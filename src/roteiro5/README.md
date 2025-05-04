# Roteiro SOLID 5
Os roteiros a serem desenvolvidos visam trazer a percepção da evolução no processo de desenvolvimento de software. Por isso, daremos sequência ao projeto criando vários pacotes, onde cada pacote representa a evolução da implementação deste projeto.
Nesse caso iremos explorar um dos princípios do SOLID:

**D - Dependency Inversion Principle (Princípio da Inversão de Dependências)**
1. _“Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações”._
2. _“Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações”_

O princípio da inversão de dependência ajuda a reduzir o acoplamento no código, facilitando a manutenção e extensibilidade. Isso é feito ao garantir que as dependências sejam gerenciadas por meio de interfaces ou classes abstratas em vez de classes concretas.
## Roteiro 5
### Parte 1
1. Dê sequência ao mesmo projeto no NetBeans chamado SOLIDroteiros
2. Dentro do projeto criar um pacote chamado roteiro5.parte1

**Cenário:**
Vamos modelar um sistema de notificação para uma plataforma digital. A plataforma deve enviar notificações aos usuários por diferentes canais:
- E-mail
- SMS
- Push Notification (Notificações no aplicativo)

3.  Vamos iniciar criando a classe NotificacaoService, conforme o código abaixo.