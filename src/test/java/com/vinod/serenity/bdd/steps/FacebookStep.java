package com.vinod.serenity.bdd.steps;

import com.vinod.serenity.bdd.pages.FacebookPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.util.EnvironmentVariables;

public class FacebookStep extends ScenarioSteps {

    @Steps
    EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    @Steps
    FacebookPage facebookPage;

    @Step
    public void userIsOnFacebookLoginPage() {
        Serenity.getDriver().get(EnvironmentSpecificConfiguration.from(variables).getProperty("webdriver.base.url"));
        facebookPage.emailAddress.sendKeys(EnvironmentSpecificConfiguration.from(variables).getProperty("application.username"));
        facebookPage.password.sendKeys(EnvironmentSpecificConfiguration.from(variables).getProperty("application.password"));
        facebookPage.login.waitUntilVisible().click();
    }
}
