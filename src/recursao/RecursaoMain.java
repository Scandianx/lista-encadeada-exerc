package recursao;

public class RecursaoMain {

    public static int somaRecursiva(int[] vetor, int tamanho) {
        if (tamanho == 0) {
            return 0;
        }
        return vetor[tamanho - 1] + somaRecursiva(vetor, tamanho - 1);
    }

    public static String inverteString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return inverteString(str.substring(1)) + str.charAt(0);
    }

    public static int maiorElemento(int[] vetor, int tamanho) {
        if (tamanho == 1) {
            return vetor[0];
        }
        int maiorDosRestantes = maiorElemento(vetor, tamanho - 1);
        return Math.max(vetor[tamanho - 1], maiorDosRestantes);
    }

    public static void main(String[] args) {
        int[] vetorSoma = {1, 2, 3, 4, 5};
        int soma = somaRecursiva(vetorSoma, vetorSoma.length);
        System.out.println("Soma dos elementos do vetor: " + soma);

        String original = "recursivo";
        String invertida = inverteString(original);
        System.out.println("String invertida: " + invertida);

        int[] vetorMaior = {10, 20, 15, 25, 5};
        int maior = maiorElemento(vetorMaior, vetorMaior.length);
        System.out.println("Maior elemento do vetor: " + maior);
    }
}

