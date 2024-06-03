import java.util.Arrays;
import java.util.Collections;

public class Biblioteca {

    public List<Livro> listarLivrosOrdenadosPorTitulo() {
        List<Livro> livrosOrdenados = new ArrayList<>(listaLivros);
        Collections.sort(livrosOrdenados, (livro1, livro2) -> livro1.getTitulo().compareToIgnoreCase(livro2.getTitulo()));
        return livrosOrdenados;
    }

    public List<Livro> listarLivrosOrdenadosPorAutor() {
        List<Livro> livrosOrdenados = new ArrayList<>(listaLivros);
        Collections.sort(livrosOrdenados, (livro1, livro2) -> livro1.getAutor().compareToIgnoreCase(livro2.getAutor()));
        return livrosOrdenados;
    }

    public List<Livro> listarLivrosOrdenadosPorGenero() {
        List<Livro> livrosOrdenados = new ArrayList<>(listaLivros);
        Collections.sort(livrosOrdenados, (livro1, livro2) -> livro1.getGenero().compareToIgnoreCase(livro2.getGenero()));
        return livrosOrdenados;
    }

    public List<Livro> listarLivrosOrdenadosPorAnoPublicacao() {
        List<Livro> livrosOrdenados = new ArrayList<>(listaLivros);
        Collections.sort(livrosOrdenados, (livro1, livro2) -> Integer.compare(livro1.getAnoPublicacao(), livro2.getAnoPublicacao()));
        return livrosOrdenados;
    }

    public List<Livro> listarLivrosOrdenadosPorQuantidadeEstoque() {
        List<Livro> livrosOrdenados = new ArrayList<>(listaLivros);
        Collections.sort(livrosOrdenados, (livro1, livro2) -> Integer.compare(livro2.getQuantidadeEstoque(), livro1.getQuantidadeEstoque()));
        return livrosOrdenados;
    }
}
