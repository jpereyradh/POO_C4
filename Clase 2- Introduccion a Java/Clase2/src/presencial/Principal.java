package presencial;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("****Bienvenidos*******");
        System.out.println("Validador de edad: ");
        System.out.println("*******************************");
        System.out.println("Ingrese su Nombre: ");
        String nombre= scanner.nextLine();
        char pLetra= primeraLetra(nombre);
        char uLetra= ultimaLetra(nombre);
        System.out.println("Ingresar Edad: ");
        Integer edad= scanner.nextInt();
        System.out.println(validadorEdad1(edad));
        System.out.println("Validador 2: "+validadorEdad2(edad));
        System.out.println("Ingrese su Altura: ");
        Double altura= scanner.nextDouble();
        scanner.close();
        System.out.println("Informacion Recibida: ");
        System.out.println(nombre+", "+edad+", "+altura+", Primera Letra: "+pLetra+", Ultima Letra: "+uLetra);

    }
    public static char primeraLetra(String nombre){
        return nombre.charAt(0);
    }
    public static char ultimaLetra(String letra){

        //J O R G I T O  J U A N
        //0 1 2 3 4 5 6  0 1 2 3
        return letra.charAt(letra.length()-1);
    }
    public static String validadorEdad1(int edad){
        if(edad>=18){
            return "La Persona es Mayor de Edad";
        }else{
            return "La Persona no cumple la legislacion vigente";
        }
    }
    public static Boolean validadorEdad2(int edad){
        return edad>=18; //por default siempre es true
    }

}
