public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private String dataConsulta;
    public Consulta(Medico medico, Paciente paciente, String dataConsulta){
        this.medico = medico;
        this.paciente = paciente;
        this.dataConsulta = dataConsulta;
       
    }
    @Override
    public String toString(){
        return "Consulta: " + dataConsulta + 
        "\nDr(a). " + medico.getNome() +" - "+ medico.getEspecialidade() +" (CRM: " + medico.getCrm() + ")" + 
        "\nPaciente: " +  paciente.getNome() + " idade: " + paciente.getIdade() + " enfermidade: " + paciente.getEnfermidade() + "\n---";
    }



// Consulta em 17/04/2026
// Dr(a). Carlos - Cardiologia (CRM: 12345)
// Paciente: Ana - Enfermidade: Hipertensão
// ---
    
}
