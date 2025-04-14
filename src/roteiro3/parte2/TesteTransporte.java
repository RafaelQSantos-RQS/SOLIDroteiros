package roteiro3.parte2;

public class TesteTransporte {
    public static void main(String[] args) {
        VeiculoTransporte onibus = new Onibus(5.00);
        VeiculoTransporte bicicleta = new Bicicleta();

        System.out.println("Tarifa Ônibus: R$ " + onibus.calcularTarifa());
        System.out.println("Tarifa Bicicleta: R$ " + bicicleta.calcularTarifa());
    }
}
