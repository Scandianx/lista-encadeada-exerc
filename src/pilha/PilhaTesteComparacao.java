package pilha;

public class PilhaTesteComparacao {
    public static void main(String[] args) {
        PilhaImplementacao pilha = new PilhaImplementacao();
        pilha.empilharElemento(2);
        pilha.empilharElemento(1);
        PilhaImplementacao pilha2 = new PilhaImplementacao();
        pilha2.empilharElemento(1);
        pilha2.empilharElemento(1);
        System.out.println(pilha2.compararPilha(pilha));
        pilha.empilharElemento(3);
        System.out.println(pilha.compararPilha(pilha2));
        pilha.empilharElemento(1);
        System.out.println(pilha.compararPilha(pilha2));
    }
}
