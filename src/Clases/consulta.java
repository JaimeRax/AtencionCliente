
package Clases;

/**
 *
 * @author JAIME_06
 */
public class consulta {
    
    private String Fecha;
    private String Atencion;
    private String Adquirido;
    private String respFinal;
    private String Comentario;
    private String idPedido;

    public consulta(String Fecha, String Atencion, String Adquirido, String respFinal, String Comentario, String idPedido) {
        this.Fecha = Fecha;
        this.Atencion = Atencion;
        this.Adquirido = Adquirido;
        this.respFinal = respFinal;
        this.Comentario = Comentario;
        this.idPedido = idPedido;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getAtencion() {
        return Atencion;
    }

    public void setAtencion(String Atencion) {
        this.Atencion = Atencion;
    }

    public String getAdquirido() {
        return Adquirido;
    }

    public void setAdquirido(String Adquirido) {
        this.Adquirido = Adquirido;
    }

    public String getRespFinal() {
        return respFinal;
    }

    public void setRespFinal(String respFinal) {
        this.respFinal = respFinal;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    
}
