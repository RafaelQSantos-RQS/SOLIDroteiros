package roteiro1.parte2;

import java.util.List;

public class PedidoService {
    private MysqlConnection mysqlConnection;
    private List<String> itens;

    public PedidoService(MysqlConnection mysqlConnection,List<String> itens) {
        this.mysqlConnection = mysqlConnection;
        this.itens = itens;
    }

    private double calcularTotal() {
        double total = 0;
        for (String item: this.itens) {
            if (item.equals("Pizza")) total += 30.0;
            else if (item.equals("Bebida")) total += 10.0;
        }
        return total;
    }

    public void processarPedido() {
        this.mysqlConnection.connect();
        double total = calcularTotal();
        System.out.println("Pedido processado. Valor total: R$" + total);
    }
}
