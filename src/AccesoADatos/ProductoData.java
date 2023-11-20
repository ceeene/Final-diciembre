
package AccesoADatos;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProductoData {
    private Connection con = null;
     
     
     public ProductoData() {

 con = Conexion.getConexion();
 
 }
     
     
      public void guardarPoducto( Producto producto){
     String sql="INSERT INTO producto(nombreProducto, descripcion, precioActual, stock, estado)"
             + "VALUES(?, ?, ?, ?, ?)"; 
     
        try { 
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isActivo());
            ps.executeUpdate(); 
            
            ResultSet rs=ps.getGeneratedKeys(); 
            if(rs.next()){
                producto.setIdProducto(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Producto agregado exitosamente");
                
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto");
            System.out.println(ex.getMessage());
            System.out.println("Codigo de error "+ex.getErrorCode());
        } 
        
        
 } 
      public void modificarProducto(Producto producto){
    String sql="UPDATE producto SET nombreProducto=?, descripcion=?, precioActual=?,stock=? "
            + "WHERE idProducto=? " ;
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4,producto.getStock());
            
             ps.setInt(5,producto.getIdProducto());
            
            int exito=ps.executeUpdate();
            if(exito==1){
                
                JOptionPane.showMessageDialog(null,"Producto modificado");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla prodcuto");
        }
    
 }
       public Producto buscarproducto(int id){
    String sql="SELECT nombreProducto, descripcion, precioActual, stock FROM producto WHERE idProducto = ? AND estado=1"; 
     Producto producto=null;
        try{
         PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,id);
         ResultSet rs=ps.executeQuery();
        if(rs.next()){
        
        producto=new Producto();
        producto.setNombreProducto(rs.getString("nombreProducto"));
        producto.setDescripcion(rs.getString("descripcion"));
        producto.setPrecioActual(rs.getDouble("precioActual"));
        producto.setStock(rs.getInt("stock"));
        
        producto.setActivo(true);
    
    }else{
        
       JOptionPane.showMessageDialog(null,"Producto no encontrado"); 
    }
    ps.close();
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto");
    }
return producto;
    }
 
       
       public void eliminarProducto(int id) {
    String sql= "UPDATE producto SET estado=0 WHERE idProducto=? ";
         try{ 
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, id);
             int exito=ps.executeUpdate();
             
             if(exito==1){
                 JOptionPane.showMessageDialog(null, "Producto eliminado");
             }
         }catch (SQLException ex){
         JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto");
     }
 }
       public  List<Producto>listarProducto(){
    String sql="SELECT idProducto,nombreProducto, descripcion, precioActual, stock FROM producto WHERE estado = 1 ";
    ArrayList<Producto> productos=new ArrayList<>();
    try{
    PreparedStatement ps=con.prepareStatement(sql);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
        
        Producto producto=new Producto();
        producto.setIdProducto(rs.getInt("idProducto"));
        producto.setNombreProducto(rs.getString("descripcion"));
        producto.setPrecioActual(rs.getDouble("precioActual"));
        producto.setStock(rs.getInt("stock"));
        producto.setActivo(true);
    
        productos.add(producto);
    }
    ps.close();
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto");
    }    
return productos;
   
    
}
        public List<Producto> stockMinimo() {
        ArrayList<Producto> stock= new ArrayList<>();
          String sql = "SELECT * FROM `producto` WHERE stock<5";
        try{
      
        
            PreparedStatement ps = con.prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();
         while (rs.next()) {
             Producto producto=new Producto();
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombreProducto(rs.getString("descripcion"));
            producto.setPrecioActual(rs.getDouble("precioActual"));
            producto.setStock(rs.getInt("stock"));
            producto.setActivo(true);
    
        stock.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        return stock;
     }
}
