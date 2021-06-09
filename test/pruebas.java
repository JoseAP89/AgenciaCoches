
import Controllers.Controlador;
import Models.Automovil;
import Models.AutomovilSedan;
import Models.DecFrontAssist;
import Models.DecParkAssist;
import Models.DecSeguro;
import Models.IAutomovil;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salvador Solis Atenco
 */
public class pruebas {
    
    public static void main(String args[]) {
//        Automovil auto = new Automovil();
//        auto.setMarca("Nissan");
//        auto.setModelo("Versa");
//        auto.setNum_serie("JHLDRD77874C026456");
//        
//        IAutomovil auto2 = new AutomovilSedan(auto);//tipo de carro
//
//        auto2 = new DecParkAssist(auto2);//agrega decoradores
//        auto2 = new DecFrontAssist(auto2);
//        
//        System.out.println("Descripcion: "+auto2.ordenarAuto());
//        System.out.println("$" + auto2.cost());
        
        
        DecimalFormat formato = new DecimalFormat("$#,###.00");

        Controlador control = new Controlador();
        control.crearSedean();
        System.out.println("Descripcion: "+control.getDescripcion());
        System.out.println("Costo total $"+control.getTotal());
        control.addParkAssist();
        System.out.println(control.eqParkAssist.getNombreEquipamiento());
        System.out.println(control.eqParkAssist.getPrecioEquipamiento());
        System.out.println("Descripcion: "+control.getDescripcion());
        System.out.println("Costo total "+formato.format(control.getTotal()));
    }
    
}
