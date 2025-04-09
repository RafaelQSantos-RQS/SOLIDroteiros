package roteiro1.parte4;

import java.util.List;

public class PedidoService {
    private MysqlConnection connection;
    private List<String> itens;

    public PedidoService(List<String> itens) {
        this.connection = new MysqlConnection();
        this.itens = itens;
    }

    private double calcularTotal() {
        double total = 0;
        for (String item: this.itens) {
            if (item.equals("Pizza")) total += 30.0;
            else if (item.equals("Bebida")) total += 10.0;
        }
        if (itens.contains("Pizza") & itens.contains("Bebida")) total = total*.85;
        if (itens.contains("Pizza") & !itens.contains("Bebida")) total = total*.9;
        return total;
    }

    public void processarPedido() {
        this.connection.connect();
        double total = calcularTotal();
        System.out.println("Pedido processado. Valor total: R$" + total);
    }
}
