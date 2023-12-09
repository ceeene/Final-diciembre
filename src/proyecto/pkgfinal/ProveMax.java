package proyecto.pkgfinal;

import AccesoADatos.CompraData;
import AccesoADatos.Conexion;
import Entidades.Compra;
import Entidades.DetalleCompra;
import java.sql.Connection; 
import java.sql.Date;
import java.time.LocalDate;

public class ProveMax {

    public static void main(String[] args) {
        
 Connection con= Conexion.getConexion();
//         Proveedor pro = new Proveedor(); 
//
//Compra compra = new Compra();
//       compra.setIdProveedor(1);
////       compra.setFecha(new Date());
//
//       DetalleCompra dc = new DetalleCompra();
//       dc.setIdProducto(1);
//       dc.setCantidad(5);
//
//       // When
////       guardarCompra(compra, dc);
//      
      
        

//        CompraData compData = new CompraData();
//        Compra comp = compData.obtenerCompraPorId(1);
//        DetalleCompraData detCompra = new DetalleCompraData();
//        for(DetalleCompra item:detCompra.buscarDetallePorCompra(comp)){
//            System.out.println(item.getIdDetalle());
//            System.out.println(item.getCantidad());
//            System.out.println(item.getPrecioCosto());
//            System.out.println(item.getProducto().getNombreProducto());
//            
//        }


      

      Compra compra1 = new Compra(3,LocalDate.of(2023,11,21),2,10);
      CompraData cd = new CompraData(); 
      cd.guardarCompra(compra1);

    }
    }