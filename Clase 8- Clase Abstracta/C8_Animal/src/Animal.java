import java.sql.SQLOutput;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void emitirSonido(){
        System.out.println("sonido indefinido");
    }
    public abstract String jugar(); //para tener  un metodo abstr necesito tener abs
}
