package MesaTrabajoC14;

public class Vacio implements EstadoCarrito{
    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No se permite agregar el : "+producto.getDescripcion()+" en esta instancia, pase a Cargando..");
        siguienteEstado();
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("Carrito cancelado, vuelve a estar Vacio");
    }

    @Override
    public void volverAlPuntoAnterior() {
//no hay que hacer
    }

    @Override
    public void siguienteEstado() {
        System.out.println("pasando al estado Cargando...");
    }
}
