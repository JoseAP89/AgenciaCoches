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
    int num_serie;
    String marca;
    String modelo;

    public Automovil() {
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
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
