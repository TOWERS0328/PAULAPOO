package Logic.query;

import Interfaces.query.ISelectAll;
import Model.User;
import database.CConexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectAllUsers implements ISelectAll<User> {
    @Override
    public List<User> selectAll() throws SQLException {
        List<User> users = new ArrayList<>();

        try {
            Connection cx = CConexion.conecarDB();
            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery("select * from users");
            while (rs.next()) {
               String username = rs.getString("username");
               String role = rs.getString("role");
               String phone = rs.getString("phone");
               String idUser = rs.getString("idUser");
               int id = rs.getInt("id");
               String lastName = rs.getString("lastName");
               User user = new User(username, idUser, phone, role, lastName, role, role);
               users.add(user);
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al traer los usuarios de la BD, "+e.getMessage());
        }

        return users;
    }
}
