package roteiro2.parte2;

/*
Esta classe à princípio é responsável por:
# Processamento de pedidos
# Cálculo de preços (integração com as regras de negócio)
    # Para efeitos didáticos deixamos itens de compra com valores fixos no código
        # Camiseta = R$ 50,00
        # Calça = R$ 100,00
        # Jaqueta = R$ 200,00
# Aplicação de Descontos (Também com regra de negócio)
    # Os descontos não podem ultrapassar 30%
*/

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
            switch (item) {
                case "Camiseta" -> total += 50.0;
                case "Calça" -> total += 100.0;
                case "Jaqueta" -> total += 200.0;
            }
        }
        return total;
    }

    public void processarPedido() {
        double valorFinal = regraDesconto.calcular(total);
        System.out.println("Pedido processado com sucesso! Valor final com desconto R$ " + valorFinal);
    }
}
