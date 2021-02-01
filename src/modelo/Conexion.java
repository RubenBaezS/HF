package modelo;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private final String user = "persecut_food";
    private final String pass = "Lalatina1";
    private final String url = "jdbc:mysql://persecutor.cl/persecut_Examen";
    private Connection con = null;
    public Connection conexion;
    public Statement sentencia;
//Connection con = DriverManager.getConnection("jdbc:mysql://persecutor.cl/persecut_Final","persecut_food","Lalatina1");

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Se ha producido una excepcion " + e.getMessage());
        }
        return con;
    }

    public void conectarBasedeDatos() {
        try {
            final String controlador = "com.mysql.jdbc.Driver";
            Class.forName(controlador);
            //final String url_bd = url;
            conexion = DriverManager.getConnection(url, user, pass);
            sentencia = conexion.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
