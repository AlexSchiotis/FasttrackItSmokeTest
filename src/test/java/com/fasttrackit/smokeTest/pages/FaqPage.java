package com.fasttrackit.smokeTest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DefaultUrl("https://www.fasttrackit.org/")


public class FaqPage extends PageObject {




    @FindBy(css = ".dt-sc-toggle")
    private List<WebElementFacade> questionContaine;





    public void questionExpended(int questionNumber) {
        String expectedResult = "dt-sc-toggle active";
        List<WebElementFacade> questionContainer = getQuestionContaine();
        String question = questionContainer.get(questionNumber -1).getAttribute("class");
        assertThat("the question didn't expend", question, is(expectedResult));
    }

    public WebElement selectQuestion(String question) {
        return  getDriver().findElement(By.xpath("//h5[@class='dt-sc-toggle']//a[contains(text(), '" + question + "')]"));
    }




    public List<WebElementFacade> getQuestionContaine() {
        return questionContaine;
    }
}

