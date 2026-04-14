public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Notebook", 2500.00, 10);
        System.out.println("produto: " + p1.getNome());
        System.out.println("preco: "+ p1.getPreco());
        System.out.println("quantidade: "+ p1.getQuantidade());
        System.out.println("valor total: "+ p1.valorTotalEmEstoque());

        p1.adicionarEstoque(5);
        p1.removerEstoque(3);
        System.out.println("quantidade atual: "+ p1.getQuantidade());
    }
}
