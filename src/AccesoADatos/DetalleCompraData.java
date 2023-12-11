package AccesoADatos;

import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.Date;
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
    
    
    
//    public void GuardarDetalleDeCompras(DetalleCompra detallecompra) {
//        String sql = " INSERT INTO detallecompra(idProducto,idCompra,cantidad, precioCosto)"
//                + " VALUES(?, ?, ?, ?)";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//             ps.setInt(1, detallecompra.getCompra().getIdCompra());
//            ps.setInt(2, detallecompra.getProducto().getIdProducto());
//            ps.setInt(3, detallecompra.getCantidad());
//            ps.setDouble(4, detallecompra.getPrecioCosto());
//           
//            ps.executeUpdate();
//
//            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//
//                detallecompra.setIdDetalle(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Detalle de compra Agregado");
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de detallesCompras");
//        }
//
//    }
    
     public void guardarDetalleCompra(DetalleCompra com) {

        String sql = "INSERT INTO detallecompra(idDetalle, cantidad, precioCosto, idCompra, IdProducto) VALUES (?,?,?,?,?) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, com.getIdDetalle());
            ps.setInt(2, com.getCantidad());
            ps.setDouble(3, com.getPrecioCosto());
            ps.setInt(4, com.getCompra().getIdCompra());
            ps.setInt(5, com.getProducto().getIdProducto());

            ps.executeUpdate();

            
            ProductoData pd = new ProductoData();
            
            Producto prod = pd.buscarProductoPorId(com.getProducto().getIdProducto());
            //descontar la cantidad pedida
            prod.setStock(prod.getStock()-com.getCantidad());
            //se modifica con el descuento
            pd.modificarProducto(prod);

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                com.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle Compra Registrado.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle compra.");
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
      
//     public List<DetalleCompra> listarDetComEntreFechas(Date f1, Date f2) {
//        String sql = "SELECT * FROM `detallecompra` d JOIN compra c ON (d.idCompra = c.idCompra)"
//                + " AND (c.fecha >= ?) AND (c.fecha <= ?)";
//        List<DetalleCompra> detalleCompras = new ArrayList<>();
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setDate(1, f1);
//            ps.setDate(2, f2);
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                int idDetalle = rs.getInt("idDetalle");
//                int cantidad = rs.getInt("cantidad");
//                double precioCosto = rs.getDouble("precioCosto");
//                int idCompra = rs.getInt("idCompra");
//                int idProducto = rs.getInt("IdProducto");
//
//                Compra compra= CompraData
//                Producto producto = prodData.buscarProductoPorId(idProducto);
//
//                DetalleCompra detalleCompra = new DetalleCompra(idDetalle, cantidad, precioCosto, compra, producto, true);
//                detalleCompras.add(detalleCompra);
//            }
//
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detallecompra: " + ex.getMessage());
//        }
//        return detalleCompras;
//    } 
      
}
