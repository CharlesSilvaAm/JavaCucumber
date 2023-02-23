package steps;

import cucumber.api.java.en.Given;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;


public class userSteps extends RunCucumberTest {
    LoginPage loginPage = new LoginPage();
    @Given("^que estou no site Itera$")
    public void tela_home_site() throws IllegalAccessException {
        getDriver(RunBase.Browser.CHROME);
        loginPage.accessHomeScreen();
    }
    @Given("^preencho as credenciais na tela de login$")
    public void inserindo_credencial() throws IllegalAccessException {
        loginPage.loginMainScreen();
    }

}
