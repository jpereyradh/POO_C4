package presencial;

import java.util.ArrayList;
import java.util.List;

//composite o compuesto
public class ProductoCompuesto extends Producto{

    private List<Producto> combo; //composite de los hijos de Producto
    public ProductoCompuesto(String nombre) {
        super(nombre, 0); //inicialmente el precio del combo es 0
        combo= new ArrayList<>();
    }
    //armar el combo
    public void agregarProducto(Producto producto) {
            combo.add(producto);
    }

    @Override
    public double getPrecio() {
        double precioTotal=0;
        for (Producto producto : combo) {
            precioTotal+= producto.getPrecio();
        }
        return precioTotal*0.9; //le aplico un descuento de 10%

    }
}
