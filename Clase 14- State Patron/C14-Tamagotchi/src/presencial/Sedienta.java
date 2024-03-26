package presencial;

public class Sedienta extends Estado{
    @Override
    public void darDeComer() {
        System.out.println("Se pone triste");
    }

    @Override
    public void darDeBeber() {
        System.out.println("se pone feliz");
    }

    @Override
    public void darMimos() {
        System.out.println("No cambia de estado");
    }

    @Override
    public String toString() {
        return "Sedienta";
    }
}
