package presencial;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompra {
    private List<Producto> carritoDeCompra= new ArrayList<>();

   public void agregarProducto(Producto producto){
       carritoDeCompra.add(producto);
   }
   public double calculadoraTotalPrecio(){
       double precioTotal=0;
       for (Producto producto : carritoDeCompra) {
           precioTotal+= producto.getPrecio();
       }
       return precioTotal;
   }
}
