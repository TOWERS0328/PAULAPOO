package Logic.command;

import Interfaces.command.IUpdate;
import Model.User;
import database.CConexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUser implements IUpdate<User> {

    // Consulta SQL para actualizar un usuario
    private static final String UPDATE_USER = 
        "UPDATE users SET nome = ?, lastname = ?, password = ?, phone = ?, idUser = ?, role = ? WHERE id = ?";

    @Override
    public void update(User user) throws SQLException {
       
        try (Connection cx = CConexion.conecarDB(); 
             PreparedStatement ps = cx.prepareStatement(UPDATE_USER)) {

            // Establecer los parámetros de la consulta SQL
            ps.setString(1, user.getNome());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getIdUser());
            ps.setString(6, user.getRoll()); 
            ps.setInt(7, user.getId());

            // Ejecutar la actualización
            int rowsUpdated = ps.executeUpdate();

            // Informar si se actualizó con éxito
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, 
                    "El usuario con ID " + user.getId() + " fue actualizado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, 
                    "No se encontró un usuario con ID " + user.getId() + " para actualizar.");
            }

        } catch (SQLException e) {
          
            JOptionPane.showMessageDialog(null, 
                "Error al actualizar el usuario con ID " + user.getId() + ": " + e.getMessage());
        }
    }
}
