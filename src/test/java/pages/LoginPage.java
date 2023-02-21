package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Utils;

public class LoginPage extends Utils {
    WebDriver driver;
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

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void accessHomeScreen(){
        driver.get("https://itera-qa.azurewebsites.net/home");
        waitElementBePresent(homeScreen, 20);
    }
    public void loginMainScreen(){
        driver.findElement(loginLink).click();
        driver.findElement(userName).sendKeys("CharlesSilva");
        driver.findElement(password).sendKeys("12345");
        driver.findElement(btnLogin).click();
        waitElementBePresent(mainHome, 10);
        waitElementBePresent(searchName, 10);
        driver.findElement(searchName).sendKeys("Charles Silva");
        driver.findElement(searchBtn).click();
        driver.findElement(deleteUser).click();
        driver.findElement(deleteDefinitive).click();
        driver.findElement(btnNewCreate).click();
    }

}
