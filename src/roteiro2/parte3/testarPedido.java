package roteiro2.parte3;


import java.util.Arrays;

public class testarPedido {
    public static void main(String[] args) {

        // Desconto Padrão
        RegraDesconto descontoPadrao = new DescontoPadrao();
        PedidoService pedidoPadrao = new PedidoService(Arrays.asList("Camiseta","Jaqueta","Calça"),descontoPadrao);
        pedidoPadrao.processarPedido();

        // Desconto VIP
        RegraDesconto descontoVIP = new DescontoVIP();
        PedidoService pedidoVIP = new PedidoService(Arrays.asList("Camiseta","Jaqueta","Calça"),descontoVIP);
        pedidoVIP.processarPedido();
    }
}
