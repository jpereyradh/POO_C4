package MesaTrabajoC15;

public class Prueba {
    public static void main(String[] args) {
        Figura rectangulo= new Rectangulo(5,4);
        Figura circulo= new Circulo(1);
        Figura circulo2= new Circulo(1);
        Figura circulo3= new Circulo(1);

        FiguraComposite vagon= new FiguraComposite();
        vagon.componerFiguras(rectangulo);
        vagon.componerFiguras(circulo);
        vagon.componerFiguras(circulo2);
        vagon.componerFiguras(circulo3);

        System.out.println("Un vagón con un rectángulo de 5 x 4 y 3 círculos de 1  tiene una superficie  de: "+vagon.calcularArea());





    }
}
