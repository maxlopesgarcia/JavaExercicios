public class Biblioteca {
    public static void main(String[] args) throws Exception {
        
        Livro meuLivro = new Livro(2008, "Clean Code", "Robert C. Martin", 464);
        Dvd meuDvd = new Dvd(1999, "Matrix", "Ficcao Cientifica", 136);

        
        System.out.println("--- Itens da Biblioteca ---");
        System.out.println(meuLivro.toString());
        System.out.println(meuDvd.toString());
    }
}