
package Clases;

/**
 *
 * @author JAIME_06
 */
public class servicios {
    

    private String ultservicio;
    private String proxservicio;
    private int idCli;
    private int idVehi;

    public servicios(String ultservicio, String proxservicio, int idCli, int idVehi) {
        this.ultservicio = ultservicio;
        this.proxservicio = proxservicio;
        this.idCli = idCli;
        this.idVehi = idVehi;
    }

    public String getUltservicio() {
        return ultservicio;
    }

    public void setUltservicio(String ultservicio) {
        this.ultservicio = ultservicio;
    }

    public String getProxservicio() {
        return proxservicio;
    }

    public void setProxservicio(String proxservicio) {
        this.proxservicio = proxservicio;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getIdVehi() {
        return idVehi;
    }

    public void setIdVehi(int idVehi) {
        this.idVehi = idVehi;
    }

    
}
