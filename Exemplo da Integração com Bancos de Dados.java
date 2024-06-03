import java.sql.*;

public class BibliotecaDAO {

    private Connection conexao;

    public BibliotecaDAO() {
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "usuario", "senha");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void salvarLivro(Livro livro) {
        try {
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO livros (isbn, titulo, autor, genero, editora, ano_publicacao, quantidade_estoque, resumo) VALUES (?, ?, ?, ?, ?, ?,
