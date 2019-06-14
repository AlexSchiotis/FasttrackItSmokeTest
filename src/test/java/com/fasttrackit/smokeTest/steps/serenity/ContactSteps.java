package com.fasttrackit.smokeTest.steps.serenity;

import com.fasttrackit.smokeTest.pages.ContactPage;
import com.fasttrackit.smokeTest.pages.HeaderPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ContactSteps extends ScenarioSteps {


    private ContactPage contactPage;
    private HeaderPage homePage;



    @Step
    public void iExpectTheContactDetailFromClujToBeCorrect() {
        String expectedAddress = "Strada Observatorului, nr. 90, apt 16-17, Cluj-Napoca, Cluj, Romania, cod postal: 400500";
        String expectedEmailAddress = "contact@fasttrackit.org";
        String expectedPhoneNumber = "0724529648 sau 0771173993";

        String contactCluj = contactPage.getContactCluj().getText();
        System.out.println(contactCluj);

        assertThat("The address is wrong", contactCluj, containsString(expectedAddress));
        assertThat("The email address is wrong", contactCluj, containsString(expectedEmailAddress));
        assertThat("The phone number is wrong", contactCluj, containsString(expectedPhoneNumber));


    }

    public void iExpectTheContactDetailFromOradeaToBeCorrect() {
        String expectedAddress = "Trade Center Oradea, Str. Nufarului, nr. 28E, Oradea, Bihor, Romania, cod postal: 410583";
        String expectedEmailAddress = "contact.oradea@fasttrackit.org";
        String expectedPhoneNumber = "0724529509 sau 0771173993";


        String oradeaContact = contactPage.getContactOradea().getText();
        assertThat("The address is wrong", oradeaContact, containsString(expectedAddress));
        assertThat("The email address is wrong", oradeaContact, containsString(expectedEmailAddress));
        assertThat("The phone number is wrong", oradeaContact, containsString(expectedPhoneNumber));

    }
}
