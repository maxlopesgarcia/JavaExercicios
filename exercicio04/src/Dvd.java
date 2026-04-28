public class Dvd extends ItemBiblioteca {
    private String categoria;
    private int duracao;

    public Dvd(int ano, String titulo, String categoria, int duracao) {
        super(ano, titulo);
        this.categoria = categoria;
        this.duracao = duracao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String toString() {
        
        return super.toString() + ", Categoria: " + categoria + ", Duracao: " + duracao + " min";
    }
}