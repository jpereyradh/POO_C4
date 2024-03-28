package MesaTrabajoC14;

public class Cliente {
    public static void main(String[] args) {
        //producto
        Producto producto= new Producto("Coca cola",100);
        Producto producto1= new Producto("Lays",20);
        CarritoDeCompra carritoDeCompra= new CarritoDeCompra();
         carritoDeCompra.agregarProducto(producto);
        carritoDeCompra.agregarProducto(producto1);
        carritoDeCompra.setEstado(new Cargando());
        carritoDeCompra.siguienteEstado();

        carritoDeCompra.agregarProducto(new Producto("Producto 3",1));
        carritoDeCompra.agregarProducto(producto);
        carritoDeCompra.agregarProducto(producto1);
        carritoDeCompra.setEstado(new Cerrado());
        carritoDeCompra.siguienteEstado();
        carritoDeCompra.agregarProducto(new Producto("Producto 4",1));




    }
}
