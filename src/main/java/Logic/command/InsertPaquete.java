package Logic.command;

import Interfaces.command.IInsert;
import Model.Paquete;
import database.CConexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertPaquete implements IInsert<Paquete> {

    
    private static final String INSERT_PAQUETE_SQL = 
        "INSERT INTO paquetes (numeroSeguimiento, categorias, fechaDeIngreso, ubicacionActual, destino, cedulaRepartidor) " +
        "VALUES (?, ?, ?, ?, ?, ?)";

    @Override
    public void insert(Paquete paquete) throws SQLException {
        if (paquete == null) {
            JOptionPane.showMessageDialog(null, "El paquete no puede ser nulo.");
            return;
        }

        try {
            
            Connection cx = CConexion.conecarDB();
            PreparedStatement st = cx.prepareStatement(INSERT_PAQUETE_SQL);
            st.setString(1, paquete.getNumeroSeguimiento());
            st.setString(2, paquete.getCategorias());
            st.setDate(3, java.sql.Date.valueOf(paquete.getFechaDeIngreso())); 
            st.setString(4, paquete.getUbicacionActual());
            st.setString(5, paquete.getDestino());
            st.setString(6, paquete.getCedulaRepartidor());
            st.execute();
            JOptionPane.showMessageDialog(null, "Paquete insertado correctamente.");
           
            cx.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el paquete: " + e.getMessage());
        }
    }
}
