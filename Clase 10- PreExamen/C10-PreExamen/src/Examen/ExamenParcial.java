package Examen;

public class ExamenParcial extends Examen{
    private int numeroUnidad;
    private int numeroReintento;

    public ExamenParcial(Estudiante estudiante, String titulo, String enunciado, int nota, int numeroUnidad, int numeroReintento) {
        super(estudiante, titulo, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.numeroReintento = numeroReintento;
    }
    public boolean sePuedeRecuperar(){
        if(numeroUnidad<=3){
            return numeroReintento<3; //salida sea true
        }else{
            return numeroReintento<2;
        }
    }
}
