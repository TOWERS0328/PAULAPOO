package Logic.command;

import Interfaces.command.IDelete;
import Model.User;
import database.CConexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUser implements IDelete<User> {

    private static final String DELETE_USER_SQL = "DELETE FROM users WHERE idUser = ?";

    @Override
    public void delete(User user) throws SQLException {
        try {
        Connection cx = CConexion.conecarDB();
        PreparedStatement ps = cx.prepareStatement(DELETE_USER_SQL);
        ps.setString(1, user.getIdUser());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente");
        cx.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario,"+e.getMessage());
        }
    }
}
