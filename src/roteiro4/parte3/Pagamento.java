package roteiro4.parte3;

public abstract class Pagamento {
    public abstract void processarPagamento(double valor);

    public void gerarFatura() {
        throw new UnsupportedOperationException("Este método de pagamento não suporta fatura.");
    }

    public void validarSaldo() {
        throw new UnsupportedOperationException("Este método de pagamento não suporta validação de saldo!");
    }
}
