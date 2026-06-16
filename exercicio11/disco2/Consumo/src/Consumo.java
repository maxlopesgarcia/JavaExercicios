import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.util.Collections;
 
class Consumo {
 
    public static void main(String[] args) throws Exception {
 
        /* Lista que armazenará as linhas do arquivo */
        ArrayList<String> lista = new ArrayList<>();
 
        /* Arquivo */
        File arquivo = new File("consumo.txt");
 
        /* Leitura do arquivo */
        Scanner leitor = new Scanner(arquivo);
 
        while (leitor.hasNextLine()) {
            lista.add(leitor.nextLine());
        }
 
        leitor.close();
 
        /* Ordena alfabeticamente */
        Collections.sort(lista);
 
        /* Calcula espaço total */
        double espacoTotal = 0;
 
        for (String linha : lista) {
 
            String[] partes = linha.split(";");
            double consumo = Double.parseDouble(partes[1]);
            espacoTotal += consumo;
        }
 
        /* Cabeçalho */
        System.out.println("--------------------------------------------------------");
        System.out.println("Nr.   Usuário           Espaço utilizado        % do uso");
        System.out.println("--------------------------------------------------------");
 
        /* Exibe resultados */
        int i = 1;
 
        for (String linha : lista) {
 
            String[] partes = linha.split(";");
 
            String nome = partes[0];
            double consumo = Double.parseDouble(partes[1]);
            double espacoUtilizado = consumo / 1024 / 1024;
            double porcentagemUso = consumo / espacoTotal * 100;
 
            System.out.printf("%-5d %-15s %15.2f MB %14.2f%%\n", i, nome, espacoUtilizado,porcentagemUso);
        
            i++;
        }
 
        System.out.println("--------------------------------------------------------");
 
        /* Calcula a média de espaço ocupado */
        double media = espacoTotal / lista.size();
 
        System.out.printf("Espaço total ocupado: %.2f MB\n", espacoTotal / 1024 / 1024);
        System.out.printf("Espaço médio ocupado: %.2f MB\n", media / 1024 / 1024);
        
    }
}