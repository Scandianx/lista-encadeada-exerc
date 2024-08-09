package pilha;

public class PilhaTeste {
    public static void main(String[] args) {
        Pilha pilha = new PilhaArray();
        pilha.empilharElemento(1);
        pilha.empilharElemento(2);
        
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
