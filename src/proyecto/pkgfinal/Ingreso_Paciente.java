package proyecto.pkgfinal;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import modelo.Conexion;
import modelo.SqlUsuario;
import modelo.prueba;
import modelo.usuario;

public class Ingreso_Paciente extends javax.swing.JFrame {

    public Ingreso_Paciente() {
        initComponents();
        this.setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Alimento");
        ((JPanel) getContentPane()).setOpaque(false);
        //ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/fondo-de-colores-181479.jpg"));
        //ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/Rikka.jpg"));
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/fondokato.png"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        /*
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "SELECT Nombre_enfermedad FROM `enfemedad` ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                this.CmbEnfermedad.addItem(rs.getString("Nombre_enfermedad"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        fecha = new com.toedter.calendar.JDateChooser();
        RbnMasculino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        RbtFemenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        TxtPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Rut");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de nacimiento");

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("xx.xxx.xxx-x");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Ingreso nuevo paciente");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Apellido Paterno");

        txtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Apellido Materno");

        txtApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMActionPerformed(evt);
            }
        });
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyTyped(evt);
            }
        });

        fecha.setMaxSelectableDate(new java.util.Date(2524622512000L));
        fecha.setMinSelectableDate(new java.util.Date(-1262285888000L));

        RbnMasculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbnMasculino.setText("Masculino");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sexo");

        RbtFemenino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbtFemenino.setText("Femenino");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");

        TxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTelefonoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Solo 8 numeros");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Código");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Correo");

        TxtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCorreoKeyTyped(evt);
            }
        });

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTelefono)
                            .addComponent(txtNombre)
                            .addComponent(txtApellidoP)
                            .addComponent(txtApellidoM)
                            .addComponent(txtRut)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RbnMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(RbtFemenino)
                                .addGap(0, 247, Short.MAX_VALUE))
                            .addComponent(TxtCorreo)
                            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(393, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbnMasculino)
                    .addComponent(RbtFemenino)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu men = new Menu();
        men.setVisible(true);
        men.jLabel1.setText(jLabel7.getText());
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        SqlUsuario modSql = new SqlUsuario();
        usuario mod = new usuario();
        String Pass = new String(TxtPass.getPassword());
        JRadioButton masculino = RbnMasculino;
        JRadioButton femenino = RbtFemenino;
        String gender = null;
        String formatoS = "yyyy-MM-dd";
        DateFormat formatte = new SimpleDateFormat(formatoS);
        if (masculino.isSelected()) {
            gender = "masculino";
        } else if (femenino.isSelected()) {
            gender = "femenino";
        }

        //String nuevoPass = hash.sha1(pass);
        if (txtRut.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un rut");
        } else {
            if (modSql.validarRut(txtRut.getText())) {

                mod.setRut(txtRut.getText());
                mod.setNombre(txtNombre.getText());
                mod.setApellidoP(txtApellidoP.getText());
                mod.setApellidoM(txtApellidoM.getText());
                mod.setContrasena(Pass);
//                mod.setDireccion(TxtDireccino.getText());
                mod.setCorreo(TxtCorreo.getText());
                mod.setSexo(gender);
                mod.setEdad(formatte.format(fecha.getDate()));
                //mod.setEstatura(txtEstatura.getText());
                // mod.setPeso(txtPeso.getText());
                // mod.setEmfermedad(txtEnferm.getText());

                if (modSql.Ingresar(mod)) {
                    JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO");
                    //txtNombre.setText("");
                    txtRut.setText("");
                    TxtPass.setText("");
                    txtApellidoP.setText("");
                    txtNombre.setText("");
                    txtRut.setText("");
                    txtApellidoM.setText("");
                    //TxtDireccino.setText("");
                    fecha.setDateFormatString("");
                    TxtCorreo.setText("");

                } else {

                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR");
                    /*
                    txtRut.setText("");
                    TxtPass.setText("");
                    txtApellidoP.setText("");
                    txtNombre.setText("");
                    txtRut.setText("");
                    txtApellidoM.setText("");
                    TxtDireccino.setText("");
                    fecha.setDateFormatString("");
                    TxtCorreo.setText("");
                     */
                }
            } else {
                JOptionPane.showMessageDialog(null, "RUT NO VALIDO");
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyTyped
        char meleon = evt.getKeyChar();
        //char rizard = evt.getKeyChar();-

        if ((meleon < '0' || meleon > '9') && (meleon < '-' || meleon > '-') && (meleon < '.' || meleon > '.') && (meleon != evt.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Datos permitidos 0-9 más puntos y comas");
        }

        int kay = 13;
        if (txtRut.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Rut demaciado largo, Favor verificar");
        }
    }//GEN-LAST:event_txtRutKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char mander = evt.getKeyChar();

        if ((mander < 'a' || mander > 'z') && (mander < 'A' || mander > 'Z') && (mander < 'ñ' || mander > 'ñ') && (mander < 'Ñ' || mander > 'ñ') && (mander != evt.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar Solo letras");
        }

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPKeyTyped
        char mander = evt.getKeyChar();

        if ((mander < 'a' || mander > 'z') && (mander < 'A' || mander > 'Z') && (mander < 'ñ' || mander > 'ñ') && (mander < 'Ñ' || mander > 'ñ') && (mander != evt.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar Solo letras");
        }

    }//GEN-LAST:event_txtApellidoPKeyTyped

    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyTyped
        char mander = evt.getKeyChar();

        if ((mander < 'a' || mander > 'z') && (mander < 'A' || mander > 'Z') && (mander != evt.VK_BACK_SPACE) && (mander < 'ñ' || mander > 'ñ') && (mander < 'Ñ' || mander > 'ñ')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar Solo letras");
        }

    }//GEN-LAST:event_txtApellidoMKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtNombre.setText("");
        txtRut.setText("");
        txtApellidoM.setText("");
        txtApellidoP.setText("");
        TxtTelefono.setText("");
        String prueba = "";
        fecha.setDateFormatString(prueba);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelefonoKeyTyped
        char mander = evt.getKeyChar();

        if ((mander < '0' || mander > '9') && (mander != evt.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar Solo números");
        }

        int kay = 8;
        if (TxtTelefono.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar número de teléfono sin código de Area(+56)");
        }
    }//GEN-LAST:event_TxtTelefonoKeyTyped

    private void txtApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMActionPerformed

    private void TxtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCorreoKeyTyped

        int kay = 50;
        if (TxtCorreo.getText().length() >= kay) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCorreoKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbnMasculino;
    private javax.swing.JRadioButton RbtFemenino;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
