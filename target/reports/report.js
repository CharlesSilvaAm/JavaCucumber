$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastroUsuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Language: en"
    }
  ],
  "line": 4,
  "name": "Cadastro de Usuario",
  "description": "",
  "id": "cadastro-de-usuario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@Cadastro"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Registrar novo usuario com sucesso",
  "description": "",
  "id": "cadastro-de-usuario;registrar-novo-usuario-com-sucesso",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Cadastro_sucesso"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que estou no site Itera",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "preencho as credenciais na tela de login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "eu preencho o formulario de cadastro",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "seleciono para registrar",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "faço uma pesquisa em Dasboard para verificar o cadastro realizado com sucesso",
  "keyword": "Then "
});
formatter.match({
  "location": "userSteps.tela_home_site()"
});
formatter.result({
  "duration": 9658307300,
  "status": "passed"
});
formatter.match({
  "location": "userSteps.inserindo_credencial()"
});
formatter.result({
  "duration": 11920591000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.preencho_formulario_de_cadastro()"
});
formatter.result({
  "duration": 928010300,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.seleciono_registrar()"
});
formatter.result({
  "duration": 3282363600,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.pesquisando_para_verificação()"
});
formatter.result({
  "duration": 953618300,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Registrar na area pratice com sucesso",
  "description": "",
  "id": "cadastro-de-usuario;registrar-na-area-pratice-com-sucesso",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Cadastro_sucesso2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "que estou no site Itera",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "vou para tela Test Automation",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "eu preencho o formulario de cadastro na tela area pratice",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "seleciono os CheckBox \u0026 Radio pratice",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "faço uma pesquisa em Dasboard para verificar o cadastro realizado",
  "keyword": "Then "
});
formatter.match({
  "location": "userSteps.tela_home_site()"
});
formatter.result({
  "duration": 5511638700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUpSteps.selecionando_link()"
});
formatter.result({
  "duration": 433454900,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUpSteps.formulario_de_cadastro()"
});
formatter.result({
  "duration": 897033300,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUpSteps.parte3()"
});
formatter.result({
  "duration": 5128987800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUpSteps.parte4()"
});
formatter.result({
  "duration": 71100,
  "status": "passed"
});
});