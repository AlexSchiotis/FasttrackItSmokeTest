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

public class CursItOradeaTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @BeforeClass
    public static void maximise() {
        getDriver().manage().window().maximize();
    }

    @Steps
    Header header;
    @Steps
    CourseItClujSteps courseItClujSteps;


    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromJavaCursOradeaSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT ORADEA","Curs Java Oradea");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCurs();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Java Oradea");
    }
    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromJavaCursAcreditatOradeaSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT ORADEA","Curs Java Oradea");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCursAcreditat();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Java Oradea");
    }

    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromWebDeveloperOradeaSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT ORADEA","Curs Web Developer Oradea");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCurs();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Web developer Oradea");
    }

    @Test
    public void CheckIfINSCRIE_TEButtonWorksCorrectlyFromWebDeveloperAcreditatOradeaSection() {
        header.iOpenTheHomepage();
        header.IHoverToCategoryAndIselectToSubCategory("CURSURI IT ORADEA","Curs Web Developer Oradea");
        courseItClujSteps.iClickINSCRIE_TEButtonFromCursAcreditat();
        courseItClujSteps.iExpectToBeRedirectedToTheSignUpPage("Inscriere Web developer Oradea");
    }
}
