public class EmpleadoPorHora extends Empleado{
    private  double importePorHora;
    private double retencion;


    @Override
    public double calcularSueldo(int dias) {
        //como calcular?
        double sueldo= (importePorHora*dias)-retencion;
        return sueldo;
    }

    public EmpleadoPorHora(double importePorHora, double retencion) {
        this.importePorHora = importePorHora;
        this.retencion = retencion;
    }
}
