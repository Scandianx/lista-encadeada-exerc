package recursao;

public class RecursaoTeste {
    public static void main(String[] args) {
        System.out.println(inverterString("teste"));
        int [] teste = new int[4];
        
        
    }
    public static int somaVetor(int[] vetor, int aux) {
       if (aux==vetor.length) {
         return vetor[aux];
       }
       vetor[aux+1] = vetor[aux] + vetor[aux + 1];
       
         return somaVetor(vetor, aux+1);

    }
    public static String inverterString(String input) {
       
        if (input.isEmpty()) {
            return input;
        }
        
        return inverterString(input.substring(1)) + input.charAt(0);
    }

}
