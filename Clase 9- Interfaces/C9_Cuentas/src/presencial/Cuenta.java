package presencial;

public abstract class Cuenta {
    protected double saldo;

    public abstract double extraer(double monto);
    public double depositar(double monto){
        saldo+=monto; //saldo = saldo+monto
        return saldo;
    }
    public double informarSaldo(){
        System.out.println("Su saldo actual es: ");
        return saldo;
    }
}
