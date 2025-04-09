package roteiro1.parte5;

import java.util.List;

public class CalculaPreco {
    public double calcularTotal(List<String> itens) {
        double total = 0;
        for (String item: itens)
            if (item.equals("Pizza")) total += 30.0;
            else if (item.equals("Bebida")) total += 10.0;
        return total - calcularDesconto(itens,total);
    }
    public double calcularDesconto(List<String> itens,double total) {
        double desconto = 0;
        if (itens.contains("Pizza") & itens.contains("Bebida")) total = total*.15;
        if (itens.contains("Pizza") & !itens.contains("Bebida")) total = total*.1;
        return total;
    }
}
