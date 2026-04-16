import java.util.Scanner;
import java.util.ArrayList;

class Agenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();

        int opcao;

        while (true) {

            menuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 6) {
                break;
            }

            switch (opcao) {

                case 1:
                    adicionarContato(scanner, lista);
                    break;

                case 2:
                    editarContato(scanner, lista);
                    break;

                case 3:
                    excluirContato(scanner, lista);
                    break;

                case 4:
                    listarContatos(lista);
                    break;

                case 5:
                    buscarContatoPorNome(scanner, lista);
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

            System.out.println();
        }

        scanner.close();
    }

    
    public static void menuPrincipal() {
        System.out.println("======= AGENDA =======");
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Editar contato");
        System.out.println("[3] Excluir contato");
        System.out.println("[4] Listar contatos");
        System.out.println("[5] Buscar por nome");
        System.out.println("[6] Sair");
        System.out.print("\nEscolha uma opcao: ");
    }

    public static void menuEditar() {
        System.out.println("\n=== EDITAR CONTATO ===");
        System.out.println("[1] Editar telefone");
        System.out.println("[2] Editar email");
        System.out.println("[3] Voltar");
        System.out.print("\nEscolha uma opcao: ");
    }

   

    public static void adicionarContato(Scanner scanner, ArrayList<Contato> lista) {

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        lista.add(new Contato(nome, telefone, email));

        System.out.println("Contato adicionado!");
    }

    public static void listarContatos(ArrayList<Contato> lista) {

        if (lista.isEmpty()) {
            System.out.println("Agenda vazia!");
            return;
        }

        System.out.printf("\n%-3s | %-20s | %-15s | %-30s\n", "ID", "Nome", "Telefone", "Email");

        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%-3d | %-20s | %-15s | %-30s\n",
                    i,
                    lista.get(i).getNome(),
                    lista.get(i).getTelefone(),
                    lista.get(i).getEmail());
        }
    }

    public static void buscarContatoPorNome(Scanner scanner, ArrayList<Contato> lista) {

        if (lista.isEmpty()) {
            System.out.println("Agenda vazia!");
            return;
        }

        System.out.print("Digite o nome para buscar: ");
        String busca = scanner.nextLine().toLowerCase();

        boolean encontrado = false;

        System.out.printf("\n%-3s | %-20s | %-15s | %-30s\n", "ID", "Nome", "Telefone", "Email");

        for (int i = 0; i < lista.size(); i++) {

            String nome = lista.get(i).getNome().toLowerCase();

            
            if (nome.contains(busca)) {

                System.out.printf("%-3d | %-20s | %-15s | %-30s\n",
                        i,
                        lista.get(i).getNome(),
                        lista.get(i).getTelefone(),
                        lista.get(i).getEmail());

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum contato encontrado!");
        }
    }

    public static void editarContato(Scanner scanner, ArrayList<Contato> lista) {

        if (lista.isEmpty()) {
            System.out.println("Agenda vazia!");
            return;
        }

        listarContatos(lista);

        System.out.print("\nDigite o ID do contato: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (id < 0 || id >= lista.size()) {
            System.out.println("ID inválido!");
            return;
        }

        Contato contato = lista.get(id);

        while (true) {
            menuEditar();

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 3) {
                break;
            }

            switch (opcao) {

                case 1:
                    System.out.print("Novo telefone: ");
                    contato.setTelefone(scanner.nextLine());
                    System.out.println("Telefone atualizado!");
                    break;

                case 2:
                    System.out.print("Novo email: ");
                    contato.setEmail(scanner.nextLine());
                    System.out.println("Email atualizado!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

    public static void excluirContato(Scanner scanner, ArrayList<Contato> lista) {

        if (lista.isEmpty()) {
            System.out.println("Agenda vazia!");
            return;
        }

        listarContatos(lista);

        System.out.print("\nDigite o ID do contato que deseja excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (id < 0 || id >= lista.size()) {
            System.out.println("ID inválido!");
            return;
        }

        lista.remove(id);
        System.out.println("Contato removido!");
    }
}