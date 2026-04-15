import java.util.*;
// Crie uma classe Produto com os atributos privados nome e preco. No programa principal, insira 5 produtos
// em um ArrayList.
// 1. Liste todos os produtos.
// 2. Liste todos os produtos em ordem crescente de nome.
// 3. Liste todos os produtos em ordem crescente de preço.
// 4. Mostre apenas os produtos com preco maior que 100.
// 5. Busque um produto na lista e apresente uma de 2 mensagens: "O produto foi encontrado!" ou "O
// produto não existe na lista".
// 6. Busque e exclua um produto na lista e apresente uma de 2 mensagens: "O produto foi excluído!" ou
// "O produto não existe na lista".
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Produto> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
       while (true) { 
           System.out.println("-----menu-----");
           System.out.println("[1]cadastrar");
           System.out.println("[2]listar");
           System.out.println("[3]listar em crescente");
           System.out.println("[4]listar preco crescente");
           System.out.println("[5]mostrar maior 100");
           System.out.println("[6]buscar produto");
           System.out.println("[7]remover produto");
           System.out.println("[8]sair");
           System.out.println("informe o numero: ");
           opcao = scanner.nextInt();
           if(opcao == 8 ) break;
           boolean resultado = false;
            switch (opcao) {
                case 1://cadastrar
                    scanner.nextLine();
                    System.out.println("Informe nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe preco: ");
                    int preco = scanner.nextInt();
                    lista.add(new Produto(nome, preco));   
                    scanner.nextLine();
                    break;
                case 2://listar
                    if(lista.isEmpty()){
                        System.out.println("cadastre 1 meu rei");
                    }
                    else{
                        for(int i = 0; i < lista.size(); i++){
                            System.out.println("nome: " + lista.get(i).getNome());
                            System.out.println("preco : "+ lista.get(i).getPreco());
                            System.out.println();
                        }
                    }
                    break;
                case 3://listar em crescente
                    if(lista.isEmpty()){
                        System.out.println("cadastre 1 meu rei");
                    }
                    else{
                        for(int i = 0; i < lista.size(); i++){
                            lista.sort(Comparator.comparing(Produto::getNome));
                            System.out.println("nome: " + lista.get(i).getNome());
                            System.out.println("preco : "+ lista.get(i).getPreco());
                            System.out.println();
                        }
                    }
                    break;
                case 4://listar preco crescente
                    if(lista.isEmpty()){
                        System.out.println("cadastre 1 meu rei");
                    }
                    else{
                        for(int i = 0; i < lista.size(); i++){
                        lista.sort(Comparator.comparing(Produto::getPreco));
                        System.out.println("nome: " + lista.get(i).getNome());
                        System.out.println("preco : "+ lista.get(i).getPreco());
                        System.out.println();
                        }
                    }
                    break;
                case 5://mostrar maior 100
                    if(lista.isEmpty()){
                        System.out.println("cadastre 1 meu rei");
                    }
                    else{
                        for(int i =0;i<lista.size();i++){
                            if(lista.get(i).getPreco()>100){
                                System.out.println("nome: " + lista.get(i).getNome());
                                System.out.println("preco : "+ lista.get(i).getPreco());
                                System.out.println(); 
                            }
                        }
                    }
                    break;
                case 6://buscar produto
                if(lista.isEmpty()){
                    System.out.println("cadastre 1 meu rei");
                }
                else {
                    System.out.println("informe o nome para busca: ");
                    String nomeBusca = scanner.nextLine();
                    for(int i =0;i<lista.size();i++){
                        if(lista.get(i).getNome().equalsIgnoreCase(nomeBusca)){
                            resultado = true;
                            System.out.println("nome: " + lista.get(i).getNome());
                            System.out.println("preco : "+ lista.get(i).getPreco());
                            System.out.println(); 
                        }
                    }
                }
                if(!resultado){
                    System.out.println("nao encontrado");
                }

                    break;
                case 7://mostrar maior 100
                    
                    break;

                default:
                    System.out.println("numero invalido");
            }

       }
    }
}
