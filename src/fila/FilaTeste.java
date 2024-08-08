package fila;

public class FilaTeste {
    public static void main(String[] args) {
        Fila fila = new FilaArray();
        System.out.println(fila.estaVazia());
        fila.adicionar(1);
        fila.adicionar(2);
        fila.adicionar(3);
        System.out.println("primeiro: "+ fila.obterPrimeiro());
        System.out.println(fila);
        fila.excluir();
        System.out.println("Fila após exclusao: " + fila);
        fila.adicionar(3);
        fila.adicionar(8);
        fila.adicionar(3);
        System.out.println(fila);
        System.out.println(fila.estaVazia());

    }
}
