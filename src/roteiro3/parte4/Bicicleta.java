package roteiro3.parte4;

public class Bicicleta extends VeiculoTransporte {
    public Bicicleta(double distancia) {
        super(distancia);
    }

    @Override
    public double calcularTarifa() {
        return 0; // Agora Bicicleta pode ser tratada como um veículo, sem lançar exceções
    }
}