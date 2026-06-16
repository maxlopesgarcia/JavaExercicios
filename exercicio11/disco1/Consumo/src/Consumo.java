import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) throws Exception {
         /* Lista que armazenará os usuários */
        ArrayList<Usuario> lista = new ArrayList<>();
 
        /* Representa o arquivo consumo.txt */
        File arquivo = new File("consumo.txt");
 
        /* Scanner usado para ler o arquivo */
        Scanner leitor = new Scanner(arquivo);
 
        /* Enquanto houver linhas no arquivo */
        while (leitor.hasNextLine()) {
 
            /* Lê uma linha completa */
            String linha = leitor.nextLine();
 
            /* Divide a linha usando ";" */
            String[] partes = linha.split(";");
 
            /* Guarda cada parte em variáveis */
            String nome = partes[0];
            double consumo = Double.parseDouble(partes[1]);
 
            /* Adiciona usuário na lista */
            lista.add(new Usuario(nome, consumo));
        }
 
        /* Fecha o leitor */
        leitor.close();
 
        /* Classifica o Arraylist */
        lista.sort(Comparator.comparing(Usuario::getNome));
 
        /* Calcula o espaço total utilizado */
        double espacoTotal = 0;
 
        for (Usuario usuario : lista) {
            espacoTotal += usuario.getConsumo();
        }
 
        /* Mostra os resultados */
        System.out.println("--------------------------------------------------------");
        System.out.println("Nr.   Usuário           Espaço utilizado        % do uso");
        System.out.println("--------------------------------------------------------");
 
        /* Mostra resultados */
        int i = 1;
 
        for (Usuario usuario : lista) {
 
            double espacoUtilizado = usuario.getConsumo() / 1024 / 1024;
            double porcentagemUso = (usuario.getConsumo() / espacoTotal) * 100;
 
            System.out.printf("%-5d %-15s %15.2f MB %15.2f\n", i, usuario.getNome(), espacoUtilizado, porcentagemUso);
 
            i++;
        }
 
        System.out.println("--------------------------------------------------------");
        
        /* Calcula a média de espaço ocupado */
        double media = espacoTotal / lista.size();
 
        System.out.printf("Espaço total ocupado: %.2f MB\n", espacoTotal / 1024 / 1024);
        System.out.printf("Espaço médio ocupado: %.2f MB\n", media / 1024 / 1024);
    }
}

