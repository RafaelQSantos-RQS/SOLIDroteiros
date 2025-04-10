package roteiro2.parte2;

import java.util.Arrays;

public class testarPedido {
    public static void main(String[] args) {
        DescontoLivre descontoLivre = new DescontoLivre(.12);
        PedidoService pedidoService = new PedidoService(Arrays.asList("Camiseta","Calça","Jaqueta"),descontoLivre);

        pedidoService.processarPedido();
    }
}
