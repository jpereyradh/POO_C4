package MesaTrabajoC14;

public class Pagando implements EstadoCarrito{
    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("no se permite agregar productos a la lista");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("compra cancelada, el carrito vuelve al estado anterior: cargando..");
    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("no se puede volver al punto anterior en este estado");
    }

    @Override
    public void siguienteEstado() {
        System.out.println("Compra realizada con exito, pasa al siguiente estado: Cerrado..");
    }
}
