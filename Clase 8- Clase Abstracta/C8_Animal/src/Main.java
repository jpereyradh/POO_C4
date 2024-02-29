public class Main {
    public static void main(String[] args) {
        Perro perro= new Perro("tobi", "dalmata");
        perro.emitirSonido();
        System.out.println(perro.jugar());

        //hablemos sobre polimorfismo
        Animal animal;
        animal= new Perro("tito","terbal");
        animal.emitirSonido(); //sonido del perro
        animal= new Gato("Krypto","2");
        animal.emitirSonido(); //sonido del gato

        //casteo o casting

        System.out.println("casteo implicito-- upcasting");
        Perro perro1= new Perro("firulais","bulldog");
        Animal animal1= perro;
        System.out.println(animal1.jugar());
        animal1.emitirSonido();


        System.out.println("Casteo Explicito-- Downcasting");
        Animal animal2= new Gato("michi","1");
        Gato gato= (Gato)animal2;
        gato.emitirSonido();
        System.out.println(gato.jugar());

        System.out.println("usar una metodo instance of");
        Animal animal3= new Gato("chuchi","caniche");
       if(animal3 instanceof Perro){//fundamental -- recomendado en casteo explicito
        Perro perro2= (Perro)animal3;
        perro2.emitirSonido();
       }else{
           System.out.println("no se puede comportar el animal como perro si en realidad es un gato");
       }
       //castear Double a Integer
        double numeroDouble= 10.5;
       int nuneroEntero= (int)numeroDouble;
        System.out.println("Double: "+numeroDouble+" N entero: "+nuneroEntero);
        System.out.println("Double a String");
        String numeroString= Double.toString(numeroDouble);
        System.out.println(numeroString);
    }
}
