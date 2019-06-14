package com.fasttrackit.smokeTest.steps.serenity;

import com.fasttrackit.smokeTest.pages.HeaderPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.interactions.Actions;

public class Header extends ScenarioSteps {

    private HeaderPage headerPage;

    @Step
    public void iOpenTheHomepage() {
        headerPage.open();
    }

    @Step
    public void iClickToCategory(String categoryName) {
        headerPage.selectCategory(categoryName, getDriver()).click();
    }

    @Step
    public void IHoverToCategoryAndIselectToSubCategory(String categoryName, String subCategoryName) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(headerPage.selectCategory(categoryName,getDriver())).build().perform();
        headerPage.selectSubCategory(subCategoryName, getDriver()).click();
    }
    @Step
    public void clickAcceptedCookies() {
        headerPage.clickAcceptedCookie();
    }



}
