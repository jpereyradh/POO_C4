package presencial;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta= new CuentaCorriente();
        cuenta.depositar(1000);
        System.out.println(cuenta.informarSaldo());

        cuenta.extraer(500);
        System.out.println(cuenta.informarSaldo());

       double impuestito= cuenta.gravarImpuesto(5);
        System.out.println("impuesto: "+impuestito);
        System.out.println(cuenta.informarSaldo());


    }
}
