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
    private float price;
    private String year;

    public Automovil() {
    }

    public Automovil(String serie, String marca) {
        num_serie = serie;
        this.marca = marca;
    }

    public Automovil(String series, String brand, String model, String year, float price) {
        num_serie = series;
        this.marca = brand;
        this.modelo = model;
        this.year = year;
        this.price = price;
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

    public float getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        if (num_serie.equals("0")) {
            return marca;
        }
        return marca + " " + modelo + " " + year;
    }
    
    
}
