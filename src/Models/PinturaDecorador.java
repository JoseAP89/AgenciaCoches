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
public class PinturaDecorador extends DecoradorEquipamiento{

    public PinturaDecorador(IAutomovil AutoDecorado) {
        super(AutoDecorado);
    }

    @Override
    public void ordenarAuto(Automovil auto) {
        AutoDecorado.ordenarAuto(auto);
        agregarPintura(auto);
    }

    private void agregarPintura(Automovil auto) {
        System.out.println("Se ordeno agregar pintura de color...");   
    }
    
    
}
