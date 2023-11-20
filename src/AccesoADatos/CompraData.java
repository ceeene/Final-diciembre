package AccesoADatos;

import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import AccesoADatos.ProductoData;
import java.time.LocalDate;
import java.util.List;

public class CompraData {

    private Connection con = null;
    //private ProveedorData prov = new ProveedorData();
    private ProductoData prodd = new ProductoData();
    //private CompraData cmd = new CompraData();

    public CompraData() {

        con = Conexion.getConexion();

    }

    public void guardarCompra(Compra comp) {
        String sql = "INSERT INTO compra (idProveedor,fecha,estado)"
                + " VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, comp.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(comp.getFecha()));
            ps.setBoolean(3, comp.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                comp.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Compra Registrada");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra");

        }

    }

    public void modificarCompra(Compra comp) {

        String sql = "UPDATE compra SET idProveedor= ?, fecha= ?, estado= ?"
                + "WHERE idCompra= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, comp.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(comp.getFecha()));
            ps.setBoolean(3, comp.isActivo());
            ps.setInt(5, comp.getIdCompra());
            int exito = ps.executeUpdate();
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Alumno modificado");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar Compra ");
        }

    }

    public void eliminarCompra(int idCompra) {

        String sql = "UPDATE compra SET estado = 0 WHERE idCompra= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            int exito = ps.executeUpdate();
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Compra eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al eliminar");
        }

    }

   public List<Compra> ObtenerComprasPorProveedor(Proveedor proveedor) {
        List<Compra> compras = new ArrayList<>();

        try {
            String sql = "SELECT idCompra, fecha FROM compra WHERE idProveedor=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, proveedor.getIdProveedor());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setProveedor(proveedor);
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compras.add(compra);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compras");
        }
        return compras;

    }

    public Compra obtenerCompraPorId(int id) {

        Compra compra = null;

        try {
            String sql = "SELECT * FROM compra WHERE idCompra=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                compra = new Compra();
                compra.setIdCompra(id);
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getInt("idProveedor"));
                compra.setProveedor(prov);
                compra.setFecha(rs.getDate("fecha").toLocalDate());

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ala acceder a la tabla compra" + ex.getMessage());
        }
        return compra;
    }

//    public Compra buscarCompra(int id) {
//        String sql = "SELECT * FROM compra WHERE idCompra = ? AND estado=1";
//        Compra compra = null;
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//
//                compra = new Compra();
//                compra.setIdCompra(id);
//                Proveedor pro = prov.buscarProveedorPorId(rs.getInt("idProveedor"));
//                compra.setProveedor(pro);
//                compra.setFecha(rs.getDate("fecha").toLocalDate());
//                compra.setActivo(true);
//
//            } else {
//
//                JOptionPane.showMessageDialog(null, "Compra no encontrada");
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra");
//        }
//        return compra;
//    }

    public List<Producto> ListaProductoXFechadeCompra(LocalDate fecha) {

        String sql = "SELECT p.idProducto, nombreProducto, descripcion, precioActual,stock, estado"
                + " FROM producto p JOIN compra c ON (c.idCompra=d.idCompra) JOIN detallecompra d ON (d.idproducto=p.idProducto)"
                + " WHERE fecha = ?";

        ArrayList<Producto> productos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(fecha));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getInt("Precioactual"));
                producto.setStock(rs.getInt("stock"));
                producto.setActivo(true);

                productos.add(producto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return productos;

    }

//    public List<Compra> ListaComprasXProveedor(int idProveedor) {
//
//        String sql = "SELECT idCompra, idProveedor, fecha FROM compra c, DetalleCompra d "
//                + "WHERE c.idCompra=d.idCompra"
//                + "AND c.idProveedor = ?";
//
//        ArrayList<Compra> compras = new ArrayList<>();
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, idProveedor);
//
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//
//                Compra compr = new Compra();
//                compr.setIdCompra(rs.getInt("idCompra"));
//                Proveedor pro = prov.buscarProveedorPorId(rs.getInt("idProveedor"));
//                compr.setProveedor(pro);
//                compr.setFecha(rs.getDate("fecha").toLocalDate());
//
//                compras.add(compr);
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "error");
//        }
//        return compras;
//    }
//}

//    public List<Producto> ListaproductosXCompra(int idCompra) {
//
//        String sql = "SELECT  d.idDetalle, d.idProducto, d.idCompra,d.cantidad, d.precioCosto"
//                + " FROM detallecompra d,compra c"
//                + " WHERE d.idCompra=c.idCompra"
//                + "AND idCompra= ?";
//
//        ArrayList<Producto> productos = new ArrayList<>();
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, idCompra);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                DetalleCompra detal = new DetalleCompra();
//                detal.setIdDetalle(rs.getInt("idDetalle"));
//                Producto pr = prodd.buscarproducto(rs.getInt("idProducto"));
//                detal.setProducto(pr);
//                Compra compd = cmd.buscarCompra(rs.getInt("idCompra"));
//                detal.setCompra(compd);
//                detal.setCantidad(rs.getInt("cantidad"));
//                detal.setPrecioCosto(rs.getDouble("precioCosto"));
//                productos.add(pr);
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "error");
//        }
//        return productos;
//    }
//}
}