/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.bridge.app;

import br.edu.ifes.poo2.bridge.cdp.Engine;
import br.edu.ifes.poo2.bridge.cdp.SportControls;
import br.edu.ifes.poo2.bridge.cdp.StandardControls;
import br.edu.ifes.poo2.bridge.cdp.StandardEngine;

/**
 *
 * @author 20101bsi0453
 */
public class App {
    
    public static void main(String args[]){
        
        Engine engine = new StandardEngine(1300);
        StandardControls controls1 = new StandardControls(engine);
        controls1.ignitionOn();
        controls1.accelarate();
        controls1.brake();
        controls1.ignitionOff();

        // Now use sport controls
        SportControls controls2 = new SportControls(engine);
        controls2.ignitionOn();
        controls2.accelarate();
        controls2.accelerateHard();
        controls2.brake();
        controls2.ignitionOff();        
    }
    
}
