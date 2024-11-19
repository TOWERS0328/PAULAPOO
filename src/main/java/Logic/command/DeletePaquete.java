
package Logic.command;

import Interfaces.command.IDelete;
import Model.Paquete;
import database.CConexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletePaquete implements IDelete<Paquete> {

    private static final String DELETE_PAQUETE_SQL = "DELETE FROM paquetes WHERE numeroSeguimiento = ?";

    @Override
    public void delete(Paquete paquete) throws SQLException {
        if (paquete == null || paquete.getNumeroSeguimiento() == null) {
            JOptionPane.showMessageDialog(null, "El número de seguimiento no puede estar vacío.");
            return;
        }
        try {
            Connection cx = CConexion.conecarDB();
            PreparedStatement ps = cx.prepareStatement(DELETE_PAQUETE_SQL);
            ps.setString(1, paquete.getNumeroSeguimiento());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Paquete eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un paquete con ese número de seguimiento.");
            }
            cx.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el paquete: " + e.getMessage());
        }
    }
}
