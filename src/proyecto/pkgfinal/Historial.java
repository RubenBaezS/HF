package proyecto.pkgfinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import static proyecto.pkgfinal.Atencion.jLabel5;

public class Historial extends javax.swing.JFrame {

    public String conten = "";

    public Historial() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Historial");
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/fondokato.png"));
        //ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagen/1280x800_birthday_wallpaper_kirby.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

    }

    /*
    
    
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
    
    
            String sql2 = "SELECT ID_PACIENTE FROM PACIENTE WHERE RUT_PACIENTE = '"+ LblRut.getText() +"'";
            ps = con.prepareStatement(sql2);
            rs = ps.executeQuery();
            while (rs.next()) {
                    conten = rs.getString(0) ;
            }
            System.out.println(conten);


            String sql = "SELECT FECHA from ATENCION  WHERE ID_PACIENTE = '"+conten+"'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                this.jComboBox1.addItem(rs.getString("FECHA"));
            }
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LblRut = new javax.swing.JLabel();
        LblNom = new javax.swing.JLabel();
        LblEdad = new javax.swing.JLabel();
        LblSexo = new javax.swing.JLabel();
        LblPeso = new javax.swing.JLabel();
        LblTalla = new javax.swing.JLabel();
        LblDiagnostico = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        CmbFechas = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaalimento = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Rut");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sexo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Peso");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Talla");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Diagnostico");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tratamiento");

        LblRut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblRut.setText("---");

        LblNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblNom.setText("---");

        LblEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblEdad.setText("---");

        LblSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblSexo.setText("---");

        LblPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblPeso.setText("---");

        LblTalla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblTalla.setText("---");

        LblDiagnostico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblDiagnostico.setText("---");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Historial");

        CmbFechas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fechas Anteriores");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Buscar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Traer fechas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Tablaalimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ));
        jScrollPane1.setViewportView(Tablaalimento);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblRut)
                    .addComponent(LblNom)
                    .addComponent(LblEdad)
                    .addComponent(LblSexo)
                    .addComponent(LblPeso)
                    .addComponent(LblTalla))
                .addGap(336, 336, 336)
                .addComponent(jLabel10)
                .addGap(38, 38, 38)
                .addComponent(CmbFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(LblDiagnostico))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel19)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(LblRut)
                        .addGap(18, 18, 18)
                        .addComponent(LblNom)
                        .addGap(14, 14, 14)
                        .addComponent(LblEdad)
                        .addGap(6, 6, 6)
                        .addComponent(LblSexo)
                        .addGap(4, 4, 4)
                        .addComponent(LblPeso)
                        .addGap(6, 6, 6)
                        .addComponent(LblTalla))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(CmbFechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jLabel7))
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addGap(66, 66, 66)
                        .addComponent(jButton2)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(LblDiagnostico))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String[] datos = new String[6];
        String fecha  = "";
        int cant =0;
        //DefaultTableModel modelo = new DefaultTableModel();
        DefaultTableModel model = (DefaultTableModel) Tablaalimento.getModel();
        
         
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "select PACIENTE.NOMBRE_PACIENTE, PACIENTE.FECHANACIMIENTO_PACIENTE, PACIENTE.SEXO_PACIENTE, ATENCION.PESO, ATENCION.ESTATURA, ATENCION.DIAGNOSTICO "
                    + "FROM PACIENTE INNER join ATENCION on ATENCION.ID_PACIENTE = PACIENTE.ID_PACIENTE WHERE ATENCION.FECHA = '" + CmbFechas.getSelectedItem() + "'";

            String sql2 = "SELECT `ID_ATENCION` FROM ATENCION INNER JOIN PACIENTE on ATENCION.ID_PACIENTE = PACIENTE.ID_PACIENTE WHERE ATENCION.FECHA ='" + CmbFechas.getSelectedItem() + "'";

            ps = con.prepareStatement(sql2);
            rs = ps.executeQuery();

            while (rs.next()) {
                fecha = rs.getString(1);
                System.out.println("aqui id" + fecha);
            }
            
            String sql3 = "SELECT count(`NOMBRE_ALIMENTO`) FROM `ALIMENTOS` INNER JOIN ATENCION_ALIMENTOS on ALIMENTOS.ID_ALIMENTO = ATENCION_ALIMENTOS.ID_ALIMENTO where ATENCION_ALIMENTOS.ID_ATENCION = '"+fecha+"'";
            ps = con.prepareStatement(sql3);
            rs = ps.executeQuery();
            
            while(rs.next()){
                cant = rs.getInt(1);
                System.out.println(cant);
            }
            
            String[] alimentos = new String[cant] ;
            
            

            String sql4 = "SELECT `NOMBRE_ALIMENTO` FROM `ALIMENTOS` INNER JOIN ATENCION_ALIMENTOS on ALIMENTOS.ID_ALIMENTO = ATENCION_ALIMENTOS.ID_ALIMENTO where ATENCION_ALIMENTOS.ID_ATENCION = '" + fecha + "'";

            ps = con.prepareStatement(sql4);
            rs = ps.executeQuery();

            while (rs.next()) {
                for (int i = 0; i < cant; i++) {
                    alimentos[i] = rs.getString(0+1);
               }
                    model.addRow(alimentos);
            }

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < datos.length; i++) {
                    datos[i] = rs.getString(i + 1);
                    
                }
                LblNom.setText(datos[0]);
                LblEdad.setText(datos[1]);
                LblSexo.setText(datos[2]);
                LblPeso.setText(datos[3]);
                LblTalla.setText(datos[4]);
                LblDiagnostico.setText(datos[5]);
                

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "SELECT FECHA FROM ATENCION INNER JOIN PACIENTE on ATENCION.ID_PACIENTE=PACIENTE.ID_PACIENTE WHERE PACIENTE.RUT_PACIENTE ='" + LblRut.getText() + "'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println(LblRut.getText());
            while (rs.next()) {
                this.CmbFechas.addItem(rs.getString("FECHA"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbFechas;
    private javax.swing.JLabel LblDiagnostico;
    private javax.swing.JLabel LblEdad;
    private javax.swing.JLabel LblNom;
    private javax.swing.JLabel LblPeso;
    public static javax.swing.JLabel LblRut;
    private javax.swing.JLabel LblSexo;
    private javax.swing.JLabel LblTalla;
    private javax.swing.JTable Tablaalimento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
