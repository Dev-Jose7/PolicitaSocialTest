public class AsistenciaSanitaria extends PoliticaSocial{
    private String cobertura;
    private String servicios;
    public AsistenciaSanitaria(String cobertura, String servicios){
        this.cobertura = cobertura;
        this.servicios = servicios;
    }

    @Override
    public void programaSocial(double ingresoMaximo) { //Definir si el usuario puede aplicar a la asistencia sanitaria
        if(ingresoMaximo <= 1500){
            System.out.println("Su cobertura es " + this.cobertura + " y sus servicios es " + this.servicios);
        }else {
            System.out.println("No eres apto para el subsidio solicitado, por favor realice otro estudio");
        }
    }

    @Override
    public void programaSocial(int edadMinina, int edadMaxima, double ingresoMaximo) { //Permite realizar otro estudio en caso no se pueda acceder a un estudio
        programaSocial(ingresoMaximo);
    }
}
