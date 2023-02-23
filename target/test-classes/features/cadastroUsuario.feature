# Language: en

    @Cadastro
    Feature: Cadastro de Usuario

      @Cadastro_sucesso
      Scenario: Registrar novo usuario com sucesso

          Given que estou no site Itera
          And preencho as credenciais na tela de login
          When eu preencho o formulario de cadastro
          And seleciono para registrar
          Then faço uma pesquisa em Dasboard para verificar o cadastro realizado com sucesso

      @Cadastro_sucesso2
      Scenario: Registrar na area pratice com sucesso
        Given que estou no site Itera
        And vou para tela Test Automation
        When eu preencho o formulario de cadastro na tela area pratice
        And seleciono os CheckBox & Radio pratice
        Then faço uma pesquisa em Dasboard para verificar o cadastro realizado