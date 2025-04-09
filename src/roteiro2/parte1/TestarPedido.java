package roteiro2.parte1;

import java.util.Arrays;

public class TestarPedido {
    public static void main(String[] args) {
        PedidoService pedidoService = new PedidoService(Arrays.asList("Camiseta","Calça","Jaqueta"));
        pedidoService.processarPedido(0.1);
        pedidoService.processarPedido(0.0);
        pedidoService.processarPedido(0.4);
    }
}
