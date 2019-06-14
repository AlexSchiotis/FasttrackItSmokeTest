package com.fasttrackit.smokeTest.features.search;

import com.fasttrackit.smokeTest.steps.serenity.CourseItClujSteps;
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

public class CourseItClujTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @BeforeClass
    public static void maximise() {
        getDriver().manage().window().maximize();
    }

    @Steps
    private Header header;
    @Steps
    CourseItClujSteps courseItClujSteps;

    @Test
    public void CheckIfINSCRIE_TE_ACUMButtonFromJavaCursSectionWorksCorrectly() throws InterruptedException {

        header.iOpenTheHomepage();
        header.iClickToCategory("CURSURI IT Cluj");
        courseItClujSteps.iClickINSCRIETEACUMButtonFromCursJava();
        courseItClujSteps.iExpectToBeRedirectedToThePage("Inscriere Java");
    }

    @Test
    public void CheckIfINSCRIE_TE_ACUMButtonFromCNetCursSectionWorksCorrectly() {
        header.iOpenTheHomepage();
        header.iClickToCategory("CURSURI IT Cluj");
        courseItClujSteps.iClickINSCRIETEACUMButtonFromCursCNet();
        courseItClujSteps.iExpectToBeRedirectedToThePage("Inscriere C# .NET");
    }

    @Test
    public void CheckIfINSCRIE_TE_ACUMButtonFromWebDeveloperCursSectionWorksCorrectly() {
        header.iOpenTheHomepage();
        header.iClickToCategory("CURSURI IT Cluj");
        courseItClujSteps.iClickINSCRIETEACUMButtonFromCursWebDeveloper();
        courseItClujSteps.iExpectToBeRedirectedToThePage("Inscriere Web developer");
    }

    @Test
    public void CheckIfINSCRIE_TE_ACUMButtonFromCurLaZiTestareSectionWorksCorrectly() {
        header.iOpenTheHomepage();
        header.iClickToCategory("CURSURI IT Cluj");
        courseItClujSteps.iClickINSCRIETEACUMButtonFromCursLaZiTestare();
        courseItClujSteps.iExpectToBeRedirectedToThePage("Inscriere Quality Assurance");
    }

    @Test
    public void CheckIfINSCRIE_TE_ACUMButtonFromCurLaDistantaTestareSectionWorksCorrectly() {
        header.iOpenTheHomepage();
        header.iClickToCategory("CURSURI IT Cluj");
        courseItClujSteps.iClickINSCRIETEACUMButtonFromCursLaDistantaTestare();
        courseItClujSteps.iExpectToBeRedirectedToTheCursuriItOnline();
    }

    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromJavaCursClujSection() {

        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT Cluj", "Curs Java");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCurs();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Java");
    }

    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromJavaCursAcreditatSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT Cluj", "Curs Java");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCursAcreditat();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Java");
    }

    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromWebDeveloperCursSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT Cluj", "Curs Web Developer");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCurs();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Web developer");
    }

    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromWebDeveloperCursAcreditatSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT Cluj", "Curs Web Developer");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCursAcreditat();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Web developer");
    }

    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromWebDeveloperReactJSCursSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT Cluj", "Curs Web Developer (React JS Oriented)");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCurs();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Web developer");
    }
    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromWebDeveloperReactJSCursAcreditatSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT Cluj", "Curs Web Developer (React JS Oriented)");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCursAcreditat();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Web developer");
    }

    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromNodeJSCursSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT Cluj", "Curs Node JS");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCurs();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Node-JS");
    }

    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromNodeJSCursAcreditatSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT Cluj", "Curs Node JS");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCursAcreditat();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Node-JS");
    }

    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromQATestareSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT Cluj", "Curs QA Testare");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCurs();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Quality Assurance");
    }

    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromQATestareAcreditatSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT Cluj", "Curs QA Testare");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCursAcreditat();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Quality Assurance");
    }
    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromQATestareAcreditatAndOnlineSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT Cluj", "Curs QA Testare");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCursAcreditatAndOnlineCurs();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Quality Assurance");
    }
}

