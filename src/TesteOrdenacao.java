public class TesteOrdenacao {
    public static void main(String[] args) {
        ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
        lista.adicionarFim(5);
        lista.adicionarFim(3);
        lista.adicionarFim(8);
        lista.adicionarFim(1);
        lista.adicionarFim(7);
        
        System.out.println("Lista antes do Bubble Sort:");
        System.out.println(lista);
        
        lista.bubbleSort();
        
        System.out.println("Lista após o Bubble Sort:");
        System.out.println(lista);
        
        int[] elementosParaBuscar = {1, 5, 9};
        for(int elemento : elementosParaBuscar) {
            int pos = lista.pesquisaBinaria(elemento);
            if(pos != -1){
                System.out.println("Elemento " + elemento + " encontrado na posição " + pos);
            } else {
                System.out.println("Elemento " + elemento + " não encontrado.");
            }
        }
    }
}