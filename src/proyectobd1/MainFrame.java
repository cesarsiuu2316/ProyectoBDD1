package proyectobd1;

import com.itextpdf.text.BaseColor;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import java.sql.PreparedStatement;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.DecimalFormat;
import java.sql.Timestamp;

public class MainFrame extends javax.swing.JFrame {

    Random r = new Random();
    MariaDBConnection c = null;
    ArrayList<Product> productos = new ArrayList();
    ArrayList<Customer> clientes = new ArrayList();
    ArrayList<Employee> empleados = new ArrayList();
    ArrayList<Shipper> shippers = new ArrayList();
    ArrayList<Order> orders = new ArrayList();
    ArrayList<OrderDetails> details = new ArrayList();
    ArrayList<Supplier> suppliers = new ArrayList();    
    ArrayList<Integer> idOrders = new ArrayList();
    
    int selectedRow = -1;

    public MainFrame() {
        initComponents();

        // Configurar Frame
        this.setSize(1390, 800);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Proyecto 1 - Teoría de Bases de Datos I");

        // Cargar datos
        cargarProds();
        cargarShippers();
        cargarClientes();
        cargarEmpleados();
        cargarSuppliers();
        
        limpiarTab1();
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
        txtProdBuscar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listProds = new javax.swing.JList<>();
        btnSeleccionarProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdsOrden = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDir = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        listClientes = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        listEmps = new javax.swing.JList<>();
        btnCliente = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        btnEmp = new javax.swing.JButton();
        lblEmp = new javax.swing.JLabel();
        cboShippersProd = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtProd = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCateg = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCantUnit = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtStockUnits = new javax.swing.JTextField();
        btnAgregarProd = new javax.swing.JButton();
        btnEliminarProd = new javax.swing.JButton();
        btnModificarProd = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        cbDescontinuado = new javax.swing.JCheckBox();
        txtReorder = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtOrderUnits = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblProds = new javax.swing.JTable();
        btnSupplier = new javax.swing.JButton();
        lblSupplier = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listSuppliers = new javax.swing.JList<>();
        txtSupplier = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblProdsNoDesc = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jt_Orden_Anio = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jt_Proveedor = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jt_Reporte_Categoria = new javax.swing.JTable();
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
        materialTabbed1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                materialTabbed1StateChanged(evt);
            }
        });

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
        jLabel1.setBounds(50, 60, 170, 17);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Buscar empleado");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(280, 60, 170, 17);

        txtEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpKeyReleased(evt);
            }
        });
        jPanel2.add(txtEmp);
        txtEmp.setBounds(280, 80, 170, 23);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Agencia de envío");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(520, 60, 200, 17);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Peso");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(990, 200, 140, 17);

        ftxtPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####.##"))));
        jPanel2.add(ftxtPeso);
        ftxtPeso.setBounds(990, 220, 140, 23);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Nombre del barco");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(990, 60, 140, 17);
        jPanel2.add(txtBarco);
        txtBarco.setBounds(990, 80, 140, 23);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Dirección del envío");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(520, 120, 200, 17);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Ciudad del envío");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(790, 130, 140, 17);
        jPanel2.add(txtCiudad);
        txtCiudad.setBounds(790, 150, 140, 23);

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Región del envío");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(790, 200, 140, 17);
        jPanel2.add(txtRegion);
        txtRegion.setBounds(790, 220, 140, 23);

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Código postal");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(990, 130, 140, 17);

        txtPostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        jPanel2.add(txtPostal);
        txtPostal.setBounds(990, 150, 140, 23);

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("País de envío");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(790, 60, 140, 17);
        jPanel2.add(txtPais);
        txtPais.setBounds(790, 80, 140, 23);

        btnOrdenar.setBackground(new java.awt.Color(153, 153, 255));
        btnOrdenar.setForeground(new java.awt.Color(255, 255, 255));
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

        txtProdBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProdBuscarKeyReleased(evt);
            }
        });
        jPanel2.add(txtProdBuscar);
        txtProdBuscar.setBounds(50, 290, 240, 23);

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

        tblProdsOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Descuento", "ID Producto", "ID Orden"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdsOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdsOrdenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdsOrden);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(370, 350, 450, 220);

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Buscar producto");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(50, 260, 240, 30);

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
        jScrollPane2.setBounds(520, 140, 200, 110);

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
        jScrollPane5.setBounds(280, 110, 170, 90);

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
        btnEmp.setBounds(280, 210, 170, 40);

        lblEmp.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblEmp.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.add(lblEmp);
        lblEmp.setBounds(290, 220, 150, 20);

        cboShippersProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cboShippersProd);
        cboShippersProd.setBounds(520, 80, 200, 23);

        materialTabbed1.addTab("Gestión de Órdenes", jPanel2);

        jPanel3.setBackground(new java.awt.Color(192, 195, 216));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("Nombre Producto");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));
        jPanel3.add(txtProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 160, -1));

        jLabel21.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel21.setForeground(java.awt.Color.white);
        jLabel21.setText("Categoria (ID)");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));
        jPanel3.add(txtCateg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 160, -1));

        jLabel22.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel22.setForeground(java.awt.Color.white);
        jLabel22.setText("Cantidad por unidad");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 160, -1));
        jPanel3.add(txtCantUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 160, -1));

        jLabel23.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel23.setForeground(java.awt.Color.white);
        jLabel23.setText("Precio unitario");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));
        jPanel3.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 160, -1));

        jLabel24.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel24.setForeground(java.awt.Color.white);
        jLabel24.setText("Unidades en stock");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 160, -1));
        jPanel3.add(txtStockUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 160, -1));

        btnAgregarProd.setBackground(new java.awt.Color(153, 153, 255));
        btnAgregarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProd.setText("Agregar producto");
        btnAgregarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProdMouseClicked(evt);
            }
        });
        jPanel3.add(btnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 160, 40));

        btnEliminarProd.setBackground(new java.awt.Color(153, 153, 255));
        btnEliminarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProd.setText("Eliminar producto");
        btnEliminarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarProdMouseClicked(evt);
            }
        });
        jPanel3.add(btnEliminarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 160, 40));

        btnModificarProd.setBackground(new java.awt.Color(153, 153, 255));
        btnModificarProd.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProd.setText("Modificar producto");
        btnModificarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarProdMouseClicked(evt);
            }
        });
        jPanel3.add(btnModificarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 160, 40));

        jLabel27.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel27.setForeground(java.awt.Color.white);
        jLabel27.setText("Descontinuado");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 100, -1));
        jPanel3.add(cbDescontinuado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 130, -1));
        jPanel3.add(txtReorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 160, -1));

        jLabel28.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel28.setForeground(java.awt.Color.white);
        jLabel28.setText("Reorder Level");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));
        jPanel3.add(txtOrderUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 160, -1));

        jLabel25.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel25.setForeground(java.awt.Color.white);
        jLabel25.setText("Unidades en órdenes");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        tblProds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tblProds);

        jPanel3.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 690, 490));

        btnSupplier.setBackground(new java.awt.Color(153, 153, 255));
        btnSupplier.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnSupplier.setText("Seleccionar");
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });
        jPanel3.add(btnSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 160, 40));

        lblSupplier.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSupplier.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSupplier.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel3.add(lblSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 140, 20));

        listSuppliers.setModel(new DefaultListModel());
        listSuppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listSuppliersMouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(listSuppliers);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 160, 140));

        txtSupplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSupplierKeyReleased(evt);
            }
        });
        jPanel3.add(txtSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 160, -1));

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Buscar proveedor");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        materialTabbed1.addTab("Gestión de Productos", jPanel3);

        jPanel6.setBackground(new java.awt.Color(192, 195, 216));

        tblProdsNoDesc.setBackground(new java.awt.Color(255, 255, 255));
        tblProdsNoDesc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdsNoDesc.setOpaque(false);
        jScrollPane10.setViewportView(tblProdsNoDesc);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Productos no descontinuados");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Productos no descontinuados", jPanel6);

        jPanel5.setBackground(new java.awt.Color(192, 195, 216));

        jt_Orden_Anio.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jt_Orden_Anio);

        jt_Proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane8.setViewportView(jt_Proveedor);

        jt_Reporte_Categoria.setModel(new javax.swing.table.DefaultTableModel(
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
        jt_Reporte_Categoria.setToolTipText("");
        jScrollPane9.setViewportView(jt_Reporte_Categoria);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane9))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Reportes", jPanel5);

        jPanel1.add(materialTabbed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 1250, 670));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/gradPinkMorado.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1440, 820));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void popElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popElimActionPerformed
        int response = JOptionPane.showConfirmDialog(
                this,
                "¿Seguro que desea eliminar este producto de la orden?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.OK_OPTION) {
            DefaultTableModel modelito = (DefaultTableModel) tblProdsOrden.getModel();
            modelito.removeRow(tblProdsOrden.getSelectedRow());
            tblProdsOrden.setModel(modelito);
        }
    }//GEN-LAST:event_popElimActionPerformed

    private void popEditarCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popEditarCantActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) tblProdsOrden.getModel();
        int cant = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la nueva cantidad"));
        try {
            if (cant >= 1) {
                tabla.setValueAt(Integer.toString(cant), tblProdsOrden.getSelectedRow(), 1);
                tblProdsOrden.setModel(tabla);
                return;
            }
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida.", "", 1);
    }//GEN-LAST:event_popEditarCantActionPerformed

     private void agregarOrdenBD(Order o){
        
        c = new MariaDBConnection();
        PreparedStatement st = null;

        // Cargar productos
        String query = "INSERT INTO `orders` (`OrderID`, `CustomerID`, `EmployeeID`, `OrderDate`, `RequiredDate`, `ShippedDate`, `ShipVia`, `Freight`, `ShipName`, `ShipAddress`, `ShipCity`, `ShipRegion`, `ShipPostalCode`, `ShipCountry`)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            st = c.connection.prepareStatement(query);
            st.setInt(1, o.getIdOrden());
            st.setString(2, o.getIdCliente());
            st.setInt(3, o.getIdEmpleado());
            st.setTimestamp(4, new Timestamp(o.getDateOrden().getTime()));
            st.setTimestamp(5, new Timestamp(o.getDateReq().getTime()));
            st.setTimestamp(6, null);
            st.setInt(7, o.getIdShipVia());
            st.setDouble(8, o.getPeso());
            st.setString(9, o.getShipName());
            st.setString(10, o.getShipAddress());
            st.setString(11, o.getShipCity());
            st.setString(12, o.getShipRegion());
            st.setString(13, o.getShipCodPostal());
            st.setString(14, o.getShipCountry());
            st.execute();
            c.connection.close();
        } catch (SQLException ex) {
        }
    }
    
    private void agregarOrderDetailsBD(OrderDetails od){
        c = new MariaDBConnection();
        PreparedStatement st = null;

        // Cargar productos
        String query = "INSERT INTO `orderdetails` (`OrderID`, `ProductID`, `UnitPrice`, `Quantity`, `Discount`)" 
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            st = c.connection.prepareStatement(query);
            st.setInt(1, od.getOrderID());
            st.setInt(2, od.getIdProducto());
            st.setDouble(3, od.getUnitPrice());
            st.setInt(4, od.getQuantity());
            st.setDouble(5, od.getDescuento());            
            st.execute();
            c.connection.close();
        } catch (SQLException ex) {
        }
    }
    
    private void actualizarExistenciasProducto(OrderDetails od){
        c = new MariaDBConnection();
        PreparedStatement st = null;
        // Cargar productos
        String query = "update products set UnitsInStock = UnitsInStock - " + od.getQuantity() + " where ProductID = " + od.getIdProducto();
        try {
            st = c.connection.prepareStatement(query);        
            st.execute();
            c.connection.close();
        } catch (SQLException ex) {
        }
    }
    
    private int getUnitsInStock(int prodID){
        int uis = 0; // units in stock
        for (Product producto : productos) {
            if(prodID == producto.getIdProd())
                uis = producto.getStock();              
        }
        return uis;
    }
    
    public void generarFactura(Order o, ArrayList<OrderDetails> od){
        Document document = new Document(PageSize.LETTER, 5,5,5,5);
        try{
            String ruta = System.getProperty("user.home");
            try {
                PdfWriter.getInstance(document, new FileOutputStream(ruta + "/Desktop/Reporte.pdf"));
            } catch (FileNotFoundException ex) {
            }
            document.open();    
            
            Paragraph titulo = new Paragraph();
            titulo.add("FACTURA DE ORDEN"); // titulo de documento
            titulo.setAlignment(1);
                        document.add(titulo);
            document.add(Chunk.NEWLINE);  
            
            //BASE COLORS
            BaseColor color1 = new BaseColor(138, 171, 236); 
            BaseColor color2 = new BaseColor(194, 210, 252);
            
            ArrayList<String> campos = new ArrayList<>(Arrays.asList("OrderID", "CustomerID", "EmployeeID", Integer.toString(o.getIdOrden()), o.getIdCliente(), Integer.toString(o.getIdEmpleado())));
            PdfPTable table = generarTablaPdf(campos.size()/2, campos, color1, color2, "Orden"); // columna
            document.add(table);

            // TABLA 2
            campos = new ArrayList<>(Arrays.asList("OrderDate", "Required Date", "Ship Via (ID)", o.getDateOrden().toString(), o.getDateReq().toString(), Integer.toString(o.getIdShipVia())));
            table = generarTablaPdf(campos.size()/2, campos, color1, color2, ""); // columna
            document.add(table);
            
            //tabla 3
            campos = new ArrayList<>(Arrays.asList("Freight", "Ship Name", "Ship Address", Double.toString(o.getPeso()), o.getShipName(), o.getShipAddress()));
            table = generarTablaPdf(campos.size()/2, campos, color1, color2, ""); // columna
            document.add(table);
            
            //tabla 4
            campos = new ArrayList<>(Arrays.asList("Ship City", "Ship Region", "Ship Postal Code", o.getShipCity(), o.getShipRegion(), o.getShipCodPostal()));
            table = generarTablaPdf(campos.size()/2, campos, color1, color2, ""); // columna
            document.add(table);
                        
            // tablas de order details
            Double subtotal = 0.0;
            Double totalPagar = 0.0;
            boolean primerDetail = true;
            for (OrderDetails detail : od) {
                campos = new ArrayList<>(Arrays.asList("Product ID", "Unit Price", "Quantity", "Discount", 
                        Integer.toString(detail.getIdProducto()), Double.toString(detail.getUnitPrice()), Integer.toString(detail.getQuantity()), Double.toString(detail.getDescuento())));
                if(primerDetail){
                    table = generarTablaPdf(campos.size()/2, campos, color1, color2, "Order Details"); // columna
                    primerDetail = false;
                }else{
                    table = generarTablaPdf(campos.size()/2, campos, color1, color2, "");
                }
                document.add(table);
                subtotal += detail.getUnitPrice() * detail.getQuantity();
                totalPagar += (detail.getUnitPrice() * detail.getQuantity()) * (1.0 - detail.getDescuento());
            }
            
            // tablas de subtotal y total a pagar
            campos = new ArrayList<>(Arrays.asList("Subtotal", "Total a Pagar", Double.toString(subtotal), Double.toString(totalPagar)));
            table = generarTablaPdf(campos.size()/2, campos, color1, color2, "Subtotal y Total a Pagar"); // columna
            document.add(table);
            document.close();       
            JOptionPane.showMessageDialog(null, "Factura impresa.");                    
            try{
                Desktop.getDesktop().open(new File(ruta + "/Desktop/Reporte.pdf"));
            }catch(Exception e)
            {            
                e.printStackTrace();
            }    
        }catch(DocumentException E){
        }
    }
    
    public PdfPTable generarTablaPdf(int nColumnas, ArrayList<String> campos, BaseColor color1, BaseColor color2, String titulo){
        PdfPTable table = new PdfPTable(nColumnas);
        if(!titulo.equals("")){
            PdfPCell cell = new PdfPCell (new Paragraph (titulo));
            cell.setColspan (nColumnas);
            cell.setHorizontalAlignment (Element.ALIGN_CENTER);
            cell.setBackgroundColor(new BaseColor(116, 144, 198)); 
            cell.setPadding (7.0f);
            table.addCell(cell);
        }        
        Phrase frase = new Phrase(campos.get(0));
        PdfPCell celda = new PdfPCell(frase);
        celda.setBackgroundColor(color1);
        table.addCell(celda);
        for(int i = 1; i < (nColumnas*2); i++){
            frase = new Phrase(campos.get(i));
            //System.out.println(frase.toString());
            celda = new PdfPCell(frase);
            if(i < (nColumnas*2)/2){
                celda.setBackgroundColor(color1);
            }else{
                celda.setBackgroundColor(color2);
            }
            table.addCell(celda);            
        }
        table.setSpacingAfter(10);
        return table;
    }
    
    private void popEditarDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popEditarDescActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) tblProdsOrden.getModel();
        Double desc = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el nuevo descuento\n(Decimal entre 0 y 1)"));
        try {
            if (desc >= 0 && desc < 1) {
                tabla.setValueAt(Double.toString(desc), tblProdsOrden.getSelectedRow(), 2);
                tblProdsOrden.setModel(tabla);
                return;
            }
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "Ingrese un descuento válido.", "", 1);
    }//GEN-LAST:event_popEditarDescActionPerformed

    private void materialTabbed1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_materialTabbed1StateChanged
        switch (materialTabbed1.getSelectedIndex()) {
            case 0: {
                limpiarTab1();
                break;
            }
            case 1: {
                limpiarTab2();
                break;
            }
            case 2: {
                limpiarTab3();
                break;
            }case 3:{
                TablaReporteCategoria();
                Tablaclienteordenes();
                Tablacantprodvendidistri();
                break;
            }
        }
    }//GEN-LAST:event_materialTabbed1StateChanged

    private void txtSupplierKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSupplierKeyReleased
        DefaultListModel modelo = new DefaultListModel();
        if (!txtSupplier.getText().isBlank()) {
            c = new MariaDBConnection();
            Statement st = null;
            ResultSet rs = null;

            String query = "select * from suppliers s where s.ContactName regexp '^" + txtSupplier.getText() + "'";
            try {
                st = c.connection.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    modelo.addElement(rs.getString("ContactName"));
                }
                c.connection.close();
            } catch (SQLException ex) {
            }
        }
        else
        modelo = crearModelLista("suppliers", "ContactName", "", false);
        listSuppliers.setModel(modelo);
    }//GEN-LAST:event_txtSupplierKeyReleased

    private void listSuppliersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSuppliersMouseReleased
        if (listSuppliers.getSelectedIndex() >= 0)
        btnSupplier.setVisible(true);
    }//GEN-LAST:event_listSuppliersMouseReleased

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        lblSupplier.setText(listSuppliers.getSelectedValue());
        lblSupplier.setVisible(true);
        btnSupplier.setVisible(false);
        txtSupplier.setText("");
        listSuppliers.setModel(crearModelLista("suppliers", "ContactName", "", false));
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnModificarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProdMouseClicked
        if (btnModificarProd.getText().equals("Modificar producto")) {
            selectedRow = tblProds.getSelectedRow();
            if (tblProds.getSelectedRow() >= 0) {
                btnModificarProd.setText("Guardar cambios");
                bloquearTxt(false);

                Product prodSelected = productos.get(selectedRow);
                txtProd.setText(prodSelected.getName());
                txtCateg.setText(String.valueOf(prodSelected.getIdCateg()));
                txtUnitPrice.setText(String.valueOf(prodSelected.getUnitPrice()));
                txtStockUnits.setText(String.valueOf(prodSelected.getStock()));
                cbDescontinuado.setSelected(prodSelected.isDiscontinued());
                txtReorder.setText(String.valueOf(prodSelected.getReorder()));
                txtCantUnit.setText(prodSelected.getQuantity());
                txtOrderUnits.setText(String.valueOf(prodSelected.getOrder()));

                lblSupplier.setText(suppliers.get(prodSelected.getIdSupplier()).getContactName());
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un producto de la tabla para modificar.");
            }

        } else {
            if (txtValid((txtUnitPrice.getText())) && txtValid(txtStockUnits.getText())) {
                btnModificarProd.setText("Modificar producto");
                bloquearTxt(true);

                modificarProds(1);
                txtUnitPrice.setText("");
                txtStockUnits.setText("");
                cbDescontinuado.setSelected(false);
                selectedRow = -1;
            } else
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.");
        }
        llenarTablaProds();
    }//GEN-LAST:event_btnModificarProdMouseClicked

    private void btnEliminarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProdMouseClicked
        selectedRow = tblProds.getSelectedRow();
        if (selectedRow >= 0)
        modificarProds(0);
        else
        JOptionPane.showMessageDialog(this, "Debe seleccionar un producto de la tabla para eliminar");
        llenarTablaProds();
    }//GEN-LAST:event_btnEliminarProdMouseClicked

    private void btnAgregarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProdMouseClicked
        CrearProductos();
        llenarTablaProds();
    }//GEN-LAST:event_btnAgregarProdMouseClicked

    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
        lblEmp.setText(listEmps.getSelectedValue());
        lblEmp.setVisible(true);
        btnEmp.setVisible(false);
        txtEmp.setText("");
        listEmps.setModel(crearModelLista("employees", "FirstName", "LastName", true));
    }//GEN-LAST:event_btnEmpActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        lblCliente.setText(listClientes.getSelectedValue());
        lblCliente.setVisible(true);
        btnCliente.setVisible(false);
        txtCliente.setText("");
        listClientes.setModel(crearModelLista("customers", "ContactName", "", false));
    }//GEN-LAST:event_btnClienteActionPerformed

    private void listEmpsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEmpsMouseReleased
        if (listEmps.getSelectedIndex() >= 0)
        btnEmp.setVisible(true);
    }//GEN-LAST:event_listEmpsMouseReleased

    private void listClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listClientesMouseReleased
        if (listClientes.getSelectedIndex() >= 0)
        btnCliente.setVisible(true);
    }//GEN-LAST:event_listClientesMouseReleased

    private void tblProdsOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdsOrdenMouseClicked
        if (evt.isMetaDown())
        popupTabla.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_tblProdsOrdenMouseClicked

    private void btnSeleccionarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarProdActionPerformed
        if (listProds.getSelectedIndex() >= 0) {
            DefaultTableModel tabla = (DefaultTableModel) tblProdsOrden.getModel();
            DefaultListModel lista = (DefaultListModel) listProds.getModel();
            
            // Buscar el producto seleccionado 
            Product prod = null;
            for (Product p : productos) {
                if (((String)lista.get(listProds.getSelectedIndex())).contains(p.getName())) {
                    prod = p;
                    break;
                }
            }
            
            // Validar que no se agregue repetido
            boolean existe = false;
            for (int i = 0; i < tabla.getRowCount() && !existe; i++) {
                existe = tabla.getValueAt(i, 0).toString().equals(prod);
            }

            if (!existe) {
                double desc = r.nextDouble() * 0.5;
                DecimalFormat df = new DecimalFormat("#.##");
                String descRounded = df.format(desc);
                cargarIDOrders();
                Object[] fila = {prod.getName(), "1", descRounded, prod.getIdProd(),
                    idOrders.get(idOrders.size()-1)+1};
                tabla.addRow(fila);
                tblProdsOrden.setModel(tabla);
            } else {
                JOptionPane.showMessageDialog(this, "El producto ya fue agregado a la orden.", "", 1);
            }
            txtProdBuscar.setText("");
            // Llenar lista productos
            DefaultListModel modelo = new DefaultListModel();
            for (Product producto : productos)
            modelo.addElement(producto.getName()+ " ($" +producto.getUnitPrice()+ ")");
            listProds.setModel(modelo);
        } else
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto.", "", 1);
    }//GEN-LAST:event_btnSeleccionarProdActionPerformed

    private void txtProdBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdBuscarKeyReleased
        DefaultListModel modelo = new DefaultListModel();
        if (!txtProdBuscar.getText().isBlank()) {
            c = new MariaDBConnection();
            Statement st = null;
            ResultSet rs = null;

            String query = "select * from products p where p.ProductName regexp '^" + txtProdBuscar.getText() + "'";
            try {
                st = c.connection.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    modelo.addElement(rs.getString("ProductName") + " ($" + rs.getDouble("UnitPrice") + ")");
                }
                c.connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else {
            for (Product producto : productos)
            modelo.addElement(producto.getName() + " ($" + producto.getUnitPrice() + ")");
        }
        listProds.setModel(modelo);
    }//GEN-LAST:event_txtProdBuscarKeyReleased

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        if (txtValid(txtBarco.getText()) && txtValid(txtCiudad.getText())
            && txtValid(txtDir.getText()) && txtValid(txtPais.getText())
            && txtValid(txtPostal.getText()) && txtValid(txtRegion.getText()) && txtValid(ftxtPeso.getText())) {

            // Validar que haya agregado productos, seleccionado un cliente, empleado y agencia
            if (tblProdsOrden.getRowCount() > 0 && txtValid(lblCliente.getText()) // si hay minimo un producto seleccionado y los campos contienen valores validos
                && txtValid(lblEmp.getText()) && cboShippersProd.getSelectedIndex()>=0) {

                String barco, ciudad, dir, pais, postal, region, clienteID = "";
                int shipVia = 0, empID = 0;
                double peso;
                Date dateOrden, dateReq, dateEnvio;
                dateEnvio = null;
                dateOrden = new Date();
                // convert date to calendar
                Calendar c = Calendar.getInstance();
                c.setTime(dateOrden);
                c.add(Calendar.DATE, 2);
                dateReq = c.getTime();
                for (Customer cliente : clientes) { // obtener idCliente
                    if(cliente.getContactName().equalsIgnoreCase(lblCliente.getText())){
                        clienteID = cliente.getCustomerID();
                    }
                }
                String nombreEmpleado;
                cargarEmpleados(); // obtener datos de empleados
                for (Employee empleado: empleados){ // obtener idEmpleado
                    nombreEmpleado = empleado.getFirstName() + " " + empleado.getLastName();
                    if(nombreEmpleado.equalsIgnoreCase(lblEmp.getText())){
                        empID = empleado.getEmployeeID();
                    }
                }
                cargarShippers(); // cargar datos de cargamento
                for (Shipper shipper : shippers) { // obtener shipperID
                    if(shipper.getCompanyName().equalsIgnoreCase(cboShippersProd.getSelectedItem().toString())){
                        shipVia = shipper.getIdShipper();
                    }
                }
                peso = Double.parseDouble(ftxtPeso.getText());
                barco = txtBarco.getText();
                ciudad = txtCiudad.getText();
                dir = txtDir.getText();
                pais = txtPais.getText();
                postal = txtPostal.getText();
                region = txtRegion.getText();
                cargarIDOrders(); // cargar los ids
                int orderId = idOrders.get(idOrders.size()-1) + 1;

                /*System.out.println(orderId);
                System.out.println(clienteID);
                System.out.println(empID);
                System.out.println(dateOrden.toString());
                System.out.println(dateReq.toString());
                System.out.println(dateEnvio);
                System.out.println(shipVia);
                System.out.println(peso);
                System.out.println(barco);
                System.out.println(dir);
                System.out.println(ciudad);
                System.out.println(region);
                System.out.println(postal);
                System.out.println(pais);*/

                boolean ordenar = true;
                ArrayList<OrderDetails> orderDetails = new ArrayList();
                int id_Producto = 0, quantity;
                double unitPrice = 0, descuento;
                for(int i = 0; i < tblProdsOrden.getRowCount(); i++){ // obtener arraylist de order details obtenidos con los valores de la tabla de productos
                    String nombreProducto = tblProdsOrden.getValueAt(i, 0).toString();
                    quantity = Integer.parseInt(tblProdsOrden.getValueAt(i, 1).toString());
                    descuento = Double.parseDouble(tblProdsOrden.getValueAt(i, 2).toString());
                    String productName = "";
                    for (Product producto : productos) {
                        productName = producto.getName()+ " ($" +producto.getUnitPrice()+ ")";
                        if(productName.equals(nombreProducto)){
                            id_Producto = producto.getIdProd();
                            unitPrice = producto.getUnitPrice();
                            break;
                        }
                    }
                    OrderDetails od = new OrderDetails(orderId, id_Producto, quantity, unitPrice, descuento); //crear nuevo orderdetail

                    int unitsInStock = getUnitsInStock(id_Producto);
                    if(unitsInStock > 0 && unitsInStock >= quantity){
                        orderDetails.add(od); // agregar orderdetail a arraylist
                    }else{
                        if(unitsInStock == 0){
                            JOptionPane.showMessageDialog(this, "Lo sentimos, el producto: " + nombreProducto + " no se encuentra disponible.", "", 1);
                        }else{
                            JOptionPane.showMessageDialog(this, "Lo sentimos, solo quedan " + Integer.toString(unitsInStock) + " unidades del producto: " + nombreProducto + ".", "", 1);
                        }
                        ordenar = false;
                        break;
                    }
                }
                if(ordenar){
                    Order orden = new Order(orderId, clienteID, empID, dateOrden, dateReq,
                        dateEnvio, shipVia, peso, barco, dir, ciudad, region, postal, pais); // crear la nueva orden
                    agregarOrdenBD(orden); // agregar la orden a la tabla

                    for (OrderDetails od : orderDetails) { // por cada order detail, aÃ±adirlo a la tabla y actualizar la cantidad de productos
                        agregarOrderDetailsBD(od);
                        actualizarExistenciasProducto(od); // modificar los units in stock de productos
                    }
                    generarFactura(orden, orderDetails);
                }else{
                    JOptionPane.showMessageDialog(this, "Debe seleccionar los productos dentro de la cantidad disponible.", "", 1);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe agregar al menos un producto a la orden.", "", 1);
            }
        } else
        JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 1);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void txtEmpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpKeyReleased
        DefaultListModel modelo = new DefaultListModel();
        if (!txtEmp.getText().isBlank()) {
            c = new MariaDBConnection();
            Statement st = null;
            ResultSet rs = null;

            String query = "select * from employees e where e.FirstName regexp '^" + txtEmp.getText() + "'";
            try {
                st = c.connection.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    modelo.addElement(rs.getString("FirstName") + " " + rs.getString("LastName"));
                }
                c.connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else
        modelo = crearModelLista("employees", "FirstName", "LastName", true);
        listEmps.setModel(modelo);
    }//GEN-LAST:event_txtEmpKeyReleased

    private void txtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyReleased
        DefaultListModel modelo = new DefaultListModel();
        if (!txtCliente.getText().isBlank()) {
            c = new MariaDBConnection();
            Statement st = null;
            ResultSet rs = null;

            String query = "select * from customers c where c.ContactName regexp '^" + txtCliente.getText() + "'";
            try {
                st = c.connection.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    modelo.addElement(rs.getString("ContactName"));
                }
                c.connection.close();
            } catch (SQLException ex) {
            }
        }
        else
        modelo = crearModelLista("customers", "ContactName", "", false);
        listClientes.setModel(modelo);
    }//GEN-LAST:event_txtClienteKeyReleased

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
        txtProdBuscar.setText("");
        txtCiudad.setText("");
        txtBarco.setText("");
        txtDir.setText("");
        txtPais.setText("");
        txtPostal.setText("");
        txtRegion.setText("");
        ftxtPeso.setText("");
        
        // Llenar cbo de shippers
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Shipper shipper : shippers)
            model.addElement(shipper);
        cboShippersProd.setModel(model);

        // Llenar lista de empleados
        listEmps.setModel(crearModelLista("employees", "FirstName", "LastName", true));

        // Llenar lista de clientes
        listClientes.setModel(crearModelLista("customers", "ContactName", "", false));

        // Llenar lista de productos
        DefaultListModel modelo = new DefaultListModel();
        for (Product prod : productos)
            modelo.addElement(prod.getName()+ " ($" +prod.getUnitPrice()+ ")");
        listProds.setModel(modelo);
    }
    
    public void limpiarTab2() {
        txtProd.setText("");
        txtReorder.setText("");
        txtCateg.setText("");
        txtCantUnit.setText("");
        txtUnitPrice.setText("");
        txtStockUnits.setText("");
        txtOrderUnits.setText("");
        cbDescontinuado.setSelected(false);
        
        // Llenar tabla con todos los productos
        llenarTablaProds();
        // Llenar lista de proveedores
        listSuppliers.setModel(crearModelLista("suppliers", "ContactName", "", false));
    }
    
    public void limpiarTab3() {
        cargarProds();
        llenarTablaProdsDesc();
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
            while (rs.next()) {
                if (dosCampos) {
                    modelo.addElement(rs.getString(campo1) + " " + rs.getString(campo2));
                } else {
                    modelo.addElement(rs.getString(campo1));
                }
            }
            c.connection.close();
        } catch (SQLException ex) {
        }
        return modelo;
    }

    public void resetLblBtn(JLabel lbl, JButton btn) {
        lbl.setText("");
        lbl.setVisible(false);
        btn.setVisible(false);
    }

    public void cargarProds() {
        productos = new ArrayList();
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;

        // Cargar productos
        String query = "select * from products";
        try {
            st = c.connection.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                productos.add(new Product(rs.getInt("ProductID"), rs.getString("ProductName"),
                        rs.getInt("SupplierID"), rs.getInt("CategoryID"),
                        rs.getString("QuantityPerUnit"), rs.getDouble("UnitPrice"),
                        rs.getInt("UnitsInStock"), rs.getInt("UnitsOnOrder"),
                        rs.getInt("ReorderLevel"), rs.getInt("Discontinued")));
            }
            c.connection.close();
        } catch (SQLException ex) {
        }
    }
    
    public void cargarShippers() {
        shippers = new ArrayList();
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;

        // Cargar shippers
        String query = "select * from shippers";
        try {
            st = c.connection.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                shippers.add(new Shipper(rs.getInt("ShipperID"), rs.getString("CompanyName"), rs.getString("Phone")));
            }
            c.connection.close();
        } catch (SQLException ex) {
        }
    }
    
    public void cargarClientes() {
        clientes = new ArrayList();
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;

        // Cargar shippers
        String query = "select * from customers";
        try {
            st = c.connection.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                clientes.add(new Customer(rs.getString("CustomerID"), rs.getString("CompanyName"),
                        rs.getString("ContactName"), rs.getString("ContactTitle"), rs.getString("Address"),
                        rs.getString("City"), rs.getString("Region"), rs.getString("PostalCode"),
                        rs.getString("Country"), rs.getString("Phone"), rs.getString("Fax")));
            }
            c.connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void cargarEmpleados() {
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;

        // Cargar shippers
        String query = "select * from employees";
        try {
            st = c.connection.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                empleados.add(new Employee(rs.getInt("EmployeeID"), rs.getString("FirstName"), rs.getString("LastName")));
            }
            c.connection.close();
        } catch (SQLException ex) {
        }
    }
    
    public void cargarSuppliers() {
        suppliers = new ArrayList();
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;

        // Cargar shippers
        String query = "select * from suppliers";
        try {
            st = c.connection.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                suppliers.add(new Supplier(rs.getInt("SupplierID"), rs.getString("CompanyName"),
                        rs.getString("ContactName"), rs.getString("ContactTitle"), rs.getString("Address"),
                        rs.getString("City"), rs.getString("Region"), rs.getString("PostalCode"),
                        rs.getString("Country"), rs.getString("Phone"), rs.getString("Fax"), rs.getString("HomePage")));
                
            }
            c.connection.close();
        } catch (SQLException ex) {
        }
    }
    
    public boolean txtValid(String txt) {
        return (!txt.isBlank() && !txt.isEmpty());
    }

    // Metodos Bryan
    public void modificarProds(int var) {
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;
        Product prod = productos.get(selectedRow);
        // Cargar productos
        if (var == 1) {
            try {
                // Registrar el precio anterior y la fecha de hoy
                if (!txtUnitPrice.getText().equals(String.valueOf(prod.getUnitPrice()))) {
                    c = new MariaDBConnection();
                    PreparedStatement ps = null;
                    
                    String query = "INSERT INTO `HistorialPrecioProductos` (`ProductID`, `fecha`, `unitPrice`)"
                            + "VALUES (?, ?, ?)";
                    try {
                        ps = c.connection.prepareStatement(query);
                        ps.setInt(1, prod.getIdProd());
                        ps.setTimestamp(2, new Timestamp(new Date().getTime()));
                        ps.setDouble(3, Double.valueOf(txtUnitPrice.getText()));
                        ps.execute();
                        c.connection.close();
                    } catch (SQLException ex) {}
                    ps.executeQuery(query);
                }
                
                st = c.connection.createStatement();
                // Actualizar Unit Price
                String query1 = "UPDATE products SET UnitPrice= " + Double.valueOf(txtUnitPrice.getText()) + " WHERE ProductID= " + prod.getIdProd();
                st.executeQuery(query1);
                // Actualizar stock
                String query2 = "UPDATE products SET UnitsInStock= " + Integer.valueOf(txtStockUnits.getText()) + " WHERE ProductID= " + prod.getIdProd();
                st.executeQuery(query2);
                // Actualizar descontinuidad
                String query3 = "UPDATE products SET Discontinued= " + cbDescontinuado.isSelected() + " WHERE ProductID= " + prod.getIdProd();
                st.executeQuery(query3);
                
                c.connection.close();
            } catch (SQLException ex) {
            }
        } else {
            st = c.connection.createStatement();
            // Eliminar producto (establecerlo como descontinuado)
            String query = "UPDATE products SET Discontinued= " + 1 + " WHERE ProductID= " + prod.getIdProd();
            try {
                st.executeQuery(query);
                c.connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        selectedRow = -1;
        cargarProds();
        limpiarTab2();
    }

    public void llenarTablaProdsDesc() {
        DefaultTableModel modelito = new DefaultTableModel();
        
        modelito.addColumn("ID Producto");
        modelito.addColumn("Nombre");
        modelito.addColumn("ID Agencia");
        modelito.addColumn("Categoria");
        modelito.addColumn("Cantidad por Unidad");
        modelito.addColumn("Precio unitario");
        modelito.addColumn("Unidades en Stock");
        modelito.addColumn("Unidades en Ordenes");
        modelito.addColumn("ReorderLevel");
        
        
        Object[] ob = new Object[10];
        for (Product pro : productos) {
            if (!pro.isDiscontinued()) {
                ob[0] = pro.getIdProd();
                ob[1] = pro.getName();
                ob[2] = pro.getIdSupplier();
                ob[3] = pro.getIdCateg();
                ob[4] = pro.getQuantity();
                ob[5] = pro.getUnitPrice();
                ob[6] = pro.getStock();
                ob[7] = pro.getOrder();
                ob[8] = pro.getReorder();
                modelito.addRow(ob);
            }
        }
        tblProdsNoDesc.setModel(modelito);
    }
    
    public void llenarTablaProds() {
        DefaultTableModel modelito = new DefaultTableModel();
        modelito.addColumn("ID Producto");
        modelito.addColumn("Nombre");
        modelito.addColumn("Categoria");
        modelito.addColumn("Cantidad por Unidad");
        modelito.addColumn("Precio unitario");
        modelito.addColumn("Unidades en Stock");
        modelito.addColumn("Unidades en Ordenes");
        
        Object[] ob = new Object[7];
        for (Product pro : productos) {
            ob[0] = pro.getIdProd();
            ob[1] = pro.getName();
            ob[2] = pro.getIdCateg();
            ob[3] = pro.getQuantity();
            ob[4] = pro.getUnitPrice();
            ob[5] = pro.getStock();
            ob[6] = pro.getOrder();
            modelito.addRow(ob);
        }
        tblProds.setModel(modelito);
    }
  
    public void cargarOrders(){
        orders = new ArrayList();
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;

        // Cargar productos
        String query = "select * from Orders";
        try {
            st = c.connection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
                orders.add(new Order(rs.getInt("OrderID"), rs.getString("CustomerID"),
                        rs.getInt("EmployeeID"), rs.getDate("OrderDate"),
                        rs.getDate("RequiredDate"), rs.getDate("ShippedDate"),
                        rs.getInt("ShipVia"), rs.getDouble("Freight"),
                        rs.getString("ShipName"), rs.getString("ShipAddress"),
                        rs.getString("ShipCity"), rs.getString("ShipRegion"),
                        rs.getString("ShipPostalCode"), rs.getString("ShipCountry")));
            }
            c.connection.close();
        } catch (SQLException ex) {
        }
    }

    public void cargarIDOrders(){
        idOrders = new ArrayList();
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;

        // Cargar productos
        String query = "select * from Orders";
        try {
            st = c.connection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
                idOrders.add(rs.getInt("OrderID"));
            }
            c.connection.close();
        } catch (SQLException ex) {
        }
        Collections.sort(idOrders);
    }

    public void CrearProductos() {
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;
        int bool = 0;
        if (cbDescontinuado.isSelected()) {
            bool = 1;
        }
        
        Product lastProd = productos.get(productos.size()-1);
        Supplier supplier = new Supplier();
        for (Supplier sup : suppliers) {
            if (sup.getContactName().equals(lblSupplier.getText())) {
                supplier = sup;
                break;
            }
        }

        String query = "INSERT INTO products (ProductName, SupplierID, CategoryID, "
                + "QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued)"
                + "VALUES ('" + txtProd.getText() + "', "
                + supplier.getSupplierID() + ", " + Integer.parseInt(txtCateg.getText()) + ", '"
                + txtCantUnit.getText() + "', " + Double.valueOf(txtUnitPrice.getText()) + ", "
                + Integer.parseInt(txtStockUnits.getText()) + ", " + Integer.parseInt(txtOrderUnits.getText())
                + ", " + Integer.parseInt(txtReorder.getText()) + ", " + bool + ")";
        c = new MariaDBConnection();
        st = c.connection.createStatement();
        try {
            st.executeQuery(query);
            c.connection.close();
            cargarProds();
        } catch (SQLException ex) {

        }
        c = new MariaDBConnection();
        st = c.connection.createStatement();
        try {
            // Actualizar shipper
            String query2 = "UPDATE products SET SupplierID= " + ((Shipper)cboShippersProd.getSelectedItem()).getIdShipper()
                    + " WHERE ProductID= " + lastProd.getIdProd();
            st.executeQuery(query2);
            
            // Actualizar categoria
            String query3 = "UPDATE products SET CategoryID= " + Integer.parseInt(txtCateg.getText())
                    + " WHERE ProductID= " + lastProd.getIdProd();
            st.executeQuery(query3);
            
            c.connection.close();
        } catch (Exception e) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, e);
        }       
    }
    
    public void bloquearTxt(boolean enabled) {
        txtProd.setEnabled(enabled);
        txtReorder.setEnabled(enabled);
        txtCateg.setEnabled(enabled);
        txtCantUnit.setEnabled(enabled);
        txtOrderUnits.setEnabled(enabled);
        tblProdsNoDesc.setEnabled(enabled);
        listSuppliers.setEnabled(enabled);
        txtSupplier.setEnabled(enabled);
        btnSupplier.setVisible(enabled);
        btnAgregarProd.setVisible(enabled);
        btnEliminarProd.setVisible(enabled);
        tblProds.setEnabled(enabled);
    }
    
    public void TablaReporteCategoria() {
        c = new MariaDBConnection();
        String query = "WITH ProductsCategoria AS\n" +
            "(SELECT P.CategoryID, C.CategoryName, COUNT(P.ProductID) Productos\n" +
            "FROM products P INNER JOIN categories C ON C.CategoryID = P.CategoryID\n" +
            "GROUP BY P.CategoryID)\n" +
            "SELECT  C.CategoryID, PC.Productos, COUNT(P.ProductID) ProductosVendidos\n" +
            "from Products P inner join orderdetails OD on OD.ProductID = P.productID inner join Orders O on O.OrderID = OD.OrderID inner join categories C ON C.CategoryID = P.CategoryID INNER JOIN ProductsCategoria PC ON PC.CategoryID = P.CategoryID\n" +
            "group BY C.CategoryID, PC.Productos";
        Statement st;
        DefaultTableModel modelo=new DefaultTableModel() ;
        jt_Reporte_Categoria.setModel(modelo);
        modelo.addColumn("CategoryID");
        modelo.addColumn("Productos");
        modelo.addColumn("Productos Vendidos");
        jt_Reporte_Categoria.setModel(modelo);
        
        String [] dato = new String [3];
        try{
          st = c.connection.createStatement();
          ResultSet result = st.executeQuery(query);
          
          while(result.next()){
              dato[0] = result.getString(1);
              dato[1] = result.getString(2);
              dato[2] = result.getString(3);
              modelo.addRow(dato);
          }
          
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void Tablaclienteordenes() {
        c = new MariaDBConnection();
        String query = "WITH ordenesMA AS\n(SELECT O.CustomerID, YEAR(O.OrderDate) Anio, MONTH(O.OrderDate) Mes, O.OrderID FROM orders O\nINNER JOIN orderdetails OD ON OD.OrderID = O.OrderID\nGROUP BY O.CustomerID, O.OrderID, YEAR(O.OrderDate), MONTH(O.OrderDate))\n" +
            "SELECT  OMA.CustomerID, OMA.Anio, OMA.Mes, ROUND(SUM((1-OD.Discount)*OD.Quantity*OD.UnitPrice),2) TotalPagar\n FROM ordenesMA OMA \nINNER JOIN orderdetails OD ON OD.OrderID = OMA.OrderID\nGROUP BY OMA.CustomerID, OMA.Anio, OMA.Mes\nORDER BY OMA.CustomerID" ;
        Statement st;
        DefaultTableModel modelito=new DefaultTableModel() ;
        jt_Orden_Anio.setModel(modelito);
        modelito.addColumn("CustomerID");
        modelito.addColumn("Año");
        modelito.addColumn("Mes");
        modelito.addColumn("Total A Pagar");
        Object[] ob = new Object[4];
        try{
          st = c.connection.createStatement();
          ResultSet resultado = st.executeQuery(query);
          while(resultado.next()){
              ob[0] = resultado.getString(1);
              ob[1] = resultado.getInt(2);
              ob[2] = resultado.getInt(3);
              ob[3] = resultado.getDouble(4);
              modelito.addRow(ob);
          }
          jt_Orden_Anio.setModel(modelito);
          
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
     
     public void Tablacantprodvendidistri() {
        c = new MariaDBConnection();
        String query = "WITH ProductosVendidosAnioSupplier AS\n (select YEAR(O.OrderDate) anyo, S.SupplierID, P.ProductID ,COUNT(P.ProductID) n_Productos\n" +
            "from Products P inner join orderdetails OD on OD.ProductID = P.productID inner join Orders O on O.OrderID = OD.OrderID INNER JOIN suppliers S ON S.SupplierID = P.SupplierID \n group by P.ProductID,YEAR(O.OrderDate))\n" +
            "SELECT PVAS.anyo, S.CompanyName, SUM(PVAS.n_Productos) ProductosVendidos FROM ProductosVendidosAnioSupplier PVAS \n INNER JOIN suppliers S ON S.SupplierID = PVAS.SupplierID \n GROUP BY S.CompanyName, PVAS.anyo";
        Statement st;
        DefaultTableModel modelito=new DefaultTableModel() ;
        jt_Proveedor.setModel(modelito);
        modelito.addColumn("Año");
        modelito.addColumn("CompanyName");
        modelito.addColumn("ProductosVendidos");
        Object[] ob = new Object[3];
        try{
          st = c.connection.createStatement();
          ResultSet resultado = st.executeQuery(query);
          while(resultado.next()){
              ob[0] = resultado.getInt(1);
              ob[1] = resultado.getString(2);
              ob[2] = resultado.getInt(3);
              modelito.addRow(ob);
          }
          jt_Proveedor.setModel(modelito);
          
        }catch (SQLException e){
            e.printStackTrace();
        }
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProd;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEliminarProd;
    private javax.swing.JButton btnEmp;
    private javax.swing.JButton btnModificarProd;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSeleccionarProd;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JCheckBox cbDescontinuado;
    private javax.swing.JComboBox<String> cboShippersProd;
    private javax.swing.JFormattedTextField ftxtPeso;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable jt_Orden_Anio;
    private javax.swing.JTable jt_Proveedor;
    private javax.swing.JTable jt_Reporte_Categoria;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEmp;
    private javax.swing.JLabel lblNice;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JList<String> listClientes;
    private javax.swing.JList<String> listEmps;
    private javax.swing.JList<String> listProds;
    private javax.swing.JList<String> listSuppliers;
    private proyectobd1.MaterialTabbed materialTabbed1;
    private javax.swing.JMenuItem popEditarCant;
    private javax.swing.JMenuItem popEditarDesc;
    private javax.swing.JMenuItem popElim;
    private javax.swing.JPopupMenu popupTabla;
    private javax.swing.JTable tblProds;
    private javax.swing.JTable tblProdsNoDesc;
    private javax.swing.JTable tblProdsOrden;
    private javax.swing.JTextField txtBarco;
    private javax.swing.JTextField txtCantUnit;
    private javax.swing.JTextField txtCateg;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextArea txtDir;
    private javax.swing.JTextField txtEmp;
    private javax.swing.JTextField txtOrderUnits;
    private javax.swing.JTextField txtPais;
    private javax.swing.JFormattedTextField txtPostal;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtProdBuscar;
    private javax.swing.JTextField txtRegion;
    private javax.swing.JTextField txtReorder;
    private javax.swing.JTextField txtStockUnits;
    private javax.swing.JTextField txtSupplier;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
