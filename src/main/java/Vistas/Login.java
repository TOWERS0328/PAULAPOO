
package Vistas;

import database.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author juand
 */
public class Login extends javax.swing.JFrame {

       
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        CConexion.conecarDB();
        configurarNavegacionConEnter();
        limpiarCampos();
    }

      private void limpiarCampos() {
        txtNumeroCelular.setText("");
        txtContraseña.setText("");
      
    }
      
       private void configurarNavegacionConEnter() {
    // Navegación con Enter entre los campos de texto
    txtNumeroCelular.addActionListener(e -> txtContraseña.requestFocus());  
   
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnVentanaIniciar = new javax.swing.JButton();
        BtnVentanaRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroCelular = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Iniciar Sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 240, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Inicia sesión para continuar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 210, 24));

        BtnVentanaIniciar.setBackground(new java.awt.Color(255, 255, 255));
        BtnVentanaIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnVentanaIniciar.setForeground(new java.awt.Color(0, 0, 0));
        BtnVentanaIniciar.setText("Iniciar Sesión");
        BtnVentanaIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVentanaIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnVentanaIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, 30));

        BtnVentanaRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        BtnVentanaRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnVentanaRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        BtnVentanaRegistrar.setText("Registrarse");
        BtnVentanaRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVentanaRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnVentanaRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Número Celular");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtNumeroCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroCelular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNumeroCelular.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCelularActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumeroCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 380, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 20));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 390, 30));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 102, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 390, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\juand\\OneDrive\\Imágenes\\Simple Lined White Login Page Wireframe Website UI Prototype.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 460, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 450, 460));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\juand\\OneDrive\\Imágenes\\UI Login Page Desktop Prototype (1).png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 660, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVentanaIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVentanaIniciarActionPerformed
   
    }//GEN-LAST:event_BtnVentanaIniciarActionPerformed

    private void BtnVentanaRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVentanaRegistrarActionPerformed
        // Asumiendo que la autenticación fue exitosa
    Registro ventanaRegistro = new Registro();
    ventanaRegistro.setVisible(true);
    this.dispose(); // Cierra la ventana de login
    }//GEN-LAST:event_BtnVentanaRegistrarActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
      
       String celular = txtNumeroCelular.getText().trim();
    String contraseña = new String(txtContraseña.getPassword()).trim(); 

    if (celular.isEmpty() || contraseña.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Connection conexion = CConexion.conecarDB();
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        
        String query = "SELECT * FROM users WHERE phone = ? AND password = ?";
        statement = conexion.prepareStatement(query);
        statement.setString(1, celular);
        statement.setString(2, contraseña);

        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            String rol = resultSet.getString("role"); 

            
            switch (rol.toLowerCase()) {
                case "usuario":
                    RegistroDePaquete ventanaCliente = new RegistroDePaquete();
                    ventanaCliente.setVisible(true);
                    break;

                case "administrador":
                    GestiónUsuarios ventanaAdmin = new GestiónUsuarios();
                    ventanaAdmin.setVisible(true);
                    break;
                    
                     case "repartidor":
                    Repartidor ventanaRepartidor = new Repartidor();
                    ventanaRepartidor.setVisible(true);
                    break;

                default:
                    JOptionPane.showMessageDialog(this, "Rol desconocido: " + rol, "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }

            this.dispose(); 
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (conexion != null) conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cerrar la conexión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        
    String contraseña = txtContraseña.getText().trim();  

    
    if (contraseña.isEmpty()) {
        
        JOptionPane.showMessageDialog(null, "El campo de contraseña no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
       
        txtContraseña.requestFocus();
    }
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtNumeroCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCelularActionPerformed
         
   
    String numeroCelular = txtNumeroCelular.getText().trim();  
    
    if (numeroCelular.isEmpty()) {
        JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        txtNumeroCelular.requestFocus(); 
    } else if (numeroCelular.length() != 10 || !numeroCelular.matches("\\d+")) {
        
        JOptionPane.showMessageDialog(null, "Un número de celular debe tener exactamente 10 dígitos. Ejemplo: 3022240701", "Error", JOptionPane.ERROR_MESSAGE);
        txtNumeroCelular.setText(""); 
        txtNumeroCelular.requestFocus(); 
    }

    }//GEN-LAST:event_txtNumeroCelularActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVentanaIniciar;
    private javax.swing.JButton BtnVentanaRegistrar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNumeroCelular;
    // End of variables declaration//GEN-END:variables
}
