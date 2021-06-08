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
public class DecRines extends DecoradorEquipamiento{

    public DecRines(IAutomovil AutoDecorado) {
        super(AutoDecorado);
    }

    @Override
    public String ordenarAuto() {
        agregarRines();
        return AutoDecorado.ordenarAuto()+", se agregan rines";
    }
    
    @Override
    public double cost() {
        return 7370.00 + AutoDecorado.cost();
    }

    private void agregarRines() {
        System.out.println("Se agregaron rines");
    }
    
}
