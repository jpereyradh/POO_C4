package presencial;

public class CuentaCajaAhorro extends Cuenta{
    private  double  interesGanado= 1.2;

    @Override
    public double extraer(double monto) {
        if(monto<=saldo){
            saldo-=monto;
            System.out.println("Extraccion correcta");
        }else{
            System.out.println("Ingrese un monto menor/ verifique saldo");
        }
        return saldo;
    }
    public double cobrarInteres(){
        saldo+=(saldo*interesGanado/100);
        return saldo;
    }

    
}
