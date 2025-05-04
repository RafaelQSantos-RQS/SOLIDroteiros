package roteiro5.parte4;

public class NotificacaoWhatsApp implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        // Lógica para enviar a mensagem via WhatsApp
        System.out.println("Enviando WhatsApp: " + mensagem);
        // Aqui você chamaria a API do WhatsApp para enviar a mensagem
    }
}