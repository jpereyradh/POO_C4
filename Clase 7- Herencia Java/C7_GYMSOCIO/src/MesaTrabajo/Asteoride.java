package MesaTrabajo;

public class Asteoride extends ObjetoGrafico {
    private int lesion;

    public Asteoride(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(int x, int y, char nuevaDireccion) {
        super.irA(x, y, nuevaDireccion);
    }
}
