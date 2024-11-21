
package Vistas;

import Logic.command.DeletePaquete;
import Logic.command.InsertPaquete;
import Logic.command.UpdatePaquete;
import Model.Paquete;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import javax.swing.JOptionPane;


/**
 *
 * @author juand
 */
public class RegistroDePaquete extends javax.swing.JFrame {

    
    /**
     * Creates new form RegistroDePaquete
     */
    public RegistroDePaquete() {
        initComponents();
        setLocationRelativeTo (null);
        configurarNavegacionConEnter();
        generarNumeroSeguimiento();
        registrarPaquete();
        
         
 
    Calendar calendar = Calendar.getInstance();
    JCalender.setDate(calendar.getTime()); 
    JCalender.setSelectableDateRange(calendar.getTime(), calendar.getTime()); 
    
      
    }

     private void configurarNavegacionConEnter() {
    
    ComboCategorias.addActionListener(e -> TxtUbicacionActual.requestFocus());  
    TxtUbicacionActual.addActionListener(e -> TxtDestino.requestFocus());       
    TxtDestino.addActionListener(e -> BtnRegistrar.requestFocus());             
    
     }
     
         private String generarNumeroSeguimiento() {
      
        String numeroSeguimiento = UUID.randomUUID().toString();
        TxtNumeroSeguimiento.setText(numeroSeguimiento); 
        return numeroSeguimiento;
    }
     
    private void limpiarCampos() {
         ComboCategorias.setSelectedIndex(0); 
        JCalender.setDate(null);
        TxtDestino.setText("");
        TxtUbicacionActual.setText("");
        TxtNumeroSeguimiento.setText("");
    }
    
    
private void registrarPaquete() {
     String categorias = ComboCategorias.getSelectedItem() != null ? ComboCategorias.getSelectedItem().toString() : "";
    Date fechaIngreso = JCalender.getDate(); // Obtener la fecha seleccionada
    String ubicacionActual = TxtUbicacionActual.getText();
    String destino = TxtDestino.getText();

    if (categorias.isEmpty() || fechaIngreso == null || destino.isEmpty() || ubicacionActual.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
        return;
    }

    // Generar el número de seguimiento
    String numeroSeguimiento = generarNumeroSeguimiento();
    TxtNumeroSeguimiento.setText(numeroSeguimiento); // Asignar el número de seguimiento al campo

    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtNumeroSeguimiento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JCalender = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        TxtUbicacionActual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtDestino = new javax.swing.JTextField();
        BtnRegistrar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        ComboCategorias = new javax.swing.JComboBox<>();
        TxCedulaRepartidor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sistema de Seguimiento de Envíos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("N° Seguimiento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        TxtNumeroSeguimiento.setBackground(new java.awt.Color(255, 255, 255));
        TxtNumeroSeguimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TxtNumeroSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroSeguimientoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtNumeroSeguimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de Ingreso");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        JCalender.setBackground(new java.awt.Color(255, 255, 255));
        JCalender.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(JCalender, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ubicación Actual");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        TxtUbicacionActual.setBackground(new java.awt.Color(255, 255, 255));
        TxtUbicacionActual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(TxtUbicacionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Destino");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        TxtDestino.setBackground(new java.awt.Color(255, 255, 255));
        TxtDestino.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(TxtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, 30));

        BtnRegistrar.setBackground(new java.awt.Color(255, 102, 0));
        BtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistrar.setText("Registar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 30));

        btnBorrar.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, 30));

        btnActualizar.setBackground(new java.awt.Color(255, 102, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Editar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        ComboCategorias.setBackground(new java.awt.Color(255, 255, 255));
        ComboCategorias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ComboCategorias.setForeground(new java.awt.Color(0, 0, 0));
        ComboCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Documentos", "Electrónicos", "Ropa y accesorios", "Hogar y decoración" }));
        ComboCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorías", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(ComboCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 150, 50));

        TxCedulaRepartidor.setBackground(new java.awt.Color(255, 255, 255));
        TxCedulaRepartidor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TxCedulaRepartidor.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxCedulaRepartidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cedula del Repartidor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\juand\\OneDrive\\Imágenes\\Simple Lined White Login Page Wireframe Website UI Prototype.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 760, 330));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\juand\\OneDrive\\Imágenes\\UI Login Page Desktop Prototype (1).png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 970, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNumeroSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroSeguimientoActionPerformed
      
    }//GEN-LAST:event_TxtNumeroSeguimientoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    
     
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
       
    String numeroSeguimiento = TxtNumeroSeguimiento.getText();  

    if (numeroSeguimiento.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor ingresa el número de seguimiento.");
        return;
    }

    
    Paquete paquete = new Paquete();
    paquete.setNumeroSeguimiento(numeroSeguimiento);

    
    DeletePaquete deletePaquete = new DeletePaquete();

    try {
        
        deletePaquete.delete(paquete);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al intentar eliminar el paquete: " + e.getMessage());
    }

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
    

    String numeroSeguimiento = TxtNumeroSeguimiento.getText().trim();
    String categorias = ComboCategorias.getSelectedItem() != null ? ComboCategorias.getSelectedItem().toString() : "";
    Date fechaIngreso = JCalender.getDate(); 
    String ubicacionActual = TxtUbicacionActual.getText().trim();
    String destino = TxtDestino.getText().trim();
    String cedula = TxCedulaRepartidor.getText().trim();

    
    if (numeroSeguimiento.isEmpty() || categorias.isEmpty() || fechaIngreso == null || 
        ubicacionActual.isEmpty() || destino.isEmpty() || cedula.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, llene todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

   
    LocalDate fechaIngresoLocalDate = fechaIngreso.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();

    
    Paquete paquete = new Paquete(numeroSeguimiento, categorias, fechaIngresoLocalDate, ubicacionActual, destino, cedula);

    
    InsertPaquete insertPaquete = new InsertPaquete();
    try {
        insertPaquete.insert(paquete);
        JOptionPane.showMessageDialog(this, "Paquete registrado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
         limpiarCampos();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al guardar el paquete: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
         limpiarCampos();
    }

    }//GEN-LAST:event_BtnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDePaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDePaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDePaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDePaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDePaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JComboBox<String> ComboCategorias;
    private com.toedter.calendar.JDateChooser JCalender;
    private javax.swing.JTextField TxCedulaRepartidor;
    private javax.swing.JTextField TxtDestino;
    private javax.swing.JTextField TxtNumeroSeguimiento;
    private javax.swing.JTextField TxtUbicacionActual;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
