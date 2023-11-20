
package AccesoADatos;

import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProveedorData {


     private Connection con = null; //objeto conexion para importar datos a la bdd
     Proveedor proveedor=null;

     
     
     
     public ProveedorData() {  //constructor

 con = Conexion.getConexion(); //inicializo la variable con

 
 }
  public void guardarProveedor(Proveedor proveedor){ //importo la clase del paquete entidades
     String sql="INSERT INTO proveedor(razonSocial, domicilio, telefono, estado)"
             + "VALUES(?, ?, ?,?)"; 
     
        try { 
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setInt(3, proveedor.getTelefono());
            ps.setBoolean(4, proveedor.isActivo());
            ps.executeUpdate(); 
            
            ResultSet rs=ps.getGeneratedKeys(); 
            if(rs.next()){
                proveedor.setIdProveedor(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Proveedor agregado exitosamente");
                
            }
            ps.close(); //cierro el objeto PreparedStatement
         
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla proveedor");
            System.out.println(ex.getMessage());
            System.out.println("Codigo de error "+ex.getErrorCode());
        } 
        
        
 } 
  
   public void eliminarProveedor(int id) {
    String sql= "UPDATE proveedor SET estado= 0 WHERE idProveedor= ? ";
         try{ 
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, id);
             int exito=ps.executeUpdate();
             
             if(exito==1){
                 JOptionPane.showMessageDialog(null, "Proveedor eliminado");
             }
         }catch (SQLException ex){
         JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de proveedores");
     }
 } 
   
    public Proveedor buscarProveedorPorId(int id){
    String sql="SELECT razonSocial, domicilio, telefono FROM proveedor WHERE idProveedor = ? AND estado=1"; 
    Proveedor proveedor=null;
    try{
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setInt(1,id);
    ResultSet rs=ps.executeQuery();
    if(rs.next()){
        
        proveedor=new Proveedor();
        proveedor.setIdProveedor(id);
        proveedor.setRazonSocial(rs.getString("razonSocial"));
        proveedor.setDomicilio(rs.getString("domicilio"));
        proveedor.setTelefono(rs.getInt("telefono"));
        proveedor.setActivo(true);
    
    }else{
        
       JOptionPane.showMessageDialog(null,"Proveedor no encontrado, verifique id"); 
    }
    ps.close();
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de proveedores");
    }
return proveedor;
    }
       
     
public void modificarProveedor (Proveedor proveedor){
    String sql="UPDATE proveedor SET razonSocial= ?, domicilio= ?, telefono= ?"+
         " WHERE  idProveedor = ?;";
     try {
    PreparedStatement ps= con.prepareStatement(sql);
    ps.setString(1, proveedor.getRazonSocial());
    ps.setString(2, proveedor.getDomicilio());
    ps.setInt(3, proveedor.getTelefono());
    ps.setInt(4, proveedor.getIdProveedor());
    int exito=ps.executeUpdate();
    if (exito==1) {
 
 JOptionPane.showMessageDialog(null, "Proveedor modificado correctamente");
} 

}catch (SQLException ex) {
JOptionPane.showMessageDialog(null,"Error al acceder a los datos de proveedores");
} 
 }
 
    
    public Proveedor buscarProveedorPorRazonSocial(String razonSocial){
    String sql="SELECT idProveedor, domicilio, telefono FROM proveedor WHERE razonSocial = ? AND estado=1"; 
    Proveedor proveedor=null;
    try{
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setString(1,razonSocial);
    ResultSet rs=ps.executeQuery();
    if(rs.next()){
        
        proveedor=new Proveedor();
        proveedor.setRazonSocial(razonSocial);
        proveedor.setDomicilio(rs.getString("domicilio"));
        proveedor.setTelefono(rs.getInt("telefono"));
        proveedor.setIdProveedor(rs.getInt("idProveedor"));
        proveedor.setActivo(true);
    
    }else{
        
       JOptionPane.showMessageDialog(null,"Proveedor no encontrado, verifique Razon Social"); 
    }
    ps.close();
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de proveedores");
    }
return proveedor;
    }
       
public List<Proveedor> obtenerProveedoresActivos(boolean activo){
    ArrayList<Proveedor> proveedores= new ArrayList<>();
    
        String sql="SELECT idProveedor, razonSocial, domicilio, telefono, estado FROM proveedor WHERE estado=1 ";
        try{
        PreparedStatement ps = con.prepareStatement (sql);
        ps.setBoolean(1, true);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Proveedor proveedor = new Proveedor();
            proveedor.setIdProveedor(rs.getInt("idProveedor"));
            proveedor.setRazonSocial(rs.getString("razonSocial"));
            proveedor.setDomicilio(rs.getString("domicilio"));
            proveedor.setTelefono(rs.getInt("telefono"));
            proveedor.setActivo(rs.getBoolean("estado"));
            proveedores.add(proveedor);
        }
        ps.close();
        
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedores");
    }
    return proveedores;
}
    
    
    
}

