package pilha;

public class PilhaImplementacao implements Pilha {
    private No noInical = null;
    private int tamanho = 0;

    @Override
    public boolean empilharElemento(int num) {
        No no = new No(num);
        no.definirProximo(noInical);
        noInical = no;
        tamanho++;
        return true;
    }

    @Override
    public boolean desempilharElemento() {
        if (noInical == null) {
            return false;
        }
        noInical = noInical.obterProximo();
        tamanho--;
        return true;
    }

    @Override
    public int obterTopo() {
        return noInical.obterDado();
    }

    @Override
    public boolean estaVazia() {
        return noInical == null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean compararPilha(PilhaImplementacao pilha){

        if (pilha.getTamanho() != this.getTamanho()) {
            return false;
        }
        No noAtual = this.noInical;
        No noComparar = pilha.noInical;
        while (noAtual != null && noComparar != null) {
            if(noAtual.obterDado()!= noComparar.obterDado()){
                return false;
            }
            noAtual = noAtual.obterProximo();
            noComparar = noComparar.obterProximo();
            


        } 
        return true;
    }
    @Override
    public String toString() {
        StringBuilder elementos = new StringBuilder();
        No noAtual = noInical;
        while (noAtual != null) {
            elementos.append(noAtual.obterDado()).append(" ");
            noAtual = noAtual.obterProximo();
        }
        return "Pilha [ " + elementos.toString().trim() + " ]";
    }
}