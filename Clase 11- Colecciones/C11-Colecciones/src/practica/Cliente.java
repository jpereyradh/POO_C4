package practica;

public class Cliente {
    public static void main(String[] args) {
        Puerto puerto= new Puerto();
        puerto.ingreseContendedor(47,Pais.BRASIL,false);
        puerto.ingreseContendedor(24,Pais.DESCONOCIDO,true);
        puerto.ingreseContendedor(12,Pais.DESCONOCIDO,true);
        puerto.ingreseContendedor(3,Pais.DESCONOCIDO,true);
        puerto.ingreseContendedor(5,Pais.DESCONOCIDO,true);
        System.out.println("Lista de contenedores SIMPLE:"+puerto.mostrarListaSimple());

        System.out.println("Contenedores ingresados:::");
        puerto.mostrarContenedores();
        int cantiPeligroso= puerto.contarContenedoresPeligrososDesconodidos();
        System.out.println("Contenedores peligrosos: "+cantiPeligroso);
    }
}
