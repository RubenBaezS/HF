package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlUsuario extends Conexion {

    public String getDatoClave(String rut) {
        return rut;
    }

    public boolean RegistrarNutricionista(usuario usr) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO `NUTRICIONISTA`(`RUT_NUTRICIONISTA`, `NOMBRE_NUTRICIONISTA`, `APELLIDOP_NUTRICIONISTA`, `APELLIDOM_NUTRICIONISTA`, `SEXO_NUTRICIONISTA`, `FECHANACIMIENTO_NUTRICIONISTA`, `TELEFONO_NUTRICIONISTA`, `CORREO_NUTRICIONISTA`, `PASS_NUTRICIONISTA`)"
                + " VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getRut());
            ps.setString(2, usr.getNombre());
            ps.setString(3, usr.getApellidoP());
            ps.setString(4, usr.getApellidoM());
            ps.setString(5, usr.getSexo());
            ps.setString(6, String.valueOf(usr.getEdad()));
            ps.setString(7, usr.getTelefono());
            ps.setString(8, usr.getCorreo());
            ps.setString(9, usr.getContrasena());
            ps.execute();
            return true;
//datos.add(String.valueOf(rs.getDate(6)));
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
            char dv = rut.charAt(rut.length() - 1);
            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception e) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, e);
        }

        return validacion;
    }

    public boolean Ingresar(usuario usr) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO `PACIENTE`(`RUT_PACIENTE`, `NOMBRE_PACIENTE`, `APELLIDOP_PACIENTE`, `APELLIDOM_PACIENTE`, `PASS_PACIENTE`, `CORREO_PACIENTE`, `SEXO_PACIENTE`, `FECHANACIMIENTO_PACIENTE`) VALUES(?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getRut());
            ps.setString(2, usr.getNombre());
            ps.setString(3, usr.getApellidoP());
            ps.setString(4, usr.getApellidoM());
            ps.setString(5, usr.getContrasena());
            //ps.setString(6, usr.getDireccion());
            ps.setString(6, usr.getCorreo());
            ps.setString(7, usr.getSexo());
            ps.setString(8, String.valueOf(usr.getEdad()));

            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean insertarAlimento(usuario usr) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = ("INSERT INTO alimentos (Nombre_Alimentos, Codigo_Alimento, Codigo_Asignacion) VALUES (?,?,?)");//ON DUPLICATE KEY UPDATE hits=hits+1
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getAlimento());
            ps.setString(2, usr.getCodigo());
            ps.setString(3, usr.getCodAlimento());

            ps.execute();
            return true;

        } catch (Exception e) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }

    }

    public boolean atencion(usuario usr) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = ("INSERT INTO `ATENCION`(`ID_PACIENTE`, `ID_NUTRICIONISTA`, `FECHA`, `ESTATURA`, `PESO`, `DIAGNOSTICO`)VALUES (?,?,?,?,?,?)");
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getId_paciente());
            ps.setInt(2, usr.getId_nutricionista());
            ps.setDate(3, Date.valueOf(usr.getEdad()));
            ps.setDouble(4, usr.getEstatura());
            ps.setDouble(5, usr.getPeso());
            ps.setString(6, usr.getDiagnostico());
          
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }

    }

    /*
    public boolean modificar_enfermedad(usuario usr){
     PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE `enfemedad` SET `Nombre_enfermedad`=?,`Descripcion_enfermedad`=? WHERE `Id_enfermedad` = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getDescripcion());

            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
    }
     */
    public boolean ingresarenf(usuario usr) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO `ENFERMEDAD`( `NOMBRE_ENFERMEDAD`, `DESCRIPCION_ENFERMEDAD`) VALUES (?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getDescripcion());

            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    //metodo para validar al usuario comparando que existan los datos ingresados para luego compararlos
    //con los datos almacenados dentro la Base de datos 
    public boolean login(usuario usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "select RUT_NUTRICIONISTA, PASS_NUTRICIONISTA from NUTRICIONISTA WHERE RUT_NUTRICIONISTA =?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getRut());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getContrasena().equals(rs.getString(2))) {
                    //Aqui va la actualizacion de ultima hora de conexion
                    //String sqlUpdate = "UPDATE nutricion (rut, nombre, enfermedad, alimentos, contrasena) VALUES(?,?,?,?,?)";

                    usr.setRut(rs.getString(1));
                    usr.setContrasena(rs.getString(2));

                    return true;

                } else {
                    return false;
                }

            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    /*    public boolean buscar(int codigo) {
        boolean resultado = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dataConexion = "jdbc:mysql://localhost:3306/control";
            Connection con = DriverManager.getConnection(dataConexion, "root", "root");
            String sql = "select * from manejo where codigo=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, codigo);
            ResultSet res = smt.executeQuery();
            if (res.next()) {
                resultado = true;
                this.codigo = res.getString("codigo");
                descripcion = res.getString("descripcion");
                valor_compra = res.getInt("valor_compra");
                valor_venta = res.getInt("valor_venta");
                stock = res.getInt("stock");
            }
            res.close();
            smt.close();
            con.close();
        } catch (Exception a) {
            a.printStackTrace();
            System.out.println("ERROR: " + a.getMessage());
        }

        return resultado;
    }*/
}
