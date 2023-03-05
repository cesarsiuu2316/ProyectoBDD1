package proyectobd1;

import com.itextpdf.text.BaseColor;
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
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.DecimalFormat;

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
        jLabel1.setBounds(50, 60, 150, 17);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Buscar empleado");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(280, 60, 160, 17);

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
        jLabel5.setBounds(520, 60, 170, 17);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Peso");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(990, 200, 31, 17);

        ftxtPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####.##"))));
        jPanel2.add(ftxtPeso);
        ftxtPeso.setBounds(990, 220, 140, 23);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Nombre del barco");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(990, 60, 111, 17);
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
        jLabel10.setBounds(790, 130, 103, 17);
        jPanel2.add(txtCiudad);
        txtCiudad.setBounds(790, 150, 140, 23);

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Región del envío");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(790, 200, 102, 17);
        jPanel2.add(txtRegion);
        txtRegion.setBounds(790, 220, 140, 23);

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Código postal");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(990, 130, 87, 17);

        txtPostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        jPanel2.add(txtPostal);
        txtPostal.setBounds(990, 150, 140, 23);

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("País de envío");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(790, 60, 82, 17);
        jPanel2.add(txtPais);
        txtPais.setBounds(790, 80, 140, 23);

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

        materialTabbed1.addTab("tab de cesar", jPanel5);

        jPanel1.add(materialTabbed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 1250, 670));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/gradPinkMorado.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1440, 820));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarProdActionPerformed
        if (listProds.getSelectedIndex() >= 0) {
            DefaultTableModel tabla = (DefaultTableModel) tblProdsOrden.getModel();
            DefaultListModel lista = (DefaultListModel) listProds.getModel();
            lista.get(listProds.getSelectedIndex());

            String prod = lista.get(listProds.getSelectedIndex()).toString();
            boolean existe = false;

            for (int i = 0; i < tabla.getRowCount() && !existe; i++) {
                existe = tabla.getValueAt(i, 0).toString().equals(prod);
            }

            if (!existe) {
                double desc = r.nextDouble() * 0.5;
                DecimalFormat df = new DecimalFormat("#.##");
                String descRounded = df.format(desc);
                Object[] fila = {prod, "1", descRounded};
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

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        Document document = new Document();
        try {
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
        } catch (DocumentException E) {
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
            DefaultTableModel modelito = (DefaultTableModel) tblProdsOrden.getModel();
            modelito.removeRow(tblProdsOrden.getSelectedRow());
            tblProdsOrden.setModel(modelito);
        }
    }//GEN-LAST:event_popElimActionPerformed

    private void popEditarCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popEditarCantActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) tblProdsOrden.getModel();
        String cant = JOptionPane.showInputDialog(this, "Ingrese la nueva cantidad");
        try {
            if (Integer.parseInt(cant) >= 1) {
                tabla.setValueAt(cant, tblProdsOrden.getSelectedRow(), 1);
                tblProdsOrden.setModel(tabla);
                return;
            }
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida.", "", 1);
    }//GEN-LAST:event_popEditarCantActionPerformed

    private void tblProdsOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdsOrdenMouseClicked
        if (evt.isMetaDown())
            popupTabla.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_tblProdsOrdenMouseClicked

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        if (txtValid(txtBarco.getText()) && txtValid(txtCiudad.getText())
                && txtValid(txtDir.getText()) && txtValid(txtPais.getText())
                && txtValid(txtPostal.getText()) && txtValid(txtRegion.getText())) {

            // Validar que haya agregado productos, seleccionado un cliente, empleado y agencia
            if (tblProdsOrden.getRowCount() > 0 && txtValid(lblCliente.getText())
                    && txtValid(lblEmp.getText()) && cboShippersProd.getSelectedIndex()>=0) {

                ArrayList<Product> prodsOrden = new ArrayList();
                for (int i = 0; i < tblProdsOrden.getRowCount(); i++) {
                    for (Product p : productos) {
                        if (p.name.equals(tblProdsOrden.getValueAt(i, 0))) {
                            prodsOrden.add(p);
                        }
                    }
                }

                // Generar ID de la orden
//                Collections.sort(orders);
                int idOrden = orders.get(orders.size() - 1).getIdOrden() + 1;
                System.out.println(idOrden);
//                orders.add(new Order())

                // actualizar stock 
                // crear orden
                // crear order detail
            } else {
                JOptionPane.showMessageDialog(this, "Debe agregar al menos un producto a la orden.", "", 1);
            }
        } else
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "", 1);
    }//GEN-LAST:event_btnOrdenarActionPerformed

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
                ex.printStackTrace();
            }
        }
        else
            modelo = crearModelLista("customers", "ContactName", "", false);
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

    private void listEmpsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEmpsMouseReleased
        if (listEmps.getSelectedIndex() >= 0)
            btnEmp.setVisible(true);
    }//GEN-LAST:event_listEmpsMouseReleased

    private void popEditarDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popEditarDescActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) tblProdsOrden.getModel();
        String desc = JOptionPane.showInputDialog(this, "Ingrese el nuevo descuento\n(Decimal entre 0 y 1)");
        try {
            if (Double.parseDouble(desc) > 0 && Double.parseDouble(desc) < 1) {
                tabla.setValueAt(desc, tblProdsOrden.getSelectedRow(), 2);
                tblProdsOrden.setModel(tabla);
                return;
            }
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "Ingrese un descuento válido.", "", 1);
    }//GEN-LAST:event_popEditarDescActionPerformed

    private void btnAgregarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProdMouseClicked
        CrearProductos();
        llenarTablaProds();
    }//GEN-LAST:event_btnAgregarProdMouseClicked

    private void btnEliminarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProdMouseClicked
        selectedRow = tblProds.getSelectedRow();
        if (selectedRow >= 0)
            modificarProds(0);
        else
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto de la tabla para eliminar");
        llenarTablaProds();
    }//GEN-LAST:event_btnEliminarProdMouseClicked

    private void btnModificarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProdMouseClicked
        if (btnModificarProd.getText().equals("Modificar producto")) {
            selectedRow = tblProds.getSelectedRow();
            if (tblProds.getSelectedRow() >= 0) {
                btnModificarProd.setText("Guardar cambios");
                bloquearTxt(false);
                btnAgregarProd.setVisible(false);
                btnEliminarProd.setVisible(false);
                Product prodSelected = productos.get(selectedRow);
                txtProd.setText(prodSelected.getName());
                txtCateg.setText(String.valueOf(prodSelected.getIdCateg()));
                txtUnitPrice.setText(String.valueOf(prodSelected.getUnitPrice()));
                txtStockUnits.setText(String.valueOf(prodSelected.getStock()));
                cbDescontinuado.setSelected(prodSelected.isDiscontinued());
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un producto de la tabla para modificar.");
            }
                
        } else {
            if (txtValid((txtUnitPrice.getText())) && txtValid(txtStockUnits.getText())) {
                btnModificarProd.setText("Modificar producto");
                bloquearTxt(true);
                btnAgregarProd.setVisible(true);
                btnEliminarProd.setVisible(true);
                modificarProds(1);
                txtUnitPrice.setText("");
                txtStockUnits.setText("");
                cbDescontinuado.setSelected(false);
            } else
                JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.");
            selectedRow = -1;
        }
        llenarTablaProds();
    }//GEN-LAST:event_btnModificarProdMouseClicked

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
            }
        }
    }//GEN-LAST:event_materialTabbed1StateChanged

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        lblSupplier.setText(listSuppliers.getSelectedValue());
        lblSupplier.setVisible(true);
        btnSupplier.setVisible(false);
        txtSupplier.setText("");
        listSuppliers.setModel(crearModelLista("suppliers", "ContactName", "", false));
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void listSuppliersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSuppliersMouseReleased
        if (listSuppliers.getSelectedIndex() >= 0)
            btnSupplier.setVisible(true);
    }//GEN-LAST:event_listSuppliersMouseReleased

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
                ex.printStackTrace();
            }
        }
        else
            modelo = crearModelLista("suppliers", "ContactName", "", false);
        listSuppliers.setModel(modelo);
    }//GEN-LAST:event_txtSupplierKeyReleased

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
            ex.printStackTrace();
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
            ex.printStackTrace();
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
            ex.printStackTrace();
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
        empleados = new ArrayList();
        c = new MariaDBConnection();
        Statement st = null;
        ResultSet rs = null;

        // Cargar shippers
        String query = "select * from employees";
        try {
            st = c.connection.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
//                empleados.add(new Employee(rs.getInt("EmployeeID"), rs.getString("LastName"), rs.getString("FirstName"),
//                    rs.getString("Title"), rs.getString("TitleOfCourtesy"), rs.));
            }
            c.connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
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
            ex.printStackTrace();
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
                st = c.connection.createStatement();
                // Actualizar Unit Price
                String query = "UPDATE products SET UnitPrice= " + Double.valueOf(txtUnitPrice.getText()) + " WHERE ProductID= " + prod.getIdProd();
                st.executeQuery(query);
                // Actualizar stock
                String query2 = "UPDATE products SET UnitsInStock= " + Integer.valueOf(txtStockUnits.getText()) + " WHERE ProductID= " + prod.getIdProd();
                st.executeQuery(query2);
                // Actualizar descontinuidad
                String query3 = "UPDATE products SET Discontinued= " + cbDescontinuado.isSelected() + " WHERE ProductID= " + prod.getIdProd();
                st.executeQuery(query3);
                
                c.connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
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
    
     public void generarFactura(){
        Document document = new Document(PageSize.LETTER, 5,5,5,5);
        try{
            String ruta = System.getProperty("user.home");
            try {
                PdfWriter.getInstance(document, new FileOutputStream(ruta + "/Desktop/Reporte.pdf"));
            } catch (FileNotFoundException ex) {
            }
            document.open();    
            
            Paragraph titulo = new Paragraph();
            titulo.add("Factura de Orden");
            titulo.setAlignment(1);
                        document.add(titulo);
            document.add(Chunk.NEWLINE);            
            
            PdfPTable tabla = new PdfPTable(3); // columna
            // TITULO DE TABLA
            PdfPCell cell = new PdfPCell (new Paragraph ("Orden"));
            cell.setColspan (3);
            cell.setHorizontalAlignment (Element.ALIGN_CENTER);
            cell.setBackgroundColor(new BaseColor(116, 144, 198)); 
            cell.setPadding (7.0f);
            tabla.addCell(cell);
            tabla.setSpacingAfter(10);
            
            //BASE COLORS
            BaseColor color1 = new BaseColor(138, 171, 236); 
            BaseColor color2 = new BaseColor(194, 210, 252);
            
            // ORDEN SUBTITULOS TABLA 1
            PdfPCell orden = new PdfPCell (new Paragraph ("OrderID"));
            orden.setBackgroundColor(color1);
            tabla.addCell(orden);
            PdfPCell customerID = new PdfPCell (new Paragraph ("CustomerID"));
            customerID.setBackgroundColor(color1);
            tabla.addCell(customerID);
            PdfPCell employeeID = new PdfPCell (new Paragraph ("EmployeeID"));
            employeeID.setBackgroundColor(color1);            
            tabla.addCell(employeeID);
            
            // ORDEN TABLA 1
            PdfPCell orde = new PdfPCell (new Paragraph ("1"));
            orde.setBackgroundColor(color2);
            tabla.addCell(orde);
            PdfPCell customeID = new PdfPCell (new Paragraph ("2"));
            customeID.setBackgroundColor(color2);
            tabla.addCell(customeID);
            PdfPCell employeID = new PdfPCell (new Paragraph ("3"));
            employeID.setBackgroundColor(color2);            
            tabla.addCell(employeID);
            
            document.add(tabla);
            
            //tabla 2
            PdfPTable tabla2 = new PdfPTable(3); // columna
            tabla2.setSpacingAfter(10);
            
            // TABLA 2
            ArrayList<String> campos = new ArrayList<String>(Arrays.asList("OrderDate", "Required Date", "Ship Via (ID)", "1", "2", "3"));
            PdfPTable table = generarTablaPdf(campos.size()/2, campos, color1, color2); // columna
            document.add(table);
            
            //tabla 3
            PdfPTable tabla3 = new PdfPTable(3); // columna
            tabla3.setSpacingAfter(10);
            
            // ORDEN SUBTITULOS TABLA 2
            campos = new ArrayList<String>(Arrays.asList("Freight", "Ship Name", "Ship Address", "1", "2", "3"));
            table = generarTablaPdf(campos.size()/2, campos, color1, color2); // columna
            document.add(table);
            
            //tabla 4
            campos = new ArrayList<String>(Arrays.asList("Ship City", "Ship Region", "1", "2"));
            table = generarTablaPdf(campos.size()/2, campos, color1, color2); // columna
            document.add(table);
            
            document.close();       
            JOptionPane.showMessageDialog(null, "Reporte Creado.");
        }catch(DocumentException E){
        }
    }
    
    public PdfPTable generarTablaPdf(int nColumnas, ArrayList<String> campos, BaseColor color1, BaseColor color2){
        PdfPTable table = new PdfPTable(nColumnas);
        Phrase frase = new Phrase(campos.get(0));
        PdfPCell celda = new PdfPCell(frase);
        celda.setBackgroundColor(color1);
        table.addCell(celda);
        for(int i = 1; i < (nColumnas*2); i++){
            frase = new Phrase(campos.get(i));
            System.out.println(frase.toString());
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
            ex.printStackTrace();
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
            ex.printStackTrace();
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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProd;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEliminarProd;
    private javax.swing.JButton btnEmp;
    private javax.swing.JButton btnModificarProd;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnReportes;
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
    private javax.swing.JPanel jPanel4;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
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
