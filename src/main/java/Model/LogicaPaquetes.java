package Model;

import database.CConexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class LogicaPaquetes {

    public DefaultTableModel mostrarPaquetes() {
        String[] nombresColumnas = {
            "Id", "Número de Seguimiento", "Categorías", 
            "Fecha de Ingreso", "Ubicación Actual", 
            "Destino", "Cédula del Repartidor"
        };
        String[] registros = new String[7]; // Mantiene los 7 registros

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        // Consulta SQL para obtener los 7 campos
        String sql = "SELECT id, numeroSeguimiento, categorias, fechaDeIngreso, " +
                     "ubicacionActual, destino, cedulaRepartidor FROM paquetes";

        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            cn = CConexion.conecarDB(); // Conexión a la base de datos
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("numeroSeguimiento");
                registros[2] = rs.getString("categorias");
                registros[3] = rs.getString("fechaDeIngreso");
                registros[4] = rs.getString("ubicacionActual");
                registros[5] = rs.getString("destino"); // Para el campo destino
                registros[6] = rs.getString("cedulaRepartidor"); // Para el campo cedulaRepartidor

                modelo.addRow(registros);
            }
        } catch (SQLException e) {
            System.err.println("Error al mostrar los paquetes: " + e.getMessage());
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
