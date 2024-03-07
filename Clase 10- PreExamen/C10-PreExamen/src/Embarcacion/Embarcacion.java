package Embarcacion;

public  class Embarcacion {
    private Capitan capitan; //relacion de asociacion
    private double precioBase;
    private  double valorAdicional;
    private int anioDeFabricacion;
    private  double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.eslora = eslora;
    }
    public double calcularMontoAlquiler(){
        double montoAlquiler= precioBase; //100 --
        if(anioDeFabricacion>2020){
            montoAlquiler+=valorAdicional;
        }return montoAlquiler;
    }

}
