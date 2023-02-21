package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Utils;

public class CadastroPage extends Utils {
    WebDriver driver;

    private By registerName = By.cssSelector("[id=\"Name\"]");
    private By companyName = By.cssSelector("[id=\"Company\"]");
    private By addressCompany = By.cssSelector("[id=\"Address\"]");
    private By companyCity = By.cssSelector("[id=\"City\"]");
    private By companyPhone = By.cssSelector("[id=\"Phone\"]");
    private  By companyEmail = By.cssSelector("[id=\"Email\"]");
    private By btnCreate = By.cssSelector("[value=\"Create\"]");
    private By searchName = By.cssSelector("[name=\"searching\"]");
    private By searchBtn = By.cssSelector("[value=\"Search\"]");
    private By doingResearch = By.cssSelector("td:nth-child(1)");
    public CadastroPage(WebDriver driver){
        this.driver = driver;
    }
    public void createCustumer(){
        driver.findElement(registerName).sendKeys("Charles Silva");
        driver.findElement(companyName).sendKeys("QaCompany Technology");
        driver.findElement(addressCompany).sendKeys("rua piragodê");
        driver.findElement(companyCity).sendKeys("Manaus-Am");
        driver.findElement(companyPhone).sendKeys("9999999999");
        driver.findElement(companyEmail).sendKeys(getRandomEmail());
    }
    public void createCompany(){
        driver.findElement(btnCreate).click();
    }
    public void verifyDashboard(){
        driver.findElement(searchName).sendKeys("Charles Silva");
        driver.findElement(searchBtn).click();
        waitElementBePresent(doingResearch, 20);
        driver.findElement(doingResearch).equals("Charles Silva");
    }
}
