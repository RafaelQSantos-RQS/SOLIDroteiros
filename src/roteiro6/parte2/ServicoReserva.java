package roteiro6.parte2;

public class ServicoReserva {
    private OracleConnection connection;

    public ServicoReserva() {
        this.connection = new OracleConnection();
    }

    void criarReserva() {
        this.connection.connect();

        System.out.println("Lógica de negócio para Reserva de quarto.");
    }
}
