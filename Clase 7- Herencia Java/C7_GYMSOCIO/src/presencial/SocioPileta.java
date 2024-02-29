package presencial;

public class SocioPileta extends Socio {
    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioPileta(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad, Double costoPileta) {
        super(nombre, numeroSocio, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = false; //por default esta deshabilitado
    }

    public SocioPileta(String nombre, Boolean estaHabilitado) {
        super(nombre);
        this.estaHabilitado = estaHabilitado;
    }
    /*Si al metodo lo creo desde 0 en el hijo no hay NINGUNA garantia de que sea el mimso metodo que el padre.
   * para garantizar JAVA tiene un mecanismo que se llama FIRMA haciendo un @Override*/

    public void habilitarSocio(){ //es por que el metodo esta sobrecargado
        System.out.println("Socio Habilitado!");
        estaHabilitado=true;
    }

    public void setCostoPileta(Double costoPileta) {
        this.costoPileta = costoPileta;
    }

    public Double getCostoPileta() {
        return costoPileta;
    }

    public Boolean getEstaHabilitado() {
        return estaHabilitado;
    }

    public void desabilitarSocio(){
        System.out.println("Socio deshabilitado!");
        estaHabilitado=false;
    }
    @Override //FIRMA DEL METODO DEL PADRE
    public Double calcularCostoMensual() { //estoy SOBREESCRIBIENDO AL METODO
        if(estaHabilitado){
            return super.calcularCostoMensual()+costoPileta;
        }else{
        return super.calcularCostoMensual();
    }}

}
