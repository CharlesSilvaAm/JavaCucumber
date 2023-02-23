package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    @When("^eu preencho o formulario de cadastro$")
    public void preencho_formulario_de_cadastro() throws IllegalAccessException {
        cadastroPage.createCustumer();
    }
    @When("^seleciono para registrar$")
    public void seleciono_registrar() throws IllegalAccessException {
        cadastroPage.createCompany();
    }
    @Then("^faço uma pesquisa em Dasboard para verificar o cadastro realizado com sucesso$")
    public void pesquisando_para_verificação() throws IllegalAccessException {
        cadastroPage.verifyDashboard();
    }
}
