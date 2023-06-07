
package Clases;

/**
 *
 * @author JAIME_06
 */
public class Transaccion {
    
    private int id;
    private int asesor;
    private int sucursal;
    private int empresa;

    public Transaccion(int id, int asesor, int sucursal, int empresa) {
        this.id = id;
        this.asesor = asesor;
        this.sucursal = sucursal;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAsesor() {
        return asesor;
    }

    public void setAsesor(int asesor) {
        this.asesor = asesor;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    


}
