package presencial;

public class Main {
    public static void main(String[] args) {
        Usuario usuario= new Usuario("Jorgito");
        Seguidor seguidor= new Seguidor("Reddmar");
        usuario.agregarSeguidor(seguidor);
        Seguidor seguidor2= new Seguidor("Laura");
        usuario.agregarSeguidor(seguidor2);

        usuario.notificar(seguidor, usuario.subirFoto());
        System.out.println(seguidor.getCantidadDenotificaciones());
        usuario.notificar(seguidor, usuario.subirFoto());
        System.out.println(seguidor.getCantidadDenotificaciones());

    }
}
