package com.fasttrackit.smokeTest.features.search;

import com.fasttrackit.smokeTest.steps.serenity.ContactSteps;
import com.fasttrackit.smokeTest.steps.serenity.Header;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


@RunWith(SerenityRunner.class)

public class ContactTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @BeforeClass
    public static void maximise() {
        getDriver().manage().window().maximize();
    }

    @Steps
    private
    ContactSteps contactSteps;
    @Steps
    private Header header;



    @Test
    public void sameContactForCluj() {
        header.iOpenTheHomepage();
        header.iClickToCategory("CONTACT");
        contactSteps.iExpectTheContactDetailFromClujToBeCorrect();

    }

    @Test
    public void sameContactForOradea() {
        header.iOpenTheHomepage();
        header.iClickToCategory("CONTACT");
        contactSteps.iExpectTheContactDetailFromOradeaToBeCorrect();
    }
}
