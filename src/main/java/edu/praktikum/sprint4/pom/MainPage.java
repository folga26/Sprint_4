package edu.praktikum.sprint4.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;


public class MainPage {
    private static final String URL = "https://qa-scooter.praktikum-services.ru/";

    private final WebDriver webDriver;


    private final By orderHighButton = By.xpath(".//button[@class='Button_Button__ra12g']");
    private final By orderLowButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MainPage open() {
        webDriver.get(URL);
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

    public By getQuestionLocatorByIndex(int index) {
        return By.xpath(String.format(".//div[@id='accordion__heading-%d']", index));
    }

    public By getAnswerLocationByIndex(int index) {
        return  By.xpath(String.format(".//div[@id='accordion__panel-%d']", index));
    }

    public MainPage click(By element) {
        webDriver.findElement(element).click();
        return this;
    }

    public String getElementText(By element) {
        return webDriver.findElement(element).getText();
    }

    public MainPage scrollToElement(By element) throws InterruptedException {

        WebElement webElement = webDriver.findElement(element);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        webDriver.manage().timeouts().implicitlyWait(Duration.of(1, SECONDS));

        return this;
    }

    public MainPage scrollToLowButton() throws InterruptedException {

        scrollToElement(orderLowButton);

        return this;
    }


}


