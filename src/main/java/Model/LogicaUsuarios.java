package Model;

import database.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 * Clase para gestionar la lógica de los usuarios.
 * Contiene un método para mostrar los usuarios desde la base de datos.
 */
public class LogicaUsuarios {

    // Consulta SQL para insertar un nuevo usuario (según lo que parece ser una constante de inserción)
    public static final String INSERT = "INSERT INTO users ( nome, idUser, phone, role? ,password, lastname, role) VALUES(?,?,?,?,?,?)";

    /**
     * Método para mostrar todos los usuarios en una tabla.
     * 
     * @return DefaultTableModel con los datos de los usuarios.
     */
    public DefaultTableModel mostrarUsuarios() {
        String[] nombresColumnas = {
            "Id", "Cedula", "Nombre", 
            "Apellido", "Telefono", 
            "Contraseña", "Roles"
        };
        String[] registros = new String[7]; 

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        // Consulta SQL para obtener los datos de los usuarios
        String sql = "SELECT id, idUser, nome, lastname, " +
                     "phone, password, role FROM users";

        // Usamos try-with-resources para asegurarnos de cerrar los recursos automáticamente
        try (Connection cn = CConexion.conecarDB();
             PreparedStatement pst = cn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("idUser"); // "Cedula" se refiere a "idUser" en la base de datos
                registros[2] = rs.getString("nome"); // "Nombre" se refiere a "nome" en la base de datos
                registros[3] = rs.getString("lastname"); // "Apellido" se refiere a "lastname" en la base de datos
                registros[4] = rs.getString("phone"); // "Telefono" se refiere a "phone" en la base de datos
                registros[5] = rs.getString("password"); // "Contraseña" se refiere a "password" en la base de datos
                registros[6] = rs.getString("role"); // "Roles" se refiere a "role" en la base de datos

                modelo.addRow(registros);
            }
        } catch (SQLException e) {
            System.err.println("Error al mostrar los usuarios: " + e.getMessage());
        }

        return modelo;
    }
}
