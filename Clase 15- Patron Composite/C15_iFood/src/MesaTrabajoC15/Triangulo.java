package MesaTrabajoC15;

public class Triangulo implements Figura{
    private double base;
    private double altura;
    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }
}
