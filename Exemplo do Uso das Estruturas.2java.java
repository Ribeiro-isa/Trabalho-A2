// Cadastro de um novo livro
Biblioteca biblioteca = new Biblioteca();
Livro livro = new Livro("1234567890", "O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", "Martins Fontes", 1954, 10);
biblioteca.cadastrarLivro(livro);

// Empréstimo de um livro
Usuario usuario = new Usuario(1, "João Silva", "joaosilva@email.com", "(11) 9999-9999");
biblioteca.emprestarLivro(livro, usuario);

// Desfazer o empréstimo do livro (usando a pilha)
biblioteca.desfazerOperacao(); // Simula o desfazimento do empréstimo

// Reservar um livro
Reserva reserva = new Reserva(livro, usuario);
biblioteca.adicionarReservaLivro(reserva);

// Verificar se há reservas para o livro
if (biblioteca.haReservaParaLivro(livro)) {
    System.out.println("Há reservas para o livro " + livro.getTitulo());
} else {
    System.out.println("Não há reservas para o livro " + livro.getTitulo());
}
