package com.vinod.serenity.bdd.steps;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class FacebookStep {

    @Step
    public void userIsOnFacebookLoginPage() {
        Serenity.getDriver().get("https://www.facebook.com/");
    }
}
