O arquivo TesteNotificacao.java na parte3 serve como um ponto de entrada para testar as implementações de notificações. Aqui está a análise:

**Análise do Teste de Notificação**
- **Uso das Implementações:** O código cria instâncias de NotificacaoEmail, NotificacaoSMS, e NotificacaoPush, e chama o método enviar em cada uma delas. Isso demonstra a flexibilidade proporcionada pela interface Notificacao.
- **Princípio da Inversão de Dependência:** Embora o teste utilize implementações concretas, ele ainda depende da abstração Notificacao. Contudo, essa abordagem pode ser considerada uma violação do princípio de Inversão de Dependência se as instâncias forem criadas diretamente no código de teste, em vez de serem injetadas, o que dificultaria a testabilidade e a manutenção.

**Comparação com a Parte2**

Na parte2, um padrão semelhante pode ser seguido, mas a injeção de dependências pode ser feita por meio do NotificacaoService, o que tornaria o teste mais flexível e alinhado com os princípios SOLID.

Resumo da Análise
- **Princípio da Inversão de Dependência:** Aplicado na parte2 através do NotificacaoService, mas potencialmente violado na parte3 devido à criação direta das instâncias no teste.
- **Outros Princípios SOLID:** A parte2 parece seguir melhor os princípios, especialmente a Responsabilidade Única e a Inversão de Dependência, enquanto a parte3 pode ter uma violação na Inversão de Dependência no contexto do teste.
