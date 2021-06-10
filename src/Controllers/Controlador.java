/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Automovil;
import Models.AutomovilPickUp;
import Models.AutomovilSedan;
import Models.DecCamara360;
import Models.DecFrontAssist;
import Models.DecNavegador;
import Models.DecParkAssist;
import Models.DecPintura;
import Models.DecRines;
import Models.DecSeguro;
import Models.DecoradorEquipamiento;
import Models.IAutomovil;

/**
 *
 * @author Salvador Solis Atenco
 */
public class Controlador {
    private Automovil auto;
    private IAutomovil autoTune;
    public DecoradorEquipamiento equipamiento;
    
    public Controlador() {
        this.auto = new Automovil();
        if(auto != null)
            System.out.println("se crea automovil");
    }
    
    public void setMarca(String marca) {
        auto.setMarca(marca);
    }

    public void setModelo(String modelo) {
        auto.setModelo(modelo);
    }

    public void setSerie(String serie) {
        auto.setNum_serie(serie);
    }

    public void crearSedean() {
        autoTune = new AutomovilSedan(auto);
        if(autoTune != null){
            System.out.println("Se crea un auto interfaz Sedan");
        }else{
            System.out.println("No se crea el objeto");
        }    
    }
    
    public void crearPickUp(){
        autoTune = new AutomovilPickUp(auto);
        if(autoTune != null){
            System.out.println("Se crea un auto interfaz Pick Up");
        }else{
            System.out.println("No se crea el objeto");
        }
            
    }
    
    public double getTotal(){
       return autoTune.cost();
    }
    
    public String getDescripcion(){
        return autoTune.ordenarAuto();
    }
    
    public void addCamara360(){
        equipamiento = new DecCamara360(autoTune);
        autoTune = new DecCamara360(autoTune);
    }
    
    public void addFrontAssist(){
        equipamiento = new DecFrontAssist(autoTune);
        autoTune = new DecFrontAssist(autoTune);
    }

    public void addNavegador(){
        equipamiento = new DecNavegador(autoTune);
        autoTune = new DecNavegador(autoTune);
    }

    public void addParkAssist(){
        equipamiento = new DecParkAssist(autoTune);
        autoTune = new DecParkAssist(autoTune);
    }
    
    public void addPintura(){
        equipamiento = new DecPintura(autoTune);
        autoTune = new DecPintura(autoTune);
    }

    public void addRines() {
        equipamiento = new DecRines(autoTune);
        autoTune = new DecRines(autoTune);
    }
    
    public void addSeguro() {
        equipamiento = new DecSeguro(autoTune);
        autoTune = new DecSeguro(autoTune);
    }    
    
}
