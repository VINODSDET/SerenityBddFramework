package com.vinod.serenity.bdd.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty",
        "json:target/cucumber-report/cucumber.json",
        "junit:target/cucumber-report/cucumber.xml",
         "html:target/cucumber-report/cucumber.html",
         "html:target/cucumber/cucumber-report/report.xml"
        },
        features = "classpath:features",
        glue = {"com.vinod.serenity.bdd.stepdefs"},
//        monochrome = true,
        tags = "@Smoke"
)
public class CucumberTest {

}
