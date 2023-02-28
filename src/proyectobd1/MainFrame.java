
package proyectobd1;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import org.mariadb.jdbc.Statement;
import proyectobd1.MariaDBConnection;
import java.sql.PreparedStatement;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.DecimalFormat;

public class MainFrame extends javax.swing.JFrame {
    Random r = new Random();
    MariaDBConnection c = null;
    ArrayList<Product> productos = new ArrayList();
    ArrayList<Customer> clientes  = new ArrayList();
    ArrayList<Employee> empleados  = new ArrayList();
    ArrayList<Order> orders  = new ArrayList();
    ArrayList<OrderDetails> details  = new ArrayList();
    
    
    public MainFrame() {
        initComponents(); 
        
        // Configurar Frame
        this.setSize(1390, 800);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Proyecto 1 - Teoría de Bases de Datos I");
        
        // Configurar TabbedPane
        limpiarTab1();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        popupTabla = new javax.swing.JPopupMenu();
        popEditarCant = new javax.swing.JMenuItem();
        popEditarDesc = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        popElim = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblNice = new javax.swing.JLabel();
        materialTabbed1 = new proyectobd1.MaterialTabbed();
        jPanel2 = new javax.swing.JPanel();
        txtCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ftxtPeso = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBarco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtRegion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPostal = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        btnOrdenar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtProd = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listProds = new javax.swing.JList<>();
        btnSeleccionarProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProds = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDir = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        listClientes = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        listEmps = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        listAgencias = new javax.swing.JList<>();
        btnCliente = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        btnEmp = new javax.swing.JButton();
        lblEmp = new javax.swing.JLabel();
        btnAgencia = new javax.swing.JButton();
        lblAgencia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        obtenerTablaButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnReportes = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        jLabel11.setText("Ciudad del envío");

        popEditarCant.setText("Modificar cantidad");
        popEditarCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popEditarCantActionPerformed(evt);
            }
        });
        popupTabla.add(popEditarCant);

        popEditarDesc.setText("Modificar descuento");
        popEditarDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popEditarDescActionPerformed(evt);
            }
        });
        popupTabla.add(popEditarDesc);
        popupTabla.add(jSeparator1);

        popElim.setText("Eliminar producto");
        popElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popElimActionPerformed(evt);
            }
        });
        popupTabla.add(popElim);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/nice copia.png"))); // NOI18N
        jPanel1.add(lblNice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, -40, 120, 250));

        materialTabbed1.setForeground(new java.awt.Color(137, 101, 255));
        materialTabbed1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(192, 195, 216));
        jPanel2.setLayout(null);

        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteKeyReleased(evt);
            }
        });
        jPanel2.add(txtCliente);
        txtCliente.setBounds(50, 80, 170, 23);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Buscar cliente");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 60, 150, 17);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Buscar empleado");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(250, 60, 160, 17);

        txtEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpKeyReleased(evt);
            }
        });
        jPanel2.add(txtEmp);
        txtEmp.setBounds(250, 80, 170, 23);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Agencia de envío");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(450, 60, 170, 17);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Peso");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(1040, 60, 31, 17);

        ftxtPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####.##"))));
        jPanel2.add(ftxtPeso);
        ftxtPeso.setBounds(1040, 80, 140, 23);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Nombre del barco");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(860, 120, 111, 17);
        jPanel2.add(txtBarco);
        txtBarco.setBounds(860, 140, 140, 23);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Dirección del envío");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(680, 180, 220, 17);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Ciudad del envío");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(680, 120, 103, 17);
        jPanel2.add(txtCiudad);
        txtCiudad.setBounds(680, 140, 140, 23);

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Región del envío");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(860, 60, 102, 17);
        jPanel2.add(txtRegion);
        txtRegion.setBounds(860, 80, 140, 23);

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Código postal");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(1040, 120, 87, 17);

        txtPostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        jPanel2.add(txtPostal);
        txtPostal.setBounds(1040, 140, 140, 23);

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("País de envío");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(680, 60, 82, 17);
        jPanel2.add(txtPais);
        txtPais.setBounds(680, 80, 140, 23);

        btnOrdenar.setBackground(new java.awt.Color(153, 153, 255));
        btnOrdenar.setText("Crear orden");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jPanel2.add(btnOrdenar);
        btnOrdenar.setBounds(850, 470, 110, 30);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Productos encontrados");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 320, 240, 30);

        txtProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProdKeyReleased(evt);
            }
        });
        jPanel2.add(txtProd);
        txtProd.setBounds(50, 290, 240, 23);

        listProds.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(listProds);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(50, 350, 240, 220);

        btnSeleccionarProd.setBackground(new java.awt.Color(153, 153, 255));
        btnSeleccionarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarProd.setText("➜");
        btnSeleccionarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarProdActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarProd);
        btnSeleccionarProd.setBounds(310, 450, 40, 23);

        tblProds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Descuento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProds);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(370, 350, 450, 220);

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre del producto");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(50, 260, 180, 30);

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Productos agregados a la orden");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(370, 320, 450, 30);

        txtDir.setColumns(20);
        txtDir.setRows(5);
        jScrollPane2.setViewportView(txtDir);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(680, 200, 500, 50);

        listClientes.setModel(new DefaultListModel());
        listClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listClientesMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(listClientes);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(50, 110, 170, 90);

        listEmps.setModel(new DefaultListModel());
        listEmps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listEmpsMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(listEmps);

        jPanel2.add(jScrollPane5);
        jScrollPane5.setBounds(250, 110, 170, 90);

        listAgencias.setModel(new DefaultListModel());
        listAgencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listAgenciasMouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(listAgencias);

        jPanel2.add(jScrollPane6);
        jScrollPane6.setBounds(450, 80, 170, 120);

        btnCliente.setBackground(new java.awt.Color(153, 153, 255));
        btnCliente.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("Seleccionar");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnCliente);
        btnCliente.setBounds(50, 210, 170, 40);

        lblCliente.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.add(lblCliente);
        lblCliente.setBounds(60, 220, 150, 20);

        btnEmp.setBackground(new java.awt.Color(153, 153, 255));
        btnEmp.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnEmp.setText("Seleccionar");
        btnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpActionPerformed(evt);
            }
        });
        jPanel2.add(btnEmp);
        btnEmp.setBounds(250, 210, 170, 40);

        lblEmp.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblEmp.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.add(lblEmp);
        lblEmp.setBounds(260, 220, 150, 20);

        btnAgencia.setBackground(new java.awt.Color(153, 153, 255));
        btnAgencia.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgencia.setForeground(new java.awt.Color(255, 255, 255));
        btnAgencia.setText("Seleccionar");
        btnAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgenciaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgencia);
        btnAgencia.setBounds(450, 210, 170, 40);

        lblAgencia.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblAgencia.setForeground(new java.awt.Color(255, 255, 255));
        lblAgencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.add(lblAgencia);
        lblAgencia.setBounds(460, 220, 150, 20);

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

        btnReportes.setBackground(new java.awt.Color(153, 153, 255));
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Generar Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1245, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 527, Short.MAX_VALUE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 528, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 287, Short.MAX_VALUE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 288, Short.MAX_VALUE)))
        );

        materialTabbed1.addTab("Reportes", jPanel4);

        jPanel5.setBackground(new java.awt.Color(192, 195, 216));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Tabla de Productos", jPanel5);

        jPanel1.add(materialTabbed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 1250, 670));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/gradPinkMorado.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1440, 820));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void obtenerTablaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obtenerTablaButtonMouseClicked
        MariaDBConnection mb = new MariaDBConnection();
        mb.proyeccion("Orders", "OrderID", "CustomerID");
    }//GEN-LAST:event_obtenerTablaButtonMouseClicked

    private void btnSeleccionarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarProdActionPerformed
        if (listProds.getSelectedIndex() >= 0) {
            DefaultTableModel tabla = (DefaultTableModel) tblProds.getModel();
            DefaultListModel lista = (DefaultListModel)listProds.getModel();
            lista.get(listProds.getSelectedIndex());

            String prod = lista.get(listProds.getSelectedIndex()).toString();
            boolean existe = false;

            for (int i = 0; i < tabla.getRowCount() && !existe; i++)
                existe = tabla.getValueAt(i, 0).toString().equals(prod);

            if (!existe) {
                double desc = r.nextDouble() * 0.5;
                DecimalFormat df = new DecimalFormat("#.##");
                String descRounded = df.format(desc);
                Object[] fila = {prod, "1", descRounded};
                tabla.addRow(fila);
                tblProds.setModel(tabla);
            }
            else {
                JOptionPane.showMessageDialog(this, "El producto ya fue agregado a la orden.", "", 1);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto.", "", 1);
    }//GEN-LAST:event_btnSeleccionarProdActionPerformed

    private void txtProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdKeyReleased
        DefaultListModel modelo = new DefaultListModel();
        if (!txtProd.getText().isBlank()) {
            c = new MariaDBConnection();
            Statement st = null;
            ResultSet rs = null;
            
            String query = "select * from products p where p.ProductName regexp '^" +txtProd.getText()+ "'";
            try {
                st = c.connection.createStatement();
                rs = st.executeQuery(query);
                while(rs.next()){
                    modelo.addElement(rs.getString("ProductName")+" ($"+rs.getDouble("UnitPrice")+")");
                }
                c.connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        listProds.setModel(modelo); 
    }//GEN-LAST:event_txtProdKeyReleased

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        Document document = new Document();
        try{
            String ruta = System.getProperty("user.home");
            try {
                PdfWriter.getInstance(document, new FileOutputStream(ruta + "/Desktop/Reporte.pdf"));
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            document.open();    
            
            Paragraph titulo = new Paragraph();
            titulo.add("Factura de Orden");
            titulo.setAlignment(1);
            
            PdfPTable tabla = new PdfPTable(3); // columna
            tabla.addCell("Columna1");
            tabla.addCell("Columna2");
            tabla.addCell("Columna3");
            document.add(titulo);
            document.add(Chunk.NEWLINE);
            document.addTitle("hola");
            document.add(tabla);            
            document.close();       
            JOptionPane.showMessageDialog(null, "Reporte Creado.");
        }catch(DocumentException E){
        }
    }//GEN-LAST:event_btnReportesActionPerformed

    private void popElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popElimActionPerformed
        int response = JOptionPane.showConfirmDialog(
                this,
                "¿Seguro que desea eliminar este producto de la orden?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.OK_OPTION) {
            DefaultTableModel modelito = (DefaultTableModel) tblProds.getModel();
            modelito.removeRow(tblProds.getSelectedRow());
            tblProds.setModel(modelito);
        }
    }//GEN-LAST:event_popElimActionPerformed

    private void popEditarCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popEditarCantActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) tblProds.getModel();
        String cant = JOptionPane.showInputDialog(this, "Ingrese la nueva cantidad");
        try {
            if (Integer.parseInt(cant) >= 1) {
                tabla.setValueAt(cant, tblProds.getSelectedRow(), 1);
                tblProds.setModel(tabla);
                return;
            }
        } catch (Exception e) {}
        JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida.", "", 1);
    }//GEN-LAST:event_popEditarCantActionPerformed

    private void tblProdsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdsMouseClicked
        if (evt.isMetaDown())
            popupTabla.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_tblProdsMouseClicked

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        if (txtValid(txtBarco.getText()) && txtValid(txtCiudad.getText()) && txtValid(txtCliente.getText())
                && txtValid(txtDir.getText()) && txtValid(txtEmp.getText())
                && txtValid(txtPais.getText()) && txtValid(txtPostal.getText()) && txtValid(txtRegion.getText())) {
            if (tblProds.getRowCount() > 0) {
                ArrayList<Product> prodsOrden = new ArrayList();
                for (int i = 0; i < tblProds.getRowCount(); i++)
                    for (Product p : productos)
                        if (p.name.equals(tblProds.getValueAt(i, 0)))
                            prodsOrden.add(p);
                
                // Crear order y order details para guardar los ids de productos y cantidades de un solo
            }
            else
                JOptionPane.showMessageDialog(this, "Debe agregar al menos un producto a la orden.", "", 1);
        }
        else 
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 1);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void txtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyReleased
        DefaultListModel modelo = new DefaultListModel();
        if (!txtCliente.getText().isBlank()) {
            c = new MariaDBConnection();
            Statement st = null;
            ResultSet rs = null;
            
            String query = "select * from customers c where c.ContactName regexp '^" +txtCliente.getText()+ "'";
            try {
                st = c.connection.createStatement();
                rs = st.executeQuery(query);
                while(rs.next()){
                    modelo.addElement(rs.getString("ContactName"));
                }
                c.connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        listClientes.setModel(modelo);
    }//GEN-LAST:event_txtClienteKeyReleased

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        lblCliente.setText(listClientes.getSelectedValue());
        lblCliente.setVisible(true);
        btnCliente.setVisible(false);
        txtCliente.setText("");
        listClientes.setModel(crearModelLista("customers", "ContactName", "", false));
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
        lblEmp.setText(listEmps.getSelectedValue());
        lblEmp.setVisible(true);
        btnEmp.setVisible(false);
        txtEmp.setText("");
        listEmps.setModel(crearModelLista("employees", "FirstName", "LastName", true));
    }//GEN-LAST:event_btnEmpActionPerformed

    private void btnAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgenciaActionPerformed
        lblAgencia.setText(listAgencias.getSelectedValue());
        lblAgencia.setVisible(true);
        btnAgencia.setVisible(false);
        listAgencias.setModel(crearModelLista("shippers", "CompanyName", "", false));
    }//GEN-LAST:event_btnAgenciaActionPerformed

    private void listClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listClientesMouseReleased
        if (listClientes.getSelectedIndex() >= 0)
            btnCliente.setVisible(true);
    }//GEN-LAST:event_listClientesMouseReleased

    private void txtEmpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpKeyReleased
        DefaultListModel modelo = new DefaultListModel();
        if (!txtEmp.getText().isBlank()) {
            c = new MariaDBConnection();
            Statement st = null;
            ResultSet rs = null;
            
            String query = "select * from employees e where e.FirstName regexp '^" +txtEmp.getText()+ "'";
            try {
                st = c.connection.createStatement();
                rs = st.executeQuery(query);
                while(rs.next()){
                    modelo.addElement(rs.getString("FirstName")+" "+rs.getString("LastName"));
                }
                c.connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        listEmps.setModel(modelo);
    }//GEN-LAST:event_txtEmpKeyReleased

    private void listEmpsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEmpsMouseReleased
        if (listEmps.getSelectedIndex() >= 0)
            btnEmp.setVisible(true);
    }//GEN-LAST:event_listEmpsMouseReleased

    private void listAgenciasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAgenciasMouseReleased
        if (listAgencias.getSelectedIndex() >= 0)
            btnAgencia.setVisible(true);
    }//GEN-LAST:event_listAgenciasMouseReleased

    private void popEditarDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popEditarDescActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) tblProds.getModel();
        String desc = JOptionPane.showInputDialog(this, "Ingrese el nuevo descuento\n(Decimal entre 0 y 1)");
        try {
            if (Double.parseDouble(desc) > 0 && Double.parseDouble(desc) < 1) {
                tabla.setValueAt(desc, tblProds.getSelectedRow(), 2);
                tblProds.setModel(tabla);
                return;
            }
        } catch (Exception e) {}
        JOptionPane.showMessageDialog(this, "Ingrese un descuento válido.", "", 1);
    }//GEN-LAST:event_popEditarDescActionPerformed

    
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
    
    public void limpiarTab1() {
        // Resetear labels y botones
        resetLblBtn(lblCliente, btnCliente);
        resetLblBtn(lblEmp, btnEmp);
        resetLblBtn(lblAgencia, btnAgencia);
        
        // Llenar lista de shippers
        listAgencias.setModel(crearModelLista("shippers", "CompanyName", "", false));
        
        // Llenar lista de empleados
        listEmps.setModel(crearModelLista("employees", "FirstName", "LastName", true));
        
        // Llenar lista de clientes
        listClientes.setModel(crearModelLista("customers", "ContactName", "", false));
    }
    
    public DefaultListModel crearModelLista(String tabla, String campo1, String campo2, boolean dosCampos) {
        DefaultListModel modelo = new DefaultListModel();
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;

        String query = "select * from " + tabla;
        try {
            st = c.connection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
                if (dosCampos)
                    modelo.addElement(rs.getString(campo1) + " " + rs.getString(campo2));
                else
                    modelo.addElement(rs.getString(campo1));
            }
            c.connection.close();
        } catch (SQLException ex) { ex.printStackTrace(); }
        return modelo;
    }
    
    public void resetLblBtn(JLabel lbl, JButton btn) {
        lbl.setText("");
        lbl.setVisible(false);
        btn.setVisible(false);
    }
    
    public void cargarDatos() {
        
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;
        
        // Cargar productos
        String query = "select * from products";
        try {
            st = c.connection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
                productos.add(new Product(rs.getInt("ProductID"), rs.getString("ProductName"),
                        rs.getInt("SupplierID"), rs.getInt("CategoryID"),
                        rs.getString("QuantityPerUnit"), rs.getDouble("UnitPrice"),
                        rs.getInt("UnitsInStock"), rs.getInt("UnitsOnOrder"),
                        rs.getInt("ReorderLevel"), (rs.getString("Discontinued").equals("y"))));
            }
            c.connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean txtValid(String txt) {
        return (!txt.isBlank() && !txt.isEmpty());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgencia;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEmp;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSeleccionarProd;
    private javax.swing.JFormattedTextField ftxtPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEmp;
    private javax.swing.JLabel lblNice;
    private javax.swing.JList<String> listAgencias;
    private javax.swing.JList<String> listClientes;
    private javax.swing.JList<String> listEmps;
    private javax.swing.JList<String> listProds;
    private proyectobd1.MaterialTabbed materialTabbed1;
    private javax.swing.JButton obtenerTablaButton;
    private javax.swing.JMenuItem popEditarCant;
    private javax.swing.JMenuItem popEditarDesc;
    private javax.swing.JMenuItem popElim;
    private javax.swing.JPopupMenu popupTabla;
    private javax.swing.JTable tblProds;
    private javax.swing.JTextField txtBarco;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextArea txtDir;
    private javax.swing.JTextField txtEmp;
    private javax.swing.JTextField txtPais;
    private javax.swing.JFormattedTextField txtPostal;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtRegion;
    // End of variables declaration//GEN-END:variables
}
