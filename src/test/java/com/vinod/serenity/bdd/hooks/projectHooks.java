package com.vinod.serenity.bdd.hooks;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.WebdriverManager;
import org.junit.Before;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class projectHooks {
    
    @Steps
    
    static Logger logger = LogManager.getLogManager().getLogger(projectHooks.class.getName());
    EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
    String browser = EnvironmentSpecificConfiguration.from(variables).getProperty("webdriver.driver");

    public projectHooks() throws IOException{}
    
    @Before
    public void settingUpWebDriver(){
        logger.info("Setting Up WebDriver(): Start");
        logger.info("webdriver.driver value is : " + browser);
        logger.info("driver.windows.webdriver.gecko.driver : " + variables.getProperty("driver.windows.gecko.driver"));
        
        if (browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            logger.info("Firefox driver is setup");
        } else if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            logger.info("ChromeDriver is setup");
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            logger.info("edge driver is setup");
        }else {
            logger.info("Invalid input");
        }
    }

    @After
    public void tearDown(){
        Serenity.getDriver().quit();
    }


}
