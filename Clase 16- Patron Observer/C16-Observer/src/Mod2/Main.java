package Mod2;

public class Main {
    public static void main(String[] args) {
        Usuario usuario= new Usuario("Jorgito");
        Seguidor seguidor= new Seguidor("Reddmar");
        usuario.addObserver(seguidor);
        Seguidor seguidor2= new Seguidor("Laura");
        usuario.addObserver(seguidor2);
        usuario.subirFoto();
        usuario.subirFoto();
        usuario.notifyObservers();
        System.out.println(seguidor.getCantidadDenotificaciones());
        System.out.println(seguidor.getCantidadDenotificaciones());

    }
}
