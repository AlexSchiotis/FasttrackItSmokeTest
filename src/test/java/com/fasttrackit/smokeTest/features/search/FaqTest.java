package com.fasttrackit.smokeTest.features.search;

import com.fasttrackit.smokeTest.steps.SmokeSteps;
import com.fasttrackit.smokeTest.steps.serenity.FaqSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
@RunWith(SerenityRunner.class)

public class FaqTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @BeforeClass
    public static void maximise(){
        getDriver().manage().window().maximize();
    }


    @Steps
    private SmokeSteps smokeSteps;
    @Steps
    private FaqSteps faqSteps;


    @Test
    public void expendFirstQuestion() throws InterruptedException {

        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("1. In cate rate se poate plati cursul?");
        faqSteps.expendQuestion(1);

    }

    @Test
    public void expendSecondQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("2. Care este orarul cursurilor?");
        faqSteps.expendQuestion(2);
    }

    @Test
    public void expendThirdQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("3. Cat tine un curs ?");
        faqSteps.expendQuestion(3);
    }
    @Test
    public void expendFourthQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("4. Unde se tine cursul ?");
        faqSteps.expendQuestion(4);
    }

    @Test
    public void expendFifthQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("5. Ce valoare are diploma ?");
        faqSteps.expendQuestion(5);
    }

    @Test
    public void expendSixthQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("6. Care este procesul care trebuie urmat in vederea acreditarii?");
        faqSteps.expendQuestion(6);
    }

    @Test
    public void expendSeventhQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("7. Exista o pre-examinare in vederea participarii la curs?");
        faqSteps.expendQuestion(7);
    }


    @Test
    public void expendEighthQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("8. Se poate emite factura si pe firma?");
        faqSteps.expendQuestion(8);
    }

    @Test
    public void expendNinthQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("9. Se pot tine cursurile si in alte locatii, localitati, judete?");
        faqSteps.expendQuestion(9);
    }

    @Test
    public void expendTenthQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("10. Care sunt promotile FasttrackIT?");
        faqSteps.expendQuestion(10);
    }

    @Test
    public void expendElevenQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("11. Care sunt criterile necesare pentru a participa la curs?");
        faqSteps.expendQuestion(11);
    }

    @Test
    public void expendTwelfthQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("12. Ce garantie am ca ma angajez?");
        faqSteps.expendQuestion(12);
    }

    @Test
    public void expendThirteenthQuestion() throws InterruptedException {
        smokeSteps.goToPage();
        smokeSteps.goToClickOnFaq();
        faqSteps.clickOnQuestion("13. Pot participa la curs daca nu am diploma de bacalaureat?");
        faqSteps.expendQuestion(13);
    }
}
