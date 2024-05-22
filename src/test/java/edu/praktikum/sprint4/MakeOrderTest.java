package edu.praktikum.sprint4;

import edu.praktikum.sprint4.pom.MainPage;
import edu.praktikum.sprint4.pom.OrderPage;
import edu.praktikum.sprint4.rules.BrowserRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class MakeOrderTest {

    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    public void makeOrderViaHighButton() throws InterruptedException {
        MainPage mainPage = new MainPage(browserRule.getWebDriver());
        OrderPage orderPage = new OrderPage(browserRule.getWebDriver());

        mainPage.open()
                .clickOrderHighButton();

        orderPage.open()
                .inputNameInField("Сан")
                .inputSurnameInField("Саныч")
                .inputLocationInField("Санторини")
                .clickSubway()
                .scrollToElement(orderPage.getListElementLocator("Лубянка"))
                .click(orderPage.getListElementLocator("Лубянка"))
                .inputPhoneInField("+55591234567")
                .clickTheNextButton()
                .inputDateInField("30.05.2024")
                .clickRentTermInput()
                .clickRentTermDropdown()
                .clickColorCheckbox()
                .inputCommentInField("Везите мой самокатик")
                .clickOrderButton()
                .clickYesButton();

        Assert.assertTrue("Текст заказа отсутствует", orderPage.getOrderText().contains("Заказ оформлен"));
        Assert.assertTrue("Текст заказа отсутствует", orderPage.getOrderText().contains("Номер заказа:"));
        Assert.assertTrue("Текст заказа отсутствует", orderPage.getOrderText().contains("Запишите его:"));
        Assert.assertTrue("Текст заказа отсутствует", orderPage.getOrderText().contains("пригодится, чтобы отслеживать статус"));
    }

    @Test
    public void makeOrderViaLowButton() throws InterruptedException {
        MainPage mainPage = new MainPage(browserRule.getWebDriver());
        OrderPage orderPage = new OrderPage(browserRule.getWebDriver());

        mainPage.open()
                .scrollToLowButton()
                .clickOrderLowButton();

        orderPage.open()
        .inputNameInField("Сан")
        .inputSurnameInField("Саныч")
        .inputLocationInField("Санторини")
        .clickSubway()
        .scrollToElement(orderPage.getListElementLocator("Лубянка"))
        .click(orderPage.getListElementLocator("Лубянка"))
        .inputPhoneInField("+55591234567")
        .clickTheNextButton()
        .inputDateInField("30.05.2024")
        .clickRentTermInput()
        .clickRentTermDropdown()
        .clickColorCheckbox()
        .inputCommentInField("Везите мой самокатик")
        .clickOrderButton()
        .clickYesButton();

        Assert.assertTrue("Текст заказа отсутствует", orderPage.getOrderText().contains("Заказ оформлен"));
        Assert.assertTrue("Текст заказа отсутствует", orderPage.getOrderText().contains("Номер заказа:"));
        Assert.assertTrue("Текст заказа отсутствует", orderPage.getOrderText().contains("Запишите его:"));
        Assert.assertTrue("Текст заказа отсутствует", orderPage.getOrderText().contains("пригодится, чтобы отслеживать статус"));
    }
}
