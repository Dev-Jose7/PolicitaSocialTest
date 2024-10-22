public class SubsidioVivienda extends PoliticaSocial{
    private double ingresoMaximo;
    private double montoSubsidio;
    private String estadoCivil;


    public SubsidioVivienda(double montoSubsidio, String estadoCivil){
        this.montoSubsidio = montoSubsidio;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public void programaSocial(int edadMinima, int edadMaxima) {
        if(edadMinima >= 18 && edadMaxima <= 30 && (this.estadoCivil == "Soltero" || this.estadoCivil == "Union libre"|| this.estadoCivil == "Casado" || this.estadoCivil == "Union libre")){
            System.out.println("Su subsidio es de: " + this.montoSubsidio);
        } else {
            System.out.println("No eres apto para el subsidio solicitado, por favor realice otro estudio");
        }
    }

    @Override
    public void programaSocial(int edadMinina, int edadMaxima, double ingresoMaximo) { //Permite realizar otro estudio en caso no se pueda acceder a un estudio
        programaSocial(edadMaxima, edadMinina);
    }
}
