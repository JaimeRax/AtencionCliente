package Formularios;

import Clases.Conexion;
import Clases.consulta;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author JAIME_06
 */
public class Consulta extends javax.swing.JFrame {

    
    ImagenFondo fondo = new ImagenFondo();
    public Consulta() {
       this.setContentPane(fondo);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/ICONO2.png")).getImage());
        txtNombre.setOpaque(false);
        txtAsesor.setOpaque(false);
        txtTelefono.setOpaque(false);
        txtAsesorTel.setOpaque(false);
        
    }
    
    private int bandera = 0;
    
    //AGREGAR IMAGEN DE FONDO 
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
                    this.setBackground(new Color(181, 181, 181, 181));
                    this.setForeground(new Color(109, 109, 109));
                }
                    return this;
            }
    }
    public void mostrarColor(){
        MiRender col = new MiRender();//instanciamos la clase MiRender
        for(int i =0;i<tblFecha.getColumnCount();i++){//ciclo para recorer todas las filas de la tabla
            tblFecha.getColumnModel().getColumn(i).setCellRenderer(col);//asignamos el color con la clase MiRender
        }
        tblFecha.getTableHeader().setBackground(new Color(109, 109, 109));//Agregamos color al fondo del Encabezado
        tblFecha.getTableHeader().setForeground(new Color(255, 255, 255 ));//Color a la letra del Encabezado
        tblFecha.getTableHeader().setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFecha = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAsesor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAsesorTel = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPedido = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        LblTablaPedidos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        rdbSi = new javax.swing.JRadioButton();
        rdbNo = new javax.swing.JRadioButton();
        rdbSi1 = new javax.swing.JRadioButton();
        rdbNo1 = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnConsultasReportes = new javax.swing.JButton();
        cmbFecha = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        rdbNoRespondio = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        check6 = new javax.swing.JCheckBox();
        check1 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check4 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
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

        jLabel1.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(109, 109, 109));
        jLabel1.setText("consultar registro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        tblFecha.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        tblFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FECHA", "NOMBRE", "APELLIDO", "TELEFONO", "DESCRIPCION", "ASESOR", "APELLIDO", "TELEFONO"
            }
        ));
        tblFecha.setSelectionBackground(new java.awt.Color(255, 255, 0));
        tblFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFechaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblFecha);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 1430, 200));

        jLabel22.setBackground(new java.awt.Color(181, 181, 181));
        jLabel22.setFont(new java.awt.Font("BigNoodleTitling", 0, 40)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(109, 109, 109));
        jLabel22.setText(" cliente");
        jLabel22.setOpaque(true);
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 460, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(109, 109, 109));
        jLabel6.setText("NOMBRE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 280, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(109, 109, 109));
        jLabel10.setText("TELEFONO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 280, -1));

        txtID.setBackground(new java.awt.Color(204, 204, 204));
        txtID.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(null);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 378, 100, -1));

        jSeparator4.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 10, 150));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 40));

        jLabel21.setBackground(new java.awt.Color(181, 181, 181));
        jLabel21.setFont(new java.awt.Font("BigNoodleTitling", 0, 40)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(109, 109, 109));
        jLabel21.setText("asesor");
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 460, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(109, 109, 109));
        jLabel8.setText("NOMBRE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        txtAsesor.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 280, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(109, 109, 109));
        jLabel9.setText("TELEFONO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        txtAsesorTel.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtAsesorTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 280, -1));

        jSeparator5.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 370, 10, 150));

        jLabel19.setBackground(new java.awt.Color(181, 181, 181));
        jLabel19.setFont(new java.awt.Font("BigNoodleTitling", 0, 40)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(109, 109, 109));
        jLabel19.setText("PEDIDO");
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 400, -1));

        txtPedido.setColumns(20);
        txtPedido.setRows(5);
        txtPedido.setOpaque(false);
        jScrollPane2.setViewportView(txtPedido);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 430, 400, 90));

        jLabel20.setBackground(new java.awt.Color(181, 181, 181));
        jLabel20.setFont(new java.awt.Font("BigNoodleTitling", 0, 40)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(109, 109, 109));
        jLabel20.setText("RESPUESTA DEL CLIENTE");
        jLabel20.setOpaque(true);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 460, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(109, 109, 109));
        jLabel16.setText("No.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, -1, -1));

        txtNumero.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.setBorder(null);
        txtNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 80, -1));

        jLabel23.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(109, 109, 109));
        jLabel23.setText("Fecha");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, -1, -1));

        txtFecha.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(null);
        txtFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 120, -1));

        LblTablaPedidos.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        LblTablaPedidos.setForeground(new java.awt.Color(109, 109, 109));
        LblTablaPedidos.setText("TABLA DE PEDIDOS");
        jPanel1.add(LblTablaPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane1.setViewportView(txtComentario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, 900, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(109, 109, 109));
        jLabel17.setText("Atendido");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, -1, -1));

        rdbSi.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        rdbSi.setForeground(new java.awt.Color(109, 109, 109));
        rdbSi.setText("SI");
        rdbSi.setBorder(null);
        rdbSi.setContentAreaFilled(false);
        rdbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSiActionPerformed(evt);
            }
        });
        jPanel1.add(rdbSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 40, 30));

        rdbNo.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        rdbNo.setForeground(new java.awt.Color(109, 109, 109));
        rdbNo.setText("NO");
        rdbNo.setContentAreaFilled(false);
        rdbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNoActionPerformed(evt);
            }
        });
        jPanel1.add(rdbNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 50, 30));

        rdbSi1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        rdbSi1.setForeground(new java.awt.Color(109, 109, 109));
        rdbSi1.setText("SI");
        rdbSi1.setContentAreaFilled(false);
        rdbSi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSi1ActionPerformed(evt);
            }
        });
        jPanel1.add(rdbSi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 620, 40, 30));

        rdbNo1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        rdbNo1.setForeground(new java.awt.Color(109, 109, 109));
        rdbNo1.setText("NO");
        rdbNo1.setContentAreaFilled(false);
        rdbNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNo1ActionPerformed(evt);
            }
        });
        jPanel1.add(rdbNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 620, 50, 30));

        jSeparator3.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 570, 10, 200));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, -1, -1));

        btnConsultasReportes.setBackground(new java.awt.Color(255, 0, 0));
        btnConsultasReportes.setFont(new java.awt.Font("BigNoodleTitling", 1, 24)); // NOI18N
        btnConsultasReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultasReportes.setText("CONSULTAS Y REPORTES");
        btnConsultasReportes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultasReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultasReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 770, 200, 30));

        cmbFecha.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(cmbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, 30));

        jLabel25.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(109, 109, 109));
        jLabel25.setText("COMENTARIO");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, -1, -1));

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
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 50, 50));

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
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(109, 109, 109));
        jLabel18.setText("Buscar Registros");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        rdbNoRespondio.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        rdbNoRespondio.setForeground(new java.awt.Color(109, 109, 109));
        rdbNoRespondio.setText("NO RESPONDIÓ");
        rdbNoRespondio.setContentAreaFilled(false);
        rdbNoRespondio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNoRespondioActionPerformed(evt);
            }
        });
        jPanel1.add(rdbNoRespondio, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, 120, 30));

        jLabel27.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(109, 109, 109));
        jLabel27.setText("Adquirio");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 620, -1, -1));

        check6.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        check6.setText("Cliente No responde");
        check6.setContentAreaFilled(false);
        check6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        check6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check6ActionPerformed(evt);
            }
        });
        jPanel1.add(check6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 720, -1, -1));

        check1.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        check1.setText("Si realizo su Compra");
        check1.setContentAreaFilled(false);
        check1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });
        jPanel1.add(check1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 570, -1, -1));

        check2.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        check2.setText("Cotizando");
        check2.setContentAreaFilled(false);
        check2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check2ActionPerformed(evt);
            }
        });
        jPanel1.add(check2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 600, -1, -1));

        check3.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        check3.setText("Producto no Disponible");
        check3.setContentAreaFilled(false);
        check3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        check3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check3ActionPerformed(evt);
            }
        });
        jPanel1.add(check3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 630, -1, -1));

        check4.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        check4.setText("No le llamo el Asesor");
        check4.setToolTipText("");
        check4.setContentAreaFilled(false);
        check4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        check4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check4ActionPerformed(evt);
            }
        });
        jPanel1.add(check4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 690, -1, -1));

        check5.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        check5.setText("Adquirio en otra Tienda");
        check5.setContentAreaFilled(false);
        check5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        check5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check5ActionPerformed(evt);
            }
        });
        jPanel1.add(check5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 660, -1, -1));

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
        if(txtID.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Selecione un registro de la tabla");
            txtID.grabFocus();
            return;
        }
        if(rdbSi.isSelected() == false && rdbNo.isSelected() == false && rdbNoRespondio.isSelected() == false) 
        {
            JOptionPane.showMessageDialog(rootPane,"Debe selecionar una respuesta si fue ATENDIDO");
            return;
        }
        if(rdbSi.isSelected() == true){
            if(rdbSi1.isSelected() == false && rdbNo1.isSelected() == false ) 
            {
                JOptionPane.showMessageDialog(rootPane,"Debe selecionar si ADQUIRIO");
                return;
            }
        }
        if(check1.isSelected()==false && check2.isSelected()==false && check3.isSelected()==false && check4.isSelected()==false && check5.isSelected()==false && check6.isSelected()==false)
        {
            JOptionPane.showMessageDialog(rootPane,"Debe selecionar si una respuesta");
            return;
        }
        
        Conexion co = new Conexion();   
        consulta cons = new consulta(    txtFecha.getText(),respuestaAtencion(),
                                    respuestaAdquirido(),Respuesta(), 
                                     txtComentario.getText(),txtID.getText());
        
        //obtener id de la tabla y mandarlo al update
        int id = Integer.parseInt(txtID.getText());
        System.out.println(id);
        co.updatePedido(id);
        
        if(!co.insertConsulta(cons))
        {
            JOptionPane.showMessageDialog(rootPane,"No se Registro la Consulta :(");
            co.cerrarConexion();
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Consulta Registrada con Exito :D"); 
        co.cerrarConexion();
        
        rdbSi.setEnabled(false);
        rdbNo.setEnabled(false);
        rdbSi1.setEnabled(false);
        rdbNo1.setEnabled(false);
        rdbNoRespondio.setEnabled(false);
        txtComentario.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        limpiar();
        bloquear();
        llenarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(cmbFecha.getDate() == null)
        {
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar una Fecha");
            cmbFecha.grabFocus();
            return;
        }
        bandera = 1;
        Date  fecha=cmbFecha.getDate();
        DateFormat f=new SimpleDateFormat("yyyy-MM-d");
        String fecha2=f.format(fecha); 
        llenarTablaFecha(fecha2);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String timeStamp = new SimpleDateFormat("yyyy-MM-d").format(Calendar.getInstance().getTime());
        txtFecha.setText(timeStamp);
        btnGuardar.setEnabled(false);
        bandera = 1;
        llenarTabla();
        bloquear();
        //mostrarColor();
        NoPedido();
    }//GEN-LAST:event_formWindowOpened

    private void tblFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFechaMouseClicked
        if(bandera == 1){
            int pos=tblFecha.rowAtPoint(evt.getPoint());
            txtID.setText(String.valueOf(tblFecha.getValueAt(pos, 0)));
            txtNombre.setText(String.valueOf(tblFecha.getValueAt(pos,2))+  tblFecha.getValueAt(pos,3));
            txtTelefono.setText(String.valueOf(tblFecha.getValueAt(pos,4)));
            txtPedido.setText(String.valueOf(tblFecha.getValueAt(pos,5)));
            txtAsesor.setText(String.valueOf(tblFecha.getValueAt(pos,6))+  tblFecha.getValueAt(pos,7));
            txtAsesorTel.setText(String.valueOf(tblFecha.getValueAt(pos,8)));
        }     
    }//GEN-LAST:event_tblFechaMouseClicked

    private void rdbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSiActionPerformed
        if(rdbSi.isSelected())
        {
           rdbNo.setSelected(false);
           rdbNoRespondio.setSelected(false);
           rdbNo1.setEnabled(true);
           rdbSi1.setEnabled(true);    
           
           check2.setSelected(false);
           check3.setSelected(false);
           check5.setSelected(false);
           check1.setSelected(false);
           check4.setSelected(false);
           check4.setSelected(false);
           
           check2.setEnabled(true);
           check3.setEnabled(true);
           check5.setEnabled(true);
           check1.setEnabled(true);
           check4.setEnabled(false);      
           check6.setEnabled(false);
        }
    }//GEN-LAST:event_rdbSiActionPerformed

    private void rdbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNoActionPerformed
        if(rdbNo.isSelected())
        {
           rdbSi.setSelected(false);
           rdbNoRespondio.setSelected(false);
           rdbNo1.setEnabled(false);
           rdbSi1.setEnabled(false);
           rdbNo1.setSelected(false);
           rdbSi1.setSelected(false);
           
           check6.setEnabled(false);
           check2.setEnabled(false);
           check3.setEnabled(false);
           check4.setEnabled(true);
           check5.setEnabled(false);
           check1.setEnabled(false);
           
           check6.setSelected(false);
           check2.setSelected(false);
           check3.setSelected(false);
           check4.setSelected(true);
           check5.setSelected(false);
           check1.setSelected(false);
 
        }
    }//GEN-LAST:event_rdbNoActionPerformed

    private void rdbSi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSi1ActionPerformed
        if(rdbSi1.isSelected())
        {
           rdbNo1.setSelected(false);
           
           check6.setEnabled(false);
           check2.setEnabled(false);
           check3.setEnabled(false);
           check4.setEnabled(false);
           check5.setEnabled(false);
           check1.setEnabled(true);
           
           check6.setSelected(false);
           check2.setSelected(false);
           check3.setSelected(false);
           check4.setSelected(false);
           check5.setSelected(false);
           check1.setSelected(true);
        }
    }//GEN-LAST:event_rdbSi1ActionPerformed

    private void rdbNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNo1ActionPerformed
        if(rdbNo1.isSelected())
        {
           rdbSi1.setSelected(false);
           
           check6.setEnabled(false);
           check2.setEnabled(true);
           check3.setEnabled(true);
           check4.setEnabled(false);
           check5.setEnabled(true);
           check1.setEnabled(false);
           
           check6.setSelected(false);
           check2.setSelected(false);
           check3.setSelected(false);
           check4.setSelected(false);
           check5.setSelected(false);
           check1.setSelected(false);
        }
    }//GEN-LAST:event_rdbNo1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        NoPedido();
        rdbSi.setEnabled(true);
        rdbNo.setEnabled(true);
        rdbSi1.setEnabled(true);
        rdbNo1.setEnabled(true);
        rdbNoRespondio.setEnabled(true);
        txtComentario.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        limpiar(); 
        //llenarTabla();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnConsultasReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasReportesActionPerformed
        ConsultasReportes cr = new ConsultasReportes();
        cr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConsultasReportesActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        llenarTabla();
        bloquear();
        LblTablaPedidos.setText("TABLA DE PEDIDOS");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed

    private void rdbNoRespondioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNoRespondioActionPerformed
        if(rdbNoRespondio.isSelected())
        {
           rdbNo.setSelected(false);
           rdbSi.setSelected(false);
           rdbNo1.setEnabled(false);
           rdbSi1.setEnabled(false);
           rdbNo1.setSelected(false);
           rdbSi1.setSelected(false);
           
           check6.setEnabled(true);
           check2.setEnabled(false);
           check3.setEnabled(false);
           check4.setEnabled(false);
           check5.setEnabled(false);
           check1.setEnabled(false);
           
           check6.setSelected(true);
           check2.setSelected(false);
           check3.setSelected(false);
           check4.setSelected(false);
           check5.setSelected(false);
           check1.setSelected(false);
        }
    }//GEN-LAST:event_rdbNoRespondioActionPerformed

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
       if(check1.isSelected()){
           check2.setSelected(false);
           check3.setSelected(false);
           check4.setSelected(false);
           check5.setSelected(false);
           check6.setSelected(false);  
       }
    }//GEN-LAST:event_check1ActionPerformed

    private void check3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check3ActionPerformed
        if(check3.isSelected()){
           check2.setSelected(false);
           check1.setSelected(false);
           check4.setSelected(false);
           check5.setSelected(false);
           check6.setSelected(false);
       }
    }//GEN-LAST:event_check3ActionPerformed

    private void check4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check4ActionPerformed
        if(check4.isSelected()){
           check2.setSelected(false);
           check3.setSelected(false);
           check1.setSelected(false);
           check5.setSelected(false);
           check6.setSelected(false);
       }
    }//GEN-LAST:event_check4ActionPerformed

    private void check5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check5ActionPerformed
        if(check5.isSelected()){
           check2.setSelected(false);
           check3.setSelected(false);
           check4.setSelected(false);
           check1.setSelected(false);
           check6.setSelected(false);
       }
    }//GEN-LAST:event_check5ActionPerformed

    private void check6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check6ActionPerformed
        if(check6.isSelected()){
           check2.setSelected(false);
           check3.setSelected(false);
           check4.setSelected(false);
           check5.setSelected(false);
           check1.setSelected(false);
       }
    }//GEN-LAST:event_check6ActionPerformed

    private void check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check2ActionPerformed
        if(check2.isSelected()){
            check1.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);
            check5.setSelected(false);
            check6.setSelected(false);
        }
    }//GEN-LAST:event_check2ActionPerformed

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

    private void limpiar(){
        txtComentario.setText("");
        rdbSi.setSelected(false);
        rdbNo.setSelected(false);
        rdbNoRespondio.setSelected(false);
        rdbSi1.setSelected(false);
        rdbNo1.setSelected(false);  
        check1.setSelected(false);
        check2.setSelected(false);
        check3.setSelected(false);
        check4.setSelected(false);
        check5.setSelected(false);
        check6.setSelected(false);
    }
      
    private void bloquear(){
        txtID.setEditable(false);
        txtNombre.setEditable(false);
        txtNombre.setEditable(false);
        txtTelefono.setEditable(false);
        txtPedido.setEditable(false);
        txtAsesor.setEditable(false);
        txtAsesorTel.setEditable(false);
        txtNumero.setEditable(false);
        txtFecha.setEditable(false);
        rdbSi.setEnabled(false);
        rdbNo.setEnabled(false);
        rdbSi1.setEnabled(false);
        rdbNo1.setEnabled(false);
        rdbNoRespondio.setEnabled(false);
        txtComentario.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
        check1.setEnabled(false);
        check2.setEnabled(false);
        check3.setEnabled(false);
        check4.setEnabled(false);
        check5.setEnabled(false);
        check6.setEnabled(false);
        
    }
       
    private DefaultTableModel Tabla;
    
    private void llenarTabla(){
       
        try {
            String titulo[] = {"id","Fecha","Nombre","Apellido","Telefono","Descripcion","Asesor","Apellido","Telefono","Estado"};
            Tabla = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 10){
                       return true;
                    }else{
                       return false;
                    }
                }                
            };
            String registros[] = new String[10];
            Conexion co = new Conexion();
            ResultSet rs = co.mostrarRegistros();
            while(rs.next())
            {
                registros[0] = rs.getString("idPedido");
                registros[1] = rs.getString("Fecha");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Apellido");
                registros[4] = rs.getString("Telefono");
                registros[5] = rs.getString("Descripcion");
                registros[6] = rs.getString("Nom_Asesor");
                registros[7] = rs.getString("Apell_Asesor");
                registros[8] = rs.getString("Tel_Asesor");
                registros[9] = rs.getString("Estado");
                
                Tabla.addRow(registros);
            }
            tblFecha.setModel(Tabla);
            
            TableColumnModel columnModel = tblFecha.getColumnModel();

            columnModel.getColumn(0).setPreferredWidth(5);
            columnModel.getColumn(1).setPreferredWidth(50);
            columnModel.getColumn(2).setPreferredWidth(100);
            columnModel.getColumn(3).setPreferredWidth(100);
            columnModel.getColumn(4).setPreferredWidth(50);
            columnModel.getColumn(5).setPreferredWidth(500);
            columnModel.getColumn(6).setPreferredWidth(100);
            columnModel.getColumn(7).setPreferredWidth(100);
            columnModel.getColumn(8).setPreferredWidth(50);
            columnModel.getColumn(9).setPreferredWidth(50);

           // mostrarColor();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblFecha.getTableHeader().setBackground(new Color(109, 109, 109));//Agregamos color al fondo del Encabezado
        tblFecha.getTableHeader().setForeground(new Color(255, 255, 255 ));//Color a la letra del Encabezado
        tblFecha.getTableHeader().setOpaque(false);
    }
    
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/d");
    
    public String getFecha(JDateChooser jd){
        if(jd.getDate()!=null)
        {
            return formato.format(jd.getDate());
        }
        return null;
    }
   
    private void llenarTablaFecha(String fecha){
        try {
            String titulo[] = {"id","Fecha","Nombre","Apellido","Telefono","Descripcion","Asesor","Apellido","Telefono","Estado"};
            Tabla = new DefaultTableModel(null,titulo){
                
                @Override
                public boolean isCellEditable(int filas, int columnas) {
              
                   if(columnas == 10){
                       return true;
                   }else{
                       return false;
                   }
                }                
            };
            String registros[] = new String[10];
            Conexion co = new Conexion();
            ResultSet rs = co.buscarRegistro(fecha);
            System.out.println(fecha);
            while(rs.next())
            {
                registros[0] = rs.getString("idPedido");
                registros[1] = rs.getString("Fecha");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Apellido");
                registros[4] = rs.getString("Telefono");
                registros[5] = rs.getString("Descripcion");
                registros[6] = rs.getString("Nom_Asesor");
                registros[7] = rs.getString("Apell_Asesor");
                registros[8] = rs.getString("Tel_Asesor");
                registros[9] = rs.getString("Estado");
                Tabla.addRow(registros);
            }
            tblFecha.setModel(Tabla);
            TableColumnModel columnModel = tblFecha.getColumnModel();

            columnModel.getColumn(0).setPreferredWidth(5);
            columnModel.getColumn(1).setPreferredWidth(50);
            columnModel.getColumn(2).setPreferredWidth(100);
            columnModel.getColumn(3).setPreferredWidth(100);
            columnModel.getColumn(4).setPreferredWidth(50);
            columnModel.getColumn(5).setPreferredWidth(500);
            columnModel.getColumn(6).setPreferredWidth(100);
            columnModel.getColumn(7).setPreferredWidth(100);
            columnModel.getColumn(8).setPreferredWidth(50);
            columnModel.getColumn(9).setPreferredWidth(50);
            
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblFecha.getTableHeader().setBackground(new Color(109, 109, 109));//Agregamos color al fondo del Encabezado
        tblFecha.getTableHeader().setForeground(new Color(255, 255, 255 ));//Color a la letra del Encabezado
        tblFecha.getTableHeader().setOpaque(false);
    }
    
    private String Respuesta(){

           if(check1.isSelected()==true){
               String SiActivo = check1.getText();
               return SiActivo;
           }
           if(check2.isSelected()==true){
               String NoActivo = check2.getText();
               return NoActivo;
           }
           if(check3.isSelected()==true){
               String SiActivo = check3.getText();
               return SiActivo;
           }
           if(check4.isSelected()==true){
               String NoActivo = check4.getText();
               return NoActivo;
           }
           if(check5.isSelected()==true){
               String SiActivo = check5.getText();
               return SiActivo;
           }
           if(check6.isSelected()==true){
               String NoActivo = check6.getText();
               return NoActivo;
           }
           return " --- ";
       }
    
    private String respuestaAtencion(){

           if(rdbSi.isSelected()==true){
               String SiActivo = rdbSi.getText();
               return SiActivo;
           }
           if(rdbNo.isSelected()==true){
               String NoActivo = rdbNo.getText();
               return NoActivo;
           }
           if(rdbNoRespondio.isSelected()==true){
               String NoActivo = rdbNoRespondio.getText();
               return NoActivo;
           }
           return " --- ";
       }

    private String respuestaAdquirido(){

            if(rdbSi1.isSelected()==true){
                String SiActivo = rdbSi1.getText();
                return SiActivo;
            }
            if(rdbNo1.isSelected()==true){
                String NoActivo = rdbNo1.getText();
                return NoActivo;
            }
            return " --- ";
       }
    
    private void NoPedido(){
            Conexion co = new Conexion();
            String NoEmp = co.NoConsulta();

            if(NoEmp==null){
                txtNumero.setText("001");
            }
            else{
                int increment = Integer.parseInt(NoEmp);
                increment = increment + 1;
                txtNumero.setText("00"+increment);
            }
            co.cerrarConexion();
       }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTablaPedidos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultasReportes;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JCheckBox check6;
    private com.toedter.calendar.JDateChooser cmbFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JMenuItem mnuCambiarClave;
    private javax.swing.JMenuItem mnuCambiarUsuario;
    private javax.swing.JMenuItem mnuCrearUsuario1;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JRadioButton rdbNo;
    private javax.swing.JRadioButton rdbNo1;
    private javax.swing.JRadioButton rdbNoRespondio;
    private javax.swing.JRadioButton rdbSi;
    private javax.swing.JRadioButton rdbSi1;
    private javax.swing.JTable tblFecha;
    private javax.swing.JTextField txtAsesor;
    private javax.swing.JTextField txtAsesorTel;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtPedido;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
