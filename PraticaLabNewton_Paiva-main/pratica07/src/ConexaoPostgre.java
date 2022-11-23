import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgre {
    // caminho do banco postgre
    private static final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
    // nome do usuario do postgre
    private final static String user = "postgres";
    // senha de acesso ao banco
    private final static String password = "1234";

    static Connection conn = null;

    /*
     * Conexão com o banco de dados
     */
    public static Connection connect() {

        try {
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Conectado com o banco de dados Postgre!");
            } else {
                System.out.println("Falha na conexão!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return conn;

    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }

    }
}