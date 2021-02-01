package proyecto.pkgfinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class IngresoAlimentos extends javax.swing.JFrame {

    Conexion con = new Conexion();
    DefaultTableModel m;

    public IngresoAlimentos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Listado de Alimentos");
        ((JPanel) getContentPane()).setOpaque(false);
        //ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/fondo-de-colores-181479.jpg"));
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/fondokato.png"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

        //Conexion para rellenar la tabla con los elementos de la base de datos
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jTable2.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "SELECT `ID_ALIMENTO`, `NOMBRE_ALIMENTO`, `CATEGORIA_ALIMENTO`, `GRAMAJE`, `CALORIAS`, `PROTEINA`, `LIPIDO`, `OMEGA6`, `OMEGA3`, `VITAMINAB12`, `FOLATO`, `VITAMINAE`, `CALCIO`, `VITAMINAD`, `POTASIO`, `SODIO`, `ZINC` from ALIMENTOS";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("Id");
            modelo.addColumn("Alimento");
            modelo.addColumn("Categoria alimento");
            modelo.addColumn("Gramaje");
            modelo.addColumn("Calorias");
            modelo.addColumn("Proteina");
            modelo.addColumn("Lipidos");
            modelo.addColumn("Omega 6");
            modelo.addColumn("Omega 3");
            modelo.addColumn("Vitamina B12");
            modelo.addColumn("Folato");
            modelo.addColumn("Vitamina E");
            modelo.addColumn("Calcio");
            modelo.addColumn("Vitamina D");
            modelo.addColumn("Potasio");
            modelo.addColumn("Sodio");
            modelo.addColumn("zinc");

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

        /*
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "select Categoria_alimento from alimento";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                this.CmbAlimento2.addItem(rs.getString("Categoria_alimento"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        BtnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TxtBusquedaAlimento = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        CmbAlimento = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        BtnFiltrar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtGrama = new javax.swing.JTextField();
        TxtCalorias = new javax.swing.JTextField();
        TxtProteina = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        TxtLipi = new javax.swing.JTextField();
        BtnVolver = new javax.swing.JButton();
        TxtOmeg6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtOme3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtVitaB12 = new javax.swing.JTextField();
        TxtFola = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtVItaE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtCalcio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtVitaD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtPotasio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtSodio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtZinc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CbxCategoria = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        CmbAlimento2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        TxtBusquedaAlimento2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel2.setLayout(null);

        BtnModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnModificar.setText("Modificar");
        panel2.add(BtnModificar);
        BtnModificar.setBounds(430, 686, 120, 33);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Categoria", "Gramaje", "Calorias", "Proteina", "Lipidos", "Omega 6", "Omega 3 ", "Vitamina B12", "Folato", "Vitamina E", "Calcio", "VItamina D", "Potacio", "Sodio", "Zinc"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 263, 958, 405);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        panel2.add(jLabel2);
        jLabel2.setBounds(10, 195, 49, 17);

        TxtBusquedaAlimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBusquedaAlimentoKeyTyped(evt);
            }
        });
        panel2.add(TxtBusquedaAlimento);
        TxtBusquedaAlimento.setBounds(69, 190, 120, 31);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Categoria");
        panel2.add(jLabel18);
        jLabel18.setBounds(228, 188, 71, 31);

        CmbAlimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));
        panel2.add(CmbAlimento);
        CmbAlimento.setBounds(303, 189, 120, 33);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("LIstado de alimentos");
        panel2.add(jLabel19);
        jLabel19.setBounds(381, 58, 165, 22);

        BtnFiltrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnFiltrar.setText("Filtrar");
        BtnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFiltrarActionPerformed(evt);
            }
        });
        panel2.add(BtnFiltrar);
        BtnFiltrar.setBounds(441, 186, 65, 34);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo-de-colores-181479.jpg"))); // NOI18N
        jLabel21.setText("jLabel21");
        panel2.add(jLabel21);
        jLabel21.setBounds(0, 0, 980, 770);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Potasio");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Sodio");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Zinc");

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });

        TxtGrama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtGramaKeyTyped(evt);
            }
        });

        TxtCalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCaloriasKeyTyped(evt);
            }
        });

        TxtProteina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtProteinaKeyTyped(evt);
            }
        });

        BtnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        TxtLipi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtLipiKeyTyped(evt);
            }
        });

        BtnVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        TxtOmeg6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtOmeg6KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        TxtOme3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtOme3KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Categoria alimento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Gramaje");

        TxtVitaB12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtVitaB12KeyTyped(evt);
            }
        });

        TxtFola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtFolaKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Calorias");

        TxtVItaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtVItaEKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Proteinas");

        TxtCalcio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCalcioKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Lipidos");

        TxtVitaD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtVitaDKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Omega 6");

        TxtPotasio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPotasioKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Omega 3");

        TxtSodio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtSodioKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Vitamina B12");

        TxtZinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtZincActionPerformed(evt);
            }
        });
        TxtZinc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtZincKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Folato");

        CbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cereales y derivados", "Frutas", "Verduras y hortalizas", "Pescado, Carnes y Huevos", "Legumbres, Frutos secos, Tuberculos" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Vitamina E");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Calcio");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Vitamina D");

        jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Categoria", "Gramaje", "Calorias", "Proteinas", "Lipidos", "Omega 6", "Omega 3", "Vitamina B12", "Folato", "Vitamina E", "Calcio", "Viatamina D", "Potasio", "Sodio", "Zinc"
            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setOpaque(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        CmbAlimento2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CmbAlimento2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos los alimentos", "Aceites y mantequillas", "Cereales y derivados", "Frutas", "Verduras y hortalizas", "Pescado, Carnes y Huevos", "Lacteos y derivados", "Legumbres, Frutos secos, Tuberculos" }));
        CmbAlimento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbAlimento2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton1.setText("Eliminar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton2.setText("Limpiar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtProteina, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtLipi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtOmeg6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtOme3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtVitaB12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFola, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtVItaE, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtVitaD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPotasio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSodio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtZinc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtGrama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CmbAlimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtBusquedaAlimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel12)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel14)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel15)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel16)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CmbAlimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtBusquedaAlimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(CbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(TxtGrama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(TxtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(TxtProteina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(TxtLipi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(TxtOmeg6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(TxtOme3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(TxtVitaB12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtFola, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(TxtVItaE, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(TxtCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(TxtVitaD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(TxtPotasio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtSodio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(TxtZinc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        Menu men = new Menu();
        men.setVisible(true);
        men.jLabel1.setText(jLabel20.getText());
        dispose();
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void TxtZincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtZincActionPerformed

    }//GEN-LAST:event_TxtZincActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();

        if ((mander < 'a' || mander > 'z') && (mander < 'A' || mander > 'Z') && (mander < 'ñ' || mander > 'Ñ') && (mander != evt.VK_BACK_SPACE) && (mander != evt.VK_SPACE)) {
            evt.consume();
        }
        int kay = 50;
        if (TxtNombre.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo 50 Caracteres como maximo");
        }
    }//GEN-LAST:event_TxtNombreKeyTyped

    private void TxtGramaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtGramaKeyTyped
        // TODO add your handling code here:

        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }
        char meleon = 3;
        if (TxtGrama.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtGramaKeyTyped

    private void TxtCaloriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCaloriasKeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtCalorias.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtCaloriasKeyTyped

    private void TxtProteinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtProteinaKeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtProteina.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtProteinaKeyTyped

    private void TxtLipiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtLipiKeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtLipi.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtLipiKeyTyped

    private void TxtOmeg6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtOmeg6KeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtOmeg6.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtOmeg6KeyTyped

    private void TxtOme3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtOme3KeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtOme3.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtOme3KeyTyped

    private void TxtVitaB12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtVitaB12KeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtVitaB12.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtVitaB12KeyTyped

    private void TxtFolaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFolaKeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtFola.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtFolaKeyTyped

    private void TxtVItaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtVItaEKeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtVItaE.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtVItaEKeyTyped

    private void TxtCalcioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCalcioKeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtCalcio.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtCalcioKeyTyped

    private void TxtVitaDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtVitaDKeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtVitaD.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtVitaDKeyTyped

    private void TxtPotasioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPotasioKeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtPotasio.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtPotasioKeyTyped

    private void TxtSodioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSodioKeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtSodio.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtSodioKeyTyped

    private void TxtZincKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtZincKeyTyped
        // TODO add your handling code here:
        char mander = evt.getKeyChar();
        if ((mander < '0' || mander > '9') && (mander < '.' || mander > '.') && (mander != evt.VK_BACK_SPACE)) {

            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }

        char meleon = 10;
        if (TxtZinc.getText().length() >= meleon) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO 3 NÚMEROS");

        }
    }//GEN-LAST:event_TxtZincKeyTyped

    private void TxtBusquedaAlimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBusquedaAlimentoKeyTyped
        char mander = evt.getKeyChar();

        if ((mander < 'a' || mander > 'z') && (mander < 'A' || mander > 'Z') && (mander < 'ñ' || mander > 'Ñ') && (mander != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
        int kay = 50;
        if (TxtNombre.getText().length() >= kay) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo 50 Caracteres como maximo");
        }
    }//GEN-LAST:event_TxtBusquedaAlimentoKeyTyped

    private void BtnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFiltrarActionPerformed

    }//GEN-LAST:event_BtnFiltrarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        //Boton guardar, es el que ingresa y almacena los alimentos con sus componentes

        Conexion con = new Conexion();
        Connection conn = con.getConexion();

        String sql = "INSERT INTO `ALIMENTOS`(`NOMBRE_ALIMENTO`, `CATEGORIA_ALIMENTO`, `GRAMAJE`, `CALORIAS`, `PROTEINA`, `LIPIDO`, `OMEGA6`, `OMEGA3`, `VITAMINAB12`, `FOLATO`, `VITAMINAE`, `CALCIO`, `VITAMINAD`, `POTASIO`, `SODIO`, `ZINC`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, TxtNombre.getText());
            pst.setString(2, String.valueOf(CbxCategoria.getSelectedItem()));
            pst.setInt(3, Integer.parseInt(TxtGrama.getText()));
            pst.setDouble(4, Double.parseDouble(TxtCalorias.getText()));
            //pst.setInt(4, Integer.parseInt(TxtCalorias.getText()));
            pst.setDouble(5, Double.parseDouble(TxtProteina.getText()));
            pst.setDouble(6, Double.parseDouble(TxtLipi.getText()));
            pst.setDouble(7, Double.parseDouble(TxtOmeg6.getText()));
            pst.setDouble(8, Double.parseDouble(TxtOme3.getText()));
            pst.setDouble(9, Double.parseDouble(TxtVitaB12.getText()));
            pst.setDouble(10, Double.parseDouble(TxtFola.getText()));
            pst.setDouble(11, Double.parseDouble(TxtVItaE.getText()));
            pst.setDouble(12, Double.parseDouble(TxtCalcio.getText()));
            pst.setDouble(13, Double.parseDouble(TxtVitaD.getText()));
            pst.setDouble(14, Double.parseDouble(TxtPotasio.getText()));
            pst.setDouble(15, Double.parseDouble(TxtSodio.getText()));
            pst.setDouble(16, Double.parseDouble(TxtZinc.getText()));

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
                TxtNombre.setText("");
                TxtVitaD.setText("");
                TxtFola.setText("");
                TxtGrama.setText("");
                TxtCalcio.setText("");
                TxtCalorias.setText("");
                TxtFola.setText("");
                TxtLipi.setText("");
                TxtOme3.setText("");
                TxtOmeg6.setText("");
                TxtVItaE.setText("");
                TxtVitaB12.setText("");
                TxtSodio.setText("");
                TxtZinc.setText("");
                TxtPotasio.setText("");
                TxtProteina.setText("");

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //boton por el cual me filtran los alimentos segun la categoria de estos
        String campo = (String) CmbAlimento2.getSelectedItem();
        String WHERE = "";

        if (!"Todos los alimentos".equals(campo)) {
            WHERE = "WHERE `Categoria_alimento` = '" + CmbAlimento2.getSelectedItem() + "'";
        }

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            jTable2.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            //String cod = CmbAlimento.ToString;
            //String sql = "SELECT Codigo_alimento, Nombre_alimentos from alimentos where Codigo_alimento = '" + CmbAlimento.getSelectedItem()+"'" ;

            String sql = "SELECT `NOMBRE_ALIMENTO`, `CATEGORIA_ALIMENTO`, `GRAMAJE`, `CALORIAS`, `PROTEINA`, `LIPIDO`, `OMEGA6`, `OMEGA3`, `VITAMINAB12`, `FOLATO`, `VITAMINAE`, `CALCIO`, `VITAMINAD`, `POTASIO`, `SODIO`, `ZINC` FROM `ALIMENTOS` "
                    + WHERE;
            /* String sql = "SELECT `Nombre_alimento`,`Categoria_alimento` ,`Gramaje`,`Calorias`,`Proteina`,`Lipidos`,`Omega_6`,`Omega_3`,`Vitamina_b12`,`Folato`,`Vitamina_e`,`Calcio`,`Vitamina_d`,`Potasio`,`Sodio`,`zinc` FROM `alimento` WHERE `Categoria_alimento` ='"
                    + CmbAlimento2.getSelectedItem().toString()+"'";
             */
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("Nombre alimento");
            modelo.addColumn("Categoria alimento");
            modelo.addColumn("Gramaje");
            modelo.addColumn("Calorias");
            modelo.addColumn("Proteina");
            modelo.addColumn("Lipidos");
            modelo.addColumn("Omega 6");
            modelo.addColumn("Omega 3");
            modelo.addColumn("Vitamina b12");
            modelo.addColumn("Folato");
            modelo.addColumn("Vitamina e");
            modelo.addColumn("Calcio");
            modelo.addColumn("Vitamina d");
            modelo.addColumn("Potasio");
            modelo.addColumn("Sodio");
            modelo.addColumn("zinc");
            while (rs.next()) {

                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //En este boton vamos a configurar la busqueda de un elemento 

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jTable2.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "SELECT `NOMBRE_ALIMENTO`, `CATEGORIA_ALIMENTO`, `GRAMAJE`, `CALORIAS`, `PROTEINA`, `LIPIDO`, `OMEGA6`, `OMEGA3`, `VITAMINAB12`, `FOLATO`, `VITAMINAE`, `CALCIO`, `VITAMINAD`, `POTASIO`, `SODIO`, `ZINC` FROM `ALIMENTOS` WHERE `NOMBRE_ALIMENTO` = '"
                    + TxtBusquedaAlimento2.getText() + "'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("Nombre_alimento");
            modelo.addColumn("Categoria_alimento");
            modelo.addColumn("Gramaje");
            modelo.addColumn("Calorias");
            modelo.addColumn("Proteina");
            modelo.addColumn("Lipidos");
            modelo.addColumn("Omega_6");
            modelo.addColumn("Omega_3");
            modelo.addColumn("Vitamina_b12");
            modelo.addColumn("Folato");
            modelo.addColumn("Vitamina_e");
            modelo.addColumn("Calcio");
            modelo.addColumn("Vitamina_d");
            modelo.addColumn("Potasio");
            modelo.addColumn("Sodio");
            modelo.addColumn("zinc");
            while (rs.next()) {

                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int seleccion = jTable2.rowAtPoint(evt.getPoint());
        TxtNombre.setText(String.valueOf(jTable2.getValueAt(seleccion, 1)));
        TxtGrama.setText(String.valueOf(jTable2.getValueAt(seleccion, 3)));
        TxtCalorias.setText(String.valueOf(jTable2.getValueAt(seleccion, 4)));
        // TxtCalcio.setText(String.valueOf(jTable2.getValueAt(seleccion, 4)));
        TxtProteina.setText(String.valueOf(jTable2.getValueAt(seleccion, 5)));
        TxtLipi.setText(String.valueOf(jTable2.getValueAt(seleccion, 6)));
        TxtOmeg6.setText(String.valueOf(jTable2.getValueAt(seleccion, 7)));
        TxtOme3.setText(String.valueOf(jTable2.getValueAt(seleccion, 8)));
        TxtVitaB12.setText(String.valueOf(jTable2.getValueAt(seleccion, 9)));
        TxtFola.setText(String.valueOf(jTable2.getValueAt(seleccion, 10)));
        TxtVItaE.setText(String.valueOf(jTable2.getValueAt(seleccion, 11)));
        TxtCalcio.setText(String.valueOf(jTable2.getValueAt(seleccion, 12)));
        TxtVitaD.setText(String.valueOf(jTable2.getValueAt(seleccion, 13)));
        TxtPotasio.setText(String.valueOf(jTable2.getValueAt(seleccion, 14)));
        TxtSodio.setText(String.valueOf(jTable2.getValueAt(seleccion, 15)));
        TxtZinc.setText(String.valueOf(jTable2.getValueAt(seleccion, 16)));
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila = jTable2.getSelectedRow();
        //int columna = jTable1.getSelectedColumn();
        PreparedStatement ps = null;
        if ((!"".equals(TxtNombre.getText()))) {

            try {

                Conexion conn = new Conexion();
                Connection con = conn.getConexion();
                // ps = con.prepareStatement("Update enfemedad set nombre_enfermedad = ?, descripcion_enfermedad = ? where Id_enfermedad = '" + jTable1.getValueAt(fila, 0) + "'");
                ps = con.prepareStatement("UPDATE alimento SET `NOMBRE_ALIMENTO`=?,`CATEGORIA_ALIMENTO`=?,`GRAMAJE`=?,`CALORIAS`=?,`PROTEINA`=?,`LIPIDO`=?,`OMEGA6`=?,`OMEGA3`=?,`VITAMINAB12`=?,`FOLATO`=?,`VITAMINAE`=?,`CALCIO`=?,`VITAMINAD`=?,`POTASIO`=?,`SODIO`=?,`ZINC`=?"
                        + " WHERE Id_alimento = '" + jTable2.getValueAt(fila, 0) + "'");//jTable1.getValueAt(fila, 0) 
                ps.setString(1, TxtNombre.getText());
                ps.setString(2, CbxCategoria.getSelectedItem().toString());
                ps.setInt(3, Integer.parseInt(TxtGrama.getText()));
                ps.setDouble(4, Double.parseDouble(TxtCalorias.getText()));
                ps.setDouble(5, Double.parseDouble(TxtProteina.getText()));
                ps.setDouble(6, Double.parseDouble(TxtLipi.getText()));
                ps.setDouble(7, Double.parseDouble(TxtOmeg6.getText()));
                ps.setDouble(8, Double.parseDouble(TxtOme3.getText()));
                ps.setDouble(9, Double.parseDouble(TxtVitaB12.getText()));
                ps.setDouble(10, Double.parseDouble(TxtFola.getText()));
                ps.setDouble(11, Double.parseDouble(TxtVItaE.getText()));
                ps.setDouble(12, Double.parseDouble(TxtCalcio.getText()));
                ps.setDouble(13, Double.parseDouble(TxtVitaD.getText()));
                ps.setDouble(14, Double.parseDouble(TxtPotasio.getText()));
                ps.setDouble(15, Double.parseDouble(TxtSodio.getText()));
                ps.setDouble(16, Double.parseDouble(TxtZinc.getText()));

                ps.execute();

                JOptionPane.showMessageDialog(null, "Dato modificado");

                jTable2.setValueAt(TxtNombre.getText(), fila, 1);
                jTable2.setValueAt(TxtGrama.getText(), fila, 3);
                jTable2.setValueAt(TxtCalorias.getText(), fila, 4);
                jTable2.setValueAt(TxtProteina.getText(), fila, 5);
                jTable2.setValueAt(TxtLipi.getText(), fila, 6);
                jTable2.setValueAt(TxtOmeg6.getText(), fila, 7);
                jTable2.setValueAt(TxtOme3.getText(), fila, 8);
                jTable2.setValueAt(TxtVitaB12.getText(), fila, 9);
                jTable2.setValueAt(TxtFola.getText(), fila, 10);
                jTable2.setValueAt(TxtVItaE.getText(), fila, 11);
                jTable2.setValueAt(TxtCalcio.getText(), fila, 12);
                jTable2.setValueAt(TxtVitaD.getText(), fila, 13);
                jTable2.setValueAt(TxtPotasio.getText(), fila, 14);
                jTable2.setValueAt(TxtSodio.getText(), fila, 15);
                jTable2.setValueAt(TxtZinc.getText(), fila, 16);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Dato no se pudo modificado");
                System.out.println(e.toString());

            }

        } else {
            JOptionPane.showMessageDialog(null, "Nombre esta vacio por favor verificar");
            System.out.println("Campo Vacio esta vacio por favor verificar");
        }
        limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CmbAlimento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbAlimento2ActionPerformed
        limpiar();
    }//GEN-LAST:event_CmbAlimento2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        PreparedStatement ps = null;
        try {

            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();

            int Fila = jTable2.getSelectedRow();
            String codigo = jTable2.getValueAt(Fila, 0).toString();

            ps = conn.prepareStatement("DELETE FROM `ALIMENTOS` WHERE `ID_ALIMENTO`=?");
            ps.setString(1, codigo);
            ps.execute();

            JOptionPane.showMessageDialog(null, "Alimento Eliminado");
            m.removeRow(Fila);
            // limpiar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar Alimento");
            System.out.println(ex.toString());
        }
        limpiar();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        limpiar();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    public void limpiar() {
        TxtNombre.setText("");
        TxtVitaD.setText("");
        TxtFola.setText("");
        TxtGrama.setText("");
        TxtCalcio.setText("");
        TxtCalorias.setText("");
        TxtFola.setText("");
        TxtLipi.setText("");
        TxtOme3.setText("");
        TxtOmeg6.setText("");
        TxtVItaE.setText("");
        TxtVitaB12.setText("");
        TxtSodio.setText("");
        TxtZinc.setText("");
        TxtPotasio.setText("");
        TxtProteina.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoAlimentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFiltrar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JComboBox<String> CbxCategoria;
    private javax.swing.JComboBox<String> CmbAlimento;
    private javax.swing.JComboBox<String> CmbAlimento2;
    private javax.swing.JTextField TxtBusquedaAlimento;
    private javax.swing.JTextField TxtBusquedaAlimento2;
    private javax.swing.JTextField TxtCalcio;
    private javax.swing.JTextField TxtCalorias;
    private javax.swing.JTextField TxtFola;
    private javax.swing.JTextField TxtGrama;
    private javax.swing.JTextField TxtLipi;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtOme3;
    private javax.swing.JTextField TxtOmeg6;
    private javax.swing.JTextField TxtPotasio;
    private javax.swing.JTextField TxtProteina;
    private javax.swing.JTextField TxtSodio;
    private javax.swing.JTextField TxtVItaE;
    private javax.swing.JTextField TxtVitaB12;
    private javax.swing.JTextField TxtVitaD;
    private javax.swing.JTextField TxtZinc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
