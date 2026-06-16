public class Usuario {
    private String nome;
    private double consumo;
 
    public Usuario(String nome, double consumo) {
        this.nome = nome;
        this.consumo = consumo;
    }
 
    public String getNome(){
        return nome;
    }

    public double getConsumo() {
        return consumo;
    }
    
}
