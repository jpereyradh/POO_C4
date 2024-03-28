package MesaTrabajoC15;

public class Circulo implements Figura{
    private double radio;
    //private static final double PI= 3.1415;


    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (radio*radio)*Math.PI; //Math.pow(radio,2)
    }
}
