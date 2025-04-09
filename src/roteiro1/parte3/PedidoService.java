package roteiro1.parte3;

import java.util.List;

public class PedidoService {
    private MysqlConnection mysqlConnection;
    private CalculaPreco calculaPreco;
    private List<String> itens;

    public PedidoService(MysqlConnection mysqlConnection, List<String> itens) {
        this.mysqlConnection = mysqlConnection;
        this.calculaPreco = new CalculaPreco();
        this.itens = itens;
    }

    public void processarPedido() {
        this.mysqlConnection.connect();
        double total = calculaPreco.calcularTotal(this.itens);
        System.out.println("Pedido processado. Valor total: R$" + total);
    }
}
