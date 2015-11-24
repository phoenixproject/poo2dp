/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.flyweight.cdp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20101bsi0453
 */
public class EngineDiagnosticTool implements DiagnosticTool {
    
    @Override
    public void runDiagnosis(Object obj) {
            
        System.out.println("Starting engine diagnostic tool for " + obj);
        
        try{
            Thread.sleep(5000);
            System.out.println("Engine diagnoses complete");
        }catch(InterruptedException ex){
            System.out.println("Engine diagnoses interrupted");
        }
    }
    
}
