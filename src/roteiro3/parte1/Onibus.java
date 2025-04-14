package roteiro3.parte1;

public class Onibus extends VeiculoTransporte{
    public Onibus(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularTarifa() {
        return super.calcularTarifa() * 1.2; // Aumento e 20% p/ longas distâncias
    }
}
