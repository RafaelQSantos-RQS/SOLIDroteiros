package roteiro6.parte3;

public class ServicoQuarto {
    private Connection connection;

    public ServicoQuarto(Connection connection) {
        this.connection = connection;
    }

    public void verificarQuarto(){
        this.connection.connect();
        System.out.println("Lógica de negócio para o Serviço de Quarto");
    }
}
