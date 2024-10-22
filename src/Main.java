public class Main {
    public static void main(String[] args) {
        SubsidioVivienda subsido1 = new SubsidioVivienda(100000, "Casado");
        AsistenciaSanitaria asistencia1 = new AsistenciaSanitaria("Completa", "Revisiones y medicamentos");

        System.out.println("Solicitando el subsidio");
        subsido1.programaSocial(20, 35);
        asistencia1.programaSocial(1600);
        System.out.println("");
        System.out.println("Solicita un estudio nuevo para solicitar subsidio");
        subsido1.programaSocial(18, 30, 1400);
        asistencia1.programaSocial(18, 30, 1400);
        System.out.println("");
    }
}
