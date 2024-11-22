package Logic.command;

import Interfaces.command.IUpdate;
import Model.User;
import database.CConexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUser implements IUpdate<User> {

    // Constante para la consulta SQL de actualización de usuario
    private static final String UPDATE_USER = "UPDATE users SET name=?, lastname=?, password=?, phone=?, idUser=? WHERE id=?";

    @Override
    public void update(User user) throws SQLException {
        // Establecer la conexión y ejecutar la actualización en la base de datos
        try (Connection cx = CConexion.conecarDB(); 
             PreparedStatement ps = cx.prepareStatement(UPDATE_USER)) {

            // Establecer los parámetros de la consulta SQL
            ps.setString(1, user.getNome());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getIdUser());
            ps.setInt(6, user.getId());

            // Ejecutar la actualización
            int rowsUpdated = ps.executeUpdate();

            // Verificar si la actualización fue exitosa
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el usuario para actualizar.");
            }

        } catch (SQLException e) {
            // Manejar cualquier error en la actualización
            JOptionPane.showMessageDialog(null, "Error al actualizar el usuario: " + e.getMessage());
        }
    }
}
