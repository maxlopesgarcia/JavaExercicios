import java.util.ArrayList;
import java.util.Comparator;

public class Estoque {
    public static void main(String[] args) throws Exception {
       ArrayList<Produto> lista = new ArrayList<>();
       lista.add(new Produto("Produto F", 30));
       lista.add(new Produto("Produto A", 20));
       lista.add(new Produto("Produto D", 10));
       lista.add(new Produto("Produto E", 70));
       lista.add(new Produto("Produto B", 110));

       for(int i=0; i<lista.size(); i++){
        System.out.println("Nome produto: " + lista.get(i).getNome());
        System.out.println("Preco produto: "+ lista.get(i).getPreco());
        System.out.println();
       }
       lista.sort(Comparator.comparing(Produto::getNome));
       for( int i = 0; i < lista.size();i++){
        System.out.println("nome produto: "+ lista.get(i).getNome());
        System.out.println("preco produto: "+ lista.get(i).getPreco());
        System.out.println();
       }
       for(int i =0; i< lista.size(); i++){
        if(lista.get(i).getPreco() > 100){
            System.out.println("nome produto: " + lista.get(i).getNome());
            System.out.println("preco produto: "+ lista.get(i).getPreco());
            System.out.println();
        }
       }
       String nomeBusca = "Produto F";
       boolean encontrado = false;
       for(int i =0; i< lista.size(); i++){
        if(lista.get(i).getNome().equalsIgnoreCase(nomeBusca)){
            System.out.println("produto encontrado");
            encontrado = true;
        }
       }
       if(!encontrado){
        System.out.println("O produto nao existe na lista!");
       }
       String nomeExclua = "Produto A";
       boolean encontrei = false;
       for(int i=0; i< lista.size();i++){
        if(lista.get(i).getNome().equalsIgnoreCase(nomeExclua)){
            lista.remove(i);
           System.out.println("O produto foi excluido!");
           encontrei = true;
        }
       }
       if(!encontrei){
        System.out.println("O produto nao existe na lista!");
       }
    }
}
