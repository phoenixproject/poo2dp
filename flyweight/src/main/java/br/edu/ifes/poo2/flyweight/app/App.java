/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.flyweight.app;

import br.edu.ifes.poo2.flyweight.cdp.DiagnosticTool;
import br.edu.ifes.poo2.flyweight.cdp.Engine;
import br.edu.ifes.poo2.flyweight.cdp.EngineDiagnosticTool;
import br.edu.ifes.poo2.flyweight.util.EngineFlyweightFactory;


/**
 *
 * @author 20101bsi0453
 */
public class App {
    
    public static void main(String args[]){
        
        // Create the flyweight factory
        EngineFlyweightFactory factory = new EngineFlyweightFactory();
        
        //Create the diagnostic tool
        DiagnosticTool tool = new EngineDiagnosticTool();
        
        //Get the flyweights and run diagnostics on them
        Engine standard1 = factory.getStandardEngine(1300);
        standard1.diagnose(tool);
                
        Engine standard2 = factory.getStandardEngine(1300);
        standard2.diagnose(tool);
        
        Engine standard3 = factory.getStandardEngine(1300);
        standard3.diagnose(tool);
        
        Engine standard4 = factory.getStandardEngine(1600);
        standard4.diagnose(tool);
        
        Engine standard5 = factory.getStandardEngine(1600);
        standard2.diagnose(tool);
        
        // Show that objects are shared
        System.out.println(standard1.hashCode());
        System.out.println(standard2.hashCode());
        System.out.println(standard3.hashCode());
        System.out.println(standard4.hashCode());
        System.out.println(standard5.hashCode());
    }
    
}
