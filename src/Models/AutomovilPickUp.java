/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Salvador Solis Atenco
 */
public class AutomovilPickUp implements IAutomovil{
    
    Automovil auto;

    public AutomovilPickUp(Automovil auto) {
        this.auto = auto;
    }
    
    @Override
    public String getMarca() {
        return auto.getMarca();
    }
    
    @Override
    public String ordenarAuto() {
        return "Automovil tipo PickUp";
    }

    @Override
    public double cost() {
        return auto.getPrice();
    }
    
    
    
    @Override
    public String toString() {
        return auto.toString();
    }

    @Override
    public String getSerie() {
        return auto.getNum_serie();
    }

    @Override
    public float getPrecioBase() {
        return auto.getPrice();
    }
    
}
