package presencial;

public class Jugador implements Comparable<Jugador> {
    private int numeroCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private  Boolean esTitular;

    public Jugador(int numeroCamiseta, String nombre, Boolean estaLesionado, Boolean esTitular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.esTitular = esTitular;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        return Integer.compare(this.numeroCamiseta,otroJugador.numeroCamiseta);
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }
}
