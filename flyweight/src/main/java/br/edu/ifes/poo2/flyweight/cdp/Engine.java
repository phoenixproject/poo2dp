/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.flyweight.cdp;

/**
 *
 * @author 20101bsi0453
 */
public interface Engine {
    
    public int getSize();
    public boolean isTurbo();
    public void diagnose(DiagnosticTool diagnosticTool);
        
}
