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

    @Override
    public String getDescipcionEquipamiento() {
        return "DecFrontAssist , este asistente controla la distancia con el vehículo que nos precede por medio de un radar instalado en el paragolpes delantero y es capaz de frenar ante una situación de riesgo por colisión";
    }

    @Override
    public String getNombreEquipamiento() {
        return "FrontAssist"; 
    }

    @Override
    public double getPrecioEquipamiento() {
        return  19180.20;
    }


    
}
