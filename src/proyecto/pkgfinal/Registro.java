package proyecto.pkgfinal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.shape.FillRule;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import modelo.SqlUsuario;
import modelo.hash;
import modelo.prueba;
import modelo.usuario;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Inicio");
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/fondokato.png"));
        // ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/1280x800_birthday_wallpaper_kirby.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        TxtRut = new javax.swing.JTextField();
        BtnRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtPass = new javax.swing.JPasswordField();
        TxtCPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtApellidoP = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtApellidoM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Fecha = new com.toedter.calendar.JDateChooser();
        RbtMasculino = new javax.swing.JRadioButton();
        RbtFemenino = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LblCorreoP = new javax.swing.JLabel();
        TxtCorreoP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 132, 211));
        setIconImages(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        TxtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRutKeyTyped(evt);
            }
        });

        BtnRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnRegistro.setText("Registrar");
        BtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese Rut");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese Contraseña");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Confirme Contraseña");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Apellido Paterno");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Telefono");

        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });

        TxtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtApellidoPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApellidoPKeyTyped(evt);
            }
        });

        TxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTelefonoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Apellido Materno");

        TxtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApellidoMKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("xx.xxx.xxx-x");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fecha de Naciento");

        Fecha.setMaxSelectableDate(new java.util.Date(2524622484000L));
        Fecha.setMinSelectableDate(new java.util.Date(-2208968150000L));

        RbtMasculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbtMasculino.setText("Masculino");

        RbtFemenino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbtFemenino.setText("Femenino");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Sexo");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LblCorreoP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCorreoP.setText("Corrreo ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Registro Nutricionista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(126, 126, 126))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(148, 148, 148))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(98, 98, 98))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(166, 166, 166))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(RbtMasculino)
                                                .addGap(18, 18, 18)
                                                .addComponent(RbtFemenino))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TxtRut, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                                .addComponent(TxtNombre)
                                                .addComponent(TxtApellidoP)
                                                .addComponent(TxtApellidoM))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(LblCorreoP))
                                                    .addComponent(jLabel2))
                                                .addGap(78, 78, 78))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                            .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                            .addComponent(TxtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                            .addComponent(TxtCPass, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                            .addComponent(TxtCorreoP))))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel4)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(RbtMasculino)
                    .addComponent(RbtFemenino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCorreoP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblCorreoP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addComponent(TxtCPass, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistroActionPerformed

        SqlUsuario modSql = new SqlUsuario();
        prueba pr = new prueba();
        usuario mod = new usuario();
        String pass = new String(TxtPass.getPassword());
        String CPass = new String(TxtCPass.getPassword());
        JRadioButton masculino = RbtMasculino;
        JRadioButton femenino = RbtFemenino;
        String gender = null;
        String formatoS = "yyyy-MM-dd";
        DateFormat formatte = new SimpleDateFormat(formatoS);

        if (masculino.isSelected()) {
            gender = "masculino";
        } else if (femenino.isSelected()) {
            gender = "femenino";
        }
        if (TxtRut.getText().equals("") || TxtPass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Datos");

        } else {
            if (pass.equals(CPass)) {
                if (modSql.validarRut(TxtRut.getText())) {
                    if (!pr.buscar(TxtRut.getText())) {//no tomar en cuenta esta sentencia
                        //String nuevoPass = hash.sha1(pass);
                        mod.setRut(TxtRut.getText());
                        mod.setContrasena(CPass);
                        mod.setNombre(TxtNombre.getText());
                        mod.setApellidoP(TxtApellidoP.getText());
                        mod.setApellidoM(TxtApellidoM.getText());
                        mod.setSexo(gender);
                        mod.setTelefono(TxtTelefono.getText());
                        mod.setEdad(formatte.format(Fecha.getDate()));
                        mod.setCorreo(TxtCorreoP.getText());
                        if (modSql.RegistrarNutricionista(mod)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                            TxtRut.setText("");
                            TxtPass.setText("");
                            TxtCPass.setText("");
                            TxtApellidoM.setText("");
                            TxtApellidoP.setText("");
                            TxtTelefono.setText("");
                            String prueba = "";
                            TxtCorreoP.setText("");
                            //Fecha.setDateFormatString(prueba);
                            Fecha.setDateFormatString(prueba);

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Rut se encuentra registrado");
                    }//esta es la llave de la sentacia que no se debe tomar en cuenta
                } else {
                    JOptionPane.showMessageDialog(null, "RUT NO VALIDO");
                    TxtRut.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                TxtPass.setText("");
                TxtCPass.setText("");
            }
        }
        TxtRut.setText("");
        TxtNombre.setText("");
        TxtPass.setText("");
        TxtCPass.setText("");
        TxtApellidoM.setText("");
        TxtApellidoP.setText("");
        TxtTelefono.setText("");
        String prueba = "";
        TxtCorreoP.setText("");
        Fecha.setDateFormatString(prueba);


    }//GEN-LAST:event_BtnRegistroActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        Inicio.frmReg = null;
    }//GEN-LAST:event_formWindowClosing

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped

        char mander = evt.getKeyChar();

        if ((mander < 'a' || mander > 'z') && (mander < 'A' || mander > 'Z') && (mander < 'ñ' || mander > 'ñ') && (mander < 'Ñ' || mander > 'ñ') && (mander != evt.VK_BACK_SPACE)) {
            evt.consume();
        }

        int kay = 30;
        if (TxtTelefono.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo 30 Caracteres como maximo");
        }

    }//GEN-LAST:event_TxtNombreKeyTyped

    private void TxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelefonoKeyTyped
        char mander = evt.getKeyChar();

        if ((mander < '0' || mander > '9') && (mander != evt.VK_BACK_SPACE)) {
            evt.consume();

        }
        int kay = 8;

        if (TxtTelefono.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar número de teléfono sin código de área");
        }
    }//GEN-LAST:event_TxtTelefonoKeyTyped

    private void TxtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRutKeyTyped

        char meleon = evt.getKeyChar();
        //char rizard = evt.getKeyChar();-
        if ((meleon < '0' || meleon > '9') && (meleon < '-' || meleon > '-') && (meleon < '.' || meleon > '.') && (meleon != evt.VK_BACK_SPACE)) {
            evt.consume();
        }

        int kay = 12;
        if (TxtRut.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Rut demaciado largo, Favor verificar");
        }
    }//GEN-LAST:event_TxtRutKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio op = new Inicio();
        op.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtApellidoPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellidoPKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoPKeyPressed

    private void TxtApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellidoPKeyTyped
        char mander = evt.getKeyChar();

        if ((mander < 'a' || mander > 'z') && (mander < 'A' || mander > 'Z') && (mander < 'ñ' || mander > 'ñ') && (mander < 'Ñ' || mander > 'ñ')) {
            evt.consume();
        }

        int kay = 30;
        if (TxtTelefono.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo 30 Caracteres como maximo");
        }
    }//GEN-LAST:event_TxtApellidoPKeyTyped

    private void TxtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellidoMKeyTyped
        char mander = evt.getKeyChar();

        if ((mander < 'a' || mander > 'z') && (mander < 'A' || mander > 'Z') && (mander < 'ñ' || mander > 'ñ') && (mander < 'Ñ' || mander > 'ñ')) {
            evt.consume();
        }

        int kay = 30;
        if (TxtTelefono.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo 30 Caracteres como maximo");
        }
    }//GEN-LAST:event_TxtApellidoMKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistro;
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JLabel LblCorreoP;
    private javax.swing.JRadioButton RbtFemenino;
    private javax.swing.JRadioButton RbtMasculino;
    private javax.swing.JTextField TxtApellidoM;
    private javax.swing.JTextField TxtApellidoP;
    private javax.swing.JPasswordField TxtCPass;
    private javax.swing.JTextField TxtCorreoP;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JTextField TxtRut;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
