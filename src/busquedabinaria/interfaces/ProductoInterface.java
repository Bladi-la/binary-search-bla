/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedabinaria.interfaces;

import java.util.List;
import busquedabinaria.entidades.Producto;

/**
 *
 * @author labla
 */
public interface ProductoInterface {
    /**
     * 
     * @param producto un objeto de la clase Producto
     */
    public void crearProducto(Producto producto);
    /**
     * 
     * @return una lista de objetos de la clase Producto
     */
    public List<Producto> listarProductos();
    /**
     * 
     * @param producto el objeto producto modificado
     */
    public void modificarProducto(Producto producto);
    /**
     * 
     * @param productoId un dato Integer que es el id del produscto a eliminar
     * @return devueleve el objeto Producto que se ha alimido de la lista
     */
    public Producto eliminarProducto(int productoId);
    /**
     * 
     * @return un objeto Producto que tiene el precio mas alto
     */
    public Producto obternerProductoMasCaro();
    
    /**
     * 
     * @return un objeto Producto que tiene el precio mas bajo
     */
    public Producto obtenerproductoMasBarato();
    
    /**
     * 
     * @return true o falso
     */
    public  boolean listaDeProductosBacia();
    /**
     * 
     * @param idProducto el id del producto a buscar
     * @return un objeto de tipo producto
     */
    public Producto obtenerProductoPorId(Integer idProducto);
}
