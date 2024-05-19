package edu.praktikum.sprint4.pom;

import org.openqa.selenium.*;

public class OrderPage {
    private static final String URL = "https://qa-scooter.praktikum-services.ru/order";

    private final WebDriver webDriver;

    private final By nameInput = By.xpath(".//input[@placeholder='* Имя' and @class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    private final By surnameInput = By.xpath(".//input[@placeholder='* Фамилия' and @class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    private final By locationInput = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ' and @class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    private final By subwayInput = By.xpath(".//input[@placeholder='* Станция метро' and @class='select-search__input']");
    private final By phoneInput = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер' and @class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    private final By theNextButton = By.xpath(".//button[(@class='Button_Button__ra12g Button_Middle__1CSJM') and (text()='Далее')]");
    private final By dateInput = By.xpath(".//input[@placeholder='* Когда привезти самокат' and contains(@class, 'Input_Input__1iN_Z Input_Responsible__1jDKN')]");
    private final By rentTermInput = By.xpath(".//div[@class='Dropdown-control']");
    private final By rentTermDayDropdown = By.xpath(".//div[(@class='Dropdown-option') and (text()='сутки')]");
    private final By colorCheckbox = By.xpath(".//label[@class='Checkbox_Label__3wxSf' and @for='black']");
    private final By commentInput = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='Комментарий для курьера']");
    private final By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    private final By yesButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    // private final By orderText = By.xpath(".//div[text()='Заказ оформлен' and text()='Номер заказа: ' and text()='.  Запишите его: ' and text()='пригодится, чтобы отслеживать статус']");

    private final By orderModalHeader = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");
    private final By orderText = By.xpath(".//div[@class='Order_Text__2broi']");

    public OrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public OrderPage open() {
        webDriver.get(URL);
        return this;
    }

    public OrderPage clickTheNextButton() {
        webDriver.findElement(theNextButton).click();
        return this;

    }

    public OrderPage clickRentTermInput() {
        webDriver.findElement(rentTermInput).click();
        return this;

    }

    public OrderPage clickRentTermDropdown() {
        webDriver.findElement(rentTermDayDropdown).click();
        return this;

    }

    public OrderPage clickColorCheckbox() {
        webDriver.findElement(colorCheckbox).click();
        return this;

    }

    public OrderPage clickOrderButton() {
        webDriver.findElement(orderButton).click();
        return this;

    }

    public OrderPage clickYesButton() throws InterruptedException {
        webDriver.findElement(yesButton).click();
        Thread.sleep(1000);
        return this;

    }

    public OrderPage clickSubway() {
        webDriver.findElement(subwayInput).click();
        return this;

    }

    public OrderPage inputNameInField(String text) {
        webDriver.findElement(nameInput).sendKeys(text);
        return this;

    }

    public OrderPage inputSurnameInField(String text) {
        webDriver.findElement(surnameInput).sendKeys(text);
        return this;

    }

    public OrderPage inputLocationInField(String text) {
        webDriver.findElement(locationInput).sendKeys(text);
        return this;

    }


    public OrderPage inputPhoneInField(String text) {
        webDriver.findElement(phoneInput).sendKeys(text);
        return this;

    }

    public OrderPage inputDateInField(String text) {
        webDriver.findElement(dateInput).click();
        webDriver.findElement(dateInput).sendKeys(text);
        webDriver.findElement(dateInput).sendKeys(Keys.RETURN);
        return this;

    }

    public OrderPage inputCommentInField(String text) {
        webDriver.findElement(commentInput).sendKeys(text);
        return this;

    }

    public  String getOrderText() {
        return webDriver.findElement(orderText).getText();
    }

    public String getElementText(By element) {
        return webDriver.findElement(element).getText();
    }

    public By getListElementLocator(String elementText) {
        return By.xpath(String.format(".//li/button/div[@class='Order_Text__2broi' and text()='%s']", elementText));
    }

    public OrderPage click(By element) {
        webDriver.findElement(element).click();
        return this;
    }

    public OrderPage scrollToElement(By element) throws InterruptedException {

        WebElement webElement = webDriver.findElement(element);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        Thread.sleep(500);

        return this;
    }




}
