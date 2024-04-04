package presencial;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements SujetoObservable{
    private String nombre;
    private List<SujetoObservador> listaseguidores= new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void agregarSeguidor(SujetoObservador sujetoObservador) {
        listaseguidores.add(sujetoObservador);

    }

    @Override
    public void eliminarSujeto(SujetoObservador sujetoObservador) {
        listaseguidores.remove(sujetoObservador);
    }
    @Override
    public String subirFoto() {
        String mensaje= nombre+" subio una foto";
        return mensaje;
    }

    @Override
    public void notificar(SujetoObservador sujetoObservador,String mensaje) {
        for (SujetoObservador seguidor : listaseguidores) {
            seguidor.notificar(mensaje);
        }

    }


}
