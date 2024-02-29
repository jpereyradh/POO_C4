package presencial;

public class Main {
    public static void main(String[] args) {
        //que necesito? crear los obj
        SocioPileta socio1= new SocioPileta("Roberto",1010,1500.0,"Musculacion",2000.0); //atajo ctrl+p
        //SocioPileta socio2= new SocioPileta("Juan Manuel",true); //prueba de sobrecargar el constructor

        System.out.println("*********Calculador de cuota ENERO*************");
        System.out.println("Socio 1 debe abonar::  "+socio1.calcularCostoMensual());
        System.out.println("Socio habilitado para piscina?: "+socio1.getEstaHabilitado());
        System.out.println("Costo piscina:: "+socio1.getCostoPileta());
        System.out.println("Socio presenta certificado medico");
        //System.out.println("Cuota socio2: "+socio2.calcularCostoMensual());
        socio1.habilitarSocio();
        System.out.println("*********Calculador de cuota FEBRERO*************");
        System.out.println("Socio 1 debe abonar::  "+socio1.calcularCostoMensual());
        System.out.println("Socio habilitado para piscina?: "+socio1.getEstaHabilitado());
        System.out.println("Costo piscina:: "+socio1.getCostoPileta());

        //aumento la cuota de la piscina
        socio1.setCostoPileta(2500.0);
        System.out.println("*********Calculador de cuota MARZO*************");
        System.out.println("Socio 1 debe abonar::  "+socio1.calcularCostoMensual());
        System.out.println("Socio habilitado para piscina?: "+socio1.getEstaHabilitado());
        System.out.println("nuevo costo de la pileta? : "+socio1.getCostoPileta());
    }

    /*RECORDATORIO?
    * CUADNO FIRMAMOS? CUANDO QUIERAMOS PROTEGER AL METODO DE USAR ESE Y NO OTRO. PARA GARANTIZAR DEBES USAR EL @OVERRIDE*/
    // CUANDO SOBRE CARGAMOS? CUANDO NECESITEMOS QUE EL METODO HAGA 2 COSAS DIFERENTES.
    //CUANDO SOBREESCRIBIMOS?  CUANDO EL MISMO METODO EN LA SUBCLASE HACE ALGO DIFERENTE. ESTA FIRMADO PERO SOBRE ESCRITO
    //CUANDO SE SOBRE ESCRIBE NO SIEMPRE USAMOS LOS MISMOS PARAMETROS siempre que se respete la firma.
}
