
package Entidades;

import java.time.LocalDate;


public class Compra {
    private int idCompra;
    private Proveedor proveedor;
    private LocalDate fecha;
    private boolean activo;
    private int idProveedor;

    public Compra(int idCompra, Proveedor proveedor, LocalDate fecha, boolean activo, int idProveedor) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.activo = activo;
        this.idProveedor = idProveedor;
    }

    public Compra(LocalDate fecha, int idProveedor) {
        this.fecha = fecha;
        this.idProveedor = idProveedor;
    }
    
    
    
    public Compra(Proveedor proveedor, LocalDate fecha, boolean activo) {
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.activo = activo;   
    }
    public Compra() {
    }

    public Compra(int i, LocalDate of, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    

    public Compra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

   

    public LocalDate getFecha() {
        return fecha;
    }
    

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", proveedor=" + proveedor + ", fecha=" + fecha + ", activo=" + activo + '}';
    }
    
    
}
