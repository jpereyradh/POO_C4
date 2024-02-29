public class Perro extends Animal {
private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza= raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println("guau guau");
    }

    @Override
    public String jugar() {
        return "El perro juega con un hueso de plastico";
    }
}
