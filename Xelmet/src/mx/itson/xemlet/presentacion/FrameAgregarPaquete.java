/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.xemlet.presentacion;

import java.awt.Color;
import mx.itson.xemlet.nucleo.controlador.ControladorFramePrincipal;
import mx.itson.xemlet.nucleo.controlador.ControladorPaquete;

/**
 *
 * @author javiershaka
 */
public class FrameAgregarPaquete extends javax.swing.JDialog {

    /**
     * Creates new form AgregarPaquete
     */
    public FrameAgregarPaquete(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtMinutosCelular = new javax.swing.JFormattedTextField();
        txtMinutosAdicionales = new javax.swing.JFormattedTextField();
        txtLlamadasFijas = new javax.swing.JFormattedTextField();
        txtLlamadasAdicionales = new javax.swing.JFormattedTextField();
        txtPrecio = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 42, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Minutos a celular:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 80, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Llamadas Fijas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 156, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Costo adicional por minutos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 118, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Costo adicional por llamada:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 187, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 231, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 39, 199, -1));

        btnAgregar.setText("Aceptar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 268, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 268, -1, -1));

        txtMinutosCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        getContentPane().add(txtMinutosCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 77, 199, -1));

        txtMinutosAdicionales.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        getContentPane().add(txtMinutosAdicionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 115, 199, -1));

        txtLlamadasFijas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        getContentPane().add(txtLlamadasFijas, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 153, 199, -1));

        txtLlamadasAdicionales.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        getContentPane().add(txtLlamadasAdicionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 184, 199, -1));

        txtPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 228, 199, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/xemlet/presentacion/imagenes/planet.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        //condiciones para campos vacios
        if (txtLlamadasAdicionales.getText().isEmpty()) {
            txtLlamadasAdicionales.setBackground(Color.red);
        }
        if (txtLlamadasFijas.getText().isEmpty()) {
            txtLlamadasFijas.setBackground(Color.red);
        }
        if (txtMinutosAdicionales.getText().isEmpty()) {
            txtMinutosAdicionales.setBackground(Color.red);
        }
        if (txtMinutosCelular.getText().isEmpty()) {
            txtMinutosCelular.setBackground(Color.red);
        }
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setBackground(Color.red);
        }
        if (txtPrecio.getText().isEmpty()) {
            txtPrecio.setBackground(Color.red);
        }
        //condicion para que todos los campos esten llenos y de ahi manda a llamar el metodo agregarormodificar cliente 
        if (!txtLlamadasAdicionales.getText().isEmpty() && !txtLlamadasFijas.getText().isEmpty() && !txtMinutosAdicionales.getText().isEmpty() && !txtMinutosCelular.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtPrecio.getText().isEmpty()) {
            new ControladorPaquete().AgregarOModificarValidacion();
            new ControladorFramePrincipal().llenarTablaFramePrincipalPaquetes();
            this.setVisible(false);
        } else {

        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // se hace invisible la ventana
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(FrameAgregarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAgregarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAgregarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAgregarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameAgregarPaquete dialog = new FrameAgregarPaquete(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAgregar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JFormattedTextField txtLlamadasAdicionales;
    public static javax.swing.JFormattedTextField txtLlamadasFijas;
    public static javax.swing.JFormattedTextField txtMinutosAdicionales;
    public static javax.swing.JFormattedTextField txtMinutosCelular;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JFormattedTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
