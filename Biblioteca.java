import java.util.LinkedList;
import java.util.Queue;

public class Biblioteca {

    private Queue<Reserva> filaEsperaLivros;

    // Implementar métodos para enfileirar e desenfileirar reservas na fila
    // Implementar método para verificar se há reservas para um livro específico

    private class Reserva {
        private Livro livro;
        private Usuario usuario;
    }
}
