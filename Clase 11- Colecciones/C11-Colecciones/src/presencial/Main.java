package presencial;

public class Main {
    public static void main(String[] args) {
        Equipo equipo= new Equipo("Digital FC");
        equipo.agregarJugador(new Jugador(20,"Jorgito",false,false));
        equipo.agregarJugador(new Jugador(10,"Carolina",true,false));
        equipo.agregarJugador(new Jugador(50,"Luis Fernando",true,true));
        equipo.agregarJugador(new Jugador(23,"Juan Manuel",true,true));

        equipo.mostrarJugadoresTitulares1();
        equipo.mostrarJugadoresTitulares2();
        

        System.out.println("Metodo 1: "+equipo.getCantidadJugadoresLesionados());
        System.out.println("Metodo 2: "+equipo.getCantidadLesionados2());

    }
}
