package proyecto.pkgfinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import static proyecto.pkgfinal.Historial.LblRut;

public class Atencion extends javax.swing.JFrame {

    public String[] datoenf = new String[1];
    public String[] idatencion = new String[1];

    public Atencion() {
        initComponents();
        //Consulta para traer el id de la atencion segun la fecha de la atencion realizada al paciente
        //SELECT `ID_ATENCION` FROM ATENCION INNER JOIN PACIENTE on ATENCION.ID_PACIENTE = PACIENTE.ID_PACIENTE WHERE ATENCION.FECHA =
        this.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Atención");
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/fondokato.png"));
        //ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/1280x800_birthday_wallpaper_kirby.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        /*
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            TblEnfermedades.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "select NOMBRE_ENFERMEDAD from ENFERMEDAD ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("NOMBRE_ENFERMEDAD");
            //modelo.addColumn("Descripcion_enfermedad");
            while (rs.next()) {
                //this.CmbAlimento.addItem(rs.getString("Nombre_alimento"));
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPaciente = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblAlimentos = new javax.swing.JTable();
        BtnGuardar = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblEnfermedades = new javax.swing.JTable();
        BtnAsignar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRutF = new javax.swing.JTextField();
        enfe_combo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Rut");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        TblPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TblPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Sexo", "Fecha de Nacimiento", "Talla", "Peso"
            }
        ));
        TblPaciente.setOpaque(false);
        jScrollPane1.setViewportView(TblPaciente);
        if (TblPaciente.getColumnModel().getColumnCount() > 0) {
            TblPaciente.getColumnModel().getColumn(0).setPreferredWidth(38);
            TblPaciente.getColumnModel().getColumn(1).setPreferredWidth(50);
            TblPaciente.getColumnModel().getColumn(2).setPreferredWidth(50);
            TblPaciente.getColumnModel().getColumn(3).setPreferredWidth(50);
            TblPaciente.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Ficha de atención");

        panel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Lista de alimento");

        TblAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Categoria"
            }
        ));
        TblAlimentos.setOpaque(false);
        jScrollPane3.setViewportView(TblAlimentos);

        BtnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        BtnVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Enfermedades");

        TblEnfermedades.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TblEnfermedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enfermedades"
            }
        ));
        TblEnfermedades.setOpaque(false);
        TblEnfermedades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblEnfermedadesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TblEnfermedades);

        BtnAsignar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAsignar.setText("Asignar Enfermedades");
        BtnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAsignarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel5.setText("jLabel5");

        enfe_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiopatia congenita", "Cardiopatia coronaria", "Insuficiencia cardíaca congestiva", "Accidentes cerebrovasculares", "Enfermedad arterial periférica", "Cardiopatia Reumatica", "Hipertension arterial", "No tiene enfermedad" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Asignar Alimentos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Eliminar enfermedad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(262, 262, 262))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(enfe_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(BtnAsignar, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRutF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(393, 393, 393)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)))
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)))
                .addGap(35, 35, 35)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRutF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 205, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enfe_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        FichaMedica fich = new FichaMedica();
        fich.setVisible(true);
        fich.lbl_rutficha.setText(jLabel4.getText());
        dispose();
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String rut = txtRutF.getText();

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            TblPaciente.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "SELECT PACIENTE.NOMBRE_PACIENTE, PACIENTE.SEXO_PACIENTE, PACIENTE.FECHANACIMIENTO_PACIENTE, ATENCION.ESTATURA, ATENCION.PESO from ATENCION inner "
                    + "JOIN PACIENTE on ATENCION.ID_PACIENTE = PACIENTE.ID_PACIENTE where ATENCION.FECHA = '" + jLabel5.getText() + "' and PACIENTE.RUT_PACIENTE = '" + rut + "'";

            String sql2 = "SELECT `ID_ATENCION` FROM ATENCION INNER JOIN PACIENTE on ATENCION.ID_PACIENTE = PACIENTE.ID_PACIENTE WHERE ATENCION.FECHA ='" + jLabel5.getText() + "'";

            //"SELECT PACIENTE.NOMBRE_PACIENTE, PACIENTE.SEXO_PACIENTE, PACIENTE.FECHANACIMIENTO_PACIENTE, ATENCION.ESTATURA,ATENCION.PESO from ATENCION inner "
            //+ "JOIN PACIENTE on ATENCION.ID_PACIENTE = PACIENTE.ID_PACIENTE where ATENCION.FECHA = '"+jLabel5.getText()+"'";
            //String sql = "SELECT  PACIENTE.NOMBRE_PACIENTE, PACIENTE.APELLIDOP_PACIENTE, PACIENTE.APELLIDOM_PACIENTE,PACIENTE.SEXO_PACIENTE, PACIENTE.FECHANACIMIENTO_PACIENTE, ATENCION.ESTATURA, "
            //        + "ATENCION.PESO FROM PACIENTE INNER JOIN ATENCION ON PACIENTE.ID_PACIENTE = ATENCION.ID_PACIENTE WHERE PACIENTE.RUT_PACIENTE ='" + rut + "'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("PACIENTE");
            modelo.addColumn("SEXO");
            modelo.addColumn("FECHA DE NACIMIENTO");
            modelo.addColumn("TALLA");
            modelo.addColumn("PESO");

            while (rs.next()) {
                //this.CmbAlimento.addItem(rs.getString("Nombre_alimento"));
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            ps.close();
            rs.close();

            ps = con.prepareStatement(sql2);
            rs = ps.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < cantidadColumnas; i++) {
                    idatencion[i] = rs.getString(i + 1);
                    System.out.println(idatencion[i]);
                }

            }
            ps.close();
            rs.close();

        } catch (Exception e) {
        }
        /*
        String sql2 = "SELECT FECHA FROM ATENCION INNER JOIN PACIENTE on ATENCION.ID_PACIENTE=PACIENTE.ID_PACIENTE WHERE PACIENTE.RUT_PACIENTE ='" + LblRut.getText() + "'";
            ps = con.prepareStatement(sql2);
            rs = ps.executeQuery();
            System.out.println(LblRut.getText());
            while (rs.next()) {
                this.jComboBox1.addItem(rs.getString("FECHA"));

            }
         */

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void BtnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAsignarActionPerformed
        /*
        int a = TblEnfermedades.getRowCount();
        System.out.println(a);

        for (int j = 0; j < a; j++) {
            String hola = String.valueOf(TblPaciente.getValueAt(j, 5));
            if (!"".equals(hola)) {
                jLabel2.setText(datoenf[0]);
                TblPaciente.setValueAt(datoenf[0], j, 5);
                System.out.println(datoenf[0]);
            } else {
                JOptionPane.showMessageDialog(null, "no tienes una enfermedad seleccionada");
            }
            hola = "";
        }
         */
        //enfe_combo.addItem(datoenf[0]);

        int totalenf = enfe_combo.getItemCount(); //Cantidad de item en combobox
        int numenfe = enfe_combo.getSelectedIndex(); //Seleccionar la posicion del conbobox
        String[] hola = new String[totalenf]; //Creamos array con cantidad de item de combobox
        hola[0] = enfe_combo.getItemAt(numenfe); //
        DefaultTableModel model = (DefaultTableModel) TblEnfermedades.getModel();
        model.addRow(hola);
        //model.setValueAt(hola, 0, 1);


    }//GEN-LAST:event_BtnAsignarActionPerformed

    private void TblEnfermedadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblEnfermedadesMouseClicked
        int seleccion = TblEnfermedades.rowAtPoint(evt.getPoint());
        datoenf[0] = TblEnfermedades.getValueAt(seleccion, 0).toString();

    }//GEN-LAST:event_TblEnfermedadesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] aliment = new String[7];
        DefaultTableModel modelo = new DefaultTableModel();
        TblAlimentos.setModel(modelo);
        int seleccion = enfe_combo.getSelectedIndex();
        switch (seleccion) {

            case 0:
                try {
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conexion conn = new Conexion();
                    Connection con = conn.getConexion();
                    String filtro = "SELECT`ID_ALIMENTO`,`NOMBRE_ALIMENTO`,`CATEGORIA_ALIMENTO` FROM `ALIMENTOS` WHERE `SODIO` <= '69.00'";
                    ps = con.prepareStatement(filtro);
                    rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadColumna = rsMd.getColumnCount();
                    modelo.addColumn("ID_ALIMENTO");
                    modelo.addColumn("NOMBRE_ALIMENTO");
                    modelo.addColumn("CATEGORIA_ALIMENTO");
                    while (rs.next()) {
                        //this.CmbAlimento.addItem(rs.getString("Nombre_alimento"));
                        Object[] fila = new Object[cantidadColumna];
                        for (int a = 0; a < cantidadColumna; a++) {
                            fila[a] = rs.getObject(a + 1);
                        }
                        modelo.addRow(fila);
                    }
                } catch (Exception e) {
                }

                break;
            case 1:
                try {
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conexion conn = new Conexion();
                    Connection con = conn.getConexion();
                    String filtro2 = "SELECT`ID_ALIMENTO`,`NOMBRE_ALIMENTO`,`CATEGORIA_ALIMENTO` FROM `ALIMENTOS` WHERE `SODIO` <= '69.00'";
                    ps = con.prepareStatement(filtro2);
                    rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadColumn = rsMd.getColumnCount();
                    modelo.addColumn("ID_ALIMENTO");
                    modelo.addColumn("NOMBRE_ALIMENTO");
                    modelo.addColumn("CATEGORIA_ALIMENTO");
                    while (rs.next()) {
                        //this.CmbAlimento.addItem(rs.getString("Nombre_alimento"));
                        Object[] fila = new Object[cantidadColumn];
                        for (int a = 0; a < cantidadColumn; a++) {
                            fila[a] = rs.getObject(a + 1);
                        }
                        modelo.addRow(fila);
                    }

                } catch (Exception e) {
                }

                break;
            case 2:
                try {
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conexion conn = new Conexion();
                    Connection con = conn.getConexion();
                    String filtro3 = "SELECT`ID_ALIMENTO`,`NOMBRE_ALIMENTO`,`CATEGORIA_ALIMENTO` FROM `ALIMENTOS` WHERE `SODIO` <= '30.00'";
                    ps = con.prepareStatement(filtro3);
                    rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadColum = rsMd.getColumnCount();
                    modelo.addColumn("ID_ALIMENTO");
                    modelo.addColumn("NOMBRE_ALIMENTO");
                    modelo.addColumn("CATEGORIA_ALIMENTO");
                    while (rs.next()) {
                        //this.CmbAlimento.addItem(rs.getString("Nombre_alimento"));
                        Object[] fila = new Object[cantidadColum];
                        for (int a = 0; a < cantidadColum; a++) {
                            fila[a] = rs.getObject(a + 1);
                        }
                        modelo.addRow(fila);
                    }

                } catch (Exception e) {
                }
                break;
            case 3:
                try {
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conexion conn = new Conexion();
                    Connection con = conn.getConexion();

                    String filtro4 = "SELECT `ID_ALIMENTO`,`NOMBRE_ALIMENTO`,`CATEGORIA_ALIMENTO` FROM `ALIMENTOS` WHERE NOT `NOMBRE_ALIMENTO` = \"Aceite de maravilla\" and NOT"
                            + " `NOMBRE_ALIMENTO` = \"Aceite de oliva\" and NOT `NOMBRE_ALIMENTO` = 'Aceituna' and NOT `NOMBRE_ALIMENTO` = 'Manteca Vegetal' and NOT `NOMBRE_ALIMENTO` = 'Mantequilla' and NOT"
                            + " `NOMBRE_ALIMENTO` = 'Margarina' and NOT `NOMBRE_ALIMENTO` ="
                            + " 'Berenjena' and NOT `NOMBRE_ALIMENTO` = 'Champiñones' and NOT `NOMBRE_ALIMENTO` = 'Repollo' and NOT `NOMBRE_ALIMENTO` = 'Repollo Morado' and NOT `NOMBRE_ALIMENTO` = 'Tocino'";

                    ps = con.prepareStatement(filtro4);
                    rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadColu = rsMd.getColumnCount();
                    modelo.addColumn("ID_ALIMENTO");
                    modelo.addColumn("NOMBRE_ALIMENTO");
                    modelo.addColumn("CATEGORIA_ALIMENTO");
                    while (rs.next()) {
                        //this.CmbAlimento.addItem(rs.getString("Nombre_alimento"));
                        Object[] fila = new Object[cantidadColu];
                        for (int a = 0; a < cantidadColu; a++) {
                            fila[a] = rs.getObject(a + 1);
                        }
                        modelo.addRow(fila);
                    }
                } catch (Exception e) {
                }

                break;
            case 4:
                try {
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conexion conn = new Conexion();
                    Connection con = conn.getConexion();
                    String filtro5 = "SELECT`ID_ALIMENTO`,`NOMBRE_ALIMENTO`,`CATEGORIA_ALIMENTO`FROM `ALIMENTOS` WHERE `SODIO` <= '71.00'";
                    ps = con.prepareStatement(filtro5);
                    rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadCol = rsMd.getColumnCount();
                    modelo.addColumn("ID_ALIMENTO");
                    modelo.addColumn("NOMBRE_ALIMENTO");
                    modelo.addColumn("CATEGORIA_ALIMENTO");
                    while (rs.next()) {
                        //this.CmbAlimento.addItem(rs.getString("Nombre_alimento"));
                        Object[] fila = new Object[cantidadCol];
                        for (int a = 0; a < cantidadCol; a++) {
                            fila[a] = rs.getObject(a + 1);
                        }
                        modelo.addRow(fila);
                    }

                } catch (Exception e) {
                }

                break;
            case 5:
                try {
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conexion conn = new Conexion();
                    Connection con = conn.getConexion();

                    String filtro6 = "SELECT`ID_ALIMENTO`,`NOMBRE_ALIMENTO`,`CATEGORIA_ALIMENTO` FROM `ALIMENTOS` WHERE `SODIO` <= '69.00'";
                    ps = con.prepareStatement(filtro6);
                    rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadCo = rsMd.getColumnCount();
                    modelo.addColumn("ID_ALIMENTO");
                    modelo.addColumn("NOMBRE_ALIMENTO");
                    modelo.addColumn("CATEGORIA_ALIMENTO");
                    while (rs.next()) {
                        //this.CmbAlimento.addItem(rs.getString("Nombre_alimento"));
                        Object[] fila = new Object[cantidadCo];
                        for (int a = 0; a < cantidadCo; a++) {
                            fila[a] = rs.getObject(a + 1);
                        }
                        modelo.addRow(fila);
                    }
                } catch (Exception e) {
                }

                break;

            case 6:
                try {
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conexion conn = new Conexion();
                    Connection con = conn.getConexion();
                    String filtro7 = "SELECT`ID_ALIMENTO`,`NOMBRE_ALIMENTO`,`CATEGORIA_ALIMENTO` FROM `ALIMENTOS` WHERE `SODIO` <= '45.00'";
                    ps = con.prepareStatement(filtro7);
                    rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadC = rsMd.getColumnCount();
                    modelo.addColumn("ID_ALIMENTO");
                    modelo.addColumn("NOMBRE_ALIMENTO");
                    modelo.addColumn("CATEGORIA_ALIMENTO");
                    while (rs.next()) {
                        //this.CmbAlimento.addItem(rs.getString("Nombre_alimento"));
                        Object[] fila = new Object[cantidadC];
                        for (int a = 0; a < cantidadC; a++) {
                            fila[a] = rs.getObject(a + 1);
                        }
                        modelo.addRow(fila);
                    }

                } catch (Exception e) {
                }

                break;

            case 7:
                try {
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conexion conn = new Conexion();
                    Connection con = conn.getConexion();
                    String filtro8 = "SELECT`ID_ALIMENTO`,`NOMBRE_ALIMENTO`,`CATEGORIA_ALIMENTO` FROM `ALIMENTOS`";
                    ps = con.prepareStatement(filtro8);
                    rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadC = rsMd.getColumnCount();
                    modelo.addColumn("ID_ALIMENTO");
                    modelo.addColumn("NOMBRE_ALIMENTO");
                    modelo.addColumn("CATEGORIA_ALIMENTO");
                    while (rs.next()) {
                        //this.CmbAlimento.addItem(rs.getString("Nombre_alimento"));
                        Object[] fila = new Object[cantidadC];
                        for (int a = 0; a < cantidadC; a++) {
                            fila[a] = rs.getObject(a + 1);
                        }
                        modelo.addRow(fila);
                    }

                } catch (Exception e) {
                }
                break;

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TblEnfermedades.getModel();
        Object[] filas = new Object[TblEnfermedades.getRowCount()];
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            for (int i = 0; i < TblEnfermedades.getRowCount(); i++) {
                System.out.println(modelo.getValueAt(i, 0));
                String sql = "SELECT `ID_ENFERMEDAD` FROM `ENFERMEDAD` where `NOMBRE_ENFERMEDAD` = '" + TblEnfermedades.getValueAt(i, 0) + "'";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()) {

                    filas[i] = rs.getObject(0 + 1);
                    System.out.println(filas[i]);
                }
            }

            for (int i = 0; i < TblAlimentos.getRowCount(); i++) {

                String sql = "INSERT INTO `ATENCION_ALIMENTOS`(`ID_ATENCION`, `ID_ALIMENTO`) VALUES (?,?)";
                ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(idatencion[0]));
                ps.setInt(2, Integer.parseInt(TblAlimentos.getValueAt(i, 0).toString()));
                ps.executeUpdate();

            }

            for (int i = 0; i < TblEnfermedades.getRowCount(); i++) {

                PreparedStatement pst = con.prepareStatement("INSERT INTO `ENFERMEDAD_ATENCION`(`ID_ATENCION`, `ID_ENFERMEDAD`) VALUES (?,?)");
                System.out.println("aqui id atencion" + Integer.parseInt(idatencion[0]));
                System.out.println("aqui id enfermedad" + Integer.parseInt(filas[i].toString()));
                pst.setInt(1, Integer.parseInt(idatencion[0]));
                pst.setInt(2, Integer.parseInt(filas[i].toString()));
                pst.executeUpdate();

            }

            System.out.println("SE GUARDARON CON EXITO LOS DATOS");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.print("ERROR AL GUARDAR DATOS");
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and
         * feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Atencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atencion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAsignar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JTable TblAlimentos;
    private javax.swing.JTable TblEnfermedades;
    private javax.swing.JTable TblPaciente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> enfe_combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txtRutF;
    // End of variables declaration//GEN-END:variables
}
