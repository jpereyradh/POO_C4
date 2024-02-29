package MesaTrabajo;

public class Cliente {
    public static void main(String[] args) {
        Nave nave= new Nave(10,20,'N',1.5);
        Asteoride asteoride= new Asteoride(30,40,'E',50);

        System.out.println(nave.toString());
    }
}
