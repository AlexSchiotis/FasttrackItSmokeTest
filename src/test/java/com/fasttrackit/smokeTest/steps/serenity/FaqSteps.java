package com.fasttrackit.smokeTest.steps.serenity;

import com.fasttrackit.smokeTest.pages.FaqPage;
import com.fasttrackit.smokeTest.pages.HeaderPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class FaqSteps extends ScenarioSteps {

    private FaqPage faqPage;
    private HeaderPage homePage;

    @Step
    public void expendQuestion(int questionNumber) {
        faqPage.questionExpended(questionNumber);
    }

    @Step
    public void clickOnQuestion(String question) throws InterruptedException {
        homePage.clickAcceptedCookie();
        faqPage.withAction().moveToElement(faqPage.selectQuestion(question));
        Thread.sleep(2000);

        faqPage.selectQuestion(question).click();
    }
}
