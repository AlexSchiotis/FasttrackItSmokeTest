package com.fasttrackit.smokeTest.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.fasttrackit.org/")


public class ContactPage extends PageObject {




    @FindBy(xpath = "//div[@class='fullwidth-bg']//div[contains(@class, 'column dt-sc-one-third')][2]")
    private WebElement contactOradea;

    @FindBy(xpath = "//div[@class='fullwidth-bg']//div[@class='column dt-sc-one-third  '][1]")
    private WebElementFacade contactCluj;


    public WebElementFacade getContactCluj() {
        return contactCluj;
    }

    public WebElement getContactOradea() {
        return contactOradea;
    }
}
