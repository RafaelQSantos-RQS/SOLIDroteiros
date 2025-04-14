package roteiro4.parte2;

public class TestePagamento {
    public static void main(String[] args) {
        System.out.println("PAGAMENTO CARTÃO DE CRÉDITO");
        MetodoPagamento cartao = new CartaoCredito();
        if (cartao instanceof CartaoCredito) {
            ((MetodoPagamentoComFatura)cartao).gerarFatura();
        }
        cartao.processarPagamento(100.00);

        System.out.println();

        System.out.println("PAGAMENTO BOLETO BANCÁRIO");
        MetodoPagamento boleto = new BoletoBancario();
        boleto.processarPagamento(200.00);

        System.out.println();

        System.out.println("PAGAMENTO CRIPTO");
        MetodoPagamento cripto = new Criptomoeda();
        cripto.processarPagamento(300.00);
    }
}
