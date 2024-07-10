package com.vinod.serenity.bdd.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class FacebookPage extends PageObject {

    @FindBy(id = "email")
    public WebElementFacade emailAddress;

    @FindBy(id = "pass")
    public WebElementFacade password;

    @FindBy(name = "login")
    public WebElementFacade login;

}
