import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizaRegistro {
    private static final String UPDATE_USE_SQL = "update livro set nm_titulo = ? where id_isbn = ?";

    public void atualiza() throws SQLException {
        Connection conn = ConexaoPostgre.connect();

        try {

            PreparedStatement ps = conn.prepareStatement(UPDATE_USE_SQL);
            ps.setString(1, "RAM");
            ps.setString(2, "18");

            System.out.println(ps);
            ps.executeUpdate();

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
