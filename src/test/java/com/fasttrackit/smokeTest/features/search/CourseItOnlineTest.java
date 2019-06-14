package com.fasttrackit.smokeTest.features.search;

import com.fasttrackit.smokeTest.pages.CourseItOnlinePage;
import com.fasttrackit.smokeTest.steps.serenity.CourseItOnlineSteps;
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


public class CourseItOnlineTest {

    @Managed(uniqueSession = true)
    WebDriver webDriver;

    @BeforeClass
    public static void maximize() {
        getDriver().manage().window().maximize();
    }

    @Steps
    Header header;
    @Steps
    CourseItOnlineSteps courseItOnlineSteps;


    @Test
    public void whenIClickOnQAManualItRedirectsToRightPage() {
        header.iOpenTheHomepage();
        header.iClickToCategory("CURSURI IT ONLINE");
        courseItOnlineSteps.iClickOnCurs("QA Manual");
        courseItOnlineSteps.iExpectedToBeRedirectedToTheCoursePage("QA Manual");
    }
    @Test
    public void whenIClickOnQAAutomationItRedirectsToRightPage() {
        header.iOpenTheHomepage();
        header.iClickToCategory("CURSURI IT ONLINE");
        courseItOnlineSteps.iClickOnCurs("QA Automation");
        courseItOnlineSteps.iExpectedToBeRedirectedToTheCoursePage("QA Automation");
    }

    @Test
    public void whenIClickOnQACompleteItRedirectsToRightPage() {
        header.iOpenTheHomepage();
        header.iClickToCategory("CURSURI IT ONLINE");
        courseItOnlineSteps.iClickOnCurs("QA Complete");
        courseItOnlineSteps.iExpectedToBeRedirectedToTheCoursePage("QA Complete");
    }

    @Test
    public void trainersNameInSectionQAManualCoincidesWithTrainersNameInQAManualPage() {
        header.iOpenTheHomepage();
        header.iClickToCategory("CURSURI IT ONLINE");
        courseItOnlineSteps.iClickOnCursToCheckTrainersName("QA Manual", "Daniel Cosman");
        courseItOnlineSteps.iExpectTheTrainerSNameIsTheSameOnBothLocations();
    }

    @Test
    public void trainersNameInSectionQAAutomationCoincidesWithTrainersNameInQAAutomationPage() {
        header.iOpenTheHomepage();
        header.iClickToCategory("CURSURI IT ONLINE");
        courseItOnlineSteps.iClickOnCursToCheckTrainersName("QA Automation", "Flaviu Ratiu");
        courseItOnlineSteps.iExpectTheTrainerSNameIsTheSameOnBothLocations();
    }
}
