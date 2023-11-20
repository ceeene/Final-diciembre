
package Vistas;

import AccesoADatos.ProveedorData;
import Entidades.Proveedor;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GestionProveedores extends javax.swing.JInternalFrame {
    ImagenFondo fondo=new ImagenFondo();
    
    
private ProveedorData proveeData=new ProveedorData();
    private Proveedor proveedorActual=null;
    
    public GestionProveedores() {
        
        this.setContentPane(fondo);
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLRSocial = new javax.swing.JLabel();
        JLDomicilio = new javax.swing.JLabel();
        JLTelefono = new javax.swing.JLabel();
        JRBEstado = new javax.swing.JRadioButton();
        JBBuscar = new javax.swing.JButton();
        JTRSocial = new javax.swing.JTextField();
        JTDomicilio = new javax.swing.JTextField();
        JTTelefono = new javax.swing.JTextField();
        JLEstado = new javax.swing.JLabel();
        JBNuevo = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        JLBusqueda = new javax.swing.JLabel();
        JTId = new javax.swing.JTextField();
        JBBuscarRS = new javax.swing.JButton();

        setTitle("Gestion de Proveedores");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);

        JLRSocial.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        JLRSocial.setForeground(new java.awt.Color(255, 255, 255));
        JLRSocial.setText("Razon Social:");

        JLDomicilio.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        JLDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        JLDomicilio.setText("Domicilio:");

        JLTelefono.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        JLTelefono.setForeground(new java.awt.Color(255, 255, 255));
        JLTelefono.setText("Telefono:");

        JRBEstado.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        JRBEstado.setForeground(new java.awt.Color(255, 255, 255));
        JRBEstado.setText("Activo");

        JBBuscar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        JBBuscar.setForeground(new java.awt.Color(255, 0, 255));
        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        JLEstado.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        JLEstado.setForeground(new java.awt.Color(255, 255, 255));
        JLEstado.setText("Estado:");

        JBNuevo.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        JBNuevo.setForeground(new java.awt.Color(255, 0, 255));
        JBNuevo.setText("Nuevo");
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        JBEliminar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        JBEliminar.setForeground(new java.awt.Color(255, 0, 255));
        JBEliminar.setText("Eliminar");
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        JBGuardar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        JBGuardar.setForeground(new java.awt.Color(255, 0, 255));
        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBSalir.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        JBSalir.setForeground(new java.awt.Color(255, 0, 255));
        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JLBusqueda.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        JLBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        JLBusqueda.setText("Busqueda por id:");

        JBBuscarRS.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        JBBuscarRS.setForeground(new java.awt.Color(255, 0, 255));
        JBBuscarRS.setText("Buscar");
        JBBuscarRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarRSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLRSocial)
                                .addGap(34, 34, 34)
                                .addComponent(JTRSocial))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLDomicilio)
                                    .addComponent(JLTelefono))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTTelefono)
                                    .addComponent(JTDomicilio)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JBBuscar)))
                        .addGap(18, 18, 18)
                        .addComponent(JBBuscarRS)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLEstado)
                                .addGap(85, 85, 85)
                                .addComponent(JRBEstado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLBusqueda)
                                .addGap(18, 18, 18)
                                .addComponent(JTId, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBSalir)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(JBNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBEliminar)
                        .addGap(78, 78, 78)
                        .addComponent(JBGuardar)
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLRSocial)
                    .addComponent(JTRSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBuscarRS))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLDomicilio))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBEstado)
                    .addComponent(JLEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNuevo)
                    .addComponent(JBEliminar)
                    .addComponent(JBGuardar))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSalir)
                    .addComponent(JLBusqueda)
                    .addComponent(JTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBuscar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        try{
        String razonSocial=JTRSocial.getText();
        String domicilio=JTDomicilio.getText();
        Integer telefono=Integer.parseInt(JTTelefono.getText());
        if(razonSocial.isEmpty()|| domicilio.isEmpty()){
            JOptionPane.showMessageDialog(this,"No puede haber campos vacios");
            return;
        }
        
        Boolean estado=JRBEstado.isSelected();
        if (proveedorActual==null){
            
           proveedorActual=new Proveedor(razonSocial, domicilio, telefono, estado);
           proveeData.guardarProveedor(proveedorActual);
            
        }else {
            proveedorActual.setRazonSocial(razonSocial);
            proveedorActual.setDomicilio(domicilio);
            proveedorActual.setTelefono(telefono);
            proveeData.modificarProveedor(proveedorActual);
            
        }
        
        
        }catch(NumberFormatException nfe){
         JOptionPane.showMessageDialog(this,"Verifique los datos ingresados");   
        }  
                                             
       limpiarCampos();
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        if (proveedorActual!=null){
            proveeData.eliminarProveedor (proveedorActual.getIdProveedor());
            proveedorActual=null;
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this,"No hay un proveedor seleccionado");
        }
          
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        limpiarCampos();
        proveedorActual=null;
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        try{
          Integer id=Integer.parseInt(JTId.getText());
          proveedorActual=proveeData.buscarProveedorPorId(id);
          if(proveedorActual!=null){
              
              JTRSocial.setText(proveedorActual.getRazonSocial());
              JTDomicilio.setText(proveedorActual.getDomicilio());
              JTTelefono.setText(proveedorActual.getTelefono()+""); 
              JRBEstado.setSelected(proveedorActual.isActivo());
              
          }
          
      }catch (NumberFormatException ex){
          JOptionPane.showMessageDialog(this,"Debe ingresar un numero de id valido");
          limpiarCampos();
      }  
                                          
      
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void JBBuscarRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarRSActionPerformed
        try{
          
          String razonSocial=(JTRSocial.getText().toLowerCase());
          proveedorActual=proveeData.buscarProveedorPorRazonSocial(razonSocial);
          if(proveedorActual!=null){
             
                          
              JTDomicilio.setText(proveedorActual.getDomicilio());
              JTTelefono.setText(proveedorActual.getTelefono()+""); 
              JRBEstado.setSelected(proveedorActual.isActivo());
              JTId.setText(proveedorActual.getIdProveedor()+"");
              
          }
          
      }catch (NumberFormatException ex){
          JOptionPane.showMessageDialog(this,"Debe ingresar una razon social valida");
          limpiarCampos();
      }  
                                          
                                    

    }//GEN-LAST:event_JBBuscarRSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBBuscarRS;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JButton JBSalir;
    private javax.swing.JLabel JLBusqueda;
    private javax.swing.JLabel JLDomicilio;
    private javax.swing.JLabel JLEstado;
    private javax.swing.JLabel JLRSocial;
    private javax.swing.JLabel JLTelefono;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JTextField JTDomicilio;
    private javax.swing.JTextField JTId;
    private javax.swing.JTextField JTRSocial;
    private javax.swing.JTextField JTTelefono;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

private void limpiarCampos(){
    JTRSocial.setText("");
    JTDomicilio.setText("");
    JTTelefono.setText("");
    JRBEstado.setSelected(false);
    JTId.setText("");
    
}
 class ImagenFondo extends JPanel{
     private Image imagen;
     
     public void paint(Graphics g){
         imagen=new ImageIcon(getClass().getResource("/Vistas/imagenes/panel.jpg")).getImage();
         g.drawImage(imagen,0,0,getWidth(), getHeight(), this);
        setOpaque(false);
         super.paint(g);
         
        }
 }

}

