
package Clases;

/**
 *
 * @author LENOVO
 */
public class Vehiculo {
    
    private String marca;
    private String placa;
    private int id;

    public Vehiculo(String marca, String placa, int id) {
        this.marca = marca;
        this.placa = placa;
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
