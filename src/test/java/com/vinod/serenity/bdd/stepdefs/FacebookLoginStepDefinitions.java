package com.vinod.serenity.bdd.stepdefs;

import com.vinod.serenity.bdd.steps.FacebookStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FacebookLoginStepDefinitions{

    @Steps
    FacebookStep facebookStep;

    @Given("User is on ORANGEHRM login page")
    public void userIsOnORANGEHRMLoginPage() {
        facebookStep.userIsOnORANGEHRMLoginPage();
    }

    @When("User entered credentials")
    public void userEnteredCredentials() {
        facebookStep.userEnteredCredentials();
    }

    @Then("User is on ORANGEHRM homepage")
    public void userIsOnORANGEHRMHomepage() {
        facebookStep.userIsOnOrangeHRMHomePage();
    }
}
