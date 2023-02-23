package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.RunCucumberTest;
import suport.Utils;

public class CadastroRunPage extends RunCucumberTest {
    private By testAutomationLink = By.cssSelector("[href=\"/home/automation\"]");
    private By createName = By.cssSelector("[id=\"name\"]");
    private By createPhone = By.cssSelector("[id=\"phone\"]");
    private By createEmailAddress = By.cssSelector("[id=\"email\"]");
    private By registerPassword = By.cssSelector("[id=\"password\"]");
    private By informAddress = By.cssSelector("[id=\"address\"]");
    private By submitButton = By.cssSelector("[class=\"btn btn-primary\"]");
    private By titleFemale = By.cssSelector("[id=\"female\"]");
    private By titleMale = By.cssSelector("[id=\"male\"]");
    private By selectCheckBox = By.cssSelector("[id=\"wednesday\"]");
    public void areaPratice() throws IllegalAccessException {
        getDriver().findElement(testAutomationLink).click();
    }
    public void typeRegistration() throws IllegalAccessException {
        getDriver().findElement(createName).sendKeys(Utils.getRandomName());
    }
    public void phoneRegistration() throws IllegalAccessException {
        getDriver().findElement(createPhone).sendKeys("99999999999");
    }
    public void emailRegistration() throws IllegalAccessException {
        getDriver().findElement(createEmailAddress).sendKeys(Utils.getRandomEmail());
    }
    public void registerNewPassword() throws IllegalAccessException{
        getDriver().findElement(registerPassword).sendKeys("123456");
    }
    public void informAddressField() throws IllegalAccessException {
        Utils.waitElementBePresent(informAddress, 20);
        getDriver().findElement(informAddress).sendKeys("Rua Marcilio Dias");
    }
    public void setSubmitButton() throws IllegalAccessException {
        getDriver().findElement(submitButton).click();
    }
    public void selectTitle(int type) throws IllegalAccessException {
        if (type == 1) {
            getDriver().findElement(titleFemale).click();
        } else if (type == 2) {
            getDriver().findElement(titleMale).click();
        }
    }
    public void selectMyCheckBox() throws IllegalAccessException, InterruptedException {
            WebElement checkbox = getDriver().findElement(selectCheckBox);
            checkbox.click();
            Thread.sleep(5000);
        }
    }




