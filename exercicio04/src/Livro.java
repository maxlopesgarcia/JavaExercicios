public class Livro extends ItemBiblioteca {
    private String autor;
    private int numeroPaginas;
    
    public Livro(int ano, String titulo, String autor, int numeroPaginas) {
        super(ano, titulo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Numero de paginas: " + numeroPaginas;
    }
}