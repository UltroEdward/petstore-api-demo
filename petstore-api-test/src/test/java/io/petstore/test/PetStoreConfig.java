package io.petstore.test;

import io.petstore.test.oas.client.ApiClient;
import io.petstore.test.oas.client.api.PetApi;
import io.petstore.test.oas.client.api.StoreApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static io.petstore.test.oas.client.GsonObjectMapper.gson;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;

@Configuration
public class PetStoreConfig {

    @Value("${base.uri}")
    private String baseUri;

    @Bean
    public ApiClient apiClient() {
        String apiKey = String.valueOf(System.currentTimeMillis());
        return ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        //.addFilter(new RequestLoggingFilter())
                        //.addFilter(new ResponseLoggingFilter())
                        .setBaseUri(baseUri)
                        .addHeader("api_key", apiKey)));
    }

    @Bean
    public PetApi petApi(ApiClient apiClient) {
        return apiClient.pet();
    }

    @Bean
    public StoreApi storeApi(ApiClient apiClient) {
        return apiClient.store();
    }
}
