package Model;

import database.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juand
 */
public class LogicaUsuarios {

    public static final String INSERT = "INSERT INTO users (nome, idUser, phone, password, lastname, role) VALUES(?,?,?,?,?,?)";

    public DefaultTableModel mostrarUsuarios() {
        String[] nombresColumnas = {
            "Id", "Cedula", "Nombre", 
            "Apellido", "Telefono", 
            "Contraseña", "Roles"
        };
        String[] registros = new String[7]; 

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        // Consulta SQL para obtener los 7 campos
        String sql = "SELECT id, idUser, nome, lastname, " +
                     "phone, password, role FROM users";

        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            cn = CConexion.conecarDB(); // Conexión a la base de datos
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();

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
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión: " + ex.getMessage());
            }
        }

        return modelo;
    }
}
