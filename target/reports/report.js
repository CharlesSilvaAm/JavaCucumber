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
  "line": 8,
  "name": "que estou no site Itera",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "preencho as credenciais na tela de login",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "eu preencho o formulario de cadastro",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "seleciono para registrar",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "faço uma pesquisa em Dasboard para verificar o cadastro realizado com sucesso",
  "keyword": "Then "
});
formatter.match({
  "location": "userSteps.tela_home_site()"
});
formatter.result({
  "duration": 4104139600,
  "status": "passed"
});
formatter.match({
  "location": "userSteps.inserindo_credencial()"
});
formatter.result({
  "duration": 11386337400,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.preencho_formulario_de_cadastro()"
});
formatter.result({
  "duration": 1031325800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.seleciono_registrar()"
});
formatter.result({
  "duration": 2913310900,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.pesquisando_para_verificação()"
});
formatter.result({
  "duration": 886447600,
  "status": "passed"
});
});