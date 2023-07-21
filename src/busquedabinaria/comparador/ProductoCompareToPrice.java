/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedabinaria.comparador;

import java.util.Comparator;
import busquedabinaria.entidades.Producto;

/**
 *
 * @author labla
 */
public class ProductoCompareToPrice implements Comparator<Producto>{

    /**
     * 
     * @param a
     * @param b
     * @return a integer 
     */
    
   

    @Override
    public int compare(Producto a, Producto b) {
         /* 
        ordena los productos por precio de mayor a menor 
     */
         return Float.compare(a.getProductoPrecio(), b.getProductoPrecio());

    }
    
}
