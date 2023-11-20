
package Vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class MenuProveMax extends javax.swing.JFrame {

    
    public MenuProveMax() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(626, 626);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        ImageIcon icono=new ImageIcon(getClass().getResource("/Vistas/imagenes/fondo.jpg"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){

                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        Cargar = new javax.swing.JMenuItem();
        jMDetalles = new javax.swing.JMenu();
        jMIDetalleCompra = new javax.swing.JMenuItem();
        JMICompra = new javax.swing.JMenuItem();
        JMGestionProvee = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setForeground(new java.awt.Color(204, 0, 0));
        jMenu1.setText("Productos");

        jMenuItem4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(255, 0, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/en-stock.png"))); // NOI18N
        jMenuItem4.setText("Stock Minimo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        Cargar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        Cargar.setForeground(new java.awt.Color(255, 0, 0));
        Cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/regalo.png"))); // NOI18N
        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        jMenu1.add(Cargar);

        jMenuBar1.add(jMenu1);

        jMDetalles.setForeground(new java.awt.Color(255, 0, 0));
        jMDetalles.setText("Compras");
        jMDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMDetallesActionPerformed(evt);
            }
        });

        jMIDetalleCompra.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jMIDetalleCompra.setForeground(new java.awt.Color(255, 0, 0));
        jMIDetalleCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/factura.png"))); // NOI18N
        jMIDetalleCompra.setText("Detalles de Compras");
        jMIDetalleCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDetalleCompraActionPerformed(evt);
            }
        });
        jMDetalles.add(jMIDetalleCompra);

        JMICompra.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        JMICompra.setForeground(new java.awt.Color(255, 0, 0));
        JMICompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/carrito-de-compras.png"))); // NOI18N
        JMICompra.setText("Realizar Compra");
        JMICompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICompraActionPerformed(evt);
            }
        });
        jMDetalles.add(JMICompra);

        jMenuBar1.add(jMDetalles);

        JMGestionProvee.setForeground(new java.awt.Color(255, 0, 0));
        JMGestionProvee.setText("Proveedores");

        jMenuItem1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(204, 0, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/proveedores.png"))); // NOI18N
        jMenuItem1.setText("Gestion de Proveedores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMGestionProvee.add(jMenuItem1);

        jMenuBar1.add(JMGestionProvee);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionProveedores gp=new GestionProveedores();
        gp.setVisible(true);
        escritorio.add(gp);
        escritorio.moveToFront(gp);
                                    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMIDetalleCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDetalleCompraActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        DetallesCompras detCm =new DetallesCompras();
        detCm.setVisible(true);
        detCm.getContentPane().setBackground(new Color(68,167,132));
        escritorio.add(detCm);
        escritorio.moveToFront(detCm);
     
    }//GEN-LAST:event_jMIDetalleCompraActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
       
         escritorio.removeAll();
        escritorio.repaint();
        AgregarProducto pro=new AgregarProducto();
        pro.setVisible(true);
        pro.getContentPane().setBackground(Color.red); 
        escritorio.add(pro);
    }//GEN-LAST:event_CargarActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        StockMinimo stock=new StockMinimo();
        stock.setVisible(true);
        stock.getContentPane().setBackground(Color.red); 
        escritorio.add(stock);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void JMICompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICompraActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Compras comp =new Compras();
        comp.setVisible(true);
        comp.getContentPane().setBackground(Color.red); 
        escritorio.add(comp);
    }//GEN-LAST:event_JMICompraActionPerformed

    private void jMDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMDetallesActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        DetallesCompras dc=new DetallesCompras();
        dc.setVisible(true);
        escritorio.add(dc);
        escritorio.moveToFront(dc);
    }//GEN-LAST:event_jMDetallesActionPerformed

    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuProveMax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProveMax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProveMax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProveMax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuProveMax().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cargar;
    private javax.swing.JMenu JMGestionProvee;
    private javax.swing.JMenuItem JMICompra;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMDetalles;
    private javax.swing.JMenuItem jMIDetalleCompra;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
