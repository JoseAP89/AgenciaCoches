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
public class DecSeguro extends DecoradorEquipamiento{

    public DecSeguro(IAutomovil AutoDecorado) {
        super(AutoDecorado);
    }

    @Override
    public String ordenarAuto() {
        return AutoDecorado.ordenarAuto() + ", se agrego Seguro de Auto";
    }

    @Override
    public double cost() {
        return this.getPrecioEquipamiento() + AutoDecorado.cost();
    }

    @Override
    public String getNombreEquipamiento() {
        return "Seguro";
    }

    @Override
    public double getPrecioEquipamiento() {
        return 13303.00;
    }
    
    public String getDescripcionEquipamiento() {
        return "Seguro de cobertura total contra diversos daños.";
    }
}
