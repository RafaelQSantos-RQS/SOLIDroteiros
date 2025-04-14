package roteiro4.parte5;

public abstract class Pagamento {
    public abstract void processarPagamento(double valor);

    public void gerarFatura() {
        System.out.println("Este Método não se aplica a esta forma de pagamento.");
    }

    public void validarSaldo() {
        throw new UnsupportedOperationException("Este método de pagamento não suporta validação de saldo!");
    }
}
