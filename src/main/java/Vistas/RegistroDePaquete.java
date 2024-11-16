
package Vistas;

import Model.Paquete;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juand
 */
public class RegistroDePaquete extends javax.swing.JFrame {
 private DefaultTableModel modeloTabla;
    
    /**
     * Creates new form RegistroDePaquete
     */
    public RegistroDePaquete() {
        initComponents();
        configurarNavegacionConEnter();
        generarNumeroSeguimiento();
        registrarPaquete();
        
         
     TxtNumeroSeguimiento.setEditable(false); 
    Calendar calendar = Calendar.getInstance();
    jDateChooser1.setDate(calendar.getTime()); 
    jDateChooser1.setSelectableDateRange(calendar.getTime(), calendar.getTime()); 
    
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("N° Seguimiento");
        modeloTabla.addColumn("Descripción");
        modeloTabla.addColumn("Fecha Ingreso");
        modeloTabla.addColumn("Ubicación Actual");
        modeloTabla.addColumn("Destino");
        
        tablaPaquetes.setModel(modeloTabla);
        
   
    }

    
        
    
     private void configurarNavegacionConEnter() {
    // Navegación con Enter entre los campos de texto
    TxtDescripcion.addActionListener(e -> TxtUbicacionActual.requestFocus());  
    TxtUbicacionActual.addActionListener(e -> TxtDestino.requestFocus());       
    TxtDestino.addActionListener(e -> BtnRegistrar.requestFocus());             
    
     }
     
         private String generarNumeroSeguimiento() {
        // Generar un UUID único para cada paquete
        return UUID.randomUUID().toString();
    }
     
    private void limpiarCampos() {
        TxtDescripcion.setText("");
        jDateChooser1.setDate(null);
        TxtDestino.setText("");
        TxtUbicacionActual.setText("");
        TxtNumeroSeguimiento.setText("");
    }
    
    
private void registrarPaquete() {
    String descripcion = TxtDescripcion.getText();
    Date fechaIngreso = jDateChooser1.getDate(); // Obtener la fecha seleccionada
    String ubicacionActual = TxtUbicacionActual.getText();
    String destino = TxtDestino.getText();

    if (descripcion.isEmpty() || fechaIngreso == null || destino.isEmpty() || ubicacionActual.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
        return;
    }

    // Generar el número de seguimiento
    String numeroSeguimiento = generarNumeroSeguimiento();
    TxtNumeroSeguimiento.setText(numeroSeguimiento); // Asignar el número de seguimiento al campo

    LocalDate fechaIngresoLocal = fechaIngreso.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    // Añadir los datos al modelo de la tabla
    modeloTabla.addRow(new Object[]{numeroSeguimiento, descripcion, fechaIngresoLocal, ubicacionActual, destino});

    // Limpiar los campos
    limpiarCampos();
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
        jLabel3 = new javax.swing.JLabel();
        TxtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        TxtUbicacionActual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtDestino = new javax.swing.JTextField();
        BtnRegistrar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPaquetes = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripción");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        TxtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        TxtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 240, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de Ingreso");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ubicación Actual");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        TxtUbicacionActual.setBackground(new java.awt.Color(255, 255, 255));
        TxtUbicacionActual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(TxtUbicacionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Destino");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        TxtDestino.setBackground(new java.awt.Color(255, 255, 255));
        TxtDestino.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(TxtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 130, 30));

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

        tablaPaquetes.setBackground(new java.awt.Color(255, 255, 255));
        tablaPaquetes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaPaquetes.setForeground(new java.awt.Color(0, 0, 0));
        tablaPaquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° Seguimiento", "Descripción", "Fecha De Inicio", "Ubicación Actual", "Cedula de Repartidor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPaquetes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 770, 130));

        btnRegistrar.setBackground(new java.awt.Color(255, 102, 0));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Editar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\juand\\OneDrive\\Imágenes\\Simple Lined White Login Page Wireframe Website UI Prototype.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 790, 510));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\juand\\OneDrive\\Imágenes\\UI Login Page Desktop Prototype (1).png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 870, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNumeroSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroSeguimientoActionPerformed
      
    }//GEN-LAST:event_TxtNumeroSeguimientoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int filaSeleccionada = tablaPaquetes.getSelectedRow();
    if (filaSeleccionada >= 0) {
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres eliminar este paquete?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            modeloTabla.removeRow(filaSeleccionada); // Eliminar la fila seleccionada
            JOptionPane.showMessageDialog(this, "Paquete eliminado.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para borrar.");
    }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
          // Obtener datos del formulario
    String descripcion = TxtDescripcion.getText();
    Date fechaIngreso = jDateChooser1.getDate();  // Verifica que jDateChooser1 esté retornando un objeto Date
    String ubicacionActual = TxtUbicacionActual.getText();
    String destino = TxtDestino.getText();

    // Validación de campos
    if (descripcion.isEmpty() || fechaIngreso == null || destino.isEmpty() || ubicacionActual.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
        return;
    }

    // Generar el número de seguimiento
    String numeroSeguimiento = generarNumeroSeguimiento();
    TxtNumeroSeguimiento.setText(numeroSeguimiento);

    // Convertir fecha a LocalDate
    LocalDate fechaIngresoLocal = fechaIngreso.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    // Crear el objeto Paquete y almacenarlo
    try {
     //   Paquete paquete = new Paquete(numeroSeguimiento, descripcion, fechaIngresoLocal, ubicacionActual, destino);
        //paqueteManager.agregarPaquete(paquete); // Llama al método agregarPaquete de PaqueteManager

        // Añadir los datos al modelo de la tabla
        modeloTabla.addRow(new Object[]{numeroSeguimiento, descripcion, fechaIngresoLocal, ubicacionActual, destino});

        // Limpiar los campos del formulario
        limpiarCampos();
    } catch (IllegalArgumentException e) {
        // Mostrar un mensaje específico si ya existe un paquete con el mismo número de seguimiento
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error de registro", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        // Capturar cualquier otro tipo de error
        JOptionPane.showMessageDialog(this, "Error al registrar el paquete: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JTextField TxtDestino;
    private javax.swing.JTextField TxtNumeroSeguimiento;
    private javax.swing.JTextField TxtUbicacionActual;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRegistrar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPaquetes;
    // End of variables declaration//GEN-END:variables
}