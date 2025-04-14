package roteiro3.parte1;

public class TesteTransporte {
    public static void main(String[] args) {
        // ÔNIBUS
        VeiculoTransporte onibus = new Onibus(5.00);
        System.out.println("Tarifa Ônibus: R$ " + onibus.calcularTarifa());

        // BICICLETA
        try {
            VeiculoTransporte bicicleta = new Bicicleta();
            System.out.println("Tarifa Bicicleta: R$ " + bicicleta.calcularTarifa());
        } catch (UnsupportedOperationException e) {
            System.out.println("Bicicletas não tem tarifa, então o cálculo será ignorado!");
        }
    }
}
