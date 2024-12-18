
package Vistas;

import Interfaces.command.IInsert;
import Logic.command.InsertUser;
import Model.User;
import java.sql.SQLException;
import javax.swing.JOptionPane;




/**
 *
 * @author juand
 */
public class Registro extends javax.swing.JFrame {
    
    public Registro() {
        initComponents();
         setLocationRelativeTo(null);
      
    }
    
   
        
    
      private void limpiarCampos() {
    
    txtNombre.setText("");
    TxtApellido.setText("");
    txtCedula.setText("");
    txtContraseña.setText("");
    TxtRepetirContraseña.setText("");
}

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnIniciarSesion = new javax.swing.JButton();
        BtnRegistrarse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnCrearCuenta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtRepetirContraseña = new javax.swing.JTextField();
        wertyui = new javax.swing.JLabel();
        txtNumeroCelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Crear Cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 240, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Crea una cuenta para continuar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 230, -1));

        BtnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        BtnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        BtnIniciarSesion.setText("Iniciar Sesión ");
        BtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(BtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, -1));

        BtnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        BtnRegistrarse.setText("Registrarse");
        BtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 340, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cedula");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 340, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 340, 30));

        btnCrearCuenta.setBackground(new java.awt.Color(255, 102, 0));
        btnCrearCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 370, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Apellido");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        TxtApellido.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TxtApellido.setForeground(new java.awt.Color(0, 0, 0));
        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 340, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Repetir Contreseña");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        TxtRepetirContraseña.setBackground(new java.awt.Color(255, 255, 255));
        TxtRepetirContraseña.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TxtRepetirContraseña.setForeground(new java.awt.Color(0, 0, 0));
        TxtRepetirContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRepetirContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtRepetirContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 340, 30));

        wertyui.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        wertyui.setForeground(new java.awt.Color(0, 0, 0));
        wertyui.setText("Número Celular");
        jPanel1.add(wertyui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        txtNumeroCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroCelular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNumeroCelular.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCelularActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumeroCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 330, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\juand\\OneDrive\\Imágenes\\Simple Lined White Login Page Wireframe Website UI Prototype.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 420, 620));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\juand\\OneDrive\\Imágenes\\UI Login Page Desktop Prototype (1).png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 600, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarSesionActionPerformed
     // Asumiendo que la autenticación fue exitosa
    Login ventanaLogin  = new Login ();
    ventanaLogin .setVisible(true);
    this.dispose(); // Cierra la ventana de login    
 limpiarCampos() ;    
    }//GEN-LAST:event_BtnIniciarSesionActionPerformed

    private void BtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarseActionPerformed
      // Asumiendo que la autenticación fue exitosa
    Registro ventanaRegistro = new Registro();
    ventanaRegistro.setVisible(true);
    this.dispose(); // Cierra la ventana de login
     limpiarCampos() ;
    }//GEN-LAST:event_BtnRegistrarseActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
                
  String nombre = txtNombre.getText().trim();
    String apellido = TxtApellido.getText().trim();
    String numeroCelular = txtNumeroCelular.getText().trim();  
    String cedula = txtCedula.getText().trim();
    String contraseña = new String(txtContraseña.getPassword()).trim();
    String repetirContraseña = TxtRepetirContraseña.getText().trim();

    // Validaciones básicas
    if (nombre.isEmpty() || apellido.isEmpty() || numeroCelular.isEmpty() || cedula.isEmpty() || contraseña.isEmpty() || repetirContraseña.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!contraseña.equals(repetirContraseña)) {
        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
        txtContraseña.setText("");
        TxtRepetirContraseña.setText("");
        txtContraseña.requestFocus();
        return;
    }

    if (contraseña.length() < 6) {
        JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 6 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Crear el objeto User con rol por defecto
    User newUser = new User();
    newUser.setNome(nombre);
    newUser.setLastName(apellido);
    newUser.setIdUser(cedula);
    newUser.setPhone(numeroCelular); 
    newUser.setPassword(contraseña);
    newUser.setRoll("Usuario"); // Asignar rol predeterminado

    // Insertar en la base de datos
    IInsert<User> insertUser = new InsertUser();
    try {
        insertUser.insert(newUser);
        JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente.");
        limpiarCampos();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al crear la cuenta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        limpiarCampos();
    }
    

    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    String nombre = txtNombre.getText().trim();  

  
    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(null, "El campo de nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        txtNombre.requestFocus();
    } else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
       
        JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras.", "Error", JOptionPane.ERROR_MESSAGE);
        txtNombre.setText(""); 
        txtNombre.requestFocus();
    } else {
        JOptionPane.showMessageDialog(null, "Nombre válido: " + nombre, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
    
    String contraseña = txtContraseña.getText().trim();
    String repetirContraseña = TxtRepetirContraseña.getText().trim();

    
    if (contraseña.isEmpty() || repetirContraseña.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ambos campos de contraseña no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
        txtContraseña.requestFocus();
    } else if (!contraseña.equals(repetirContraseña)) {
        
        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden. Por favor, verifique.", "Error", JOptionPane.ERROR_MESSAGE);
        
        txtContraseña.setText("");
        TxtRepetirContraseña.setText("");
       
        txtContraseña.requestFocus();
    }
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void TxtRepetirContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRepetirContraseñaActionPerformed
      
    String contraseña = txtContraseña.getText().trim();
    String repetirContraseña = TxtRepetirContraseña.getText().trim();

    
    if (contraseña.isEmpty() || repetirContraseña.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ambos campos de contraseña no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
        TxtRepetirContraseña.requestFocus();
    } else if (!contraseña.equals(repetirContraseña)) {
        
        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden. Por favor, verifique.", "Error", JOptionPane.ERROR_MESSAGE);
        
        txtContraseña.setText("");
        TxtRepetirContraseña.setText("");
        
        txtContraseña.requestFocus();
    }
    }//GEN-LAST:event_TxtRepetirContraseñaActionPerformed

    private void TxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoActionPerformed
    
     String nombre = TxtApellido.getText().trim();  

  
    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(null, "El campo de apellido no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        TxtApellido.requestFocus();
    } else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
       
        JOptionPane.showMessageDialog(null, "El apellido solo puede contener letras.", "Error", JOptionPane.ERROR_MESSAGE);
        TxtApellido.setText(""); 
        TxtApellido.requestFocus();
    } else {
        JOptionPane.showMessageDialog(null, "Apellido válido: " + nombre, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_TxtApellidoActionPerformed

    private void txtNumeroCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCelularActionPerformed
      String numeroCelular = txtNumeroCelular.getText().trim();  
    
    if (numeroCelular.isEmpty()) {
        JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        txtNumeroCelular.requestFocus(); 
    } else if (numeroCelular.length() != 10 || !numeroCelular.matches("\\d+")) {
        
        JOptionPane.showMessageDialog(null, "Un número de celular debe tener exactamente 10 dígitos. Ejemplo: 3022240701", "Error", JOptionPane.ERROR_MESSAGE);
        txtNumeroCelular.setText(""); 
        txtNumeroCelular.requestFocus(); 
         limpiarCampos();
    }
    }//GEN-LAST:event_txtNumeroCelularActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // HACER UNA VALIDACIÓN, PARA QUE VERIFIQUE SI LA CEDULA INGRESADA YA EXIXTE 
    }//GEN-LAST:event_txtCedulaActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIniciarSesion;
    private javax.swing.JButton BtnRegistrarse;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtRepetirContraseña;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCelular;
    private javax.swing.JLabel wertyui;
    // End of variables declaration//GEN-END:variables
}
