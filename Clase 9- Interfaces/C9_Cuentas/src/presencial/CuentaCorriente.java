package presencial;

public class CuentaCorriente extends Cuenta implements ImpuestoGravable {
    private double descubiertoPermitido;
    @Override
    public double extraer(double monto) {
        if(monto<=saldo+descubiertoPermitido){ //20, 10+30
            saldo-=monto;}else{
            System.out.println("monto superior al establecido");
            System.out.println("Puede retirar hasta: ");
            return saldo;
        }
        return saldo;
    }

    @Override
    public double gravarImpuesto(double impuesto) {
        saldo-=impuesto;
        return saldo;
    }
}
