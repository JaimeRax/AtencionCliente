
package Clases;

/**
 *
 * @author JAIME_06
 */
public class Usuarios {

    private String nombre;
    private String Apellido;
    private String Telefono;
    private int sucursal;

    public Usuarios(String nombre, String Apellido, String Telefono, int sucursal) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.sucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    
}
