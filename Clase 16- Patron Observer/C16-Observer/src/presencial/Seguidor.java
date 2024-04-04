package presencial;

public class Seguidor implements SujetoObservador{
    private String nombre;
    private int cantidadDenotificaciones=0;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre+": Notificacion : "+mensaje);
        cantidadDenotificaciones++;

    }

    public int getCantidadDenotificaciones() {
        return cantidadDenotificaciones;
    }
}
