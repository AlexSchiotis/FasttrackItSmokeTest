package com.fasttrackit.smokeTest.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.fasttrackit.org/")

public class CourseItOnlinePage extends PageObject {


    public String trainerNameAsText(String trainerName) {
        trainerName(trainerName).getText();
        return trainerName;
    }

    public WebElement trainerName(String trainerName) {
        return getDriver().findElement(By.xpath("//div[@class='pull-left']//div[contains(text(), '" + trainerName + "')]"));
    }

    public void clickOnCourse(String courseName) {
        courseName(courseName).click();
    }

    public String courseNameAsText(String courseName) {
        courseName(courseName).getText();
        return courseName;
    }

    public String titlePageAsText(String titlePage) {
        titlePage(titlePage).getText();
        return titlePage;
    }

    public WebElement courseName(String courseName) {
        return getDriver().findElement(By.xpath("//div[@class='course-listing']//div[contains(text(), '" + courseName + "')]"));

    }

    public WebElement titlePage(String courseName) {
        return getDriver().findElement(By.className("course-title"));
    }

    @FindBy(className = "author-name")
    private WebElement trainersNameInQaPage;

    public WebElement getTrainersNameInQaPage() {
        return trainersNameInQaPage;
    }
}
