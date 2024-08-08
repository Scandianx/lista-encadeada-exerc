package pilha;

public class PilhaTeste {
    public static void main(String[] args) {
        Pilha pilha = new PilhaArray();
        pilha.empilharElemento(new No(7));
        pilha.empilharElemento(new No(3));
        pilha.empilharElemento(new No(2));
        pilha.empilharElemento(new No(1));
        System.out.println("Antes de desempilhar "+pilha);
        pilha.desempilharElemento();
        System.out.println("Pilha apos desempilhar " + pilha);
        System.out.println(pilha.obterTopo());
        System.out.println(pilha);
        pilha.desempilharElemento();
        System.out.println(pilha);
        System.out.println(pilha.estaVazia());
    }
}
