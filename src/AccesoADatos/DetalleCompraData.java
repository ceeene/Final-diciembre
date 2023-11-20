package AccesoADatos;

import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleCompraData {

    private Connection con = null;
    ProductoData prodData;

    public DetalleCompraData() {

        con = Conexion.getConexion();
        prodData = new ProductoData();

    }
    
    
    
    public void GuardarDetalleDeCompras(DetalleCompra detallecompra) {
        String sql = " INSERT INTO detallecompra(idCompra, idProductocantidad, precioCosto)"
                + " VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, detallecompra.getCompra().getIdCompra());
            ps.setInt(2, detallecompra.getProducto().getIdProducto());
            ps.setInt(3, detallecompra.getCantidad());
            ps.setDouble(4, detallecompra.getPrecioCosto());
           
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                detallecompra.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle de compra Agregado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de detallesCompras");
        }

    }
    
    
    
    

    public List<DetalleCompra> buscarDetallePorCompra(Compra compra) {
        String sql = " SELECT idDetalle, `idCompra`, `cantidad`, `precioCosto`, producto.* FROM `detallecompra` JOIN producto"
                + " ON (detallecompra.idProducto=producto.idProducto) WHERE idCompra=?";

        List<DetalleCompra> detalle = new ArrayList<DetalleCompra>();
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getIdCompra());
            ResultSet rs = ps.executeQuery();
            DetalleCompra detCompra;
            Producto prod;
            while (rs.next()) {
                prod = new Producto(rs.getInt("idProducto"),
                        rs.getString("nombreProducto"),
                        rs.getDouble("precioActual"),
                        rs.getInt("stock"),
                        rs.getBoolean("estado"));
                detCompra = new DetalleCompra(rs.getInt("idDetalle"), rs.getInt("cantidad"), rs.getDouble("precioCosto"), compra, prod);
                detalle.add(detCompra);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sql: " + ex.getMessage());

        }
        return detalle;
    }
}
