package fila;

import pilha.PilhaImplementacao;
import pilha.Pilha;
public class FilaTeste {
    public static void main(String[] args) {
        Fila fila = new FilaEncadeada();
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
        Fila fila2=  new FilaEncadeada();
        Fila fila3=  new FilaEncadeada();
        // Teste de separar filas
        FuncoesExerc3.separarFilas(fila, fila2, fila3);
        fila.adicionar(3);
        fila.adicionar(4);
        fila.adicionar(10);
        fila.adicionar(11);
        System.out.println(fila);
        Pilha pilha= new PilhaImplementacao();
        System.out.println(FuncoesExerc3.inverterFila(pilha, fila));


    }
}
