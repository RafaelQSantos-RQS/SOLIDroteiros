package roteiro6.parte3;

public class TesteConexao {

    public static void main(String[] args) {
        OracleConnection oracleConnection = new OracleConnection();
        MysqlConnection mysqlConnection = new MysqlConnection();
        SQLServerConnection sqlServerConnection = new SQLServerConnection();

        ServicoQuarto quarto = new ServicoQuarto(oracleConnection);
        quarto.verificarQuarto();
        ServicoQuarto quarto1 = new ServicoQuarto(mysqlConnection);
        quarto1.verificarQuarto();
        ServicoQuarto quarto2 = new ServicoQuarto(sqlServerConnection);
        quarto2.verificarQuarto();

        ServicoReserva reserva = new ServicoReserva(oracleConnection);
        reserva.criarReserva();
        ServicoReserva reserva1 = new ServicoReserva(mysqlConnection);
        reserva1.criarReserva();
        ServicoReserva reserva2 = new ServicoReserva(sqlServerConnection);
        reserva2.criarReserva();

        RelatorioReserva relatorio = new RelatorioReserva(oracleConnection);
        relatorio.gerarRelatorio();
        RelatorioReserva relatorio1 = new RelatorioReserva(mysqlConnection);
        relatorio1.gerarRelatorio();
        RelatorioReserva relatorio2 = new RelatorioReserva(sqlServerConnection);
        relatorio2.gerarRelatorio();
    }
}