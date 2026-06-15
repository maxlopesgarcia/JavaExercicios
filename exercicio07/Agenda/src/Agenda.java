import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;


public class Agenda {
    public static void main(String[] args) throws Exception {
        Scanner  scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();
        int opcao;
        while(true){
            menuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine();
            if(opcao == 5){
                break;
            }
            switch (opcao){
                case 1:
                    adicionarContato(scanner, lista);
                    break;
                case 2:
                    while(true){
                        menuEditar();
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        if(opcao == 3){
                            break;
                        }
                        switch (opcao){
                            case 1:
                                editarTelefone(scanner, lista);
                                break;
                            case 2:
                                editarEmail(scanner, lista);
                                break;
                            default:
                                System.out.println("opcao invalida");
                        }
                    }
                    break;
                case 3:
                    excluirContato(scanner, lista);
                    break;
                case 4:
                    listarContatos(lista);
                    break;
                default:
                    System.out.println("opcao invalida");
            }
            System.out.println();
        }
        scanner.close();
    }
    public static void menuPrincipal(){
        System.out.println("======= AGENDA =======");
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Editar contato");
        System.out.println("[3] Excluir contato");
        System.out.println("[4] Listar contatos");
        System.out.println("[5] Sair");
        System.out.print("\nEscolha uma opcao: ");
    }
    public static void menuEditar(){
        System.out.println("\n=== EDITAR CONTATO ===");
        System.out.println("[1] Editar telefone");
        System.out.println("[2] Editar email");
        System.out.println("[3] Voltar");
        System.out.print("\nEscolha uma opcao: ");
    }
    public static void adicionarContato(Scanner scanner, ArrayList<Contato> lista){
        System.out.print("nome: ");
        String nome = scanner.nextLine();
        System.out.print("telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("email: ");
        String email = scanner.nextLine();

        lista.add(new Contato(nome, telefone, email));
        System.out.println("contato adicionado");

    }
    public static void editarTelefone(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("lista vazia");
            return;
        }
        System.out.print("nome para buscar: ");
        String nomeBuscar = scanner.nextLine();
        boolean encontrado = false;
        for(int i=0; i< lista.size();i++){
            if(lista.get(i).getNome().equalsIgnoreCase(nomeBuscar)){
                System.out.print("novo telefone: ");
                String novoTelefone = scanner.nextLine();
                lista.get(i).setTelefone(novoTelefone);
                System.out.println("telefone atualizado");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("contato nao encontrado");
        }
    }
    public static void editarEmail(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("lista vazia");
            return;
        }
        System.out.print("nome para buscar: ");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;
        for(int i =0; i< lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(nomeBusca)){
                System.out.print("novo email: ");
                String novoEmail = scanner.nextLine();
                lista.get(i).setEmail(novoEmail);
                System.out.println("email atualizado");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("email nao encontrado");
        }
    }
    public static void excluirContato(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("lista vazia");
            return;
        }
        System.out.print("nome para excluir: ");
        String nomeExcluir = scanner.nextLine();
        boolean encontrado = false;
        for(int i =0; i<lista.size();i++){
            if(lista.get(i).getNome().equalsIgnoreCase(nomeExcluir)){
                lista.remove(i);
                System.out.println("contato excluido");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("contato nao encontrado");
        }
    }
    public static void listarContatos(ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("lista vazia");
            return;
        }
        lista.sort(Comparator.comparing(Contato::getNome));
        System.out.printf("\n%-20s | %-15s | %s%n", "nome", "telefone", "email");
        for(int i=0;i<lista.size();i++){
            System.out.printf("%-20s | %-15s | %s%n", lista.get(i).getNome(), lista.get(i).getTelefone(), lista.get(i).getEmail());
        }
    }
}
