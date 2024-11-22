package Logic.query;

import Interfaces.query.ISelectById;
import Model.User;
import database.CConexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUserById implements ISelectById<User> {
    @Override
    public User getById(User user) {
        User userReturn = null;

        try {
            Connection cx = CConexion.conecarDB();
            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery("select * from users where id=" + user.getId());
            if (rs.next()) {
                String username = rs.getString("username");
                String role = rs.getString("role");
                String phone = rs.getString("phone");
                String idUser = rs.getString("idUser");
                int id = rs.getInt("id");
                String lastName = rs.getString("lastName");
                userReturn = new User(username, idUser, phone, role, lastName, role, role);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return userReturn;
    }
}
