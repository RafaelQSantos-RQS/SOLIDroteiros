package roteiro3.parte3;

public class TesteTransporte {
    public static void main(String[] args) {
        VeiculoTransporte onibus = new Onibus(5.00,10.00);
        VeiculoTransporte bicicleta = new Bicicleta(10.0);

        System.out.println("## ÔNIBUS ##");
        System.out.println("Tarifa: R$ " + onibus.calcularTarifa());
        System.out.println("Distância: " + onibus.getDistancia());
        System.out.println("Consumo Total: " + onibus.calcularTotalCombustivel(12));

        System.out.println();

        System.out.println("## BICICLETA ##");
        System.out.println("Tarifa: R$ " + bicicleta.calcularTarifa());
        System.out.println("Distância: " + bicicleta.getDistancia());
        System.out.println("Consumo Total: " + bicicleta.calcularTotalCombustivel(12));
    }
}
