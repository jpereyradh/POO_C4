import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Bienvenidos al calculo de salarios*****");
        Scanner scanner= new Scanner(System.in);
        try{
        System.out.println("Ingrese el tipo de empleado a calcular: ");
        String tipo= scanner.nextLine();

        //quien crea al empleado???

        Empleado empleado= EmpleadoFactory.crearEmpleado(tipo);
        System.out.println("Ingrese la cantidad de dias trabajados: ");
        int cantDias= scanner.nextInt();

        //quien calcula los sueldos?

        System.out.println("El sueldo liquidado para el empleado es: "+empleado.calcularSueldo(cantDias));
    }catch (ParametroException e){
            System.err.println(e.getMessage());
            scanner.close();
        }


    }
}
