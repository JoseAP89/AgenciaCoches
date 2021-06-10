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
public class DecPintura extends DecoradorEquipamiento{

    public DecPintura(IAutomovil AutoDecorado) {
        super(AutoDecorado);
    }

    @Override
    public String ordenarAuto() {
        return AutoDecorado.ordenarAuto() + ", Pintura";
    }

    @Override
    public double cost() {
        return this.getPrecioEquipamiento() + AutoDecorado.cost();
    }

    @Override
    public String getNombreEquipamiento() {
        return "Pintura";
    }

    @Override
    public double getPrecioEquipamiento() {
        return 12000.00;
    }

    @Override
    public String getDescipcionEquipamiento() {
        return "Se ordeno agregar pintura no estandar";
    }
    
    
}
