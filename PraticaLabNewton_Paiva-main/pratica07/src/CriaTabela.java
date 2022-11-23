
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaTabela {

    // atributo onde será armazenado o meu comando SQL
    private static final String createTableSQL =

            "CREATE TABLE cidade" +
                    "(ID INT PRIMARY KEY, " +
                    " EMAIL VARCHAR(50), " +
                    " COUNTRY VARCHAR(50), " +
                    " PASSWORD VARCHAR(50))";

    public void criaTabela() throws SQLException {

        try (Connection conn = ConexaoPostgre.connect()) {
            Statement statement = conn.createStatement();

            // executando a query
            System.out.println(statement);
            statement.execute(createTableSQL);

        } catch (SQLException e) {

            printSQLException(e);
        }

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
