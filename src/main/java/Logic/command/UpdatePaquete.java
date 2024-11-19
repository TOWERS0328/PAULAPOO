package Logic.command;

import Interfaces.command.IUpdate;
import Model.Paquete;
import database.CConexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePaquete implements IUpdate<Paquete> {

    private static final String UPDATE_PAQUETE_SQL = 
        "UPDATE paquetes SET categorias=?, fechaDeIngreso=?, ubicacionActual=?, destino=?, cedulaRepartidor=? " +
        "WHERE numeroSeguimiento=?";

    @Override
    public void update(Paquete paquete) throws SQLException {
        if (paquete == null || paquete.getNumeroSeguimiento() == null) {
            JOptionPane.showMessageDialog(null, "El número de seguimiento no puede estar vacío.");
            return;
        }
        try {
            
            Connection cx = CConexion.conecarDB();
            PreparedStatement ps = cx.prepareStatement(UPDATE_PAQUETE_SQL);
            
            ps.setString(1, paquete.getCategorias());
            ps.setDate(2, java.sql.Date.valueOf(paquete.getFechaDeIngreso())); 
            ps.setString(3, paquete.getUbicacionActual());
            ps.setString(4, paquete.getDestino());
            ps.setString(5, paquete.getCedulaRepartidor());
            ps.setString(6, paquete.getNumeroSeguimiento()); 
            
            int rowsAffected = ps.executeUpdate();
            
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Paquete actualizado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un paquete con ese número de seguimiento.");
            }
            
            cx.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el paquete: " + e.getMessage());
        }
    }
}

