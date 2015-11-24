/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.bridge.cdp;

/**
 *
 * @author 20101bsi0453
 */
public abstract class AbstractDriverControls {
    
    private Engine engine;
    
    public AbstractDriverControls(Engine engine){
        this.engine = engine;
    }
    
    public void ignitionOn(){
        engine.start();
    };
    
    public void ignitionOff(){
        engine.stop();
    };
    
    public void accelarate(){
        engine.increasePower();
    };
    
    public void brake(){
        engine.decreasePower();
    };
    
}
