package proyecto.pkgfinal;

import Atxy2k.CustomTextField.RestrictedTextField;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import com.sun.xml.internal.ws.wsdl.parser.InaccessibleWSDLException;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.prueba;
import modelo.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import modelo.SqlUsuario;

public class FichaMedica extends javax.swing.JFrame {

    public String[] cadena;
    public int total = 0;
    int[] IdEnfe = {1};
    public int[] enferme;
    public String idPaci = "";
    public String idnutri = "";

    public FichaMedica() {

        initComponents();
        usuario mos = new usuario();
       // jTextField1.setText(mos.getGuardarut());

        this.setLocationRelativeTo(null);
        /*RestrictedTextField restringido = new RestrictedTextField(TxtImc);
        restringido.setLimit(1);
        restringido.setOnlyNums(true);
         */
        setResizable(false);
        setTitle("Ficha médica");
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/fondokato.png"));
        //ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/1280x800_birthday_wallpaper_kirby.jpg"));
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
            String sql = "SELECT `NOMBRE_ENFERMEDAD` FROM `ENFERMEDAD`";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                this.CmbEnfemedades.addItem(rs.getString("Nombre_enfermedad"));
                total++;
                cadena = new String[total];
                //System.out.println(rs.getObject((1)));
                //System.out.println(cadena.a("Nombre_enfermedad"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
/*/

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtRut = new javax.swing.JTextField();
        prueba = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblnom = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbledad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblbsex = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtTalla = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtPeso = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Txtareadiag = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        BtnGuardad = new javax.swing.JButton();
        BtnHistorial = new javax.swing.JButton();
        BtnFicha = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        LblImc = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblCalculo = new javax.swing.JLabel();
        lbl_rutficha = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Rut");

        TxtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRutActionPerformed(evt);
            }
        });
        TxtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRutKeyTyped(evt);
            }
        });

        prueba.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prueba.setText("xx.xxx.xxx-x");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        lblnom.setText("---");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha Nacimiento");

        lbledad.setText("---");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sexo");

        lblbsex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblbsex.setText("---");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Talla");

        TxtTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTallaActionPerformed(evt);
            }
        });
        TxtTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTallaKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Peso");

        TxtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPesoKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("I.M.C");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Diagnostico");

        Txtareadiag.setColumns(20);
        Txtareadiag.setRows(5);
        jScrollPane2.setViewportView(Txtareadiag);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Fecha");

        BtnGuardad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnGuardad.setText("Guardar");
        BtnGuardad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardadActionPerformed(evt);
            }
        });

        BtnHistorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnHistorial.setText("Historial medico");
        BtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistorialActionPerformed(evt);
            }
        });

        BtnFicha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnFicha.setText("Ficha Alimenticia");
        BtnFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFichaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Detalles de la atencion");

        BtnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        LblImc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblImc.setText("---");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblCalculo.setText("-----");

        lbl_rutficha.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        lbl_rutficha.setText("----");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbledad)
                                    .addComponent(lblnom)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LblImc)
                                        .addGap(110, 110, 110)
                                        .addComponent(jButton2)
                                        .addGap(44, 44, 44)
                                        .addComponent(lblCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblbsex)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(TxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(prueba)
                                .addGap(40, 40, 40)
                                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)
                                .addComponent(jLabel15)
                                .addGap(32, 32, 32)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 382, Short.MAX_VALUE)
                                .addComponent(BtnGuardad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnHistorial)
                                .addGap(18, 18, 18)
                                .addComponent(BtnFicha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(461, 461, 461)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(284, 284, 284)
                                .addComponent(lbl_rutficha)))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_rutficha))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(TxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prueba)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblnom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbledad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblbsex))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(LblImc)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCalculo))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel14))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGuardad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu men = new Menu();
        men.setVisible(true);
        men.jLabel1.setText(lbl_rutficha.getText());
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRutActionPerformed


    }//GEN-LAST:event_TxtRutActionPerformed

    private void BtnFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFichaActionPerformed
        String formatoS = "yyyy-MM-dd";
        DateFormat formatte = new SimpleDateFormat(formatoS);
        Atencion aten = new Atencion();
        aten.setVisible(true);
        aten.jLabel4.setText(lbl_rutficha.getText());
        aten.jLabel5.setText(formatte.format(jDateChooser1.getDate()));
        //aten.txtrutf.setText(TxtRut.getText());
        dispose();
    }//GEN-LAST:event_BtnFichaActionPerformed

    private void TxtTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTallaActionPerformed

    }//GEN-LAST:event_TxtTallaActionPerformed

    private void BtnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialActionPerformed
        Historial his = new Historial();
        his.setVisible(true);
        his.LblRut.setText(TxtRut.getText());
    }//GEN-LAST:event_BtnHistorialActionPerformed

    private void TxtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRutKeyTyped
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '-' || mander > '-') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN NÚMEROS, PUNTOS Y GUION");

        }

        int kay = 12;
        if (TxtRut.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo 12 Caracteres como maximo");
        }
    }//GEN-LAST:event_TxtRutKeyTyped

    private void TxtTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTallaKeyTyped
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN NÚMEROS");
        }

        int kay = 4;
        if (TxtTalla.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo 3 Caracteres como maximo");
        }
    }//GEN-LAST:event_TxtTallaKeyTyped

    private void TxtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPesoKeyTyped
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN NÚMEROS");
        }

        int kay = 4;
        if (TxtPeso.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo 4 Caracteres como maximo");
        }
    }//GEN-LAST:event_TxtPesoKeyTyped

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

        String rut = TxtRut.getText();
        if (!rut.equals("")) {
            try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                Conexion conn = new Conexion();
                Connection con = conn.getConexion();
                String sql = "SELECT `NOMBRE_PACIENTE`, `SEXO_PACIENTE`, `FECHANACIMIENTO_PACIENTE` FROM `PACIENTE` WHERE  `RUT_PACIENTE` ='" + rut + "'";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()) {
                    String[] contenido = new String[3];
                    for (int i = 0; i < 3; i++) {
                        contenido[i] = rs.getString(i + 1);
                    }

                    lblnom.setText(contenido[0]);
                    lblbsex.setText(contenido[1]);
                    lbledad.setText(contenido[2]);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        } else {
            //System.out.println("No ha ingresado un rut");
            JOptionPane.showMessageDialog(null, "No ha ingresado rut");

        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (!TxtTalla.getText().equals("") && !TxtPeso.getText().equals("")) {
            double talla = Double.valueOf(TxtTalla.getText());
            double peso = Double.valueOf(TxtPeso.getText());
            double elevado = Math.pow(talla, 2);
            double imc = (peso / elevado);
            LblImc.setText(String.valueOf(imc));
            //jTextField1.setText(String.valueOf(imc));
            if (imc < 18.5) {
                lblCalculo.setText("BAJO PESO");
            } else if (imc >= 18.5 && imc <= 24.9) {
                lblCalculo.setText("PESO NORMAL");
            } else if (imc >= 25 && imc <= 29.9) {
                lblCalculo.setText("SOBREPESO");
            } else if (imc >= 30) {
                lblCalculo.setText("OBESIDAD");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campos de talla o peso estan vacios favor llenarlos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BtnGuardadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardadActionPerformed
        SqlUsuario modSql = new SqlUsuario();
        usuario mod = new usuario();
        String rut;
        String paciente = TxtRut.getText();
        rut = lbl_rutficha.getText();
        String formatoS = "yyyy-MM-dd";
        DateFormat formatte = new SimpleDateFormat(formatoS);
        try {

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql3 = "SELECT `ID_PACIENTE` FROM `PACIENTE` WHERE `RUT_PACIENTE`= '" + paciente + "'";
            ps = con.prepareStatement(sql3);
            rs = ps.executeQuery();
            while (rs.next()) {
                String[] contenido = new String[1];
                for (int i = 0; i < 1; i++) {
                    contenido[i] = rs.getString(i + 1);
                }

                idPaci = contenido[0];
                System.out.println("Id Paciente: " + idPaci);
            }
            String sql = "SELECT `ID_NUTRICIONISTA` FROM `NUTRICIONISTA` WHERE `RUT_NUTRICIONISTA` ='" + rut + "'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String[] contenido = new String[1];
                for (int i = 0; i < 1; i++) {
                    contenido[i] = rs.getString(i + 1);
                }

                idnutri = contenido[0];
                System.out.println("Id  nutricionista: " + idnutri);
            }
            if (!TxtRut.equals("")) {
                if (!TxtTalla.equals("")) {
                    if (!TxtPeso.equals("")) {
                        if (!Txtareadiag.equals("")) {

                            mod.setId_nutricionista(Integer.parseInt(idnutri));
                            mod.setId_paciente(Integer.parseInt(idPaci));
                            mod.setPeso(Integer.parseInt(TxtPeso.getText()));
                            //mod.setId_enfermedad(enferme[1]);
                            mod.setEdad(formatte.format(jDateChooser1.getDate()));
                            mod.setEstatura((double) Double.parseDouble(TxtTalla.getText()));
                            mod.setDiagnostico(Txtareadiag.getText());

                            if (modSql.atencion(mod)) {
                                
                                TxtPeso.setText("");
                                TxtTalla.setText("");
                                Txtareadiag.setText("");

                                String prueba = "";
                                jDateChooser1.setDateFormatString(prueba);

                                JOptionPane.showMessageDialog(null, "Datos registrados");
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al ingresar datos");
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Falta Diagnostico");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Falta Peso");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Falta Estatura");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Falta Rut");
            }

        } catch (Exception e) {
            System.out.println("Problemas en la base de datos " + e.toString());
        }


    }//GEN-LAST:event_BtnGuardadActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichaMedica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnFicha;
    private javax.swing.JButton BtnGuardad;
    private javax.swing.JButton BtnHistorial;
    private javax.swing.JLabel LblImc;
    private javax.swing.JTextField TxtPeso;
    private javax.swing.JTextField TxtRut;
    private javax.swing.JTextField TxtTalla;
    private javax.swing.JTextArea Txtareadiag;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCalculo;
    public static javax.swing.JLabel lbl_rutficha;
    private javax.swing.JLabel lblbsex;
    private javax.swing.JLabel lbledad;
    private javax.swing.JLabel lblnom;
    private javax.swing.JLabel prueba;
    // End of variables declaration//GEN-END:variables
}
