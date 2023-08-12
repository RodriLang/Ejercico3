
package ejercico3;


public abstract class Producto {
    protected double precio;
    protected String descripcion;
    protected String tipo;

    public Producto(double precio, String descripcion, String tipo) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
