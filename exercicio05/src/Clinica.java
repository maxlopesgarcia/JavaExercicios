// O objetivo dessa atividade é desenvolver um sistema simples de uma clínica onde pacientes, médicos
// e consultas são organizados por classes.
// 2. O sistema será composto por 4 classes principais: pessoa, médico, paciente e consulta.
// 3. A classe Pessoa deve ter 2 atributos: nome (do tipo String) e idade (do tipo int). Essa classe deve
// conter um construtor para inicializar os atributos da classe, além dos getters para acessar o nome e a
// idade da pessoa.
// 4. A classe Médico deve ter herdar os atributos nome e idade de Pessoa e possuir 2 outros atributos:
// especialidade (String) e crm (String). Essa classe deve conter um construtor para inicializar os
// atributos da classe, além dos getters para acessar a especialidade e o crm do médico.
// 5. A classe Paciente deve ter herdar os atributos nome e idade de Pessoa e possuir o atributo
// enfermidade (String). Essa classe deve conter um construtor para inicializar o atributo da classe,
// além do getter para acessar a enfermidade do paciente.
// 6. A classe Consulta deve representar uma consulta e deve possuir 3 atributos: medico (do tipo
// Medico), paciente (do tipo Paciente) e data da consulta (String). Essa classe deve conter um
// construtor para inicializar os atributos da classe, além do método toString(), que exiba as
// informações da consulta conforme mostrado a seguir:
// 
// Consulta em 17/04/2026
// Dr(a). Carlos - Cardiologia (CRM: 12345)
// Paciente: Ana - Enfermidade: Hipertensão
// ---
// Consulta em 22/04/2026
// Dr(a). Roberto - Ortopedia (CRM: 54321)
// Paciente: Fernanda - Enfermidade: Fratura no tornozel
public class Clinica {
    public static void main(String[] args) throws Exception {
        Medico m1 = new Medico( "joao", 20, "traumatologista", "200");
        Paciente p1 = new Paciente("max", 30, "febre");
        Consulta c1 = new Consulta(m1, p1, "10/02/30");
        System.out.println(c1);
        }
}
