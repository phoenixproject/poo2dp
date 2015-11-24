/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.proxy.cdp;

/**
 *
 * @author 20101bsi0453
 */
public abstract class AbstractEngine implements Engine {

    public int size;
    private boolean turbo;
    DiagnosticTool diagnosticTool;
    
    public AbstractEngine(int size, boolean turbo){
        this.size = size;
        this.turbo = turbo;
    }
    
    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isTurbo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void diagnose(DiagnosticTool diagnosticTool) {
        
    }
    

    
}
