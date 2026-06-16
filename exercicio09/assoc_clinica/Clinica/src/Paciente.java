public class Paciente extends Pessoa{
    private String enfermidade;

    public Paciente(String nome, int idade, String enfermidade){
        super(nome, idade);
        this.enfermidade = enfermidade;
    }

    public String getEnfermidade() {
        return enfermidade;
    }
    @Override
    public String toString(){
        return "paciente: " + super.toString() + " - enfermidade: " + enfermidade;
    }
}
