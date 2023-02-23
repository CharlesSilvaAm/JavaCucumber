package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunBase;
import runner.RunCucumberTest;
import suport.Utils;
public class LoginPage extends RunCucumberTest {
    private By homeScreen = By.cssSelector(".img-fluid.img-thumbnail + h1");
    private By loginLink = By.cssSelector("[href=\"/Login\"]");
    private By userName = By.id("Username");
    private By password = By.id("Password");
    private By btnLogin = By.cssSelector("[class=\"btn btn-primary\"]");
    private By mainHome = By.cssSelector("div>h3");
    private By btnNewCreate = By.cssSelector("[href=\"/Customer/Create\"]");
    private By searchName = By.cssSelector("[name=\"searching\"]");
    private By searchBtn = By.cssSelector("[value=\"Search\"]");
    private By deleteUser = By.cssSelector("[class=\"btn btn-outline-danger\"]");
    private By deleteDefinitive = By.cssSelector("[class=\"btn btn-outline-danger\"]");
    public void accessHomeScreen() throws IllegalAccessException {
        getDriver().get("https://itera-qa.azurewebsites.net/home");
        Utils.waitElementBePresent(homeScreen, 20);
    }
    public void loginMainScreen() throws IllegalAccessException {
        getDriver().findElement(loginLink).click();
        getDriver().findElement(userName).sendKeys("CharlesSilva");
        getDriver().findElement(password).sendKeys("12345");
        getDriver().findElement(btnLogin).click();
        Utils.waitElementBePresent(mainHome, 10);
        Utils.waitElementBePresent(searchName, 10);
        getDriver().findElement(searchName).sendKeys("Charles Silva");
        getDriver().findElement(searchBtn).click();
        getDriver().findElement(deleteUser).click();
        getDriver().findElement(deleteDefinitive).click();
        getDriver().findElement(btnNewCreate).click();
    }
}
