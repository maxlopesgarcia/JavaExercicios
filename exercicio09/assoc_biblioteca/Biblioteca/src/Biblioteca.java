public class Biblioteca {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("carlos", 10);
        Cliente cliente2 = new Cliente("max", 20);

        Livro livro1 = new Livro("wow", "blizzars");
        Livro livro2 = new Livro("biblia", "Deus");
        Emprestimo emprestimo1 = new Emprestimo(cliente1, livro2, "10/05/2026");
        Emprestimo emprestimo2 = new Emprestimo(cliente2, livro1, "02/07/2025");
        emprestimo1.exibirDetalhes();
        emprestimo2.exibirDetalhes();
    }
}
