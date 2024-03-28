package MesaTrabajoC14;

import java.util.ArrayList;
import java.util.List;

//es la clase con todos los estados y estimulos, es donde se da el contexto.
public class CarritoDeCompra {
    private EstadoCarrito estado;
   private List<Producto> carrito= new ArrayList<>();

    public CarritoDeCompra() {
        estado= new Vacio(); //por default siempre inicializamos vacio
    }

    public void setEstado(EstadoCarrito estado) {
        this.estado = estado;
    }
    public void agregarProducto(Producto producto){ //falta preguntar si son instance of del siguiente estado
        estado.agregarProducto(producto);
        carrito.add(producto);

    }public void cancelarCarrito(){
        estado.cancelarCarrito();
        carrito.clear();
    }
    public void volverAlPuntoAnterior(){
        estado.volverAlPuntoAnterior();
    }
    public void siguienteEstado(){
        estado.siguienteEstado();
    }
}
