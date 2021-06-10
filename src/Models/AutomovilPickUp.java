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
    public String ordenarAuto() {
        return "Automovil tipo PickUp";
    }

    @Override
    public double cost() {
        return 526800.00;
    }
    
}
