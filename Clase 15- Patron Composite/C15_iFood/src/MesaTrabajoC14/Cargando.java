package MesaTrabajoC14;

import java.util.ArrayList;
import java.util.List;

public class Cargando implements EstadoCarrito{
    List<Producto> productos= new ArrayList<>();
    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("producto agregado con exito: "+producto.getDescripcion());

    }

    @Override
    public void cancelarCarrito() {
        System.out.println("carrito cancelado");
        productos.clear();
        System.out.println("carrito en vacio");

    }

    @Override
    public void volverAlPuntoAnterior() {
cancelarCarrito();
    }

    @Override
    public void siguienteEstado() {
        System.out.println("carrito pasa al estado pagando..");
    }
}
