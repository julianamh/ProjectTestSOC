Feature: BuscaDeCredenciado

Scenario: Em soluções SOC, buscar um credenciado
       Given O clique do botão para aceitar os cookies na página inicial
       When está na página de SOC
       Then Será clicado no SOCNET para ir à página de Rede Credenciada
       And O clique do botão em buscar credenciados

       Scenario: Aplicar filtros
              Given o mostrar todas as conveniências
              When todos os filtros de conveniências forem aplicados
              Then todos os serviços serão mostrados com as conveniências

       Scenario: Inserir CEP
              Given Os filtros aplicados de serviços
              When Inserido o CEP
              Then clicado em saiba mais será mostrado o credenciado

