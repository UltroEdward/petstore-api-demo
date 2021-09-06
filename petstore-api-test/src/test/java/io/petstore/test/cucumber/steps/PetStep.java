package io.petstore.test.cucumber.steps;

import io.cucumber.java.en.Step;
import io.petstore.test.cucumber.ScenarioContext;
import io.petstore.test.oas.client.api.PetApi;
import io.petstore.test.oas.client.api.StoreApi;
import io.petstore.test.oas.client.model.ModelApiResponse;
import io.petstore.test.oas.client.model.Order;
import io.petstore.test.oas.client.model.Pet;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.assertj.core.api.Condition;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ThreadLocalRandom;

import static io.petstore.test.oas.client.ResponseSpecBuilders.shouldBeCode;
import static io.petstore.test.oas.client.ResponseSpecBuilders.validatedWith;
import static org.apache.http.HttpStatus.SC_NOT_FOUND;
import static org.apache.http.HttpStatus.SC_OK;
import static org.assertj.Assertions.assertThat;

@Slf4j
public class PetStep extends  BaseStep {

    @Autowired
    private PetApi petApi;

    @Autowired
    private StoreApi storeApi;

    @Autowired
    private ScenarioContext scenarioContext;

    @Step("I add pet to store")
    public void addPetToStore() {
        scenarioContext.setResponse(petApi.addPet().body(fakePet()).execute(r -> r));
    }

    @Step("I have got http status {string}")
    public void gotStatus(String code) {
        validatedWith(shouldBeCode(Integer.parseInt(code))).apply(scenarioContext.getResponse());
    }

    @Step("I have got pet in response")
    public void gotPet() {
        Pet pet = scenarioContext.getResponse().as(Pet.class);
        scenarioContext.setPet(pet);

        assertThat(pet).isNotNull().has(new Condition<Pet>(p -> pet.getId() != null, ""));
    }

    @Step("The pet was added to store successfully")
    public void verifyPetAdded() {
        Pet expected = scenarioContext.getPet();
        Pet actual = petApi.getPetById().petIdPath(expected.getId()).executeAs(validatedWith(shouldBeCode(SC_OK)));

        assertThat(actual).hasId(expected.getId());
    }

    @Step("I remove pet from store")
    public void removePet() {
        Pet pet = scenarioContext.getPet();
        scenarioContext.setResponse(petApi.deletePet().petIdPath(pet.getId()).execute(r->r));
    }

    @Step("The pet was removed from successfully")
    public void verifyPetRemoved() {
        Pet expected = scenarioContext.getPet();
        ModelApiResponse modelApiResponse = petApi.getPetById().petIdPath(expected.getId()).execute(validatedWith(shouldBeCode(SC_NOT_FOUND))).as(ModelApiResponse.class);

        assertThat(modelApiResponse)
                .hasCode(1)
                .hasType("error")
                .hasMessage("Pet not found");
    }

    @Step("I place order to buy the pet")
    public void placeOrder() {
        Pet pet = scenarioContext.getPet();
        scenarioContext.setResponse(storeApi.placeOrder().body(new Order().id(1L).petId(pet.getId()).quantity(1).status(Order.StatusEnum.PLACED)).execute(r->r));
    }

    @Step("The order status is {string}")
    public void verifyOrderStatus(String status) {
        Order actual = scenarioContext.getResponse().as(Order.class);
        assertThat(actual).hasStatus(Order.StatusEnum.fromValue(status));

        //server state verify
        Order order = storeApi.getOrderById().orderIdPath(actual.getId()).executeAs(validatedWith(shouldBeCode(SC_OK)));
        assertThat(order).hasStatus(Order.StatusEnum.fromValue(status));
    }


    @Step("The pet has status {string}")
    public void verifyPetStatus(String status) {
        Pet pet = scenarioContext.getPet();
        assertThat(pet).hasStatus(Pet.StatusEnum.fromValue(status));
    }

    private static Pet fakePet() {
        return new Pet()
                .id(randomLong())
                .name(randomString())
                .status(Pet.StatusEnum.AVAILABLE);
    }

    private static Long randomLong() {
        return ThreadLocalRandom.current().nextLong(0, Long.MAX_VALUE);
    }

    private static String randomString() {
        return RandomStringUtils.randomAlphabetic(7);
    }
}