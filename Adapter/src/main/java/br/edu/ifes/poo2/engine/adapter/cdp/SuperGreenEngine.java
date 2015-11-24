/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.engine.adapter.cdp;

/**
 *
 * @author 20101bsi0453
 */
public class SuperGreenEngine {
    
    private int engineSize;
    
    public SuperGreenEngine(int engineSize) {
        this.engineSize = engineSize;
    }
    
    public int getEngineSize() {
        return engineSize;
    }
    
    public String toString() {
        return "SUPER ENGINE " + engineSize;
    }
    
}
