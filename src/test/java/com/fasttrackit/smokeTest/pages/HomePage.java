package com.fasttrackit.smokeTest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;


import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@DefaultUrl("https://www.fasttrackit.org/")


public class HomePage extends PageObject {
    @FindBy(css = "#menu-item-788 > a")
    private WebElementFacade cursJava;
    @FindBy(css = "#menu-item-786 > a")
    private WebElementFacade accessCursuri;
    @FindBy(css = "#menu-item-787 > a")
    private WebElementFacade accessWeb;
    @FindBy(css = "#menu-item-908 > a")
    private WebElementFacade accessDesign;
    @FindBy(css = "#menu-item-790 > a")
    private WebElementFacade accessCSharp;
    @FindBy (css = "#menu-item-789 > a")
    private WebElementFacade accessTestare;
    @FindBy(css = "#menu-item-24 > a")
    private WebElementFacade accessContact;


    public void hoverOverCursuri() {
        withAction().moveToElement(accessCursuri).perform();
    }

    public void clickCursJava() {
        clickOn(cursJava);
    }
    public void clickCursWeb(){
        clickOn(accessWeb);
    }
    public void clickCursDesign(){
        clickOn(accessDesign);
    }
    public void clickCSharp(){
        clickOn(accessCSharp);
    }
    public void  clickAccessTestare(){
        clickOn(accessTestare);
    }
    public void clickAccessContact(){
        clickOn(accessContact);
    }

}
