package edu.praktikum.sprint4;

import edu.praktikum.sprint4.pom.MainPage;
import edu.praktikum.sprint4.pom.OrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static edu.praktikum.sprint4.utils.Utils.randomString;
import static java.time.temporal.ChronoUnit.SECONDS;
import static org.junit.Assert.assertTrue;


public class MakeOrder {
    private WebDriver webDriver;

    @Before
    public void setup() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.of(3, SECONDS));
    }

    @Test
    public void makeOrderViaHighButton() {
        MainPage mainPage = new MainPage(webDriver);
        OrderPage orderPage = new OrderPage(webDriver);

        mainPage.open()
                .clickOrderHighButton();

        orderPage.open();
        orderPage.inputNameInField("Сан");
        orderPage.inputSurnameInField("Саныч");
        orderPage.inputLocationInField("Санторини");
        orderPage.clickSubway();
        orderPage.inputPhoneInField("+55591234567");
        orderPage.clickTheNextButton();
        orderPage.inputDateInField("30.05.2024");
        orderPage.clickRentTermInput();
        orderPage.clickRentTermDropdown();
        orderPage.clickColorCheckbox();
        orderPage.inputCommentInField("Везите мой самокатик");
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        orderPage.getOrderText();

        String result = "Номер заказа";

        assertTrue("Текст заказа отсутствует", orderPage.getOrderText(), result);



    }

    @Test
    public void makeOrderViaLowButton() {
        MainPage mainPage = new MainPage(webDriver);
        OrderPage orderPage = new OrderPage(webDriver);

        mainPage.open()
                .clickOrderLowButton();

        orderPage.open();
        orderPage.inputNameInField("Сан");
        orderPage.inputSurnameInField("Саныч");
        orderPage.inputLocationInField("Санторини");
        orderPage.clickSubway();
        orderPage.inputPhoneInField("+55591234567");
        orderPage.clickTheNextButton();
        orderPage.inputDateInField("30.05.2024");
        orderPage.clickRentTermInput();
        orderPage.clickRentTermDropdown();
        orderPage.clickColorCheckbox();
        orderPage.inputCommentInField("Везите мой самокатик");
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        orderPage.getOrderText();

        String result = "Номер заказа";

        assertTrue("Текст заказа отсутствует", orderPage.getOrderText(), result);

    }


    @After
    public void tearDown() {
        webDriver.quit();
    }
}
