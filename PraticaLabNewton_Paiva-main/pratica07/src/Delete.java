import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    private static final String DELETE_USERS_SQL = "delete from Livro where id_isbn = ?;";

    public int deleteRecord(String id_isbm) throws SQLException {
        int result = 0;
        try (Connection conn = ConexaoPostgre.connect()) {
            System.out.println(DELETE_USERS_SQL);

            PreparedStatement pstmt = conn.prepareStatement(DELETE_USERS_SQL);
            pstmt.setString(1, id_isbm);
            result = pstmt.executeUpdate();
            System.out.println("ID ("+ result+") Foi apagado com sucesso!");

        } catch (SQLException e) {
            printSQLException(e);
        }
        return result;

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
