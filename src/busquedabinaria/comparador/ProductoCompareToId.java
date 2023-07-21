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
public class ProductoCompareToId implements Comparator<Producto>{

    @Override
    public int compare(Producto arg0, Producto arg1) {
        return Integer.compare(arg0.getProductoId(), arg1.getProductoId());
    }
    
}
