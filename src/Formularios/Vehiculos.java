
package Formularios;

import Clases.Cliente;
import Clases.Vehiculo;
import Clases.Conexion;
import Clases.servicios;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAIME_06
 */
public class Vehiculos extends javax.swing.JFrame {

    ImagenFondo fondo = new ImagenFondo();
    
    public Vehiculos() {
        this.setContentPane(fondo);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/ICONO2.png")).getImage());
        txtApellido.setOpaque(false);
        txtTelefono.setOpaque(false);
        txtCodigo.setOpaque(false);
        txtNombre.setOpaque(false);
        txtDireccion.setOpaque(false);
        txtVehiculo1.setOpaque(false);
        txtFechaProxima.setOpaque(false);
        txtBuscarR.setOpaque(false);
    }
   
    private int bandera = 0;
    
    public class ImagenFondo extends JPanel{
        @Override
        public void paint(Graphics g){
            ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/FONDO BLANCO.png"));
            g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
    //AGREGAR COLOR AL ENCABEZADO Y A LAS FILAS
    public boolean evaluarPar(int numero){
     return (numero % 2 == 0);//dividimos las filas en pares e impares
    }
    public class MiRender extends DefaultTableCellRenderer{
        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus, int row, int column){
                super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
                if ( evaluarPar(row) ){//si la fila es impar la pintamos de un color claro
                    this.setBackground(new Color(239, 239, 239,239));//color de la fila
                    this.setForeground(new Color(109, 109, 109));//color de la letra 
                } else{//de lo contrario la fila la pintamos de un color mas oscuro
                    this.setBackground(new Color(204, 204, 204));
                    this.setForeground(new Color(109, 109, 109));
                }
                    return this;
            }
    }
    public void mostrarColor(){
        MiRender col = new MiRender();//instanciamos la clase MiRender
        for(int i =0;i<tbl2.getColumnCount();i++){//ciclo para recorer todas las filas de la tabla
            tbl2.getColumnModel().getColumn(i).setCellRenderer(col);//asignamos el color con la clase MiRender
        }
        tbl2.getTableHeader().setBackground(new Color(109, 109, 109));//Agregamos color al fondo del Encabezado
        tbl2.getTableHeader().setForeground(new Color(255, 255, 255 ));//Color a la letra del Encabezado
        tbl2.getTableHeader().setFont(new Font("Roboto Condensed", Font.BOLD, 14));//Fuente del Encabezado
        tbl2.getTableHeader().setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        txtBuscarR = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        txtFechaProxima = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtVehiculo1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnfechanueva = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnGuardar2 = new javax.swing.JButton();
        btnCancelar2 = new javax.swing.JButton();
        cmbFecha = new com.toedter.calendar.JDateChooser();
        btnServicios = new javax.swing.JButton();
        txtSemanas = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPlaca1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnNuevo1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        mnuCambiarUsuario = new javax.swing.JMenuItem();
        mnuCambiarClave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuCrearUsuario1 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(109, 109, 109));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 50, 50));

        txtBuscarR.setFont(new java.awt.Font("Roboto Condensed", 0, 20)); // NOI18N
        txtBuscarR.setForeground(new java.awt.Color(109, 109, 109));
        txtBuscarR.setText("Buscar Registro");
        txtBuscarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarRMouseClicked(evt);
            }
        });
        txtBuscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarRActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 250, -1));

        jSeparator2.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 100, 10, 640));

        btnBuscar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(109, 109, 109));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 50, 50));

        jLabel1.setBackground(new java.awt.Color(181, 181, 181));
        jLabel1.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(109, 109, 109));
        jLabel1.setText(" ultimos registros");
        jLabel1.setMaximumSize(new java.awt.Dimension(255, 54));
        jLabel1.setMinimumSize(new java.awt.Dimension(255, 54));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 650, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(109, 109, 109));
        jLabel18.setText("DIRECCIÓN");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 280, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(109, 109, 109));
        jLabel17.setText("TELEFONO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 280, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(109, 109, 109));
        jLabel16.setText("APELLIDO");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLabel8.setBackground(new java.awt.Color(181, 181, 181));
        jLabel8.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(109, 109, 109));
        jLabel8.setText(" REGISTRAR VEHÍCULO");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 700, -1));

        txtApellido.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 280, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(109, 109, 109));
        jLabel15.setText("NOMBRE");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 280, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(109, 109, 109));
        jLabel14.setText("CÓDIGO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 280, -1));

        btnEditar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(109, 109, 109));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        btnBorrar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(109, 109, 109));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btnBorrar.setText("ELIMINAR");
        btnBorrar.setBorderPainted(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(109, 109, 109));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        jLabel19.setBackground(new java.awt.Color(181, 181, 181));
        jLabel19.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(109, 109, 109));
        jLabel19.setText(" registrar cliente");
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 650, -1));

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID CLIENTE", "NOMBRE", "APELLIDO", "TELEFONO", "DIRECCION", "MARCA", "PLACA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl2.setColumnSelectionAllowed(true);
        tbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 650, 280));

        txtFechaProxima.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtFechaProxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 400, 130, -1));

        jLabel22.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(109, 109, 109));
        jLabel22.setText("VEHÍCULO ");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, -1, -1));

        txtVehiculo1.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtVehiculo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 290, -1));

        jLabel24.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(109, 109, 109));
        jLabel24.setText("SEMANAS");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 350, -1, -1));

        tbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID CLIENTE", "NOMBRE", "VEHÍCULO", "ULT. SERVICIO", "PROX. SERVICIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, 700, 340));

        btnNuevo.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(109, 109, 109));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnNuevo.setText("AÑADIR");
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        btnfechanueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BOTON.png"))); // NOI18N
        btnfechanueva.setBorderPainted(false);
        btnfechanueva.setContentAreaFilled(false);
        btnfechanueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfechanuevaActionPerformed(evt);
            }
        });
        jPanel1.add(btnfechanueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 400, -1, 30));

        btnAgregar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(109, 109, 109));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, -1, -1));

        btnGuardar2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnGuardar2.setForeground(new java.awt.Color(109, 109, 109));
        btnGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar2.setText("GUARDAR");
        btnGuardar2.setBorderPainted(false);
        btnGuardar2.setContentAreaFilled(false);
        btnGuardar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuardar2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, -1, -1));

        btnCancelar2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnCancelar2.setForeground(new java.awt.Color(109, 109, 109));
        btnCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar2.setText("CANCELAR");
        btnCancelar2.setBorderPainted(false);
        btnCancelar2.setContentAreaFilled(false);
        btnCancelar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, -1, -1));

        cmbFecha.setDateFormatString("yyyy/MM/d");
        jPanel1.add(cmbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, 150, 30));

        btnServicios.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(109, 109, 109));
        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VER.png"))); // NOI18N
        btnServicios.setText("Servicios pendientes");
        btnServicios.setBorderPainted(false);
        btnServicios.setContentAreaFilled(false);
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        jPanel1.add(btnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 340, 220, -1));

        txtSemanas.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jPanel1.add(txtSemanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 350, 50, -1));

        jLabel25.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(109, 109, 109));
        jLabel25.setText("ULT SERVICIO");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, -1, -1));

        txtPlaca1.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtPlaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 220, 170, -1));

        jLabel26.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(109, 109, 109));
        jLabel26.setText("PROX SERVICIO");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 400, -1, -1));

        jLabel27.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(109, 109, 109));
        jLabel27.setText("PLACA");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 220, -1, -1));

        jLabel9.setBackground(new java.awt.Color(181, 181, 181));
        jLabel9.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(109, 109, 109));
        jLabel9.setText(" REGISTRAR SERVICIO VEHíCULAR");
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 700, -1));

        btnNuevo1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnNuevo1.setForeground(new java.awt.Color(109, 109, 109));
        btnNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnNuevo1.setText("AÑADIR");
        btnNuevo1.setBorderPainted(false);
        btnNuevo1.setContentAreaFilled(false);
        btnNuevo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        btnGuardar1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(109, 109, 109));
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar1.setText("GUARDAR");
        btnGuardar1.setBorderPainted(false);
        btnGuardar1.setContentAreaFilled(false);
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(54, 54, 54));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 109, 109)));
        jMenuBar1.setForeground(new java.awt.Color(54, 54, 54));

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio.png"))); // NOI18N
        jMenu4.setText("INICIO");
        jMenu4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Archivo.png"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N

        mnuCambiarUsuario.setBackground(new java.awt.Color(239, 239, 239));
        mnuCambiarUsuario.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        mnuCambiarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CambiarUsuario.png"))); // NOI18N
        mnuCambiarUsuario.setText("Cambiar Usuario");
        mnuCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCambiarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCambiarUsuario);

        mnuCambiarClave.setBackground(new java.awt.Color(239, 239, 239));
        mnuCambiarClave.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        mnuCambiarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CambiarClave.png"))); // NOI18N
        mnuCambiarClave.setText("Cambiar Clave");
        mnuCambiarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCambiarClaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCambiarClave);
        jMenu1.add(jSeparator1);

        mnuSalir.setBackground(new java.awt.Color(239, 239, 239));
        mnuSalir.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1.png"))); // NOI18N
        jMenu3.setText("Herramientas");
        jMenu3.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });

        mnuCrearUsuario1.setBackground(new java.awt.Color(239, 239, 239));
        mnuCrearUsuario1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        mnuCrearUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearUsuario.png"))); // NOI18N
        mnuCrearUsuario1.setText("Crear Usuario");
        mnuCrearUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCrearUsuario1ActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCrearUsuario1);

        jMenuItem1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seguridad-de-datos (1).png"))); // NOI18N
        jMenuItem1.setText("Backup");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ayuda.png"))); // NOI18N
        jMenu2.setText("Ayuda");
        jMenu2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarUsuarioActionPerformed
        Login f1 = new Login();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarUsuarioActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Ayuda f1 = new Ayuda();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Principal f1 = new Principal();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Nombre del Cliente");
            txtNombre.grabFocus();
            return;
        }
        if(txtApellido.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Apellido del Cliente");
            txtApellido.grabFocus();
            return;
        }
        if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Telefono del Cliente");
            txtTelefono.grabFocus();
            return;
        }
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese la Direccion del Cliente");
            txtDireccion.grabFocus();
            return;
        }
        
        Conexion co = new Conexion();       
        Cliente miCliente = new Cliente(
            txtNombre.getText(),
            txtApellido.getText(),
            txtTelefono.getText(),        
            txtDireccion.getText());
          
        if(bandera == 1){
        if(!co.insertCliente(miCliente))
        {
            JOptionPane.showMessageDialog(rootPane,"No se Registro el Cliente :(");
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Cliente Agregado Correctamente :D");
        }
        if(bandera == 2){
        int id = Integer.parseInt(txtCodigo.getText());
        if(!co.updateCliente(miCliente,id))
        {
            JOptionPane.showMessageDialog(rootPane,"No se Actualizo el Cliente :(");
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Cliente Actualizado Correctamente :D");
        }
        llenarTabla();
        co.cerrarConexion();
        limpiar();        
        bloquear();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(txtCodigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese el ID del Cliente");
            txtCodigo.setEnabled(true);
            txtCodigo.grabFocus();
            return;
        }
        int res = JOptionPane.showConfirmDialog(rootPane,"Esta seguro de eliminar al Cliente?");
        if(res != 0)
        {
            return;
        }
       
        Conexion co = new Conexion();
        Cliente cli = co.getCliente(txtCodigo.getText());
        
        if(cli == null)
        {
            JOptionPane.showMessageDialog(rootPane, "Cliente no Existe");
            txtCodigo.setText("");
            txtCodigo.grabFocus();
            co.cerrarConexion();
            return;
        }
        int id = Integer.parseInt(txtCodigo.getText());
        if(co.deleteUpdateCliente(id))
        {
            JOptionPane.showMessageDialog(rootPane,"Cliente Eliminado Correctectamente");          
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"ERROR Cliente NO eliminado");         
        }
        limpiar();
        llenarTabla();
        co.cerrarConexion(); 
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        bloquear();
        NoCliente();
        NoVehiculo();
        bandera = 1;
        llenarTabla();
        llenarTablaServicios();
        mostrarColor();     
        btnfechanueva.setEnabled(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombre = txtBuscarR.getText();
       if(nombre.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Nombre del Cliente");
            txtBuscarR.grabFocus();
            return;
        }
        llenarTablaNombre(nombre);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        llenarTabla();
        bloquear();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarRActionPerformed
    }//GEN-LAST:event_txtBuscarRActionPerformed

    private void txtBuscarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarRMouseClicked
       txtBuscarR.setText("");
    }//GEN-LAST:event_txtBuscarRMouseClicked

    private void tbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl2MouseClicked
         int pos=tbl2.rowAtPoint(evt.getPoint());
        txtCodigo.setText(String.valueOf(tbl2.getValueAt(pos,0)));
        txtNombre.setText(String.valueOf(tbl2.getValueAt(pos,1)));
        txtApellido.setText(String.valueOf(tbl2.getValueAt(pos,2)));
        txtTelefono.setText(String.valueOf(tbl2.getValueAt(pos,3)));
        txtDireccion.setText(String.valueOf(tbl2.getValueAt(pos,4)));
        txtVehiculo1.setText(String.valueOf(tbl2.getValueAt(pos,5)));
        txtPlaca1.setText(String.valueOf(tbl2.getValueAt(pos,6)));
        
    }//GEN-LAST:event_tbl2MouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        bandera = 2;
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnNuevo1.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnGuardar2.setEnabled(false);
        btnCancelar2.setEnabled(false);
        btnServicios.setEnabled(false);
        btnfechanueva.setEnabled(false);
        btnGuardar1.setEnabled(false);
        
        if(txtVehiculo1.getText().equals("null")){
            txtVehiculo1.setText("");          
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed

    private void tbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl3MouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        bandera = 1;
        NoCliente();
        limpiar();
        txtNombre.grabFocus();
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnNuevo1.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnGuardar2.setEnabled(false);
        btnGuardar1.setEnabled(false);
        btnCancelar2.setEnabled(false);
        btnServicios.setEnabled(false);
        btnfechanueva.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnfechanuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfechanuevaActionPerformed
        if(txtSemanas.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar un Numero de Semanas");
            txtSemanas.grabFocus();
            return;
        }
        if(!txtSemanas.getText().matches("[0-9]*")){
            JOptionPane.showMessageDialog(rootPane,"Solo se aceptan datos Numericos");
            return;
        }
        btnGuardar2.setEnabled(true);
        Date fecha = cmbFecha.getDate();
        DateFormat f=new SimpleDateFormat("yyyy-MM-d");
        String fecha2=f.format(fecha);
        String dias = txtSemanas.getText();
        int cantidad = Integer.parseInt(dias) * 7;
        txtFechaProxima.setText(sumarDiasAFecha(fecha2,cantidad));
        
    }//GEN-LAST:event_btnfechanuevaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        bandera = 2;
        
        if(txtVehiculo1.getText().equals("null")){
            txtVehiculo1.setText("");
        }
        btnNuevo.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnBuscar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnGuardar2.setEnabled(false);
        btnCancelar2.setEnabled(true);
        btnServicios.setEnabled(false);
        btnfechanueva.setEnabled(true);
        txtVehiculo1.setEnabled(false);
        txtPlaca1.setEnabled(false);
       
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed

        if(txtPlaca1.getText().equals("null")||txtPlaca1.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"seleccione un Vehiculo");
            return;
        }   
        Date fecha = cmbFecha.getDate();
        DateFormat f=new SimpleDateFormat("yyyy-MM-d");
        String fecha2=f.format(fecha);
       
        Conexion co = new Conexion();       
        servicios miCliente = new servicios(
             fecha2,
             txtFechaProxima.getText(),
             Integer.parseInt(txtCodigo.getText()),
             Integer.parseInt(co.idVehiculo(txtPlaca1.getText())));
          

        if(!co.insertServicio(miCliente))
        {
            JOptionPane.showMessageDialog(rootPane,"No se Registro el Servicio :(");
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Servicio Agregado Correctamente :D");
        
        bloquear();
        llenarTablaServicios();
        btnGuardar2.setEnabled(false);
        btnAgregar.setEnabled(true);
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        bloquear();
        limpiar();
        btnAgregar.setEnabled(true);
        llenarTablaServicios();
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        if(cmbFecha.getDate() == null)
        {
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar una fecha ");
            return;
        }
       // cmbFecha.setEnabled(true);
        Date fecha = cmbFecha.getDate();
        DateFormat f = new SimpleDateFormat("yyyy-MM-d");
        String fecha2 = f.format(fecha);
        llenarTablaServicioProximo(fecha2);
        btnCancelar2.setEnabled(true);
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed
        txtVehiculo1.setEnabled(true);
        txtPlaca1.setEnabled(true);
        btnNuevo1.setEnabled(false);
        btnGuardar1.setEnabled(true);
        btnGuardar2.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnCancelar2.setEnabled(false);
        btnServicios.setEnabled(false);
        txtVehiculo1.setText("");
        txtPlaca1.setText("");
        txtVehiculo1.grabFocus();
        //NoVehiculo();
    }//GEN-LAST:event_btnNuevo1ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Seleccione al Cliente");
            return;
        }
        if(txtVehiculo1.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese la Marca del vehiculo");
            txtVehiculo1.grabFocus();
            return;
        }
        if(txtPlaca1.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese el No. de Placa");
            txtPlaca1.grabFocus();
            return;
        }
        
        Conexion co = new Conexion();       
        Vehiculo miCliente = new Vehiculo(
            txtVehiculo1.getText(),
            txtPlaca1.getText(),
            Integer.parseInt(txtCodigo.getText()));

          
        if(bandera == 1){
        if(!co.insertVehiculo(miCliente))
        {
            JOptionPane.showMessageDialog(rootPane,"No se Registro el Vehiculo :(");
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Vehiculo Agregado Correctamente :D");
        }
        bloquear();
        llenarTabla();
        txtVehiculo1.setEnabled(false);
        txtPlaca1.setEnabled(false);
        btnNuevo1.setEnabled(true);
        btnGuardar1.setEnabled(false);
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void mnuCrearUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearUsuario1ActionPerformed
        Login user = new Login();
        String us = user.getNombreLogin();
        Conexion co = new Conexion();
        String tipo = co.TipoUser(us);

        if(tipo.equals("Usuario")){
            JOptionPane.showMessageDialog(rootPane,"Acceso Denegado");
            return;
        }else{
            Usuario f1 = new Usuario();
            f1.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_mnuCrearUsuario1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Login user = new Login();
        String us = user.getNombreLogin();
        Conexion co = new Conexion();
        String tipo = co.TipoUser(us);

        if(tipo.equals("Usuario")){
            JOptionPane.showMessageDialog(rootPane,"Acceso Denegado");
            return;
        }else{
            Herramientas f1 = new Herramientas();
            f1.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked

    }//GEN-LAST:event_jMenu3MouseClicked


       
    private void NoCliente(){
        Conexion co = new Conexion();
        String NoEmp = co.NoCliente();
        if(NoEmp==null){
            txtCodigo.setText("0001");
        }
        else{
            int increment = Integer.parseInt(NoEmp);
            increment = increment + 1;
            txtCodigo.setText("000"+increment);
        }
    }
    
    private void NoVehiculo(){
        Conexion co = new Conexion();
        String NoEmp = co.NoCliente();
        if(NoEmp==null){
            txtCodigo.setText("0001");
        }
        else{
            int increment = Integer.parseInt(NoEmp);
            increment = increment + 1;
            txtCodigo.setText("000"+increment);
        }
    }
    
    private void limpiar(){           
            txtNombre.setText("");
            txtApellido.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            txtVehiculo1.setText("");
            txtPlaca1.setText("");
            ((JTextField)cmbFecha.getDateEditor().getUiComponent()).setText("");
            txtFechaProxima.setText("");
            txtNombre.grabFocus();
    }
    
    private void bloquear(){
            txtCodigo.setEnabled(false);
            txtNombre.setEnabled(false);
            txtApellido.setEnabled(false);
            txtTelefono.setEnabled(false);
            txtDireccion.setEnabled(false);
            txtVehiculo1.setEnabled(false);
            txtPlaca1.setEnabled(false);
            txtFechaProxima.setEnabled(false);
            btnAgregar.setEnabled(true);
            btnNuevo.setEnabled(true);
            btnNuevo1.setEnabled(true);
            btnEditar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnBorrar.setEnabled(true);  
            btnBuscar.setEnabled(true);
            btnfechanueva.setEnabled(false);
            btnGuardar.setEnabled(false);
            btnGuardar1.setEnabled(false);
            btnGuardar2.setEnabled(false);
            btnCancelar2.setEnabled(false);
            btnServicios.setEnabled(true);
            
    }

    public static String sumarDiasAFecha(String fecha, int dias) {  
        if(dias == 0){
        return fecha;
        }
        String[] f = fecha.split("-");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(f[0]), Integer.parseInt(f[1])-1, Integer.parseInt(f[2]));
        calendar.add(Calendar.DAY_OF_MONTH, dias);
        SimpleDateFormat fe = new SimpleDateFormat("yyyy-MM-d");
        return fe.format(calendar.getTime());
    }
    
    private DefaultTableModel Tabla2;
    
    private void llenarTablaServicios(){
        try {
            String titulo[] = {"Id Cliente","Nombre","Vehiculo","Placa","Ultimo Servicio","Proximo Servicio"};
            Tabla2 = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 6){
                       return true;
                   }else{
                       return false;
                   }
                }                
            };
            String registros[] = new String[6];
            Conexion co = new Conexion();
            ResultSet rs = co.mostrarServicios();
            while(rs.next())
            {
                registros[0] = rs.getString("ID");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Marca");
                registros[3] = rs.getString("Placa");
                registros[4] = rs.getString("Ult_Servicio");
                registros[5] = rs.getString("Prox_Servicio");
               
                Tabla2.addRow(registros);
               
            }
            tbl3.setModel(Tabla2);
             mostrarColor();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void llenarTablaServicioProximo(String fecha){
        try {
            String titulo[] = {"Id Cliente","Nombre","Vehiculo","Placa","Ultimo Servicio","Proximo Servicio"};
            Tabla2 = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 6){
                       return true;
                   }else{
                       return false;
                   }
                }                
            };
            String registros[] = new String[6];
            Conexion co = new Conexion();
            ResultSet rs = co.buscarServicio(fecha);
            while(rs.next())
            {
                registros[0] = rs.getString("ID");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Marca");
                registros[3] = rs.getString("Placa");
                registros[4] = rs.getString("Ult_Servicio");
                registros[5] = rs.getString("Prox_Servicio");
               
                Tabla2.addRow(registros);
            }
            tbl3.setModel(Tabla2);
            mostrarColor();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private DefaultTableModel Tabla;

    
  
    private void llenarTabla(){
        try {
            String titulo[] = {"id","Nombre","Apellido","Telefono","Direccion","Vehículo ","Placa"};
            Tabla = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 7){
                       return true;
                   }else{
                       return false;
                   }
                }                
            };
            String registros[] = new String[7];
            Conexion co = new Conexion();
            ResultSet rs = co.getClienteVehiculo();
            while(rs.next())
            {
                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Telefono");
                registros[4] = rs.getString("Direccion");
                registros[5] = rs.getString("Marca");
                registros[6] = rs.getString("Placa");

                Tabla.addRow(registros);
            }
            tbl2.setModel(Tabla);
             mostrarColor();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    private void llenarTablaNombre(String nombre){
        try {       
            String titulo[] = {"id","Nombre","Apellido","Telefono","Direccion","Marca","Placa"};
            Tabla = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                   if(columnas == 11){
                       return true;
                   }else{
                       return false;
                   }
                }                
            };
            String registros[] = new String[11];
            Conexion co = new Conexion();
            ResultSet rs = co.buscarCliNom(nombre);
            while(rs.next())
            {
                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Telefono");
                registros[4] = rs.getString("Direccion");
                registros[5] = rs.getString("Marca");
                registros[6] = rs.getString("Placa");
                Tabla.addRow(registros);
            }
            tbl2.setModel(Tabla);
             mostrarColor();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton btnfechanueva;
    private com.toedter.calendar.JDateChooser cmbFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem mnuCambiarClave;
    private javax.swing.JMenuItem mnuCambiarUsuario;
    private javax.swing.JMenuItem mnuCrearUsuario1;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JTable tbl2;
    private javax.swing.JTable tbl3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarR;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaProxima;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca1;
    private javax.swing.JTextField txtSemanas;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtVehiculo1;
    // End of variables declaration//GEN-END:variables
}
