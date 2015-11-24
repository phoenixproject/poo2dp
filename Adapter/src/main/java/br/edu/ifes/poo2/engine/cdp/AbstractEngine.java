/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.engine.cdp;

/**
 *
 * @author 20101bsi0453
 */
public abstract class AbstractEngine implements Engine {

    private int size;
    private boolean turbo;
    
    public AbstractEngine(int size, boolean turbo) {
        this.size = size;
        this.turbo = turbo;
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isTurbo() {
        return turbo;
    }
    
    public String toString() {
        return getClass().getSimpleName() +
                " (" + size + ")";
    }
        
}
