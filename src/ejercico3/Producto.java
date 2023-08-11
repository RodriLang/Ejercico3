
package ejercico3;


public abstract class Producto {
    protected double precio;
    protected String descripcion;

    public Producto(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
