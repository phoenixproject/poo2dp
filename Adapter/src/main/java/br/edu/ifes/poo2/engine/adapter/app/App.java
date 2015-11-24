/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.engine.adapter.app;

import br.edu.ifes.poo2.engine.adapter.cdp.SuperGreenEngine;
import br.edu.ifes.poo2.engine.cdp.Engine;
import br.edu.ifes.poo2.engine.cdp.StandardEngine;
import br.edu.ifes.poo2.engine.cdp.SuperGreenEngineAdapter;
import br.edu.ifes.poo2.engine.cdp.TurboEngine;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pchan
 */
public class App {
    
    public static void main(String args[]){
        
        /*Engine engine = new StandardEngine(1300);
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
        controls2.ignitionOff();      */  
        
        List<Engine> engines = new ArrayList<Engine>();
              
        engines.add(new StandardEngine(1300));
        engines.add(new StandardEngine(1600));
        engines.add(new TurboEngine(2000));
        
        // "Adapt" the new engine type...
        SuperGreenEngine greenEngine = new SuperGreenEngine(1200);
        engines.add(new SuperGreenEngineAdapter(greenEngine));
        
        for (Engine engine : engines) {
            System.out.println(engine);
        }        
        
    }
    
}
