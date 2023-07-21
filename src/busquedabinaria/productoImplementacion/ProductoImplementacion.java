/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedabinaria.productoImplementacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import busquedabinaria.comparador.ProductoCompareToId;
import busquedabinaria.comparador.ProductoCompareToPrice;
import busquedabinaria.entidades.Producto;
import busquedabinaria.interfaces.ProductoInterface;

/**
 *
 * @author labla
 */
public class ProductoImplementacion implements ProductoInterface {

    private final List<Producto> listaDeProductos = new ArrayList<>();


    @Override
    public void crearProducto(Producto producto) {
        this.listaDeProductos.add(producto);
    }

    /**
     *
     * @return la lista de productos
     */
    @Override
    public List<Producto> listarProductos() {
        return listaDeProductos;
    }

    /**
     *
     * @param producto agrega el producto modificado a la lista
     */
    @Override
    public void modificarProducto(Producto producto) {
        listaDeProductos.add(producto);
    }

    /**
     *
     * @param productoId es el id del producto a eliminar
     * @return devuelve el producto eliminado de la lista
     */
    @Override
    public Producto eliminarProducto(int productoId) {
        if (!listaDeProductosBacia()) {
            int index = 0;
            for (Producto p : listaDeProductos) {

                if (productoId == p.getProductoId()) {
                    return listaDeProductos.remove(index);
                }
                index++;
            }
        }
        return null;
    }

    /**
     *
     * @return el producto mas caro
     */
    @Override
    public Producto obternerProductoMasCaro() {

        if (!listaDeProductosBacia()) {
            return listaDeProductos.get(listaDeProductos.size() - 1);

        } else {
            return null;
        }

    }

    /**
     *
     * @return el producto mas varato
     */
    @Override
    public Producto obtenerproductoMasBarato() {

        ordernarProductosPorPrecioAsc();
        if (!listaDeProductosBacia()) {

            return listaDeProductos.get(0);
        } else {
            return null;
        }

    }


    @Override
    public boolean listaDeProductosBacia() {
        return listaDeProductos.isEmpty();
    }
/**
 * ordena la lista de productos haciendo uso de la clase Collections de java
 */
    public void ordernarProductosPorPrecioAsc() {
        Collections.sort(listaDeProductos, new ProductoCompareToPrice());
    }
 /**
 * ordena la lista de productos haciendo uso de la clase Collections de java
 */
    public void ordenrProductosPorIdAsc() {
        Collections.sort(listaDeProductos, new ProductoCompareToId());
    }

    /**
     * 
     * @param idProducto el id del producto a buscar
     * @return un objeto producto, o null sino lo encuentra
     */
    @Override
    public Producto obtenerProductoPorId(Integer idProducto) {

        Producto p = null;
        if (!listaDeProductos.isEmpty()) {

            if (!estaAlInicio(idProducto)) {
                if (!estaAlFinal(idProducto)) {

                    p = ProductoImplementacion.this.busquedaBinaria(idProducto);
                } else {
                    p = listaDeProductos.get(listaDeProductos.size() - 1);
                }
            } else {
                p = listaDeProductos.get(0);
            }

        }

        return p;
    }
    /**
     * 
     * @param idP el id del producto a buscar
     * @return un objeto de tipo producto, null sino lo encuentra
     */

    private Producto busquedaBinaria(int idP) {
        Producto p = null;
        try {

            List<Producto> lista = busquedaBinaria(listaDeProductos, idP);

            if (lista != null && !lista.isEmpty()) {
                p = lista.get(0);
            }

        } catch (Exception e) {
            System.out.println("El producto con id: " + idP + " no esta en la lista\nError:" + e.getMessage());
        }
        return p;
    }

    /**
     *
     * @param subListP es una sub lista de la lista principal
     * @param idP el id del producto a buscar
     * @return una lista, si el dato buscado esta en la lista, devolvera una
     * nueva lista con el objeto buscado caso contrario, devolvera null
     */
    private List<Producto> busquedaBinaria(List<Producto> subListP, int idP) {

        int posmedia = (subListP.size() / 2);
        // se verifica si esta en la posicion media
        if (subListP.size() == 3) {

            if (subListP.get(0).getProductoId() == idP) {

                return subListP.subList(0, 1);

            } else if (subListP.get(1).getProductoId() == idP) {

                return subListP.subList(1, 2);

            } else if (subListP.get(2).getProductoId() == idP) {

                return subListP.subList(2, subListP.size());

            }

        } else {
            if (idP == subListP.get(posmedia).getProductoId()) {
                System.out.println("Producto encontrado");
                return subListP.subList(posmedia, ++posmedia);

            } else if (idP > subListP.get(posmedia).getProductoId()) {

                System.out.println("Buscando arriba");
                return busquedaBinaria(subListP.subList(posmedia, subListP.size()), idP);

            } else {
                System.out.println("Buscando abajo");
                return busquedaBinaria(subListP.subList(0, posmedia), idP);
            }
        }
        return null;

    }

    /**
     *
     * @param id el id del producto a buscar
     * @return true o false
     */
    private boolean estaAlInicio(int id) {

        return listaDeProductos.get(0).getProductoId() == id;
    }

    /**
     *
     * @param id el id del producto a buscar
     * @return true o false
     */
    private boolean estaAlFinal(int id) {

        return (listaDeProductos.get(listaDeProductos.size() - 1)).getProductoId() == id;
    }

}
