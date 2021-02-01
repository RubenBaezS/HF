package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class prueba {

    private final String user = "asmrefri_food";
    private final String pass = "CarlosFood123.";
    private final String url = "jdbc:mysql://asmrefri.cl/asmrefri_healthy_food";
    private Connection con = null;

    public ArrayList<String> traerDatos(String rut) {

        ArrayList<String> datos = new ArrayList();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            PreparedStatement consulta = con.prepareStatement("SELECT Rut_paciente, Nombre_paciente, ApellidoP_paciente, ApellidoM_paciente, Telefono_paciente, Fecha_nacimiento_paciente FROM paciente WHERE Rut_Paciente = ?");

            consulta.setString(1, rut);

            ResultSet rs = consulta.executeQuery();

            if (rs.next()) {

                datos.add(rs.getString(1));
                datos.add(rs.getString(2));
                datos.add(rs.getString(3));
                datos.add(rs.getString(4));
                datos.add(rs.getString(5));
                datos.add(rs.getString(6));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró registro");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);

        }

        return datos;
    }

    public ArrayList<String> buscarDatos(String nombre) {

        ArrayList<String> datos = new ArrayList();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            PreparedStatement consulta = con.prepareStatement("SELECT Rut_paciente, Nombre_paciente, ApellidoP_paciente, ApellidoM_paciente FROM paciente WHERE Nombre_paciente like" + '"' + nombre + '"' + "_%");

            consulta.setString(1, nombre);

            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {

                datos.add(rs.getString(1));
                datos.add(rs.getString(2));
                datos.add(rs.getString(3));
                datos.add(rs.getString(4));
                datos.add(rs.getString(5));
                datos.add(rs.getString(6));

            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró registro");
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);

        }

        return datos;
    }

    public boolean actualizar(String rut, int peso, int Altura) {
        boolean resultado = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            PreparedStatement consulta = con.prepareStatement("Update paciente set  Peso = ?, Altura = ? where Rut_Paciente=?");
            consulta.setInt(1, peso);
            consulta.setInt(2, Altura);
            consulta.setString(3, rut);
            int cantida;
            cantida = consulta.executeUpdate();
            resultado = cantida > 0;

        } catch (Exception ex) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);

        }
        return resultado;
    }

    public boolean insertar(String codigo, String rut, String nombre, String ApellidoP, String ApellidoM, String sexo, String Telefono, String fecha_nacimiento) {

        boolean resultado = false;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            PreparedStatement consulta = con.prepareStatement("insert into paciente values(?,?,?,?,?,?,?,?)");
            consulta.setString(1, codigo);
            consulta.setString(2, rut);
            consulta.setString(3, nombre);
            consulta.setString(4, ApellidoP);
            consulta.setString(5, ApellidoM);
            consulta.setString(6, sexo);
            consulta.setString(7, Telefono);
            consulta.setString(8, fecha_nacimiento);
            
            int cantida;
            cantida = consulta.executeUpdate();
            resultado = cantida > 0;
        } catch (Exception ex) {

            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;

    }



    public boolean ingresarenf(int cod, String nombre, String descripcion, String area, String nivel) {

        boolean resultado = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement("insert into enfermedad values(?,?,?,?,?)");

            ps.setInt(1, cod);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setString(4, area);
            ps.setString(5, nivel);

            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;

    }

    public boolean buscar(String rut) {
        boolean resultado = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement("select * nutricionista where Rut_nutricionista = ?");
            ps.setString(1, rut);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                resultado = true;
            } else {
                return resultado;
            }

        } catch (Exception e) {
        }
        return resultado;
    }

    /*
        public boolean guardar() {
        boolean resultado = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String conexion = "jdbc:mysql://localhost/control";
            Connection con = DriverManager.getConnection(conexion, "root", "root");
            String query = "insert into manejo values (?,?,?,?,?)";
            PreparedStatement smt = con.prepareStatement(query);
            smt.setString(1, codigo);
            smt.setString(2, descripcion);
            smt.setInt(3, valor_compra);
            smt.setInt(4, valor_venta);
            smt.setInt(5, stock);
            resultado = smt.executeUpdate() > 0;
            smt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
     */

   
}
