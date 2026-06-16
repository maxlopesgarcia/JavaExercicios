public class Emprestimo {
    private Cliente cliente;
    private Livro livro;
    private String dataEmprestimo;

    public Emprestimo(Cliente cliente, Livro livro, String dataEmprestimo){
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }
    public void exibirDetalhes(){
        System.out.println("dados do emprestimo:");
        System.out.println("cliente: " + cliente.getNome() + "(idade: " + cliente.getIdade()+ ")");
        System.out.println("livro: "+ livro.getTitulo()+ " por "+ livro.getAutor());
        System.out.println("data do emprestimo: " + dataEmprestimo);
        System.out.println();
    }
}
