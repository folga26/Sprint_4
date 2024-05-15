package edu.praktikum.sprint4.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class MainPage {
    private static final String URL = "https://qa-scooter.praktikum-services.ru/";

    private final WebDriver webDriver;

    //private final By importantQuestionsText = By.xpath(".//div[@class='Home_SubHeader__zwi_E']");
    private final By costQuestion = By.xpath(".//div[@id='accordion__heading-0']");
    private final By quantityQuestion = By.xpath(".//div[@id='accordion__heading-1']");
    private final By timeQuestion = By.xpath(".//div[@id='accordion__heading-2']");
    private final By todayQuestion = By.xpath(".//div[@id='accordion__heading-3']");
    private final By extensionReturnQuestion = By.xpath(".//div[@id='accordion__heading-4']");
    private final By chargingQuestion = By.xpath(".//div[@id='accordion__heading-5']");
    private final By refusalOrderQuestion = By.xpath(".//div[@id='accordion__heading-6']");
    private final By suburbanQuestion = By.xpath(".//div[@id='accordion__heading-7']");
    private final By costAnswer = By.xpath(".//div[@id='accordion__panel-0']");
    private final By quantityAnswer = By.xpath(".//div[@id='accordion__panel-1']");
    private final By timeAnswer = By.xpath(".//div[@id='accordion__panel-2']");
    private final By todayAnswer = By.xpath(".//div[@id='accordion__panel-3']");
    private final By extensionReturnAnswer = By.xpath(".//div[@id='accordion__panel-4']");
    private final By chargingAnswer = By.xpath(".//div[@id='accordion__panel-5']");
    private final By refusalOrderAnswer = By.xpath(".//div[@id='accordion__panel-6']");
    private final By suburbanAnswer = By.xpath(".//div[@id='accordion__panel-7']");
    private final By orderHighButton = By.xpath(".//button[@id='Button_Button__ra12g']");
    private final By orderLowButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MainPage open() {
        webDriver.get(URL);
        return this;
    }

    public MainPage clickAccordionCostQuestion() {
        webDriver.findElement(costQuestion).click();
        return this;
    }

    public MainPage clickAccordionQuantityQuestion() {
        webDriver.findElement(quantityQuestion).click();
        return this;

    }

    public MainPage clickAccordionTimeQuestion() {
        webDriver.findElement(timeQuestion).click();
        return this;

    }

    public MainPage clickAccordionTodayQuestion() {
        webDriver.findElement(todayQuestion).click();
        return this;

    }

    public MainPage clickAccordionExtensionReturnQuestion() {
        webDriver.findElement(extensionReturnQuestion).click();
        return this;

    }

    public MainPage clickAccordionChargingQuestion() {
        webDriver.findElement(chargingQuestion).click();
        return this;

    }

    public MainPage clickAccordionRefusalOrderQuestion() {
        webDriver.findElement(refusalOrderQuestion).click();
        return this;

    }

    public MainPage clickAccordionSuburbanQuestion() {
        webDriver.findElement(suburbanQuestion).click();
        return this;

    }

    public MainPage clickOrderHighButton() {
        webDriver.findElement(orderHighButton).click();
        return this;

    }

    public MainPage clickOrderLowButton() {
        webDriver.findElement(orderLowButton).click();
        return this;

    }


}
