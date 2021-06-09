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
public class DecCamara360 extends DecoradorEquipamiento{

    public DecCamara360(IAutomovil AutoDecorado) {
        super(AutoDecorado);
    }
    
    @Override
    public String ordenarAuto() {
        descripcionCamara360();
        return AutoDecorado.ordenarAuto() + ", equipamiento de Camaras 360° ";
    }


    @Override
    public double cost() {
        return this.getPrecioEquipamiento() + AutoDecorado.cost();
    }

    private void descripcionCamara360() {
        System.out.println("Como opcion para facilitar el aparcamiento, la camara de visión trasera permite una mejor percepción periferica de todo lo que rodea al auto ");
    }
    
    @Override
    public String getNombreEquipamiento() {
        return "Camara 360°";
    }
    
    @Override
    public double getPrecioEquipamiento() {
        return 4057.00;
    }
    
}
