package Logic.command;

import Interfaces.command.IUpdate;
import Model.User;
import database.CConexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUser implements IUpdate<User> {

    private static final String UPDATE_USER = "update users set name=?, lastname=?, password=?, phone=?, idUser=? where id=?";


    @Override
    public void update(User user) throws SQLException {
        try {

            Connection cx = CConexion.conecarDB();
            PreparedStatement ps = cx.prepareStatement(UPDATE_USER);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getIdUser());
            ps.setInt(6, user.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usario actulizado con exito");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el usuario"+e.getMessage());
        }
    }
}
