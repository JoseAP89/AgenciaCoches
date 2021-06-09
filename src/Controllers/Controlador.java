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
    public IAutomovil autoTune;
    public DecCamara360 eqCamaras;
    public DecFrontAssist eqFrontAssist ;
    public DecNavegador eqNavegador;
    public DecParkAssist  eqParkAssist;
    public DecPintura eqPintura;
    public DecRines eqRines;
    public DecSeguro eqSeguro;
            

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
        eqCamaras = new DecCamara360(autoTune);
        autoTune = new DecCamara360(autoTune);
    }
    
    public void addFrontAssist(){
        eqFrontAssist = new DecFrontAssist(autoTune);
        autoTune = new DecFrontAssist(autoTune);
    }

    public void addNavegador(){
        eqNavegador = new DecNavegador(autoTune);
        autoTune = new DecNavegador(autoTune);
    }

    public void addParkAssist(){
        eqParkAssist = new DecParkAssist(autoTune);
        autoTune = new DecParkAssist(autoTune);
    }
    
    public void addPintura(){
        eqPintura = new DecPintura(autoTune);
        autoTune = new DecPintura(autoTune);
    }

    public void addRines() {
        eqRines = new DecRines(autoTune);
        autoTune = new DecRines(autoTune);
    }
    
    public void addSeguro() {
        eqSeguro = new DecSeguro(autoTune);
        autoTune = new DecSeguro(autoTune);
    }    
    
}
