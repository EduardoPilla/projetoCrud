package BD;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static final String USERNAME = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://localhost:3306/poo?zeroDateTimeBehavior=convertToNull";
    
    public static Connection criarConexao() throws Exception{
        Connection conn = DriverManager.getConnection(URL, USERNAME, SENHA);
        
        return conn;
    }
    
    
    public static void main(String[] args) throws Exception {
        Connection c = criarConexao();
        
        if (c != null){
            System.out.println("Conexão com sucesso!");
            System.out.println(c);
        } else {
            System.out.println("Erro de conexão");
        }
    }
}
