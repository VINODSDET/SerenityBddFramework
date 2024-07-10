package com.vinod.serenity.bdd.stepdefs;

import com.vinod.serenity.bdd.steps.FacebookStep;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class FacebookLoginStepDefinitions{

    @Steps
    FacebookStep facebookStep;

    @Given("User is on facebook login page")
    public void userIsOnFacebookLoginPage() {
        facebookStep.userIsOnFacebookLoginPage();
    }
}
