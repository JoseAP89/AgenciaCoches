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
public class DecParkAssist extends DecoradorEquipamiento{
    
    public DecParkAssist(IAutomovil AutoDecorado) {
        super(AutoDecorado);
    }

    @Override
    public String ordenarAuto() {
        return AutoDecorado.ordenarAuto() + ", equipamiento ParkAssist";
    }

    
    @Override
    public double cost() {
        return this.getPrecioEquipamiento() + AutoDecorado.cost();
    }

    @Override
    public String getNombreEquipamiento() {
        return "Park-Assist";
    }

    @Override
    public double getPrecioEquipamiento() {
        return 13785.00;
    }

    @Override
    public String getDescripcionEquipamiento() {
        return "Asistente para facilitar el estacionado de su vehículo.";
    }
    
}
