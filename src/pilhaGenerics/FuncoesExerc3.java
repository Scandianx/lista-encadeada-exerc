package pilhaGenerics;

public class FuncoesExerc3 {
    public static void main(String[] args) {
        System.out.println(inverterString("filipe"));
        System.out.println(verificarEquacao("(ewewewwew()"));
    }

    public static String inverterString(String dado) {

        PilhaEncadeada<Character> pilha = new PilhaEncadeada<>();
        for (int i = 0; i < dado.length(); i++) {
            char caractere = dado.charAt(i);
            pilha.push(caractere);
        }
        String stringInversa = "";
        for (int i = 0; i < dado.length(); i++) {
            char caractere2 = pilha.pop();
            stringInversa = stringInversa + caractere2;
            
        }
        return stringInversa;
    }

    public static boolean verificarEquacao(String dado) {
        PilhaEncadeada<Character> pilha = new PilhaEncadeada<>();
        for (int i = 0; i < dado.length(); i++) {
            char caractere = dado.charAt(i);
            if(caractere=='('){
                pilha.push(caractere);
            } else {
                if (caractere==')') {
                    pilha.pop();
                }
            }
            
        }
        return pilha.isEmpty();
    }

}
