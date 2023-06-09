
package Formularios;

import Clases.Conexion;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author JAIME_06
 */
public class Usuario extends javax.swing.JFrame {

   
    ImagenFondo fondo = new ImagenFondo();
    public Usuario() {
        this.setContentPane(fondo);
        UIManager.put("TextField.border", BorderFactory.createCompoundBorder(
            new Login.CustomeBorder(), 
            new EmptyBorder(new Insets(8,10,4,4))));
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/ICONO2.png")).getImage());
        txtCodigo.setOpaque(false);
        txtNombre.setOpaque(false);
        txtClave1.setOpaque(false);
        txtClave2.setOpaque(false);
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        txtClave2 = new javax.swing.JPasswordField();
        txtClave1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
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

        jLabel9.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(109, 109, 109));
        jLabel9.setText("agregar usuario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(109, 109, 109));
        jLabel8.setText("ID:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Roboto Condensed", 1, 36)); // NOI18N
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 450, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(109, 109, 109));
        jLabel10.setText("Tipo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto Condensed", 1, 36)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 450, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(109, 109, 109));
        jLabel11.setText("Clave:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(109, 109, 109));
        jLabel12.setText("Confirmar:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(109, 109, 109));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 670, -1, -1));

        btnEditar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(109, 109, 109));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar_1.png"))); // NOI18N
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 670, -1, -1));

        jLabel13.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(109, 109, 109));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Comarsin.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 170, -1));

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
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 310, -1, -1));

        txtClave2.setFont(new java.awt.Font("Roboto Condensed", 1, 36)); // NOI18N
        jPanel1.add(txtClave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 450, 50));

        txtClave1.setFont(new java.awt.Font("Roboto Condensed", 1, 36)); // NOI18N
        jPanel1.add(txtClave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 450, 50));

        jLabel14.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(109, 109, 109));
        jLabel14.setText("Nombre:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        cmbTipo.setFont(new java.awt.Font("Roboto Condensed", 1, 36)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opcion...", "Administrador", "Usuario" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, 450, 50));

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        bandera = 1;
        Conexion co = new Conexion();
        Login log = new Login();
        txtCodigo.setEnabled(false);
        txtCodigo.setText(co.idUSUARIO(log.getNombreLogin(), log.getClaveLogin()));
        txtNombre.setText(log.getNombreLogin());
        txtClave1.setText(log.getClaveLogin());
        txtClave2.setText(log.getClaveLogin());
        txtClave2.setText(log.getClaveLogin());
        txtNombre.setEnabled(false);
        txtClave1.setEnabled(false);
        txtClave2.setEnabled(false);
        String tipo = co.TipoUser(Integer.parseInt(txtCodigo.getText()));
        
        cmbTipo.setEnabled(false);
        cmbTipo.setSelectedItem(tipo);
    }//GEN-LAST:event_formWindowOpened

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();
        String clave1 = String.valueOf(txtClave1.getText());
        String clave2 = String.valueOf(txtClave2.getText());
        String tipo = (String) cmbTipo.getSelectedItem();
        
        if(nombre.equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese su Nombre");
            txtNombre.grabFocus();
            return;
        }
        if(clave1.equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese su Clave");
            txtClave1.grabFocus();
            return;
        }
        if(clave2.equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese nuevamente su Clave");
            txtClave2.grabFocus();
            return;
        }
        if(!clave1.equals(clave2)){
            JOptionPane.showMessageDialog(rootPane,"Las Claves NO son Iguales");
            txtClave1.setText("");
            txtClave2.setText("");
            txtClave1.grabFocus();
            return;
        }
        if(cmbTipo.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane,"Seleccione el tipo de Usuario");
            return;
        }
        Conexion co = new Conexion();
        Clases.Usuario usu = new Clases.Usuario(nombre,clave1,tipo);
        if(bandera == 1){
        if(!co.insertUsuario(usu)){
             JOptionPane.showMessageDialog(rootPane,"No se Registro el Usuario :(");
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Usuario Agregado Correctamente :D");
        }
        if(bandera == 2){
        int id = Integer.parseInt(txtCodigo.getText());
            System.out.println(id);
        if(!co.updateUs(usu,id)){
             JOptionPane.showMessageDialog(rootPane,"No se Actualizo el Usuario :(");
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Usuario Actualizado Correctamente :D");
        JOptionPane.showMessageDialog(rootPane,"Por favor inicie Sesion Nuevamente");
        Login f1 = new Login();
        f1.setVisible(true);
        this.setVisible(false);
        }
        co.cerrarConexion();
        Limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        bandera =2;
        txtNombre.setEnabled(true);
        txtClave1.setEnabled(true);
        txtClave2.setEnabled(true);
        cmbTipo.setEnabled(true);
        txtNombre.grabFocus();
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        NoUsuario();
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        txtNombre.setEnabled(true);
        txtClave1.setEnabled(true);
        txtClave2.setEnabled(true);
        cmbTipo.setEnabled(true);
        bandera = 1;
        Limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void mnuCrearUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearUsuario1ActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCrearUsuario1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Herramientas f1 = new Herramientas();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked

    }//GEN-LAST:event_jMenu3MouseClicked
    
    private void NoUsuario(){
        Conexion co = new Conexion();
        String NoEmp = co.NoUsuario();
        if(NoEmp==null){
            txtCodigo.setText("0001");
        }
        else{
            int increment = Integer.parseInt(NoEmp);
            increment = increment + 1;
            txtCodigo.setText("000"+increment);
        }
        co.cerrarConexion();
    }
    
    private void Limpiar(){
        
        txtNombre.setText("");
        txtClave1.setText("");
        txtClave2.setText("");
        txtNombre.grabFocus();
        btnNuevo.setEnabled(true);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuCambiarClave;
    private javax.swing.JMenuItem mnuCambiarUsuario;
    private javax.swing.JMenuItem mnuCrearUsuario1;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JPasswordField txtClave1;
    private javax.swing.JPasswordField txtClave2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
