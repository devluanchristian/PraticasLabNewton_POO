import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class InserirRegistroLivro {

    // atributo onde será armazenado o meu comando SQL
    private static final String INSERT_LIVRO_SQL = "INSERT INTO livro (id_isbn, id_categoria, id_editora, nm_titulo, dt_publicacao, nu_edicao, nu_volume, vl_preco) VALUES  (?,?,?,?,?,?,?,?)";

    // Metodo que faz a inserção no banco de dados
    public void insertRecord() throws SQLException, ParseException {
        Connection conn = ConexaoPostgre.connect();

        java.util.Date dt_publicacao = new SimpleDateFormat("yyyy-MM-dd").parse("2022-11-17");

        try {
            PreparedStatement pstmt = conn.prepareStatement(INSERT_LIVRO_SQL);
            pstmt.setString(1, "12");
            pstmt.setInt(2, 1);
            pstmt.setInt(3, 2);
            pstmt.setString(4, "Marvel - Iron Man");
            pstmt.setDate(5, new Date(dt_publicacao.getTime()));
            pstmt.setInt(6, 13);
            pstmt.setInt(7, 1);
            pstmt.setDouble(8, 12.50);

            System.out.println(pstmt);
            
            pstmt.executeUpdate();

        } catch (SQLException e) {
            ConexaoPostgre.printSQLException(e);
        }

    }

}
