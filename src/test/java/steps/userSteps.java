package steps;

import cucumber.api.java.en.Given;
import pages.LoginPage;
import runner.RunCucumberTest;


public class userSteps extends RunCucumberTest {
    LoginPage loginPage = new LoginPage(driver);
    @Given("^que estou no site Itera$")
    public void tela_home_site() {
        loginPage.accessHomeScreen();
    }
    @Given("^preencho as credenciais na tela de login$")
    public void inserindo_credencial(){
        loginPage.loginMainScreen();
    }
}
