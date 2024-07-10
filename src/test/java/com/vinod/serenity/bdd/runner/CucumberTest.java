package com.vinod.serenity.bdd.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "classpath:features",
        glue = {"com.vinod.serenity.bdd.stepdefs"},
//        monochrome = true,
        tags = "@Smoke"
)
public class CucumberTest {

}
