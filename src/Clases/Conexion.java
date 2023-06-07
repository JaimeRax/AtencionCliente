
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author LENOVO
 */
public class Conexion {
    public Statement sentencia;
    public ResultSet rs;
    private Connection conn;


    //METODO PARA CONECTARNOS A LA BASE DE DATO Y CERRAR LA CONEXION
    public Conexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String db = "jdbc:sqlserver://localhost:1433;databaseName=CC82_AtencionCliente;";
            conn = DriverManager.getConnection(db,"sa","Jaime.2000");
            System.out.println("Conectados xd");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    public void cerrarConexion(){
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //METODOS PARA INSERTAR A LA BASE DE DATOS
    public boolean insertUsuario(Usuario datos){
        try {
            String sql = "exec insertUser '"
                +datos.getNombre()+"','"
                +datos.getClave()+"','"
                +datos.getTipo()+"'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }
    public boolean insertEmpresa(Empresa datosEmpresa){     
        try {
            String sql = "exec insertEmp '"+datosEmpresa.getNombre()+"'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    
    public boolean insertSucursal(Sucursal datosSucursal){
        try {
            String sql = "exec insertSuc  '"+datosSucursal.getNombre()+"',"
                +datosSucursal.getCodigoemp()+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    } 
    public boolean insertAsesor(Usuarios datosUsuarios){     
        try {
            String sql = "exec insertAsesor '"
                +datosUsuarios.getNombre()+"','"
                +datosUsuarios.getApellido()+"','"
                +datosUsuarios.getTelefono()+"',"
                +datosUsuarios.getSucursal()+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);          
            return true; 
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }   
    public boolean insertCliente(Cliente datosCliente){     
        try {
            String sql = "exec insertCliente '"
                +datosCliente.getNombre()+"','"
                +datosCliente.getApellido()+"','"
                +datosCliente.getTelefono()+"','"
                +datosCliente.getDireccion()+"'";       
            Statement st = conn.createStatement();
            st.executeUpdate(sql);          
            return true; 
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }  
    public boolean insertTransaccion(Transaccion datos){
        try {
            String sql = "exec insertTransac "
                +datos.getId()+","
                +datos.getAsesor()+","
                +datos.getSucursal()+","
                +datos.getEmpresa()+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     } 
    public boolean insertPedido(pedido datos){
        try {
            String sql = "exec insertPedido "
                +datos.getCodigo()+",'"
                +datos.getFecha()+"','"
                +datos.getDescripcion()+"','"
                +datos.getEstado()+"',"
                +datos.getCliente()+","
                +datos.getTransaccion()+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            System.out.println(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }    
    public boolean insertConsulta(consulta datos){
        try {
            String sql = "exec insertConsulta '"
                +datos.getFecha()+"','"
                +datos.getAtencion()+"','"
                +datos.getAdquirido()+"','"
                +datos.getRespFinal()+"','"
                +datos.getComentario()+"',"        
                +datos.getIdPedido()+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }  
    public boolean insertVehiculo(Vehiculo datos){
        try {
            String sql = "exec insertVehiculo '"
                +datos.getMarca()+"','"
                +datos.getPlaca()+"',"
                +datos.getId()+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }
    public boolean insertServicio(servicios datos){
        try {
            String sql = "exec insertSericio '"
                +datos.getUltservicio()+"','"
                +datos.getProxservicio()+"',"
                +datos.getIdCli()+","
                +datos.getIdVehi()+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }
    public boolean backup(String base,String ruta,String nombre){
        try {
            String sql = "EXEC RealizarBackup '"+base+"','"+ruta+"','"+nombre+"'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }
    
    
    //METODOS PARA UPDATE EN LA BASE DE DATOS
    public boolean updateUs(Usuario usu,int id){ 
    try {
        String sql = "exec updateUser '"+id+"','"+usu.getNombre()+"','"+usu.getClave()+"','"+usu.getTipo()+"'";             
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    }
    public boolean updateEmpresa(Empresa usu,int id){ 
    try {
        String sql = "exec updateEmp '"+id+"','"+usu.getNombre()+"'";             
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    }    
    public boolean updateSucursal(Sucursal usu,int id){ 
    try {
        String sql = "exec updateSuc "+id+",'"+usu.getNombre()+"', "+usu.getCodigoemp()+"";             
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    } 
    public boolean updateUsuario(Usuarios usu,int id){ 
    try {
        String sql = "exec updateAsesor "+id+",'"+usu.getNombre()+"', '"+usu.getApellido()+"', '"+usu.getTelefono()+"'";   
                         
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    }    
    public boolean updateCliente(Cliente usu, int id){ 
    try {
        String sql = "exec updateCliente "+id+",'"
                +usu.getNombre()+"','"
                +usu.getApellido()+"','"
                +usu.getTelefono()+"','"
                +usu.getDireccion()+"'";             
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    } 
    public boolean updatePedido(int id){ 
    try {
        String resp = "Si";
        String sql = "exec  updatePedido "+id+",'"+resp+"'";             
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    } 
    public boolean updateConsulta(consulta usu,int id){ 
    try {
        String sql = "exec updateConsulta  "
                +id+",'"
                +usu.getAtencion()+"','"
                +usu.getAdquirido()+"','"
                +usu.getRespFinal()+"','"
                +usu.getComentario()+"'";            
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    } 

    
    //METODOS PARA ELIMINAR UN REGISTRO SELECCIONADO   
    public boolean deleteUpdate(int id){
        try {
            String sql = "exec deleteEmp "+id+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    } 
    public boolean deleteUpdateSucursal(int id){
        try {
            String sql = "exec deleteSuc "+id+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    public boolean deleteUpdateAsesor(int id){
        try {
            String sql = "exec deleteAse "+id+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }  
    public boolean deleteUpdateCliente(int id){
        try {
            String sql = "exec deleteCliente "+id+"";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    public boolean deleteUpdateVehiculo(int id,String placa){
        try {       
            String sql = "exec deleteVehiculo "+id+",'"+placa+"'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
    //METODOS PARA MOSTRAR TODOS LOS DATOS DE UN REGISTRO SELECCIONADO
    public Empresa getEmpresa(String emp){
        try {
            Empresa empresa = null;
            String sql = "Select * from tbEmpresa where idEmpresa = '"+emp+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                empresa = new Empresa(rs.getString("Nombre"));
            }
            return empresa;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
    public Sucursal getSucursal2(String suc){
        try {
            Sucursal sucursal = null;
            String sql = "Select * from tbSucursal where idEmpresa = '"+suc+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                sucursal = new Sucursal(rs.getString("Nombre"),rs.getInt("idEmpresa"));
            }
            return sucursal;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public Sucursal getSucursal(String suc){
        try {
            Sucursal sucursal = null;
            String sql = "Select * from tbSucursal where idSucursal = '"+suc+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                sucursal = new Sucursal(rs.getString("Nombre"),rs.getInt("idEmpresa"));
            }
            return sucursal;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
    public Usuarios getUsuarios2(String usu){
        try {
            Usuarios usuario = null;
            String sql = "Select * from tbAsesor where idSucursal = '"+usu+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                usuario = new Usuarios(rs.getString("Nombre"),rs.getString("Apellido"),
                rs.getString("Telefono"),rs.getInt("Sucursal_idSucursal"));
            }
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public Usuarios getUsuarios(String usu){
        try {
            Usuarios usuario = null;
            String sql = "Select * from tbAsesor where idAsesor = '"+usu+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                usuario = new Usuarios(rs.getString("Nombre"),rs.getString("Apellido"),
                rs.getString("Telefono"),rs.getInt("idSucursal"));
            }
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    
    public Transaccion getTransaccion2(String reg){
        try {
            Transaccion tran = null;
            String sql = "Select * from tbTransaccion where idAsesor = '"+reg+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                tran = new Transaccion(rs.getInt("idTransaccion"),rs.getInt("idAsesor"),
                        rs.getInt("idSucursal"),rs.getInt("idEmpresa"));
            }
            return tran;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }  
    public Cliente getCliente(String cli){
        try {
            Cliente client = null;
            String sql = "Select * from tbCliente where idCliente = "+cli+"";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                client = new Cliente(rs.getString("Nombre"),rs.getString("Apellido"),
                rs.getString("Telefono"),rs.getString("Direccion"));
            }
            return client;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
    
    
    //METODOS PARA MOSTRAR TODOS LOS RESULTADOS DE LAS TABLAS DE LA BASE DE DATOS
    public ResultSet mostrarConsultas(){
        try {
            String sql = "Select * from vista_final";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null; 
        } 
    } 
    public ResultSet mostrarRegistros(){
        try {
            String sql = "Select * from vista_pedidos";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null; 
        } 
    } 
    public ResultSet mostrarSucursal(){
        try {
            String sql = "Select * from vista_sucursales";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;  
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null; 
        } 
    }
    public ResultSet mostrarAsesor(){
        try {
            String sql = "Select * from vista_asesor";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null; 
        } 
    }
    public ResultSet getEmpresa(){
        try {
            String sql = "Select * from tbEmpresa";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }  
    public ResultSet getCliente(){
        try {
            String sql = "Select * from tbCliente ORDER BY idCliente DESC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    public ResultSet getClienteVehiculo(){
        try {
            String sql = "Select * from vista_vehiculo ORDER BY idCliente DESC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
     public ResultSet mostrarServicios(){
        try {
            String sql = "Select * from servicioss";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null; 
        } 
    }
    
    
    //METODOS PARA BUSCAR EL ID DE UN REGISTRO ESPECIFICO
    public String idsuc(String suc,String emp){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT tbSucursal.idSucursal FROM tbSucursal INNER JOIN tbEmpresa "
                                    + "ON tbEmpresa.idEmpresa = tbSucursal.idEmpresa "
                                    + "WHERE tbSucursal.Nombre = '"+suc+"' AND tbEmpresa.Nombre = '"+emp+"'");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
    }   
    public String baseDatos(String emp){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT name FROM sys.databases WHERE name = '"+emp+"'");
            if (rs.next()) {
                return "si";
            } else {
                return "no";
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
    } 
 
    public String idEmpresa(String emp){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT idEmpresa FROM tbEmpresa "
                                    + "WHERE Nombre = '"+emp+"'");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
    }     
    public String idAsesor(String suc,String ase){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT tbAsesor.idAsesor FROM tbAsesor INNER JOIN tbSucursal "
                                    + "ON tbSucursal.idSucursal = tbAsesor.idSucursal "
                                    + "WHERE tbSucursal.Nombre = '"+suc+"' AND concat_ws(' ', tbAsesor.Nombre, tbAsesor.Apellido) = '"+ase+"'");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
    }
    public String telVendedor(String ase, String suc){
          try {
            String empNo;
            Statement stmt = conn.createStatement();
            ResultSet  rs = stmt.executeQuery("Select tbAsesor.Telefono from tbAsesor inner join tbSucursal "
                                    + "on tbSucursal.idSucursal = tbAsesor.idSucursal "
                                    + "where concat_ws(' ', tbAsesor.Nombre, tbAsesor.Apellido) = '"+ase+"' and tbSucursal.Nombre = '"+suc+"'");
               
            while (rs.next()){  
                empNo = rs.getString(1);  
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
         return "...";
    }   
    public String Resp1(String resp,String fecha1,String fecha2){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("select count(Resp_Final) from tbConsulta where Resp_Final = '"+resp+"' and Fecha between '"+fecha1+"' and '"+fecha2+"'");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
    }  
    public String idVehiculo(String emp){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT idVehiculo FROM tbVehiculo "
                                    + "WHERE Placa = '"+emp+"'");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
    }   
    
    
    
    //METODO PARA MOSTRAR UN REGISTRO ESPECIFICO
    public ResultSet buscarCliNom1(String nombre){
         try {
            String sql = "Select * from tbCliente where Nombre = '"+nombre+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    public ResultSet buscarCliNom(String nombre){
         try {
            String sql = "Select * from vista_vehiculo where Nombre = '"+nombre+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    public ResultSet buscarCliNomVehi(String nombre){
         try {
            String sql = "Select * from  where Nombre = '"+nombre+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    public ResultSet buscarRegistro(String fecha){
         try {
            String sql = "Select * from vista_pedidos where Fecha = '"+fecha+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    
    }   
    public ResultSet generarPDF2(String fecha1,String fecha2){
         try {
            String sql = "Select * from vista_final where Fecha between '"+fecha1+"' and '"+fecha2+"' order by Fecha ASC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    public ResultSet buscarServicio(String fecha){
         try {
            String sql = "Select * from servicioss where Prox_Servicio = '"+fecha+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    } 
    
        
    //METODO PARA BUSCAR EL MAX(ID)
    public String NoUsuario(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idUsuario) from tbUsuario");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";        
    }
    public String NoEmpresa(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idEmpresa) from tbEmpresa");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";       
    }
    public String NoSucursal(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idSucursal) from tbSucursal");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";       
    }
    public String NoAsesor(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idAsesor) from tbAsesor");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";        
    }   
    public String NoCliente(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idCliente) from tbCliente");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";        
    } 
    public String NoPedido(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idPedido) from tbPedido");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";        
    }  
    public String NoConsulta(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idConsulta) from tbConsulta");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";        
    } 
    public String NoServicio(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idCalendario) from tbCalendario");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
            
    }
    public String NoVehiculo(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idVehiculo) from tbVehiculo");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
            
    }

        
    //METODO PARA LLENAR LOS COMBOBOX  
    public void llenarCombobox(JComboBox combo){
        try {
            String sql = "Select Nombre from tbEmpresa";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            combo.addItem("Seleccione una Empresa...");
            while(rs.next())
            {
                combo.addItem(rs.getString("Nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }    
    public void llenarSucursal(JComboBox combo, String emp){
         try {
            String sql = "Select tbSucursal.Nombre from tbSucursal right join tbEmpresa "
                    + "on tbEmpresa.idEmpresa = tbSucursal.idEmpresa "
                    + "where tbEmpresa.Nombre = '"+emp+"' order by tbSucursal.idSucursal ASC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            combo.removeAllItems();
            combo.addItem("Seleccione una Sucursal...");
            while(rs.next())
            {
                combo.addItem(rs.getString("Nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public void llenarAsesor(JComboBox combo, String suc, String emp){
         try {
            String sql = "Select tbAsesor.Nombre,tbAsesor.Apellido from tbAsesor "
                    + "inner join tbSucursal "
                    + "on tbSucursal.idSucursal = tbAsesor.idSucursal "
                    + "inner join tbEmpresa "
                    + "on tbEmpresa.idEmpresa = tbSucursal.idEmpresa "
                    + "where tbSucursal.Nombre ='"+suc+"' and tbEmpresa.Nombre ='"+emp+"' order by tbAsesor.idAsesor ASC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            combo.removeAllItems();
            combo.addItem("Seleccione un Asesor...");
            while(rs.next())
            {
                combo.addItem(rs.getString("Nombre") + " "+ rs.getString("Apellido")); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }      
    
    
    //METODO PARA VALIDAR USUARIOS 
    public boolean validarUsuario(String nombre, String clave) {
    try {
        String sql = "{? = call validarUser(?, ?)}";
        java.sql.CallableStatement cstmt = conn.prepareCall(sql);

        cstmt.registerOutParameter(1, java.sql.Types.BIT);
        cstmt.setString(2, nombre);
        cstmt.setString(3, clave);

        cstmt.execute();

        boolean resultado = cstmt.getBoolean(1);
        return resultado;

    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
}
    public String idUSUARIO(String nom,String clav){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT idUsuario FROM tbUsuario WHERE Nombre = '"+nom+"' AND dbo.desencriptar(Clave) = '"+clav+"'");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
    }
    public String TipoUser(int id){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT Tipo FROM tbUsuario WHERE idUsuario = "+id+"");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
    }
        public String TipoUser(String emp){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT Tipo FROM tbUsuario WHERE Nombre = '"+emp+"'");
            while (rs.next()) {  
                empNo = rs.getString(1);
                System.out.println(empNo);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
          return "";
    }
}
