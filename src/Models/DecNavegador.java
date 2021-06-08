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
public class DecNavegador extends DecoradorEquipamiento{

    public DecNavegador(IAutomovil AutoDecorado) {
        super(AutoDecorado);
    }

    @Override
    public String ordenarAuto() {
        descripcionNavegador();
        return AutoDecorado.ordenarAuto() + ", equipamiento de Navegador";
    }    
    
    @Override
    public double cost() {
        return 3836.00 + AutoDecorado.cost();
    }

    private void descripcionNavegador() {
        System.out.println("Navegador integrado en la consola central.");
    }
    
}
