public class ItemBiblioteca {
    private String titulo;
    private int ano;

    public ItemBiblioteca(int ano, String titulo) {
        this.ano = ano;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String toString() {
        return "Titulo: " + titulo + ", Ano: " + ano;
    }
}