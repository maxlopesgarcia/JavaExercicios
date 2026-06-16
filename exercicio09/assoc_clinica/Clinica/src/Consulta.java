public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private String data;
    public Consulta(Medico medico, Paciente paciente, String data){
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }
    @Override
    public String toString(){
        return "consulta em " + data + "\n" + medico.toString() + "\n" + paciente.toString() + "\n";
    }
}
