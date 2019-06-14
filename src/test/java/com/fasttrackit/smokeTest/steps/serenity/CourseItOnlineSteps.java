package com.fasttrackit.smokeTest.steps.serenity;

import com.fasttrackit.smokeTest.pages.CourseItOnlinePage;
import com.fasttrackit.smokeTest.pages.TestBase;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class CourseItOnlineSteps extends TestBase {

    CourseItOnlinePage courseItOnlinePage;

    @Step
    public void iClickOnCurs(String courseName) {

        String courseNameAsText = courseItOnlinePage.courseNameAsText(courseName);
        System.out.println(courseNameAsText);
        getStepVariables().put("Course Name", courseNameAsText);
        courseItOnlinePage.clickOnCourse(courseName);
    }

    @Step
    public void iExpectedToBeRedirectedToTheCoursePage(String titlePage) {

        String coursePageTitle = courseItOnlinePage.titlePageAsText(titlePage);
        System.out.println(coursePageTitle);
        assertThat("The right page could not be accessed", getStepVariables().get("Course Name"), is(coursePageTitle));
    }

    @Step
    public void iClickOnCursToCheckTrainersName(String courseName, String trainerName) {
        String trainerNameInSection = courseItOnlinePage.trainerNameAsText(trainerName);
        getStepVariables().put("Trainer Name", trainerNameInSection);
        courseItOnlinePage.clickOnCourse(courseName);
    }

    @Step
    public void iExpectTheTrainerSNameIsTheSameOnBothLocations() {
        String trainerNameInQaPage = courseItOnlinePage.getTrainersNameInQaPage().getText();
        assertThat("The trainer's name is not the same", getStepVariables().get("Trainer Name"), is(trainerNameInQaPage));

    }
}
