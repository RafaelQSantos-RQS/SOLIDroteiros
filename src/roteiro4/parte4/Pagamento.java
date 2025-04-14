package roteiro4.parte4;

public abstract class Pagamento {
    public abstract void processarPagamento(double valor);

    public abstract void gerarFatura();

    public void validarSaldo() {
        throw new UnsupportedOperationException("Este método de pagamento não suporta validação de saldo!");
    }
}
