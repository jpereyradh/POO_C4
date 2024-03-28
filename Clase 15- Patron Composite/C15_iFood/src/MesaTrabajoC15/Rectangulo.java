package MesaTrabajoC15;

public class Rectangulo implements Figura{
    private double lado, altura;

    public Rectangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return lado*altura;
    }
}
