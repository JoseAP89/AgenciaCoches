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
public class BlindajeDecorador extends DecoradorEquipamiento{

    public BlindajeDecorador(IAutomovil AutoDecorado) {
        super(AutoDecorado);
    }

    @Override
    public void ordenarAuto(Automovil auto) {
        AutoDecorado.ordenarAuto(auto);
        agregarBlindaje(auto);
    }

    private void agregarBlindaje(Automovil auto) {
        System.out.println("Se agrego seguro de Blindaje total");
    }
    
    
}
