package com.vinod.serenity.bdd.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class FacebookPage extends PageObject {

    @FindBy(name = "username")
    public WebElementFacade emailAddress;

    @FindBy(name = "password")
    public WebElementFacade password;

    @FindBy(xpath = "//button[contains(@class,'orangehrm-login-button')]")
    public WebElementFacade login;

    @FindBy(xpath = "//div[@class='orangehrm-login-branding']")
    public WebElementFacade orangeHRMLogo;

    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    public WebElementFacade homePageOrangeHRMLogo;


}
