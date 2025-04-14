package roteiro4.parte2;

public class Criptomoeda implements MetodoPagamento,MetodoPagamentoComFatura {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$: " + valor + " realizado com criptomoeda!");
    }

    @Override
    public void gerarFatura() {
        throw new UnsupportedOperationException("Criptomoedas não geram fatura!");
    }

}
