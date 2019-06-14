package com.fasttrackit.smokeTest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.fasttrackit.org/")

public class CourseItClujPage extends PageObject {



    public void clickIncrie_teAcumButtonJava() {
        getInscrie_teAcumButtonJava().click();
    }

    @FindBy(xpath = "(//a[contains(@class, 'dt-sc-button')])[3]")
    private WebElement inscrie_teButtonForCursQATestareAcreditatAndCursOnline;

    @FindBy(className = "freebirdFormviewerViewHeaderTitleRow")
    private WebElement msgForInscriere;

    @FindBy(xpath = "//div[@class='column dt-sc-one-third  first']//div[@class='dt-sc-pr-tb-col blue']//a[contains(@class, 'dt-sc-button  small')]")
    private WebElement inscrie_teAcumButtonJava;

    @FindBy(xpath = "(//div[@class='column dt-sc-one-third  ']//a[contains(@class, 'dt-sc-button  small')])[1]")
    private WebElement inscrie_teAcumButtonCNet;

    @FindBy(xpath = "(//div[@class='column dt-sc-one-third  ']//a[contains(@class, 'dt-sc-button  small')])[2]")
    private WebElement inscrie_teAcumButtonWebDeveloper;

    @FindBy(xpath = "//div[@class='column dt-sc-one-third  first']//div[@class='dt-sc-pr-tb-col red']//a[contains(@class, 'dt-sc-button  small')]")
    private WebElement inscrie_teAcumButtonCursLaZiTestare;

    @FindBy(xpath = "//div[@class='column dt-sc-one-third  ']//div[@class='dt-sc-pr-tb-col red']//a[contains(@class, 'dt-sc-button  small')]")
    private WebElement inscrie_teAcumButtonCursLaDistantaTestare;

    @FindBy(xpath = "(//a[contains(@class, 'dt-sc-button')])[1]")
    private WebElement inscrie_teButtonCurs;

    @FindBy(className = "hr-title")
    private WebElement trainerPresentation;

    @FindBy(xpath = "(//a[contains(@class, 'dt-sc-button')])[2]")
    private WebElement inscrie_teButtonCursAcreditat;


    public WebElement getInscrie_teButtonForCursQATestareAcreditatAndCursOnline() {
        return inscrie_teButtonForCursQATestareAcreditatAndCursOnline;
    }
    public WebElement getInscrie_teButtonCursAcreditat() {
        return inscrie_teButtonCursAcreditat;
    }

    public WebElement getTrainerPresentation() {
        return trainerPresentation;
    }

    public WebElement getInscrie_teButtonCurs() {
        return inscrie_teButtonCurs;
    }

    public WebElement getInscrie_teAcumButtonCursLaDistantaTestare() {
        return inscrie_teAcumButtonCursLaDistantaTestare;
    }

    public WebElement getInscrie_teAcumButtonCursLaZiTestare() {
        return inscrie_teAcumButtonCursLaZiTestare;
    }

    public WebElement getInscrie_teAcumButtonWebDeveloper() {
        return inscrie_teAcumButtonWebDeveloper;
    }

    public WebElement getInscrie_teAcumButtonCNet() {
        return inscrie_teAcumButtonCNet;
    }

    public WebElement getMsgForInscriere() {
        return msgForInscriere;
    }

    public WebElement getInscrie_teAcumButtonJava() {
        return inscrie_teAcumButtonJava;
    }
}
