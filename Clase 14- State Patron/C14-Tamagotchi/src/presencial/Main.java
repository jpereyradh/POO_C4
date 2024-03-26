package presencial;

public class Main {
    public static void main(String[] args) {
        Tamagotchi tamagotchi= new Tamagotchi();
        System.out.println("estado actual de la mascota: "+tamagotchi.getEstadoActual().toString());
        System.out.println("Le dimos el estimulo de comer y su estado fue: ");
        tamagotchi.darDeComer();
        System.out.println("Le dimos de comer otra vez y su estado fue: ");
        tamagotchi.darDeComer();
        System.out.println("estado actual de la mascota: "+tamagotchi.getEstadoActual().toString());
        System.out.println("Le dimos de comer por 3era vez y su estado fue: ");
        tamagotchi.darDeComer();
        System.out.println("estado actual de la mascota: "+tamagotchi.getEstadoActual().toString());
        System.out.println("Le dimos de comer por 4  vez y su estado fue: ");
        tamagotchi.darDeComer();
        System.out.println("estado actual de la mascota: "+tamagotchi.getEstadoActual().toString());


        /*
        System.out.println("volvimos a dar comida y se puso?");
        tamagotchi.darDeComer();
        System.out.println("*********************************************");
        System.out.println("estado desp de comer: "+tamagotchi.getEstadoActual().toString());*/
       /* System.out.println("le dimos de tomar y se puso:");
        tamagotchi.darDeBeber();
        System.out.println("Le dimos el estimulo de beber y su estado fue: ");
        System.out.println("estado desp de comer: "+tamagotchi.getEstadoActual().toString());

        tamagotchi.darMimos();
        tamagotchi.darDeBeber();*/

    }
}
