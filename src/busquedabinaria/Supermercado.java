/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedabinaria;

import busquedabinaria.entidades.Producto;
import busquedabinaria.productoImplementacion.ProductoImplementacion;

/**
 *
 * @author labla
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    private static final ProductoImplementacion productoImplementacion = new ProductoImplementacion();

    public static void main(String[] args) {

        System.out.println("*****************************************************************************\n");
        agregarProductos();
        System.out.println("\n***************************************************************************\n");
        productoImplementacion.ordernarProductosPorPrecioAsc();
        mostrarProductoMasCaro();
        mostrarProductoMasBarato();
    }

    private static void agregarProductos() {

        productoImplementacion.crearProducto(new Producto(5, "Coca-cola", 250));
        productoImplementacion.crearProducto(new Producto(8, "Proteina en polvo", 100.50F));
        productoImplementacion.crearProducto(new Producto(1, "Coca-cola Zero", 15));
        productoImplementacion.crearProducto(new Producto(2, "Bebida de Proteina", 20.5F));
        productoImplementacion.crearProducto(new Producto(3, "Leche 1.5 fet", 28.78F));
        productoImplementacion.crearProducto(new Producto(4, "Queso FirtsPrice", 35.9F));
        productoImplementacion.crearProducto(new Producto(6, "Pan integral", 25));
        productoImplementacion.crearProducto(new Producto(7, "Cafe en polvo", 23));
        productoImplementacion.crearProducto(new Producto(9, "Pan bimbo", 25.9f));
        productoImplementacion.crearProducto(new Producto(10, "Cafe NestCafe", 23.9f));
        productoImplementacion.crearProducto(new Producto(11, "Coca-cola", 250));
        productoImplementacion.crearProducto(new Producto(12, "Proteina en polvo", 100.50F));
        productoImplementacion.crearProducto(new Producto(13, "Coca-cola Zero", 15));
        productoImplementacion.crearProducto(new Producto(14, "Bebida de Proteina", 20.5F));
        productoImplementacion.crearProducto(new Producto(16, "Leche 1.5 fet", 28.78F));
        productoImplementacion.crearProducto(new Producto(15, "Queso FirtsPrice", 35.9F));
        productoImplementacion.crearProducto(new Producto(18, "Pan integral", 25));
        productoImplementacion.crearProducto(new Producto(17, "Cafe en polvo", 23));
        productoImplementacion.crearProducto(new Producto(20, "Pan bimbo", 25.9f));
        productoImplementacion.crearProducto(new Producto(19, "Cafe NestCafe", 23.9f));
        productoImplementacion.crearProducto(new Producto(30, "Cafe NestCafe", 23.9f));
        productoImplementacion.crearProducto(new Producto(29, "Coca-cola", 250));
        productoImplementacion.crearProducto(new Producto(28, "Proteina en polvo", 100.50F));
        productoImplementacion.crearProducto(new Producto(27, "Coca-cola Zero", 15));
        productoImplementacion.crearProducto(new Producto(26, "Bebida de Proteina", 20.5F));
        productoImplementacion.crearProducto(new Producto(25, "Leche 1.5 fet", 28.78F));
        productoImplementacion.crearProducto(new Producto(24, "Queso FirtsPrice", 35.9F));
        productoImplementacion.crearProducto(new Producto(23, "Pan integral", 25));
        productoImplementacion.crearProducto(new Producto(22, "Cafe en polvo", 23));
        productoImplementacion.crearProducto(new Producto(21, "Pan bimbo", 25.9f));
        productoImplementacion.crearProducto(new Producto(40, "Cafe NestCafe", 23.9f));
        productoImplementacion.crearProducto(new Producto(31, "Cafe NestCafe", 23.9f));
        productoImplementacion.crearProducto(new Producto(32, "Coca-cola", 250));
        productoImplementacion.crearProducto(new Producto(33, "Proteina en polvo", 100.50F));
        productoImplementacion.crearProducto(new Producto(34, "Coca-cola Zero", 15));
        productoImplementacion.crearProducto(new Producto(35, "Bebida de Proteina", 20.5F));
        productoImplementacion.crearProducto(new Producto(36, "Leche 1.5 fet", 28.78F));
        productoImplementacion.crearProducto(new Producto(37, "Queso FirtsPrice", 35.9F));
        productoImplementacion.crearProducto(new Producto(38, "Pan integral", 25));
        productoImplementacion.crearProducto(new Producto(39, "Cafe en polvo", 23));
        productoImplementacion.crearProducto(new Producto(41, "Pan bimbo", 25.9f));
        productoImplementacion.crearProducto(new Producto(42, "Cafe NestCafe", 23.9f));
        System.out.println("Lista size: " + productoImplementacion.listarProductos().size());
        productoImplementacion.ordenrProductosPorIdAsc();
        /**
         * aqui con un while, se hace un test al buscar cada producto de la
         * lista, y ademas, se comprueba las cantidad de iteraciones del metodo
         * recursivo busquedaBinaria esto deja claro que este metodo es muy
         * eficiente para buscar elementos en lista ORDENADAS
         */

        int i = 1;
        while (i <= productoImplementacion.listarProductos().size()) {

            Producto b = productoImplementacion.obtenerProductoPorId(i);
            if (b != null) {
                System.out.println("El produto con el id: " + i + " que busca es\n" + b);
            } else {
                System.out.println("El producto que busca no esta en la lista!");
            }
            i++;

        }

    }

    private static void mostraProductos() {

        if (!productoImplementacion.listaDeProductosBacia()) {
            for (Producto p : productoImplementacion.listarProductos()) {
                System.out.println(p);
            }
        } else {
            System.out.println("La lista de productos esta bacia!");
        }

    }

    private static void mostrarProductoMasCaro() {

        System.out.println("El producto mas caro es: " + productoImplementacion.obternerProductoMasCaro());

    }

    private static void mostrarProductoMasBarato() {

        System.out.println("\nEl producto mas barato es: " + productoImplementacion.obtenerproductoMasBarato());

    }
}
