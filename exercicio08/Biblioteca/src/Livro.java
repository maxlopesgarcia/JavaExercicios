public class Livro extends ItemBiblioteca{
    private String autor;
    private int numeroPaginas;

    Livro(String titulo, int anoPublicado, String autor, int numeroPaginas){
        super(titulo, anoPublicado);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    public String getAutor(){
        return autor;
    }
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    public void setAutor( String autor){
        this.autor = autor;
    }
    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }
    @Override
    public String toString(){
        return "detalhes do livro:\n" + super.toString() + "autor: " + autor + "\nnumero de paginas: "+ numeroPaginas + "\n";
    }

}
