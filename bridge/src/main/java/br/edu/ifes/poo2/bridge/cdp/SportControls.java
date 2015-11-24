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
public class SportControls extends AbstractDriverControls {

    public SportControls(Engine engine) {
        super(engine);
    }
    
    public void accelerateHard(){
        accelarate();
        accelarate();
    }
    
}
