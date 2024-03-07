package Examen;

public class Examen {
    private Estudiante estudiante;
    private String titulo;
    private String enunciado;
    protected int nota;

    public Examen(Estudiante estudiante, String titulo, String enunciado, int nota) {
        this.estudiante = estudiante;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }
    public boolean estaAprobado(){
        return nota>=4;
    }
}
