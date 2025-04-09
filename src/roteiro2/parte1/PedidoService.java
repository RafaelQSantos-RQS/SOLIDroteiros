package roteiro2.parte1;

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

    public PedidoService(List<String> itens) {
        this.itens = itens;
        this.total = this.calcularTotal();
    }

    public double aplicarDesconto(double desconto) {
        if (desconto > 0 && desconto < .3) {
            return this.total - (total*desconto);
        }
        return this.total;
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

    public void processarPedido(double desconto) {
        double valorFinal = aplicarDesconto(desconto);
    }
}
