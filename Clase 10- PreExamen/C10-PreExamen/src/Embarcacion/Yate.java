package Embarcacion;

public class Yate extends Embarcacion implements Comparable<Yate>{
    private int cantidadDeCamarote;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, double eslora, int cantidadDeCamarote) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadDeCamarote = cantidadDeCamarote;
    }
    public boolean tieneMayorLujoQue(Yate otroYate){
        return cantidadDeCamarote>otroYate.cantidadDeCamarote;
    }


    @Override
    public int compareTo(Yate otroYate) {
        if(this.cantidadDeCamarote>otroYate.cantidadDeCamarote){
            return 1;
        } else if (this.cantidadDeCamarote< otroYate.cantidadDeCamarote) {
            return -1;

        }
        /*la logica
        -1 si es menor
        0 si es igual
        1 si es mayor*/
        return 0;
    }
}
