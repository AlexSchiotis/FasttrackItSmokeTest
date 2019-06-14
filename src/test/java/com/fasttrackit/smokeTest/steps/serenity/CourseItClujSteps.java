package com.fasttrackit.smokeTest.steps.serenity;

import com.fasttrackit.smokeTest.pages.CourseItClujPage;
import com.fasttrackit.smokeTest.pages.HeaderPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CourseItClujSteps extends ScenarioSteps {

    private CourseItClujPage courseItClujPage;
    private HeaderPage headerPage;
    private void switchTabsAndFrame() {
        ArrayList<String> tabs2 = new ArrayList<>(getDriver().getWindowHandles());
       getDriver().switchTo().window(tabs2.get(1));
        int size = getDriver().findElements(By.tagName("iframe")).size();
        System.out.println("first size of iframe" + size);
        getDriver().switchTo().frame(0);
    }

    private void moveToTrainerPresentation() {
        // I need to go to a certain element in order to be able to click on another element
        headerPage.clickAcceptedCookie();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(courseItClujPage.getTrainerPresentation()).build().perform();
    }

    @Step
    public void iClickINSCRIE_TEButtonFromCursAcreditat() {
        moveToTrainerPresentation();
        courseItClujPage.getInscrie_teButtonCursAcreditat().click();
    }
    @Step
    public void iClickINSCRIE_TEButtonFromCursAcreditatAndOnlineCurs() {
        moveToTrainerPresentation();
        courseItClujPage.getInscrie_teButtonCursAcreditat().click();
    }
    @Step
    public void iClickINSCRIE_TEButtonFromCurs() {
        moveToTrainerPresentation();
        courseItClujPage.getInscrie_teButtonCurs().click();
    }

    @Step
    public void iExpectToBeRedirectedToTheCursuriItOnline() {
        String currentURL = getDriver().getCurrentUrl();
        String expectedURL = "https://fasttrackit.teachable.com/";
        assertThat("I'm redirected to the wrong URL", currentURL, is(expectedURL));
    }

    @Step
    public void iClickINSCRIETEACUMButtonFromCursLaDistantaTestare() {
        headerPage.clickAcceptedCookie();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(courseItClujPage.getInscrie_teAcumButtonCursLaDistantaTestare()).build().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(courseItClujPage.getInscrie_teAcumButtonCursLaDistantaTestare()));
        courseItClujPage.getInscrie_teAcumButtonCursLaDistantaTestare().click();
    }


    @Step
    public void iClickINSCRIETEACUMButtonFromCursLaZiTestare() {
        headerPage.clickAcceptedCookie();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(courseItClujPage.getInscrie_teAcumButtonCursLaZiTestare()).build().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(courseItClujPage.getInscrie_teAcumButtonCursLaZiTestare()));
        courseItClujPage.getInscrie_teAcumButtonCursLaZiTestare().click();
    }
    @Step
    public void iClickINSCRIETEACUMButtonFromCursWebDeveloper() {
        headerPage.clickAcceptedCookie();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(courseItClujPage.getInscrie_teAcumButtonWebDeveloper()).build().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(courseItClujPage.getInscrie_teAcumButtonWebDeveloper()));
        courseItClujPage.getInscrie_teAcumButtonWebDeveloper().click();
    }

    @Step
    public void iClickINSCRIETEACUMButtonFromCursCNet() {
        headerPage.clickAcceptedCookie();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(courseItClujPage.getInscrie_teAcumButtonCNet()).build().perform();
        //getDriver().manage().timeouts().pageLoadTimeout(10, SECONDS);
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(courseItClujPage.getInscrie_teAcumButtonCNet()));
        courseItClujPage.getInscrie_teAcumButtonCNet().click();

    }

    @Step
    public void iClickINSCRIETEACUMButtonFromCursJava() {
        headerPage.clickAcceptedCookie();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(courseItClujPage.getInscrie_teAcumButtonJava()).build().perform();
        //getDriver().manage().timeouts().pageLoadTimeout(10, SECONDS);
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(courseItClujPage.getInscrie_teAcumButtonJava()));
        courseItClujPage.clickIncrie_teAcumButtonJava();

    }

    @Step
    public void iExpectToBeRedirectedToThePage(String courseName) {
        getDriver().switchTo().frame(0);
        String msgForSignUpPage = courseItClujPage.getMsgForInscriere().getText();
        assertThat("I can't sing up", msgForSignUpPage, is(courseName));
    }

    @Step
    public void iExpectToBeRedirectedToTheSignUpPage(String courseName) {
        switchTabsAndFrame();
        int size = getDriver().findElements(By.tagName("iframe")).size();
        System.out.println("second size of iframe" + size);

        if (size == 0) {
            getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            System.out.println("if size frame @@@@@@@@@:" + size);

        } else {
            getDriver().navigate().refresh();
            getDriver().switchTo().frame(0);
            System.out.println("else size frame#########:" + size);
        }

        String signUpCourseAsText = courseItClujPage.getMsgForInscriere().getText();
        System.out.println("*******" + signUpCourseAsText + "***********");
        assertThat("I can't sing up", signUpCourseAsText, is(courseName));
    }
}
