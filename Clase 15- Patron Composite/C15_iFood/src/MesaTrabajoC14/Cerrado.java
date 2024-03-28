package MesaTrabajoC14;

public class Cerrado implements EstadoCarrito{
    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("carrito cerrado, no se permite esta accion");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("carrito cerrado, no se permite esta accion");
    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("carrito cerrado, no se permite esta accion");

    }

    @Override
    public void siguienteEstado() {
        System.out.println("carrito cerrado, no se permite esta accion");

    }
}
