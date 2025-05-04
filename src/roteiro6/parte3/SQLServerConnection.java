package roteiro6.parte3;

public class SQLServerConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("Conectando com o SQL Server");
    }
}
