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
        descripcionParkAssist();
        return AutoDecorado.ordenarAuto() + ", equipamiento ParkAssist";
    }


    @Override
    public double cost() {
        return 13785.00 + AutoDecorado.cost();
    }

    private void descripcionParkAssist() {
        System.out.println("ParkAssist, con ayuda de sensores de aproximación, el coche se encarga por si mismo de girar el volante y meter el coche en la plaza libre");
    }
    
}
