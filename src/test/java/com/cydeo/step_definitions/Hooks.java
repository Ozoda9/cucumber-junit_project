package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @After
    public void teardownScenario(Scenario scenario){

        if(scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());

        }

        Driver.closeDriver();
    }






    // @Before
    public void setUpScenario(){
        System.out.println("Setting up browser using cucumber @Before each scenario");
    }

    // @Before(value = "@login", order = 2)
    public void setupForLogin(){
        System.out.println("Setting up browser using cucumber @Before @login scenario");

    }

    //@Before(value = "db", order = 3)
    public void setupDatabaseScenario(){

    }

    //@BeforeStep
    public void setupScenarioStep(){
        System.out.println("Setting up browser using cucumber @Before each scenario step");
    }

}
