

package Formularios;

import Clases.Conexion;
import java.awt.Graphics;
import java.io.File;
import static java.util.Calendar.MINUTE;
import static java.util.Calendar.SECOND;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JAIME_06
 */
public class Herramientas extends javax.swing.JFrame {

    ImagenFondo fondo = new ImagenFondo();
    
    public Herramientas() {
        this.setContentPane(fondo);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/ICONO2.png")).getImage());
    }

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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtBase = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        mnuCambiarUsuario = new javax.swing.JMenuItem();
        mnuCambiarClave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuCrearUsuario2 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(109, 109, 109));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, -1, -1));

        btnInicio.setBackground(new java.awt.Color(255, 51, 51));
        btnInicio.setFont(new java.awt.Font("BigNoodleTitling", 1, 36)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("INICIAR");
        btnInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 525, 120, 50));

        jLabel1.setFont(new java.awt.Font("BigNoodleTitling", 0, 36)); // NOI18N
        jLabel1.setText("Ruta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        txtRuta.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        txtRuta.setText("C:\\SISTEMA REGISTRO\\Backup\\");
            jPanel1.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 427, 460, -1));

            jLabel2.setFont(new java.awt.Font("BigNoodleTitling", 0, 36)); // NOI18N
            jLabel2.setText("Base de Datos");
            jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

            jLabel3.setFont(new java.awt.Font("BigNoodleTitling", 0, 36)); // NOI18N
            jLabel3.setText("Nombre");
            jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

            txtNombre.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
            txtNombre.setText("backup");
            jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 347, 460, -1));

            txtBase.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
            txtBase.setText("CC82_AtencionCliente");
            jPanel1.add(txtBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 267, 460, -1));

            btnSalir.setBackground(new java.awt.Color(255, 255, 102));
            btnSalir.setFont(new java.awt.Font("BigNoodleTitling", 1, 36)); // NOI18N
            btnSalir.setText("salir");
            btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            btnSalir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSalirActionPerformed(evt);
                }
            });
            jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 525, 100, 50));

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

            jMenu5.setForeground(new java.awt.Color(255, 255, 255));
            jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1.png"))); // NOI18N
            jMenu5.setText("Herramientas");
            jMenu5.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
            jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jMenu5MouseClicked(evt);
                }
            });

            mnuCrearUsuario2.setBackground(new java.awt.Color(239, 239, 239));
            mnuCrearUsuario2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
            mnuCrearUsuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearUsuario.png"))); // NOI18N
            mnuCrearUsuario2.setText("Crear Usuario");
            mnuCrearUsuario2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    mnuCrearUsuario2ActionPerformed(evt);
                }
            });
            jMenu5.add(mnuCrearUsuario2);

            jMenuItem2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
            jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seguridad-de-datos (1).png"))); // NOI18N
            jMenuItem2.setText("Backup");
            jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem2ActionPerformed(evt);
                }
            });
            jMenu5.add(jMenuItem2);

            jMenuBar1.add(jMenu5);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
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

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed

    private void mnuCrearUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearUsuario2ActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCrearUsuario2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Herramientas f1 = new Herramientas();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
    }//GEN-LAST:event_jMenu5MouseClicked

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        String base = txtBase.getText();
        String nombre = txtNombre.getText();
        String ruta = txtRuta.getText();
        if(txtBase.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Nombre de la Base de datos");
            txtBase.grabFocus();
            return;
        }
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Nombre para el Backup");
            txtNombre.grabFocus();
            return;
        }
        if(txtRuta.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese la Ruta destino");
            txtRuta.grabFocus();
            return;
        }
        
        Conexion co = new Conexion();
        
        if(!co.baseDatos(txtBase.getText()).equals("si")){
            JOptionPane.showMessageDialog(rootPane, "La base de datos no Existe");
            return;
        }
        
        String ruta2 = txtRuta.getText();
        boolean existeRuta = verificarRuta(ruta2);

        if (existeRuta) {
            System.out.println(" ");
        } else {
            JOptionPane.showMessageDialog(rootPane,"La ruta no existe.");
            return;
        }
        if(!co.backup(base, ruta, nombre)){
            JOptionPane.showMessageDialog(rootPane,"Error al Crear el Backup");
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Backup Creado con Exito");
    }//GEN-LAST:event_btnInicioActionPerformed

   
    public static boolean verificarRuta(String ruta) {
        File archivo = new File(ruta);
        return archivo.exists();
    }

    
    
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Principal f1 = new Principal();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuCambiarClave;
    private javax.swing.JMenuItem mnuCambiarUsuario;
    private javax.swing.JMenuItem mnuCrearUsuario2;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
