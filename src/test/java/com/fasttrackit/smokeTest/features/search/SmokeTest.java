package com.fasttrackit.smokeTest.features.search;


import com.fasttrackit.smokeTest.steps.SmokeSteps;
import com.fasttrackit.smokeTest.steps.serenity.FaqSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@RunWith(SerenityRunner.class)

public class SmokeTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;


    @BeforeClass
    public static void maximise() {
        getDriver().manage().window().maximize();
    }

    @Steps
    private SmokeSteps smokeSteps;
    private FaqSteps faqSteps;

    @Test
    public void successfulSmokeTest() {

        smokeSteps.goToPage();
        smokeSteps.goToAccessCursuri();
        smokeSteps.goToClickOnCurs();
        smokeSteps.goToAccessCursuri();
        smokeSteps.goToClickOnWeb();
        smokeSteps.goToAccessCursuri();
        smokeSteps.goToClickOnDesign();
        smokeSteps.goToAccessCursuri();
        smokeSteps.goToClikOnCSharp();
        smokeSteps.goToAccessCursuri();
        smokeSteps.goToClickOnTestare();
        smokeSteps.goToContacts();
    }


}
