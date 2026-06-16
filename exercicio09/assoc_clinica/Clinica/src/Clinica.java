public class Clinica {
    public static void main(String[] args) throws Exception {
        Medico m1 = new Medico("Carlos", 45, "Cardiologia", "12345");
        Paciente p1 = new Paciente("Ana", 30, "Hipertensao");
        Consulta c1 = new Consulta(m1, p1, "17/04/2026");
        
        Medico m2 = new Medico("Roberto", 54, "Ortopedia", "54321");
        Paciente p2 = new Paciente("Fernanda", 21, "Fratura no tornozelo");
        Consulta c2 = new Consulta(m2, p2, "22/04/2026");

        System.out.println(c1);
        System.out.println(c2);
    }
}
