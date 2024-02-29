package MesaTrabajo;

public class ObjetoGrafico {
    private int posx;
    private int posy;
    protected char direccion; //atributo protected para poder acceder desde el hijo

    public ObjetoGrafico(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }
    public void irA(int x, int y, char nuevaDireccion){
        //cual seria la logica para ir a una nueva dire?
        this.posx = posx;
        this.posy = posy;
        this.direccion = nuevaDireccion;
    }

    @Override
    public String toString() {
        return "ObjetoGrafico{" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direccion=" + direccion +
                '}';
    }
}
