public class EmpleadoRelacionDependencia extends Empleado {
    private double sueldoMensual;


    @Override
    public double calcularSueldo(int dias) {//el mes tiene 30 dias y puede no trabajar el mes completo
        double sueldo= sueldoMensual/30;
        return sueldo*dias;
    }

    public EmpleadoRelacionDependencia(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
