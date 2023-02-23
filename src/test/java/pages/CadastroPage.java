package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;
import suport.Utils;

public class CadastroPage extends RunCucumberTest {
    String name = "Charles";
    String firstName = "Silva";

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
    public void createCustumer() throws IllegalAccessException {
        getDriver().findElement(registerName).sendKeys("Charles Silva");
        getDriver().findElement(companyName).sendKeys("QaCompany Technology");
        getDriver().findElement(addressCompany).sendKeys("rua piragodê");
        getDriver().findElement(companyCity).sendKeys("Manaus-Am");
        getDriver().findElement(companyPhone).sendKeys("9999999999");
        getDriver().findElement(companyEmail).sendKeys(Utils.getRandomEmail());
    }
    public void createCompany() throws IllegalAccessException {
        getDriver().findElement(btnCreate).click();
    }
    public void verifyDashboard() throws IllegalAccessException {
        getDriver().findElement(searchName).sendKeys("Charles Silva");
        getDriver().findElement(searchBtn).click();
        Utils.waitElementBePresent(doingResearch, 20);
        String resultVerify = getDriver().findElement(doingResearch).getText();
        Assert.assertEquals(name + " " + firstName, resultVerify);
    }
}
