package Mod2;

import java.util.Observable;
import java.util.Observer;

public class Seguidor implements Observer {
    private String nombre;
    private int cantidadDenotificaciones=0;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }



    public int getCantidadDenotificaciones() {
        return cantidadDenotificaciones;
    }

    @Override
    public void update(Observable o, Object arg) {
        String mensaje= (String) arg;
        System.out.println(nombre+" fue notificado: "+mensaje);
        cantidadDenotificaciones++;

    }

}
