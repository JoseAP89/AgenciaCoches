/*
 * Modelo de automovil
 * 
 * 
 */
package Models;

/**
 *
 * @author Salvador Solis Atenco
 */
public class Automovil {
    private String num_serie;
    private String marca;
    private String modelo;

    public Automovil() {
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
