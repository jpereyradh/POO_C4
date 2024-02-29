package presencial;

public class Socio {
    //todos los atributos salvo excepciones deben ser privados
        private String nombre;
        private Integer numeroSocio;
        private Double cuotaMensual;
        private String actividad;
        //como creo el metodo constructor?
    //para que sirve?--> para crear instancias de la clase.
    //para crear basicamente los objetos.
    // click derecho--> generate-->constructor

    public Socio(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public Socio(String nombre) { //ESTE ES SOLO UN EJEMPLO DE QUE PODEMOS SOBRE CARGAR UN METODO
        this.nombre = nombre;
    }

    //metodo?
    public Double calcularCostoMensual(){
        //aqui va toda la logica del metodo, como coloco un retorno, debo llamar a la palabra return
        return cuotaMensual+(0.09*cuotaMensual); // cuotaMensual*1.05;
    }
}
