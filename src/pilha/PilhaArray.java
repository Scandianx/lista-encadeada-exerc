package pilha;

public class PilhaArray implements Pilha {

    private int[] elemento;
    private int topo;

    public PilhaArray() {
        this.elemento = new int[19];
        this.topo = 0;
    }

    @Override
    public boolean empilharElemento(No no) {
        System.out.println("-----------------------");
        System.out.println("Antes de adicionar " + no.obterDado());
       System.out.println(this.toString());
        System.out.println("-----------------------");

        for (int c = 0; c < 20; c++) {
            if (topo == 20) {
                System.out.println("Pilha cheia");
                return false;
                
            }
            if (c == topo) {
                elemento[c] = no.obterDado();
                topo++;
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean desempilharElemento() {
      if(topo>0) {
        topo--;
        return true;
      }
      System.out.println("Pilha vazia");
      return false;

    }

    @Override
    public int obterTopo() {
        
        return elemento[topo-1];
    }

    @Override
    public boolean estaVazia() {
        if (topo==0){
            return true;
        }
        else {
            return false;
        }
        
    }
    @Override
    public String toString(){
        String valores = new String();
        for (int i = 0; i < topo; i++) {
           valores = valores + " " + elemento[i];
        }
        return "Lista: [" + valores + "]";
    }
}
