package MesaTrabajo;

public class Nave extends ObjetoGrafico {
    private Double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, Double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida=100; //por default la vida es 100%
    }
    public void girar(char nuevaDireccion){
        //el atributo direccion donde esta contenido?--> en padre
        this.direccion= nuevaDireccion;
    }

    @Override
    public void irA(int x, int y, char nuevaDireccion) {
        super.irA(x, y, nuevaDireccion);
    }
    public void restarVida(int valor){
        this.vida-=valor; //resta la acumulada
    }

    @Override
    public String toString() {
        return "Nave{" +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                '}';
    }
}
