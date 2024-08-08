package pilha;

public class PilhaImplementacao implements Pilha {
    private No noInical = null;
    private int tamanho = 0;

    @Override
    public boolean empilharElemento(No no) {
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