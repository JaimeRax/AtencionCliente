
package Clases;

/**
 *
 * @author JAIME_06
 */
public class Sucursal {
    private String nombre;
    private int codigoemp;

    public Sucursal(String nombre, int codigoemp) {
        this.nombre = nombre;
        this.codigoemp = codigoemp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoemp() {
        return codigoemp;
    }

    public void setCodigoemp(int codigoemp) {
        this.codigoemp = codigoemp;
    }

    
}
