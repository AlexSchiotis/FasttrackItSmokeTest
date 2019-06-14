package com.fasttrackit.smokeTest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



@DefaultUrl("https://www.fasttrackit.org/")


public class HeaderPage extends PageObject {

    public WebElement selectSubCategory(String subCategoryName, WebDriver driver) {
        return driver.findElement(By.xpath("//ul[@class='sub-menu']//a[contains(text(), '" + subCategoryName + "')]"));
    }
    public WebElement selectCategory(String categoryName, WebDriver driver) {
        return driver.findElement(By.xpath("//ul[@id='menu-main-menu']//a[contains(text(), '" + categoryName + "')]"));
    }
    @FindBy(css = "#menu-item-25>a")
    private WebElementFacade accessFaq;

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
    @FindBy(xpath= "//li[@id='menu-item-24']//a[contains(text(), 'CONTACT')]")
    private WebElementFacade accessContact;


    public void hoverOverCursuri() {
        withAction().moveToElement(accessCursuri).perform();
    }
      @FindBy(css = ".cookie_action_close_header")
    private WebElementFacade acceptedCookies;

    public void clickAcceptedCookie(){clickOn(acceptedCookies);}
    public void clickFaq(){clickOn(accessFaq);}
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
