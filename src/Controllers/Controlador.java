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
import Models.IAutomovil;

/**
 *
 * @author Salvador Solis Atenco
 */
public class Controlador {
    Automovil auto;
    IAutomovil autoTune;

    public Controlador() {
        this.auto = new Automovil();
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
    }
    
    public void crearPickUp(){
        autoTune = new AutomovilPickUp(auto);
    }
    
    public double getTotal(){
       return autoTune.cost();
    }
    
    public String getDescripcion(){
        return autoTune.ordenarAuto();
    }
    
    public void addCamara360(){
        autoTune = new DecCamara360(autoTune);
    }
    
    public void addFrontAssist(){
        autoTune = new DecFrontAssist(autoTune);
    }

    public void addNavegador(){
        autoTune = new DecNavegador(autoTune);
    }

    public void addParkAssist(){
        autoTune = new DecParkAssist(autoTune);
    }
    
    public void addPintura(){
        autoTune = new DecPintura(autoTune);
    }

    public void addRines() {
        autoTune = new DecRines(autoTune);
    }
    
    public void addSeguro() {
        autoTune = new DecSeguro(autoTune);
    }    
    
}
