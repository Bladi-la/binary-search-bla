
package busquedabinaria.entidades;

/**
 *
 * @author labla
 */
public class Producto implements Comparable<Producto> {

    private Integer productoId;
    private String productoNombre;
    private float productoPrecio;

    public Producto() {
    }

    public Producto(Integer productoId, String productoNombre, float productoPrecio) {
        this.productoId = productoId;
        this.productoNombre = productoNombre;
        this.productoPrecio = productoPrecio;
    }

   
    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }

    public float getProductoPrecio() {
        return productoPrecio;
    }

    public void setProductoPrecio(float productoPrecio) {
        this.productoPrecio = productoPrecio;
    }

    @Override
    public String toString() {
        return "Producto{" + "\n\t\tProductoId: " + productoId + "\n\t\tNombre: " + productoNombre + 
                "\n\t\tPrecio: " + productoPrecio + '}';
    }

    @Override
    public int compareTo(Producto arg) {
         if(this.productoPrecio >= arg.getProductoPrecio()){
            return 1;
        }else{
            return 0;
        }
    }

}
