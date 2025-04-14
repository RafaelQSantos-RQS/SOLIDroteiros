package roteiro3.parte3;

public abstract class VeiculoTransporte {
    double distancia;

    public abstract double calcularTarifa();

    public VeiculoTransporte(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public abstract double calcularTotalCombustivel(double consumoPorKm);
}
