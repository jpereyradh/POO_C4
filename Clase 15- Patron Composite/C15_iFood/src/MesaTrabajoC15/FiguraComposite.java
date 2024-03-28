package MesaTrabajoC15;

import java.util.ArrayList;
import java.util.List;

public class FiguraComposite implements Figura{
   private List<Figura> figuras= new ArrayList<>();

   public void componerFiguras(Figura figura){
       figuras.add(figura);
   }
    @Override
    public double calcularArea() {
       double calculoArea=0;
        for (Figura figura : figuras) {
            calculoArea+=figura.calcularArea();
        }
        return calculoArea;
    }
}
