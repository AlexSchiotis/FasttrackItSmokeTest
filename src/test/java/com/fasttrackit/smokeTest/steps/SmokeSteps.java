package com.fasttrackit.smokeTest.steps;

import com.fasttrackit.smokeTest.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SmokeSteps extends ScenarioSteps {
    HomePage homePage;


    @Step
    public void goToPage(){
        homePage.open();
    }
    @Step
    public void goToAccessCursuri(){
        homePage.hoverOverCursuri();
    }
    @Step
    public void goToClickOnCurs(){
        homePage.clickCursJava();
    }
    @Step
    public void goToClickOnWeb(){
        homePage.clickCursWeb();
    }
    @Step
    public void goToClickOnDesign(){
        homePage.clickCursDesign();
    }
    @Step
    public void goToClikOnCSharp(){
        homePage.clickCSharp();
    }
    @Step
    public void goToClickOnTestare(){
        homePage.clickAccessTestare();
    }
    @Step
    public void goToContacts(){
        homePage.clickAccessContact();
    }

}