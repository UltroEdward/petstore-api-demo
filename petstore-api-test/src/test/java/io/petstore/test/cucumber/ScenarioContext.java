package io.petstore.test.cucumber;

import io.cucumber.spring.ScenarioScope;
import io.petstore.test.oas.client.model.Pet;
import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@ScenarioScope
@Getter
@Setter
public class ScenarioContext {

    private Response response;
    private Pet pet;
}
