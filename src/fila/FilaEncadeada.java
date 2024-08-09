package fila;

public class FilaEncadeada implements Fila  {
    private No inicio = null;
    
    private int tamanho = 0;
    

    @Override
    public void adicionar(int valor) {
        No auxiliar=this.inicio;
        No anterior = null;
        if(this.inicio==null) {
            this.inicio = new No(valor);
            tamanho++;
            return;
        }
        while(auxiliar!=null){
            anterior = auxiliar;
            auxiliar = auxiliar.obterProximo();
        }
        No novoNo = new No(valor);
        anterior.definirProximo(novoNo);
        
        tamanho++;
    }

    @Override
    public void excluir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
            return;
        }
        if(this.inicio.obterProximo()==null) {
             this.inicio=null;
             tamanho--;
             return;
        }
        this.inicio = this.inicio.obterProximo();
        tamanho--;
        

     

        
    }

    @Override
    public int obterPrimeiro() {
        if (!estaVazia()) {
            return this.inicio.obterDado();
        }
        System.out.println("A pilha está vazia ");
       return -1;

    }

    @Override
    public boolean estaVazia() {
        
        if (this.inicio==null) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        StringBuilder elementos = new StringBuilder();
        No noAtual = inicio;
        while (noAtual != null) {
            elementos.append(noAtual.obterDado()).append(" ");
            noAtual = noAtual.obterProximo();
        }
        return "Fila [ " + elementos.toString().trim() + " ] com " + tamanho + " elementos";
    }
    
}
