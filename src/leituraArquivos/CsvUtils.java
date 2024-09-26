package leituraArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvUtils {

    public List<Pessoa> lerCsv(String filePath) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
            boolean primeiraLinha = true;
            while ((linha = br.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue; // pula a primeira linha de cabeçalhos
                }
                String[] campos = linha.split(",");
                Pessoa pessoa = new Pessoa(
                        Integer.parseInt(campos[0]), // Id
                        campos[1],                    // Name
                        campos[2],                    // Short description
                        campos[3],                    // Gender
                        campos[4],                    // Country
                        campos[5],                    // Occupation
                        Integer.parseInt(campos[6])   // Birth year
                );
                pessoas.add(pessoa);
            }
        }
        return pessoas;
    }

    public void escreverCsv(List<Pessoa> pessoas, String filePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("Id,Name,Short description,Gender,Country,Occupation,Birth year\n");
            for (Pessoa pessoa : pessoas) {
                bw.write(pessoa.getId() + "," +
                        pessoa.getNome() + "," +
                        pessoa.getShortDescription() + "," +
                        pessoa.getGender() + "," +
                        pessoa.getCountry() + "," +
                        pessoa.getOccupation() + "," +
                        pessoa.getBirthYear() + "\n");
            }
        }
    }
}

