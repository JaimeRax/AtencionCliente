
package Clases;

/**
 *
 * @author JAIME_06
 */
public class pedido {
    private int codigo;
    private String fecha;
    private String descripcion;
    private String estado;
    private int cliente;
    private int transaccion;

    public pedido(int codigo, String fecha, String descripcion, String estado, int cliente, int transaccion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.cliente = cliente;
        this.transaccion = transaccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(int transaccion) {
        this.transaccion = transaccion;
    }

    
}
