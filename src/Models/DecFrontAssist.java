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
public class DecFrontAssist  extends DecoradorEquipamiento{

    public DecFrontAssist(IAutomovil AutoDecorado) {
        super(AutoDecorado);
    }
    
    @Override
    public String ordenarAuto() {
        return AutoDecorado.ordenarAuto()+", equipamiento de FrontAssist";
    }

    @Override
    public double cost() {
        return this.getPrecioEquipamiento() +  AutoDecorado.cost();
    }

    public String getDescripcionEquipamiento() {
        return "Monitorea la distancia con el vehículo que nos precede para evitar colisiones." ;
    }

    @Override
    public String getNombreEquipamiento() {
        return "Asistente-Frontal"; 
    }

    @Override
    public double getPrecioEquipamiento() {
        return  19180.20;
    }
    
}
