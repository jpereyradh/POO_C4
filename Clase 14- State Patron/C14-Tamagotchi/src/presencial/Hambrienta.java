package presencial;

public class Hambrienta extends Estado{
    @Override
    public void darDeComer() {
        System.out.println("Se Pone Feliz");
    }

    @Override
    public void darDeBeber() {
        System.out.println("Se pone triste");
    }

    @Override
    public void darMimos() {
        System.out.println("No cambia de estado");
    }

    @Override
    public String toString() {
        return "Hambrienta";
    }
}
