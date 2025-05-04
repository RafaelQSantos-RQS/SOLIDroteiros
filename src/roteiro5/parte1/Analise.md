A classe NotificacaoService viola o princípio da Inversão de Dependencia., pois depende diretamente das implementações concretas.

Se quisermos adicionar ou remover um tipo de notificação, precisaremos modificar o código existente, aumentando os riscos de bugs e dificultando a manutenção.

Consegue identificar se esta modelagem viola algum outro princípio do SOLID?
1. Single Responsibility Principle (SRP):
O NotificacaoService tem várias responsabilidades (enviar e-mails, SMS e notificações push). Isso pode ser considerado uma violação do SRP, pois cada classe deve ter uma única responsabilidade.
2. Open/Closed Principle (OCP):
O NotificacaoService não está facilmente extensível. Se você quiser adicionar um novo método de notificação, precisará modificar a classe existente, o que viola o OCP.