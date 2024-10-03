package leituraArquivos;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CsvUtils csvUtils = new CsvUtils();
        String inputPath = "C:\\Users\\Filipe\\Desktop\\Git repositories\\exercs\\lista-encadeada-exerc\\AgeDataset-V1.csv";
        String outputPath = "FilteredDataset.csv";
        try {
            List<Pessoa> pessoas = csvUtils.lerCsv(inputPath);
            csvUtils.escreverCsv(pessoas, outputPath);
            System.out.println("Arquivo CSV filtrado gerado com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
