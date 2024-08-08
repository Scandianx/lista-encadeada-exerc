package fila;

public class FilaArray implements Fila{

    private int[] elemento;
    private int topo;

    public FilaArray() {
        this.elemento = new int[19];
        this.topo = 0;
    }

    @Override
    public void adicionar(int valor) {
        if (this.topo == 20) {
            System.out.println("Fila cheia");
            return;
        }
        this.elemento[this.topo] = valor;
        topo++;

       
    }

    @Override
    public void excluir() {
        for (int i = 0; i < topo; i++) {
          elemento[i] = elemento[i + 1];
        }
        topo--;
    }

    @Override
    public int obterPrimeiro() {
        return elemento[0];
    }

    @Override
    public boolean estaVazia() {
        return topo == 0;
    }
    public String toString(){
        String valores = new String();
        for (int i = 0; i < topo; i++) {
           valores = valores + " " + elemento[i];
        }
        return "Fila: [" + valores + "]";
    }
}
