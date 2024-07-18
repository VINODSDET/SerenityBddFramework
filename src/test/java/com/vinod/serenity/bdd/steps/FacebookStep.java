package com.vinod.serenity.bdd.steps;

import com.vinod.serenity.bdd.pages.FacebookPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;


public class FacebookStep extends ScenarioSteps {

    @Steps
    EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();


    @Steps
    FacebookPage facebookPage;

    @Step
    public void userIsOnORANGEHRMLoginPage() {
//        Serenity.getDriver().get(EnvironmentSpecificConfiguration.from(variables).getProperty("webdriver.base.url"));
        facebookPage.open();
        Serenity.recordReportData().withTitle("HRM Login Page").andContents("User is on HRM login page: " + getDriver().getTitle());
        Assert.assertTrue("OrangeHRM logo not visible",getDriver().getTitle().equals("OrangeHRM"));
    }

    @Step
    public void userEnteredCredentials() {
        facebookPage.emailAddress.sendKeys(EnvironmentSpecificConfiguration.from(variables).getProperty("application.username"));
        facebookPage.password.sendKeys(EnvironmentSpecificConfiguration.from(variables).getProperty("application.password"));
        facebookPage.login.waitUntilVisible().click();
    }
    @Step
    public void userIsOnOrangeHRMHomePage () {
        Serenity.recordReportData().withTitle("OrangeHRM HomePage").andContents("User is on OrangeHRM Page: " + facebookPage.homePageOrangeHRMLogo.waitUntilVisible().isVisible());
        Assert.assertTrue(facebookPage.homePageOrangeHRMLogo.waitUntilVisible().isVisible());
    }
}
