package Logic.command;

import Interfaces.command.IInsert;
import Model.User;
import database.CConexion;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUser implements IInsert<User> {

    private static final String INSERT = "INSERT INTO users (nome, idUser, phone, password, lastname, role) VALUES (?, ?, ?, ?, ?, ?)";

    @Override
    public void insert(User user) throws SQLException {
        try {
            Connection cx = CConexion.conecarDB();
            PreparedStatement st = cx.prepareCall(INSERT);
            st.setString(1, user.getNome());
            st.setString(2, user.getIdUser());
            st.setString(3, user.getPhone());
            st.setString(4, user.getPassword());
            st.setString(5, user.getLastName());
            st.setString(6, user.getRoll()); // Se añade el rol
            st.execute();
            JOptionPane.showMessageDialog(null, "Usuario insertado correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el usuario: " + e.getMessage());
        }
    }
}

