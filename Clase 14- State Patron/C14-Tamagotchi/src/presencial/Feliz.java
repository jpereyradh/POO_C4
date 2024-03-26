package presencial;

public class Feliz extends Estado{
    @Override
    public void darDeComer() {
        System.out.println("la mascota se pone sedienta");
    }

    @Override
    public void darDeBeber() {
        System.out.println("se pone hambrienta");
    }

    @Override
    public void darMimos() {
        System.out.println("no hace nada");
    }

    @Override
    public String toString() {
        return "Feliz";
    }
}
