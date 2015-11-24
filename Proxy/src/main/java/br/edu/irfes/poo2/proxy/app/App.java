/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.irfes.poo2.proxy.app;

import br.edu.ifes.poo2.proxy.cdp.DiagnosticTool;
import br.edu.ifes.poo2.proxy.cdp.Engine;
import br.edu.ifes.poo2.proxy.cdp.EngineDiagnosticTool;
import br.edu.ifes.poo2.proxy.cdp.EngineProxy;
import br.edu.ifes.poo2.proxy.cdp.PrimeiraThread;
import br.edu.ifes.poo2.proxy.util.EngineFlyweightFactory;

/**
 *
 * @author 20101bsi0453
 */
public class App {
    
    public static void main (String [] args){
        
        /*PrimeiraThread primeiraThread = new PrimeiraThread();
        primeiraThread.setName("Thread1");        
        primeiraThread.start();*/
                
        // Create the flyweight factory
        EngineFlyweightFactory factory = new EngineFlyweightFactory();
        
        //Create the diagnostic tool
        DiagnosticTool tool = new EngineDiagnosticTool();
        
        //Get the flyweights and run diagnostics on them
        Engine standard1 = new EngineProxy(1300, true);
        standard1.diagnose(tool);
        //EngineProxy engineProxy = factory.getStandardEngine(1300);
          
        Engine standard2 = new EngineProxy(1600, true);
        standard2.diagnose(tool);        
        /*Engine standard2 = factory.getStandardEngine(1300);
        standard2.diagnose(tool);
        
        Engine standard3 = factory.getStandardEngine(1300);
        standard3.diagnose(tool);
        
        Engine standard4 = factory.getStandardEngine(1600);
        standard4.diagnose(tool);
        
        Engine standard5 = factory.getStandardEngine(1600);
        standard2.diagnose(tool);*/
        
        // Show that objects are shared
        System.out.println(standard1.hashCode());
        System.out.println(standard2.hashCode());
        //System.out.println(standard3.hashCode());
        //System.out.println(standard4.hashCode());
        //System.out.println(standard5.hashCode());        
        
        
        
        
    }
    
}
