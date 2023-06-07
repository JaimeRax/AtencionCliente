
package Clases;

/**
 *
 * @author JAIME_06
 */
public class Usuario {
    

    private String Nombre;
    private String Clave;
    private String tipo;

    public Usuario(String Nombre, String Clave, String tipo) {
        this.Nombre = Nombre;
        this.Clave = Clave;
        this.tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
