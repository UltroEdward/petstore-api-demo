package io.petstore.test.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import io.petstore.test.SptringTestConfiguration;
import io.petstore.test.SpringBootPetstoreTestApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringBootPetstoreTestApplication.class, webEnvironment = WebEnvironment.NONE)
@ContextConfiguration(classes = SptringTestConfiguration.class)
public class CucumberSpringContextConfiguration {

}