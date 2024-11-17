package database;

import javax.swing.*;
import java.sql.*;

public class CConexion {
    public static void main(String[] args) {
        CConexion cConexion = new CConexion();
        cConexion.conecarDB();
    }

    Connection cx = null;

    String user = "";
    String password = "";
    String bd = "";
    String ip = "localhost";
    String puerto = "3306";
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public CConexion() {

    }

    public Connection conecarDB() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cx = DriverManager.getConnection(cadena, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se logro conectar con la base de datos, error: " + e.toString());
        }

        return cx;
    }
}
