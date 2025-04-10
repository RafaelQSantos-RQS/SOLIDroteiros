package roteiro2.parte3;

import java.util.List;

public class PedidoService {
    private List<String> itens;
    private double total;
    private RegraDesconto regraDesconto;

    public PedidoService(List<String> itens, RegraDesconto regraDesconto) {
        this.itens = itens;
        this.regraDesconto = regraDesconto;
        this.total = this.calcularTotal();
    }

    private double calcularTotal() {
        double total = 0;

        for (String item: this.itens) {
            if (item.equals("Camiseta")) total += 50.0;
            else if (item.equals("Calça")) total += 100.0;
            else if (itens.equals("Jaqueta")) total += 200.0;
        }
        return total;
    }

    public void processarPedido() {
        double valorFinal = regraDesconto.calcular(total);
        System.out.println("Pedido processado com sucesso! Valor final com desconto R$ " + valorFinal);
    }
}
