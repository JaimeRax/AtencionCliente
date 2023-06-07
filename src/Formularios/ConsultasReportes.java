package Formularios;

import Clases.Conexion;
import Clases.consulta;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.orsonpdf.PDFDocument;
import com.orsonpdf.PDFGraphics2D;
import com.orsonpdf.Page;
import com.toedter.calendar.JDateChooser;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import jnafilechooser.api.JnaFileChooser;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.HorizontalAlignment;


/**
 *
 * @author JAIME_06
 */
public class ConsultasReportes extends javax.swing.JFrame {

    
    ImagenFondo fondo = new ImagenFondo();
    public ConsultasReportes() {
       this.setContentPane(fondo);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/ICONO2.png")).getImage());
        txtNombre.setOpaque(false);
        txtAsesor.setOpaque(false);
        txtTelefono.setOpaque(false);
        txtAsesorTel.setOpaque(false); 
    }
    
    private int bandera = 0;
    public static int rsp1 = 0,rsp2 = 0,rsp3 = 0,rsp4 = 0,rsp5 = 0,rsp6 = 0,total = 0;
    public static double por1 = 0,por2 = 0,por3 = 0,por4 = 0,por5 = 0,por6 = 0;
    public String ruta;
    
    
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

        jDialog1 = new javax.swing.JDialog();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        cmbFecha2 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        cmbFecha1 = new com.toedter.calendar.JDateChooser();
        check1 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
        check4 = new javax.swing.JCheckBox();
        check6 = new javax.swing.JCheckBox();
        rdbSi = new javax.swing.JRadioButton();
        rdbNo = new javax.swing.JRadioButton();
        rdbNoRespondio = new javax.swing.JRadioButton();
        rdbSi1 = new javax.swing.JRadioButton();
        rdbNo1 = new javax.swing.JRadioButton();
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

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "FECHA", "CLIENTE", "PEDIDO", "ASESOR", "FUE ATENDIDO", "ADQUIRIO", "RESP. FINAL", "COMENTARIO"
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

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane1.setViewportView(txtComentario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, 900, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(109, 109, 109));
        jLabel17.setText("Atendido");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, -1, -1));

        jLabel24.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(109, 109, 109));
        jLabel24.setText("AL");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 570, 10, 180));

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

        btnConsultas.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnConsultas.setForeground(new java.awt.Color(109, 109, 109));
        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VER.png"))); // NOI18N
        btnConsultas.setBorderPainted(false);
        btnConsultas.setContentAreaFilled(false);
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 10.png"))); // NOI18N
        btnPDF.setBorderPainted(false);
        btnPDF.setContentAreaFilled(false);
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });
        jPanel1.add(btnPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 770, -1, -1));

        jLabel25.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(109, 109, 109));
        jLabel25.setText("COMENTARIO");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, -1, -1));

        btnNuevo.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(109, 109, 109));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        btnNuevo.setText("EDITAR");
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

        cmbFecha2.setDateFormatString("yyyy-MM-d");
        cmbFecha2.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(cmbFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 140, 30));

        jLabel26.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(109, 109, 109));
        jLabel26.setText("Adquirio");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 620, -1, -1));

        cmbFecha1.setDateFormatString("yyyy-MM-d");
        cmbFecha1.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(cmbFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 140, 30));

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
        consulta cons = new consulta( txtFecha.getText(),respuestaAtencion(),
                                    respuestaAdquirido(),Respuesta(),
                                     txtComentario.getText(),txtID.getText());
        int id = Integer.parseInt(txtNumero.getText());
        if(!co.updateConsulta(cons,id))
        {
            JOptionPane.showMessageDialog(rootPane,"No se Registro la Consulta :(");
            co.cerrarConexion();
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Consulta Registrada con Exito :D"); 
        co.cerrarConexion();
        llenarTabla();
        bloquear();
        rdbSi.setEnabled(false);
        rdbNo.setEnabled(false);
        rdbSi1.setEnabled(false);
        rdbNo1.setEnabled(false);
        rdbNoRespondio.setEnabled(false);
        txtComentario.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        if(cmbFecha1.getDate() == null)
        {   
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar una fecha ");
            return;
        }
        if(cmbFecha2.getDate() == null)
        {   
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar una fecha ");
            return;
        }
        bandera=2;
       
        Date fecha = cmbFecha1.getDate();
        DateFormat f=new SimpleDateFormat("yyyy-MM-d");
        String fecha2=f.format(fecha);
        
        Date fecha3 = cmbFecha2.getDate();
        DateFormat f2=new SimpleDateFormat("yyyy-MM-d");
        String fecha4=f2.format(fecha3);
       
        LLENARPDF(fecha2,fecha4);  
        btnPDF.setEnabled(true);
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        btnGuardar.setEnabled(false);
        bandera = 1;
        llenarTabla();
        bloquear();
    }//GEN-LAST:event_formWindowOpened

    private void tblFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFechaMouseClicked
        if(bandera ==1){
            int pos=tblFecha.rowAtPoint(evt.getPoint());
            txtNumero.setText(String.valueOf(tblFecha.getValueAt(pos, 0)));
            txtFecha.setText(String.valueOf(tblFecha.getValueAt(pos, 1)));
            txtNombre.setText(String.valueOf(tblFecha.getValueAt(pos,2))+ " " + tblFecha.getValueAt(pos,3));
            txtTelefono.setText(String.valueOf(tblFecha.getValueAt(pos, 4)));
            txtID.setText(String.valueOf(tblFecha.getValueAt(pos, 5)));
            txtPedido.setText(String.valueOf(tblFecha.getValueAt(pos,6)));
            txtAsesor.setText(String.valueOf(tblFecha.getValueAt(pos,7))+ " " + tblFecha.getValueAt(pos,8));
            txtAsesorTel.setText(String.valueOf(tblFecha.getValueAt(pos, 9)));
            String Atendido = String.valueOf(tblFecha.getValueAt(pos, 10));
            String Adquirio = String.valueOf(tblFecha.getValueAt(pos, 11));
            String resp = String.valueOf(tblFecha.getValueAt(pos, 12));
            
            if(rdbSi.getText().equals(Atendido)){
                rdbSi.setSelected(true);
                rdbNo.setSelected(false);
                rdbNoRespondio.setSelected(false);
            }
            if(rdbNo.getText().equals(Atendido)){
                rdbSi.setSelected(false);
                rdbNo.setSelected(true);
                rdbNoRespondio.setSelected(false);
                rdbSi1.setSelected(false);
                rdbNo1.setSelected(false);
            }
            if(rdbNoRespondio.getText().equals(Atendido)){
                rdbSi.setSelected(false);
                rdbNo.setSelected(false);
                rdbNoRespondio.setSelected(true);
                rdbSi1.setSelected(false);
                rdbNo1.setSelected(false);
            }
            if(rdbSi1.getText().equals(Adquirio)){
                rdbSi1.setSelected(true);
                rdbNo1.setSelected(false);
            }
            if(rdbNo1.getText().equals(Adquirio)){
                rdbSi1.setSelected(false);
                rdbNo1.setSelected(true);
            }
            if(check1.getText().equals(resp)){
                check1.setSelected(true);
                check2.setSelected(false);
                check3.setSelected(false);
                check4.setSelected(false);
                check5.setSelected(false);
                check6.setSelected(false);
            }
            if(check2.getText().equals(resp)){
                check1.setSelected(false);
                check2.setSelected(true);
                check3.setSelected(false);
                check4.setSelected(false);
                check5.setSelected(false);
                check6.setSelected(false);
            }
            if(check3.getText().equals(resp)){
                check1.setSelected(false);
                check2.setSelected(false);
                check3.setSelected(true);
                check4.setSelected(false);
                check5.setSelected(false);
                check6.setSelected(false);
            }
            if(check4.getText().equals(resp)){
                check1.setSelected(false);
                check2.setSelected(false);
                check3.setSelected(false);
                check4.setSelected(true);
                check5.setSelected(false);
                check6.setSelected(false);
            }
            if(check5.getText().equals(resp)){
                check1.setSelected(false);
                check2.setSelected(false);
                check3.setSelected(false);
                check4.setSelected(false);
                check5.setSelected(true);
                check6.setSelected(false);
            }
            if(check6.getText().equals(resp)){
                check1.setSelected(false);
                check2.setSelected(false);
                check3.setSelected(false);
                check4.setSelected(false);
                check5.setSelected(false);
                check6.setSelected(true);
            }

            txtComentario.setText(String.valueOf(tblFecha.getValueAt(pos,13)));
        }
        if(bandera == 2){
            int pos=tblFecha.rowAtPoint(evt.getPoint());
            txtNumero.setText(String.valueOf(tblFecha.getValueAt(pos, 0)));
            txtFecha.setText(String.valueOf(tblFecha.getValueAt(pos, 1)));
            txtNombre.setText(String.valueOf(tblFecha.getValueAt(pos,2))+ " " + tblFecha.getValueAt(pos,3));
            txtTelefono.setText(String.valueOf(tblFecha.getValueAt(pos, 4)));
            txtID.setText(String.valueOf(tblFecha.getValueAt(pos, 5)));
            txtPedido.setText(String.valueOf(tblFecha.getValueAt(pos,6)));
            txtAsesor.setText(String.valueOf(tblFecha.getValueAt(pos,7))+ " " + tblFecha.getValueAt(pos,8));
            txtAsesorTel.setText(String.valueOf(tblFecha.getValueAt(pos, 9)));
            String Atendido = String.valueOf(tblFecha.getValueAt(pos, 10));
            String Adquirio = String.valueOf(tblFecha.getValueAt(pos, 11));
            String resp = String.valueOf(tblFecha.getValueAt(pos, 12));
            
            if(rdbSi.getText().equals(Atendido)){
                rdbSi.setSelected(true);
                rdbNo.setSelected(false);
                rdbNoRespondio.setSelected(false);
            }
            if(rdbNo.getText().equals(Atendido)){
                rdbSi.setSelected(false);
                rdbNo.setSelected(true);
                rdbNoRespondio.setSelected(false);
                rdbSi1.setSelected(false);
                rdbNo1.setSelected(false);
            }
            if(rdbNoRespondio.getText().equals(Atendido)){
                rdbSi.setSelected(false);
                rdbNo.setSelected(false);
                rdbNoRespondio.setSelected(true);
                rdbSi1.setSelected(false);
                rdbNo1.setSelected(false);
            }
            if(rdbSi1.getText().equals(Adquirio)){
                rdbSi1.setSelected(true);
                rdbNo1.setSelected(false);
            }
            if(rdbNo1.getText().equals(Adquirio)){
                rdbSi1.setSelected(false);
                rdbNo1.setSelected(true);
            }
            if(check1.getText().equals(resp)){
                check1.setSelected(true);
                check2.setSelected(false);
                check3.setSelected(false);
                check4.setSelected(false);
                check5.setSelected(false);
                check6.setSelected(false);
            }
            if(check2.getText().equals(resp)){
                check1.setSelected(false);
                check2.setSelected(true);
                check3.setSelected(false);
                check4.setSelected(false);
                check5.setSelected(false);
                check6.setSelected(false);
            }
            if(check3.getText().equals(resp)){
                check1.setSelected(false);
                check2.setSelected(false);
                check3.setSelected(true);
                check4.setSelected(false);
                check5.setSelected(false);
                check6.setSelected(false);
            }
            if(check4.getText().equals(resp)){
                check1.setSelected(false);
                check2.setSelected(false);
                check3.setSelected(false);
                check4.setSelected(true);
                check5.setSelected(false);
                check6.setSelected(false);
            }
            if(check5.getText().equals(resp)){
                check1.setSelected(false);
                check2.setSelected(false);
                check3.setSelected(false);
                check4.setSelected(false);
                check5.setSelected(true);
                check6.setSelected(false);
            }
            if(check6.getText().equals(resp)){
                check1.setSelected(false);
                check2.setSelected(false);
                check3.setSelected(false);
                check4.setSelected(false);
                check5.setSelected(false);
                check6.setSelected(true);
            }

            txtComentario.setText(String.valueOf(tblFecha.getValueAt(pos,13)));
        }
            
    }//GEN-LAST:event_tblFechaMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
//        bandera = 2;
        rdbSi.setEnabled(true);
        rdbNo.setEnabled(true);
        rdbSi1.setEnabled(true);
        rdbNo1.setEnabled(true);
        rdbNoRespondio.setEnabled(true);
        txtComentario.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        check1.setEnabled(true);
        check2.setEnabled(true);
        check3.setEnabled(true);
        check4.setEnabled(true);
        check5.setEnabled(true);
        check6.setEnabled(true);
        btnPDF.setEnabled(false);
       

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        
        if(cmbFecha1.getDate() == null )
        {
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar una Fecha");
            cmbFecha1.grabFocus();
            return;
        }
        if( cmbFecha2.getDate() == null)
        {
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar una Fecha");
            cmbFecha2.grabFocus();
            return;
        }
        
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showSaveDialog(this);
        if(action){
            ruta = String.valueOf(ch.getSelectedFile());
        }else{
            return;
        }
            
        PDF();
        grafico();
        JOptionPane.showMessageDialog(rootPane,"Archivo PDF guardado con Exito");
        btnPDF.setEnabled(true);
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        llenarTabla();
        bloquear();
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
        if(check1.isSelected()){
            check2.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);
            check5.setSelected(false);
            check6.setSelected(false);
        }
    }//GEN-LAST:event_check1ActionPerformed

    private void check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check2ActionPerformed
        if(check2.isSelected()){
            check1.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);
            check5.setSelected(false);
            check6.setSelected(false);
        }
    }//GEN-LAST:event_check2ActionPerformed

    private void check3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check3ActionPerformed
        if(check3.isSelected()){
            check2.setSelected(false);
            check1.setSelected(false);
            check4.setSelected(false);
            check5.setSelected(false);
            check6.setSelected(false);
        }
    }//GEN-LAST:event_check3ActionPerformed

    private void check5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check5ActionPerformed
        if(check5.isSelected()){
            check2.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);
            check1.setSelected(false);
            check6.setSelected(false);
        }
    }//GEN-LAST:event_check5ActionPerformed

    private void check4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check4ActionPerformed
        if(check4.isSelected()){
            check2.setSelected(false);
            check3.setSelected(false);
            check1.setSelected(false);
            check5.setSelected(false);
            check6.setSelected(false);
        }
    }//GEN-LAST:event_check4ActionPerformed

    private void check6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check6ActionPerformed
        if(check6.isSelected()){
            check2.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);
            check5.setSelected(false);
            check1.setSelected(false);
        }
    }//GEN-LAST:event_check6ActionPerformed

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
        btnPDF.setEnabled(true);
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
            String titulo[] = {"Id","Fecha","Nombre","Apellido","Telefono","IdPedido","Pedido","Asesor","Apellido","Telefono","Fue Atendido","Adquirio","Resp. Final","Comentario"};
            Tabla = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 14){
                       return true;
                    }else{
                       return false;
                    }
                }                
            };
            String registros[] = new String[14];
            Conexion co = new Conexion();
            ResultSet rs = co.mostrarConsultas();
            while(rs.next())
            {   
                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Fecha");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Apellido");
                registros[4] = rs.getString("Telefono");
                registros[5] = rs.getString("Id_Pedido");
                registros[6] = rs.getString("Pedido");
                registros[7] = rs.getString("Asesor");
                registros[8] = rs.getString("Apell_Asesor");
                registros[9] = rs.getString("Tel_Asesor");
                registros[10] = rs.getString("FueAtendido");
                registros[11] = rs.getString("Adquirio");
                registros[12] = rs.getString("Respuesta_Final");
                registros[13] = rs.getString("Comentario");
                Tabla.addRow(registros);
            }
            tblFecha.setModel(Tabla);
            //mostrarColor();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasReportes.class.getName()).log(Level.SEVERE, null, ex);
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
    
    private void LLENARPDF(String fecha,String fecha2){
        try {
            String titulo[] = {"Id","Fecha","Nombre","Apellido","Telefono","IdPedido","Pedido","Asesor","Apellido","Telefono","Fue Atendido","Adquirio","Resp. Final","Comentario"};
            Tabla = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 14){
                       return true;
                    }else{
                       return false;
                    }
                }                
            };
            String registros[] = new String[14];
            Conexion co = new Conexion();
            ResultSet rs = co.generarPDF2(fecha,fecha2);
            while(rs.next())
            {
                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Fecha");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Apellido");
                registros[4] = rs.getString("Telefono");
                registros[5] = rs.getString("Id_Pedido");
                registros[6] = rs.getString("Pedido");
                registros[7] = rs.getString("Asesor");
                registros[8] = rs.getString("Apell_Asesor");
                registros[9] = rs.getString("Tel_Asesor");
                registros[10] = rs.getString("FueAtendido");
                registros[11] = rs.getString("Adquirio");
                registros[12] = rs.getString("Respuesta_Final");
                registros[13] = rs.getString("Comentario");
                Tabla.addRow(registros);
            }
            tblFecha.setModel(Tabla);
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasReportes.class.getName()).log(Level.SEVERE, null, ex);
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

    private void PDF() {
        try{ 
            Date fecha5 = cmbFecha1.getDate();
            DateFormat f=new SimpleDateFormat("yyyy-MM-d");
            String fecha2=f.format(fecha5);

            Date fecha3 = cmbFecha2.getDate();
            DateFormat f2=new SimpleDateFormat("yyyy-MM-d");
            String fecha4=f2.format(fecha3);
           
            FileOutputStream archivo;
            File file = new File(ruta+".pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document(PageSize.LETTER.rotate(),25f,25,25f,25f);
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            //ENCABEZADO
            Image img = Image.getInstance("C:\\SISTEMA REGISTRO\\Img\\Grupo comasar color.png");
            Paragraph fecha = new Paragraph();
            BaseColor rgb = new BaseColor(191,12,17);
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD, BaseColor.WHITE);
            Font negrita2 = new Font(FontFactory.getFont("Arial", 12,Font.BOLD, BaseColor.WHITE));

            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f,30f,70f,40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            Encabezado.addCell(img); 
            String nom = "GRUPO COMAR.S.A.";
            String ub = "Oficina Central Coban";
            String tel = "7951-0472";
            String dir = "Diagonal 3 11-02 Zona 02";  
            Encabezado.addCell("");
            Encabezado.addCell("Nombre: "+nom+ "\nUbicacion: "+ub+ "\nTelefono: "+tel+ "\nDireccion: "+dir);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
      
            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("\n");
            doc.add(cli);  
            PdfPTable tablacli = new PdfPTable(9);
            tablacli.setWidthPercentage(100);
            tablacli.getDefaultCell().setBorder(0);
            float[] Columnacli = new float[]{10f,16f,9f, 45f, 15f, 10f,8f,20f,15f};
            tablacli.setWidths(Columnacli);
            PdfPCell cl2 = new PdfPCell(new Phrase("\nFecha\n\n",negrita));
            PdfPCell cl3 = new PdfPCell(new Phrase("\nCliente\n\n",negrita));
            PdfPCell cl5 = new PdfPCell(new Phrase("\nTelefono\n\n",negrita));
            PdfPCell cl7 = new PdfPCell(new Phrase("\nPedido\n\n",negrita));          
            PdfPCell cl8 = new PdfPCell(new Phrase("\nAsesor\n\n",negrita));                    
            PdfPCell cl11 = new PdfPCell(new Phrase("\nAtendido\n\n",negrita));          
            PdfPCell cl12 = new PdfPCell(new Phrase("\nAdquirio\n\n",negrita));          
            PdfPCell cl13 = new PdfPCell(new Phrase("\nRespuestaFinal\n\n",negrita));          
            PdfPCell cl14 = new PdfPCell(new Phrase("\nComentario\n\n",negrita));          
            cl7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl7.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cl5.setHorizontalAlignment(Element.ALIGN_CENTER);           
            cl5.setVerticalAlignment(Element.ALIGN_MIDDLE); 
            cl3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl3.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cl2.setHorizontalAlignment(Element.ALIGN_CENTER);          
            cl2.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cl8.setHorizontalAlignment(Element.ALIGN_CENTER);        
            cl8.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cl11.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl11.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cl12.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl12.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cl13.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl13.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cl14.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl14.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cl2.setBackgroundColor(rgb);
            cl3.setBackgroundColor(rgb);
            cl5.setBackgroundColor(rgb);
            cl7.setBackgroundColor(rgb);
            cl8.setBackgroundColor(rgb);
            cl11.setBackgroundColor(rgb);
            cl12.setBackgroundColor(rgb);
            cl13.setBackgroundColor(rgb);
            cl14.setBackgroundColor(rgb);
            tablacli.addCell(cl2);
            tablacli.addCell(cl3);
            tablacli.addCell(cl5);
            tablacli.addCell(cl7);  
            tablacli.addCell(cl8);   
            tablacli.addCell(cl11);  
            tablacli.addCell(cl12);  
            tablacli.addCell(cl13);  
            tablacli.addCell(cl14);  
            Conexion co = new Conexion();
            ResultSet rs = co.generarPDF2(fecha2,fecha4);
            try { 
                while(rs.next())
                {               
                    PdfPCell celda1 = new PdfPCell(new Paragraph(rs.getString("Fecha"),FontFactory.getFont("Arial", 7)));
                    PdfPCell celda2 = new PdfPCell(new Paragraph(rs.getString("Nombre")+ " "+rs.getString("Apellido"),FontFactory.getFont("Arial", 7)));
                    PdfPCell celda3 = new PdfPCell(new Paragraph(rs.getString("Telefono"),FontFactory.getFont("Arial", 7)));
                    PdfPCell celda4 = new PdfPCell(new Paragraph(rs.getString("Pedido"),FontFactory.getFont("Arial", 7)));
                    PdfPCell celda5 = new PdfPCell(new Paragraph(rs.getString("Asesor")+ " "+rs.getString("Apell_Asesor"),FontFactory.getFont("Arial", 7)));
                    PdfPCell celda7 = new PdfPCell(new Paragraph(rs.getString("FueAtendido"),FontFactory.getFont("Arial", 7)));
                    PdfPCell celda8 = new PdfPCell(new Paragraph(rs.getString("Adquirio"),FontFactory.getFont("Arial", 7)));
                    PdfPCell celda9 = new PdfPCell(new Paragraph(rs.getString("Respuesta_Final"),FontFactory.getFont("Arial", 7)));
                    PdfPCell celda10 = new PdfPCell(new Paragraph(rs.getString("Comentario"),FontFactory.getFont("Arial", 7)));                  
                    celda1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    celda1.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    celda2.setHorizontalAlignment(Element.ALIGN_LEFT);
                    celda2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    celda3.setHorizontalAlignment(Element.ALIGN_LEFT);
                    celda3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    celda4.setHorizontalAlignment(Element.ALIGN_LEFT);
                    celda4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    celda5.setHorizontalAlignment(Element.ALIGN_LEFT);
                    celda5.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    celda7.setHorizontalAlignment(Element.ALIGN_CENTER);
                    celda7.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    celda8.setHorizontalAlignment(Element.ALIGN_CENTER);
                    celda8.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    celda9.setHorizontalAlignment(Element.ALIGN_CENTER);
                    celda9.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    celda10.setHorizontalAlignment(Element.ALIGN_LEFT);
                    celda10.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tablacli.addCell(celda1);
                    tablacli.addCell(celda2);
                    tablacli.addCell(celda3);
                    tablacli.addCell(celda4);
                    tablacli.addCell(celda5);
                    tablacli.addCell(celda7);                                               
                    tablacli.addCell(celda8);                                               
                    tablacli.addCell(celda9);                                               
                    tablacli.addCell(celda10);                        
                }           
                           
            } catch (SQLException ex) {
             Logger.getLogger(ConsultasReportes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            doc.add(tablacli);      

            
            Paragraph clin = new Paragraph();
            clin.add(Chunk.NEWLINE);
            clin.add("\n");
            doc.add(clin);
            
            PdfPTable Resumen = new PdfPTable(3);
            Resumen.setWidthPercentage(100);
            Resumen.getDefaultCell().setBorder(0);
            float[] ColumnaResumen = new float[]{45.5f,9f,45.5f};
            Resumen.setWidths(ColumnaResumen);
                  
            Resumen.addCell("");  
            Resumen.addCell("RESUMEN");   
            Resumen.addCell("");    
            doc.add(Resumen);
            doc.add(clin);
            
            PdfPTable RES = new PdfPTable(4);
            RES.setWidthPercentage(100);
            RES.getDefaultCell().setBorder(0);
            float[] ColumnaRES = new float[]{25f,25f,25f,25f};
            RES.setWidths(ColumnaRES);         
            PdfPCell c3 = new PdfPCell(new Phrase("\nRespuesta\n\n",negrita2));
            PdfPCell c4 = new PdfPCell(new Phrase("\nRegistros\n\n",negrita2));
            c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            c4.setHorizontalAlignment(Element.ALIGN_CENTER);
            c3.setBackgroundColor(rgb);
            c4.setBackgroundColor(rgb);
            RES.addCell("");    
            RES.addCell(c3);    
            RES.addCell(c4);    
            RES.addCell("");
            
            String resp = check1.getText();
            String rss = co.Resp1(resp,fecha2,fecha4);
            PdfPCell r1 = new PdfPCell(new Phrase(resp));
            PdfPCell r2 = new PdfPCell(new Phrase(rss));
            r1.setHorizontalAlignment(Element.ALIGN_CENTER);
            r2.setHorizontalAlignment(Element.ALIGN_CENTER);
            RES.addCell("");    
            RES.addCell(r1);    
            RES.addCell(r2);    
            RES.addCell("");
            
            String resp2 = check2.getText();
            String rss2 = co.Resp1(resp2,fecha2,fecha4);
            PdfPCell r11 = new PdfPCell(new Phrase(resp2));
            PdfPCell r21 = new PdfPCell(new Phrase(rss2));
            r11.setHorizontalAlignment(Element.ALIGN_CENTER);
            r21.setHorizontalAlignment(Element.ALIGN_CENTER);
            RES.addCell("");    
            RES.addCell(r11);    
            RES.addCell(r21);    
            RES.addCell("");
                    
            String resp3 = check3.getText();
            String rss3 = co.Resp1(resp3,fecha2,fecha4);
            PdfPCell r13 = new PdfPCell(new Phrase(resp3));
            PdfPCell r23 = new PdfPCell(new Phrase(rss3));
            r13.setHorizontalAlignment(Element.ALIGN_CENTER);
            r23.setHorizontalAlignment(Element.ALIGN_CENTER);
            RES.addCell("");    
            RES.addCell(r13);    
            RES.addCell(r23);    
            RES.addCell("");
                    
            String resp5 = check5.getText();
            String rss5 = co.Resp1(resp5,fecha2,fecha4);
            PdfPCell r15 = new PdfPCell(new Phrase(resp5));
            PdfPCell r25 = new PdfPCell(new Phrase(rss5));
            r15.setHorizontalAlignment(Element.ALIGN_CENTER);
            r25.setHorizontalAlignment(Element.ALIGN_CENTER);
            RES.addCell("");    
            RES.addCell(r15);    
            RES.addCell(r25);    
            RES.addCell("");
                    
            String resp4 = check4.getText();
            String rss4 = co.Resp1(resp4,fecha2,fecha4);
            PdfPCell r14 = new PdfPCell(new Phrase(resp4));
            PdfPCell r24 = new PdfPCell(new Phrase(rss4));
            r14.setHorizontalAlignment(Element.ALIGN_CENTER);
            r24.setHorizontalAlignment(Element.ALIGN_CENTER);
            RES.addCell("");    
            RES.addCell(r14);    
            RES.addCell(r24);    
            RES.addCell("");
                    
            String resp6 = check6.getText();
            String rss6 = co.Resp1(resp6,fecha2,fecha4);
            PdfPCell r16 = new PdfPCell(new Phrase(resp6));
            PdfPCell r26 = new PdfPCell(new Phrase(rss6));
            r16.setHorizontalAlignment(Element.ALIGN_CENTER);
            r26.setHorizontalAlignment(Element.ALIGN_CENTER);
            RES.addCell("");    
            RES.addCell(r16);    
            RES.addCell(r26);    
            RES.addCell("");
           
            
            String llamadas;
            rsp1 = Integer.parseInt(rss);
            rsp2 = Integer.parseInt(rss2);
            rsp3 = Integer.parseInt(rss3);
            rsp4 = Integer.parseInt(rss4);
            rsp5 = Integer.parseInt(rss5);
            rsp6 = Integer.parseInt(rss6);
            total = rsp1+rsp2+rsp3+rsp4+rsp5+rsp6;
            por1=(rsp1*100)/total;
            por2=(rsp2*100)/total;
            por3=(rsp3*100)/total;
            por4=(rsp4*100)/total;
            por5=(rsp5*100)/total;
            por6=(rsp6*100)/total;
            llamadas = String.valueOf(total);
            
            PdfPCell a = new PdfPCell(new Phrase("Total Llamadas ",negrita2));
            PdfPCell b = new PdfPCell(new Phrase(llamadas,negrita2));
            a.setHorizontalAlignment(Element.ALIGN_CENTER);
            b.setHorizontalAlignment(Element.ALIGN_CENTER);
            a.setBackgroundColor(rgb);
            b.setBackgroundColor(rgb);
            RES.addCell("");    
            RES.addCell(a);    
            RES.addCell(b);    
            RES.addCell("");
          
            co.cerrarConexion();            
            doc.add(RES);
            doc.add(clin);
            
            PdfPTable Resumen2 = new PdfPTable(1);
            Resumen2.setWidthPercentage(100);
            Resumen2.getDefaultCell().setBorder(0);
            float[] ColumnaResumen2 = new float[]{100f};
            Resumen2.setWidths(ColumnaResumen2);
                  
            Resumen2.addCell("Reporte de  Atencion al Cliente realizada entre las fechas:   "+fecha2+"   y   "+fecha4+"   para el seguimiento de los pedidos y verificacion de la compra final.");     
            doc.add(Resumen2);
            doc.add(clin);

            //CERRAR PDF
            co.cerrarConexion();
            doc.close();
            archivo.close();
        } catch(DocumentException | IOException e){
        }      
    }
   
    private void grafico(){
        JFreeChart chart = createChart(createDataset());
        PDFDocument pdfDoc = new PDFDocument();
        Page page = pdfDoc.createPage(new Rectangle(792, 612));
        PDFGraphics2D g2 = page.getGraphics2D();
        chart.draw(g2, new Rectangle(70, 40, 650, 470));
        pdfDoc.writeToFile(new File(ruta+" Grafica.pdf"));
    }
   
    private static PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Si realizo su Compra \n"+por1+" %", Double.valueOf(rsp1));
        dataset.setValue("Cotizando \n"+por2+" %", Double.valueOf(rsp2));
        dataset.setValue("Producto no Disponible\n"+por3+" %", Double.valueOf(rsp3));
        dataset.setValue("Adquirio en otra Tienda\n"+por4+" %", Double.valueOf(rsp4));
        dataset.setValue("No le llamo el Asesor\n"+por5+" %", Double.valueOf(rsp5));
        dataset.setValue("Cliente No responde\n"+por6+" %", Double.valueOf(rsp6));
        return dataset;
    }
    
    private static JFreeChart createChart(PieDataset dataset) {

        JFreeChart chart = ChartFactory.createPieChart(
                "\nRESUMEN\n", dataset, false, false, false);

        TextTitle t = chart.getTitle();
        t.setHorizontalAlignment(HorizontalAlignment.CENTER);
        t.setPaint(new Color(0, 0, 0));
        t.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 44));

        PiePlot plot = (PiePlot) chart.getPlot();

        plot.setBackgroundPaint(null);
        plot.setInteriorGap(0.04);
        plot.setOutlineVisible(false);
        plot.setShadowPaint(null);
        plot.setLabelShadowPaint(null);
        plot.setBaseSectionOutlinePaint(Color.WHITE);
        plot.setSectionOutlinesVisible(true);
        plot.setBaseSectionOutlineStroke(new BasicStroke(2.0f));
        plot.setLabelFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
        plot.setLabelLinkPaint(Color.BLACK);
        plot.setLabelLinkStroke(new BasicStroke(0.5f));
        plot.setLabelOutlineStroke(null);
        plot.setLabelPaint(Color.BLACK);
        plot.setLabelBackgroundPaint(null);

        return chart;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPDF;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JCheckBox check6;
    private com.toedter.calendar.JDateChooser cmbFecha1;
    private com.toedter.calendar.JDateChooser cmbFecha2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
