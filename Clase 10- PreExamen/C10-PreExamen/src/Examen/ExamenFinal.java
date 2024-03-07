package Examen;

public class ExamenFinal extends Examen{
    private int notaOral;
    private String temaOral;

    public ExamenFinal(Estudiante estudiante, String titulo, String enunciado, int nota, int notaOral, String temaOral) {
        super(estudiante, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }
    public boolean esMayorQue(ExamenFinal otroExamen){
        double promedioThis= (double) (nota+notaOral)/2;
        double promedioOtro= (double) (otroExamen.notaOral+ otroExamen.nota)/2;
        return promedioThis>promedioOtro;
    }
}
