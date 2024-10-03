package leituraArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvUtils {

    public void escreverCsv(List<Pessoa> pessoas, String filePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("Nome,Descricao,Genero,Pais,Emprego,Ano nasc,Ano morte\n");
            for (Pessoa pessoa : pessoas) {
                bw.write(
                        pessoa.getNome() + "," +
                        pessoa.getShortDescription() + "," +
                        pessoa.getGender() + "," +
                        pessoa.getCountry() + "," +
                        pessoa.getOccupation() + "," +
                        pessoa.getBirthYear() + "," +
                        pessoa.getDeathyear()
                        + "\n");
            }
        }
    }

    public List<Pessoa> lerCsv(String filePath) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
            boolean primeiraLinha = true;
            while ((linha = br.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue; 
                }
                String[] campos = processarLinha(linha);
                if (campos.length>7) {
                    Pessoa pessoa = new Pessoa(
                        campos[7], 
                        campos[1], 
                        campos[2], 
                        campos[3], 
                        campos[4], 
                        campos[5], 
                        campos[6]
                );
                pessoas.add(pessoa);
                } else {
                    Pessoa pessoa = new Pessoa(
                        null, 
                        campos[1], 
                        campos[2], 
                        campos[3], 
                        campos[4], 
                        campos[5], 
                        campos[6]
                );
                pessoas.add(pessoa);
                }
                
            }
        }
        // pessoas.forEach(v -> System.out.println("Nome:" + v.getNome() + "descricao: " + v.getShortDescription() + "genero " +v.getGender() + "pais " + v.getCountry() + v.getOccupation() + v.getBirthYear()));
        return pessoas;
    }

    public String[] processarLinha(String linha) {
        String[] retornoArray = new String[200];
        retornoArray[0] = "";
        int tamanho = linha.length();
        char v = ',';
        char asp = '"';
        int colunas = 0;
        
        // Escapar aspas (lembrar qnd fabio perguntar)
        if (!linha.contains("\"")) {
            return linha.split(",");
        } else {
            for(int i=0; i< tamanho; i++) {
                if(linha.charAt(i)==v) {
                    colunas++;
                    retornoArray[colunas] = "";
                } else {
                    if (linha.charAt(i)==asp) {
                        
                        String retorno = processarAspas(linha.substring(i + 1));
                        retornoArray[colunas] = retorno;
                        i = i + retorno.length() + 1;
                        
                    }  else {
                        retornoArray[colunas] = retornoArray[colunas] + linha.charAt(i);
                    }
                }
            }
        }
        
        return retornoArray;
    }
    private String processarAspas(String linha) {
        
        int tamanho = linha.length();
        char asp = '"';
        StringBuilder retorno = new StringBuilder();
        for(int i=0; i< tamanho; i++) {
            if (linha.charAt(i)==asp) {
                return retorno.toString();
            }
            retorno.append(linha.charAt(i));
        }
        return retorno.toString();
    }
}
