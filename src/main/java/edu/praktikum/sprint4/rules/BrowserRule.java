package edu.praktikum.sprint4.rules;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.SECONDS;


public class BrowserRule extends ExternalResource {

    private WebDriver webDriver;

    protected void before() {

        webDriver = new ChromeDriver();
        Dimension dimension = new Dimension(1920, 1080);
        webDriver.manage().window().setSize(dimension);
        webDriver.manage().timeouts().implicitlyWait(Duration.of(3, SECONDS));
    }

    protected void after() {
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
