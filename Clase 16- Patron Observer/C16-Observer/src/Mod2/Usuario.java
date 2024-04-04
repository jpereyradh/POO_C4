package Mod2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Usuario extends Observable {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    public void subirFoto() {
        String mensaje= nombre+" subio una foto";
         setChanged();
        notifyObservers(mensaje);
    }



}
