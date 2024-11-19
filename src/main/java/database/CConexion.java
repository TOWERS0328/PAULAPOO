package database;

import javax.swing.*;
import java.sql.*;

public class CConexion {
    public static void main(String[] args) {
        CConexion cConexion = new CConexion();
        cConexion.conecarDB();
    }

    static Connection cx = null;

    static String  user = "root";
    static String  password = "Juan304@@";
    static String  bd = "sistema_usuarios";
    static String  ip = "localhost";
    static String  puerto = "3306";
    static String  cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public CConexion() {

    }

    public static Connection conecarDB() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cx = DriverManager.getConnection(cadena, user, password);
            JOptionPane.showConfirmDialog(null, "GOODDDDD");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se logro conectar con la base de datos, error: " + e.toString());
        }

        return cx;
    }
}
