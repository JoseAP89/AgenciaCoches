/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author joseap
 */
public class Automovil {
    public String seriesNumber;
    String color;
    String brand;
    String model;
    float price;
    String year;

    public Automovil(String id, String brand) {
        seriesNumber = id;
        this.brand = brand;
    }

    public Automovil(String series, String brand, String model, String year, float price) {
        seriesNumber = series;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        if (seriesNumber.equals("0")) {
            return brand;
        }
        return brand + " " + model + " " + year;
    }
    
    
}
