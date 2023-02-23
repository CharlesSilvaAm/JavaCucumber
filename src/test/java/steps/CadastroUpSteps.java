package steps;

import cucumber.api.java.en.When;
import pages.CadastroRunPage;
import runner.RunCucumberTest;

import java.sql.SQLOutput;

public class CadastroUpSteps extends RunCucumberTest {

    CadastroRunPage cadastroRunPage = new CadastroRunPage();
    @When("^vou para tela Test Automation$")
    public void selecionando_link() throws IllegalAccessException {
        cadastroRunPage.areaPratice();
    }
    @When("^eu preencho o formulario de cadastro na tela area pratice$")
    public void formulario_de_cadastro () throws IllegalAccessException {
        cadastroRunPage.typeRegistration();
        cadastroRunPage.phoneRegistration();
        cadastroRunPage.emailRegistration();
        cadastroRunPage.registerNewPassword();
        cadastroRunPage.informAddressField();
        cadastroRunPage.setSubmitButton();
    }
    @When("^seleciono os CheckBox & Radio pratice$")
    public void parte3() throws IllegalAccessException, InterruptedException {
        cadastroRunPage.selectTitle(1);
        cadastroRunPage.selectMyCheckBox();
    }
    @When("^faço uma pesquisa em Dasboard para verificar o cadastro realizado$")
    public void parte4() {
        System.out.println("parte 4");
    }
}
