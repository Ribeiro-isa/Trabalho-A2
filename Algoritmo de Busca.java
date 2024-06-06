public class Biblioteca {

    public List<Livro> buscarLivrosPorTitulo(String titulo) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> buscarLivrosPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> buscarLivrosPorISBN(String isbn) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getIsbn().equals(isbn)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> buscarLivrosPorGenero(String genero) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getGenero().toLowerCase().equals(genero.toLowerCase())) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> buscarLivrosPorEditora(String editora) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getEditora().toLowerCase().equals(editora.toLowerCase())) {     
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }
