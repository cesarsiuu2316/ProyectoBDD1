
package proyectobd1;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import proyectobd1.MariaDBConnection;


public class MainFrame extends javax.swing.JFrame {

    
    public MainFrame() {
        initComponents(); 
        this.setLocationRelativeTo(null);
        this.setTitle("Proyecto 1 - Teoría de Bases de Datos I");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        materialTabbed1 = new proyectobd1.MaterialTabbed();
        jPanel2 = new javax.swing.JPanel();
        txtCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEnvio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ftxtPeso = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBarco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtRegion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPostal = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        btnOrdenar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listResultado = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        txtProd = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listBuscar = new javax.swing.JList<>();
        btnSeleccionarProd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        obtenerTablaButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        jLabel11.setText("Ciudad del envío");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/nice copia.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 140, 140));

        materialTabbed1.setForeground(new java.awt.Color(255, 255, 255));
        materialTabbed1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(192, 195, 216));
        jPanel2.setLayout(null);
        jPanel2.add(txtCliente);
        txtCliente.setBounds(70, 80, 140, 22);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Nombre del cliente");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 60, 121, 18);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Nombre del empleado");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 120, 142, 18);
        jPanel2.add(txtEmp);
        txtEmp.setBounds(70, 140, 140, 22);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Nombre del envío");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 180, 113, 18);
        jPanel2.add(txtEnvio);
        txtEnvio.setBounds(70, 200, 140, 22);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Peso");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(70, 240, 31, 18);

        try {
            ftxtPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(ftxtPeso);
        ftxtPeso.setBounds(70, 260, 140, 22);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Nombre del barco");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(70, 300, 114, 18);
        jPanel2.add(txtBarco);
        txtBarco.setBounds(70, 320, 140, 22);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Dirección del envío");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(290, 60, 123, 18);
        jPanel2.add(txtDir);
        txtDir.setBounds(290, 80, 140, 22);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Ciudad del envío");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(290, 120, 108, 18);
        jPanel2.add(txtCiudad);
        txtCiudad.setBounds(290, 140, 140, 22);

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Región del envío");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(290, 180, 108, 18);
        jPanel2.add(txtRegion);
        txtRegion.setBounds(290, 200, 140, 22);

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Código postal del envío");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(290, 240, 150, 18);

        txtPostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        jPanel2.add(txtPostal);
        txtPostal.setBounds(290, 260, 140, 22);

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("País de envío");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(290, 300, 86, 18);
        jPanel2.add(txtPais);
        txtPais.setBounds(290, 320, 140, 22);

        btnOrdenar.setBackground(new java.awt.Color(153, 153, 255));
        btnOrdenar.setText("Crear orden");
        jPanel2.add(btnOrdenar);
        btnOrdenar.setBounds(510, 313, 270, 30);

        listResultado.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(listResultado);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(680, 150, 100, 150);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrese el nombre del producto:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(513, 61, 204, 18);
        jPanel2.add(txtProd);
        txtProd.setBounds(510, 90, 160, 30);

        btnBuscar.setBackground(new java.awt.Color(153, 153, 255));
        btnBuscar.setText("Buscar");
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(690, 90, 90, 30);

        listBuscar.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(listBuscar);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(510, 150, 100, 150);

        btnSeleccionarProd.setBackground(new java.awt.Color(153, 153, 255));
        btnSeleccionarProd.setText("➜");
        btnSeleccionarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarProdActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarProd);
        btnSeleccionarProd.setBounds(620, 210, 50, 22);

        materialTabbed1.addTab("Gestión de Órdenes", jPanel2);

        jPanel3.setBackground(new java.awt.Color(192, 195, 216));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        obtenerTablaButton.setBackground(new java.awt.Color(153, 153, 255));
        obtenerTablaButton.setForeground(new java.awt.Color(255, 255, 255));
        obtenerTablaButton.setText("Obtener datos de tabla");
        obtenerTablaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obtenerTablaButtonMouseClicked(evt);
            }
        });
        jPanel3.add(obtenerTablaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 190, 50));

        materialTabbed1.addTab("Gestión de Productos", jPanel3);

        jPanel4.setBackground(new java.awt.Color(192, 195, 216));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 965, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        materialTabbed1.addTab("Reportes", jPanel4);

        jPanel1.add(materialTabbed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 970, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/gradPinkAzul copia.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, -1, 610));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarProdActionPerformed
        if (listBuscar.getSelectedIndex() >= 0) {
            DefaultListModel listBuscarModel = (DefaultListModel) listBuscar.getModel(),
                            listResultadoModel = (DefaultListModel) listBuscar.getModel();
            if (listBuscar.getModel().getSize() < 1) 
                listResultadoModel.addElement(listBuscarModel.elementAt(listBuscar.getSelectedIndex()));
            else {
                listBuscar.setModel(new DefaultListModel());
                listResultadoModel.addElement(listBuscarModel.elementAt(listBuscar.getSelectedIndex()));
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento.");
        }
    }//GEN-LAST:event_btnSeleccionarProdActionPerformed

    private void obtenerTablaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obtenerTablaButtonMouseClicked
        MariaDBConnection mb = new MariaDBConnection();
        mb.proyeccion("Orders", "OrderID", "CustomerID");
    }//GEN-LAST:event_obtenerTablaButtonMouseClicked

    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSeleccionarProd;
    private javax.swing.JFormattedTextField ftxtPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JList<String> listBuscar;
    private javax.swing.JList<String> listResultado;
    private proyectobd1.MaterialTabbed materialTabbed1;
    private javax.swing.JButton obtenerTablaButton;
    private javax.swing.JTextField txtBarco;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtEmp;
    private javax.swing.JTextField txtEnvio;
    private javax.swing.JTextField txtPais;
    private javax.swing.JFormattedTextField txtPostal;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtRegion;
    // End of variables declaration//GEN-END:variables
}
