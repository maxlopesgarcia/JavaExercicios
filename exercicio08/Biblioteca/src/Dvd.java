public class Dvd extends ItemBiblioteca{
    private String categoria;
    private int duracaoMinutos;

    Dvd(String titulo, int anoPublicado, String categoria, int duracaoMinutos){
        super(titulo, anoPublicado);
        this.categoria = categoria;
        this.duracaoMinutos= duracaoMinutos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
    @Override
    public String toString(){
        return "detalhes do dvd:\n" + super.toString() + "categoria: " + categoria + "\nduracao minutos: "+ duracaoMinutos + "\n";
    }

}
