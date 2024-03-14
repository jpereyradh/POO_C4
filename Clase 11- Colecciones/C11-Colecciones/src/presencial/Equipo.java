package presencial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> listaJugadores; //la relacion de asociacion 1 a N

    public Equipo(String nombre) {
        this.nombre = nombre;
        listaJugadores= new ArrayList<>(); //instancie la lista

    }
    public void agregarJugador(Jugador jugador){
        listaJugadores.add(jugador);
    }
    public void mostrarJugadoresTitulares1(){
        System.out.println("************Jugadores Titulares- Metodo 1****************");
        for (Jugador jugador : listaJugadores) {
            if(jugador.getEsTitular()){
                System.out.println("Jugador: "+jugador.getNombre()+" -"+jugador.getNumeroCamiseta());
            }
        }
    }
    public void mostrarJugadoresTitulares2(){
        System.out.println("Jugadores Titulares-- Metodo 2");
        listaJugadores.stream().filter(Jugador::getEsTitular).sorted().forEach(jugador -> System.out.println(jugador.getNombre()+" -"+jugador.getNumeroCamiseta()));
            }
     public int getCantidadJugadoresLesionados(){
        int contadorLesionados=0;
         for (Jugador jugador : listaJugadores) {
             if(jugador.getEstaLesionado() && jugador.getEsTitular()){
                 contadorLesionados++;
             }

         }
         return contadorLesionados;
     }
     public int getCantidadLesionados2(){
        return (int)listaJugadores.stream().filter(jugador -> jugador.getEstaLesionado()&& jugador.getEsTitular()).count();
     }
}
