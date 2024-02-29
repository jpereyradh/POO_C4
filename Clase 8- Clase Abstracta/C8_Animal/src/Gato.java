public  class Gato extends Animal{

    private String tamanio;

    public Gato(String nombre, String tamanio) {
        super(nombre);
        this.tamanio= tamanio;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El gato maulla");
    }

    @Override
    public String jugar() {
        return "El gato juega con un ovillo de Hilo.";
    }
}
