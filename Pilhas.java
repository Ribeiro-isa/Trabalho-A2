import java.util.Stack;

public class Biblioteca {

    private Stack<Operacao> pilhaDesfazer;

    // Implementar métodos para empilhar e desempilhar operações na pilha
    // Implementar método para desfazer a última operação

    private enum Operacao {
        CADASTRO,
        EDICAO,
        EXCLUSAO
    }
}
