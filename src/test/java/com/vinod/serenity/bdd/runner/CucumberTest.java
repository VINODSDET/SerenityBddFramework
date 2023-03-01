package com.vinod.serenity.bdd.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = {"src/test/java/com/vinod/serenity/bdd/stepdefs","src/test/java/com/vinod/serenity/bdd/hooks"},
        monochrome = true,
        tags = "@Smoke"
)
public class CucumberTest {

}
