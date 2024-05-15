package edu.praktikum.sprint4;

import edu.praktikum.sprint4.pom.MainPage;
import edu.praktikum.sprint4.pom.OrderPage;
import edu.praktikum.sprint4.steps.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static edu.praktikum.sprint4.utils.Utils.randomString;
import static java.time.temporal.ChronoUnit.SECONDS;
import static org.junit.Assert.assertTrue;
public class ImportantQuestions {
    private WebDriver webDriver;

    @Before
    public void setup() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.of(3, SECONDS));
    }

    @Test
    public void makeOrderViaHighButton() {
        MainPage mainPage = new MainPage(webDriver);


        mainPage.open()
                .clickAccordionChargingQuestion()
                .clickAccordionCostQuestion()
                .clickAccordionQuantityQuestion()
                .clickAccordionRefusalOrderQuestion()
                .clickAccordionExtensionReturnQuestion()
                .clickAccordionSuburbanQuestion()
                .clickAccordionTimeQuestion()
                .clickAccordionTodayQuestion();

        assertTrue();

        @After
        public void tearDown() {
            webDriver.quit();
        }



    }
}
