public class ItemBiblioteca {
    private String titulo;
    private int anoPublicado;

    ItemBiblioteca(String titulo, int anoPublicado){
        this.titulo = titulo;
        this.anoPublicado = anoPublicado;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getAnoPublicado(){
        return anoPublicado;
    }
    public void setAnoPublicado(int anoPublicado){
        this.anoPublicado = anoPublicado;
    }
    @Override
    public String toString(){
        return "titulo: " + titulo + "\nano publicacao: " + anoPublicado + "\n";
    }
}
