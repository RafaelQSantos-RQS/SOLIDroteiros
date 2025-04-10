package roteiro2.parte3;

public class DescontoPadrao implements RegraDesconto {
    @Override
    public double calcular(double total) {
        return total*.9; // 10% de desconto
    }
}
