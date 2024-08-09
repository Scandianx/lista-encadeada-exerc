package fila;

import pilha.Pilha;

public class FuncoesExerc3 {
    
    public static void separarFilas(Fila filaOriginal, Fila filaImpar, Fila filaPar) {
        System.out.println("Fila original inicio: " + filaOriginal);
        while (!filaOriginal.estaVazia()) {
            int num = filaOriginal.obterPrimeiro();
            
            if (num%2==0) {
                filaPar.adicionar(num);
            } else {
                filaImpar.adicionar(num);
            }
            filaOriginal.excluir();


        }
        System.out.println("Fila original: " + filaOriginal);
        System.out.println("Fila par: " + filaPar);
        System.out.println("Fila impar: " + filaImpar);
    }
    public static Fila inverterFila(Pilha pilha, Fila fila) {
        int numAuxiliar;
        while (!fila.estaVazia()) {
            numAuxiliar = fila.obterPrimeiro();
            pilha.empilharElemento(numAuxiliar);
            fila.excluir();
        }
        while(!pilha.estaVazia()){
            numAuxiliar= pilha.obterTopo();
            pilha.desempilharElemento();
            fila.adicionar(numAuxiliar);
        }
        return fila;
    }
}
