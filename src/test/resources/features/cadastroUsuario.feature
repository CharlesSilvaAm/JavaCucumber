# Language: en

    @Cadastro
    Feature: Cadastro de Usuario

      @Cadastro_sucesso
      Scenario: Registrar novo usuario com sucesso
          Given que estou no site Itera
          When preencho as credenciais na tela de login
          When eu preencho o formulario de cadastro
          When seleciono para registrar
          Then faço uma pesquisa em Dasboard para verificar o cadastro realizado com sucesso