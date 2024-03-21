public abstract class EmpleadoFactory {

   public static Empleado crearEmpleado(String tipo) throws ParametroException{
            if("EMP-RD".equalsIgnoreCase(tipo)){
                return new EmpleadoRelacionDependencia(1000);
            }else if("EMP-PH".equalsIgnoreCase(tipo)){
                return new EmpleadoPorHora(7,14);
            }else {
              throw new ParametroException();
            }
   }
}
