package presencial;

public class Tamagotchi {
    //asociamos?
    private  Estado estadoActual;

    public Tamagotchi() {
        estadoActual= new Hambrienta(); //mi mascota siempre estara al comienzo hambrienta

    }
    public void darDeComer(){
        estadoActual.darDeComer();
        if(estadoActual instanceof Hambrienta){
            estadoActual= new Feliz();
        } else if (estadoActual instanceof Feliz) {
            estadoActual= new Sedienta();
        } else if (estadoActual instanceof  Sedienta) {
            estadoActual= new Triste();
        }

    }
    public void darDeBeber(){
        estadoActual.darDeBeber();
        estadoActual= new Hambrienta();
    }
    public void darMimos(){
        estadoActual.darMimos();
        estadoActual= new Triste();
    }

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }
}
