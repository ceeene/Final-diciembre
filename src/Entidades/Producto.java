
package Entidades;


public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private double precioActual;
    private int stock;
    private boolean activo;

    public Producto(int idProducto, String nombreProducto, String descripcion, double precioActual, int stock, boolean activo) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.activo = activo;
    }
     public Producto(int idProducto, String nombreProducto, double precioActual, int stock, boolean activo) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioActual = precioActual;
        this.stock = stock;
        this.activo = activo;
    }

    public Producto() {
    }

    public Producto(String nombreProducto, String descripcion, double precioActual, int stock, boolean activo) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.activo = activo;
    }

    public Producto(int idProducto, String nombreProducto, String descripcion, double precioActual, int stock) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
    }

    

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", precioActual=" + precioActual + ", stock=" + stock + ", activo=" + activo + '}';
    }
    
    
}
