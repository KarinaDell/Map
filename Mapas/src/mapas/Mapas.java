
package mapas;

import java.util.HashMap;
import java.util.Map;


public class Mapas {
    public static void main(String[] args){
      Map<Integer, String> mapaFrutas = new HashMap<Integer, String>();
      mapaFrutas.put(1,"Manzana");
      mapaFrutas.put(2,"Pera");
      mapaFrutas.put(3, "Durazno");
      System.out.println("Mapa -> Valores: " + mapaFrutas.values());
      System.out.println("Mapa -> Removido: " + mapaFrutas.remove(1));
      System.out.println("Mapa -> Valores: " + mapaFrutas.values());

      mapaFrutas.clear();
      System.out.println("Mapa borrado.");
      
      System.out.println("Mapa -> Valores: " + mapaFrutas.values());      
    }
}