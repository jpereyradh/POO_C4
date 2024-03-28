package presencial;

public class Main {
    public static void main(String[] args) {
        Producto bebida= new Bebida("Guarana",20);
        Producto papaFrita= new Acompanamiento("papa frita",10);
        Producto burger= new Sandwich("doble cheese",100);
        ProductoCompuesto comboDH= new ProductoCompuesto("Digital Food");
        comboDH.agregarProducto(burger);
        comboDH.agregarProducto(papaFrita);
    comboDH.agregarProducto(bebida);
        System.out.println("Precio por unidad: "+bebida.getPrecio()+": "+papaFrita.getPrecio()+": "+burger.getPrecio());

        CarritoDeCompra carritoDeCompra= new CarritoDeCompra();


        carritoDeCompra.agregarProducto(comboDH);
        System.out.println("precio del combo: "+comboDH.getPrecio());

        System.out.println("Precio total por el combo: "+comboDH.getPrecio());

        System.out.println("Precio total de los consumos con combo: "+carritoDeCompra.calculadoraTotalPrecio());

    }
}
