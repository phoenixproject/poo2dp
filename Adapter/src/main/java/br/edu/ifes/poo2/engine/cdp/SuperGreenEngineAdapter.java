/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.engine.cdp;

import br.edu.ifes.poo2.engine.adapter.cdp.SuperGreenEngine;

/**
 *
 * @author 20101bsi0453
 */
public class SuperGreenEngineAdapter extends AbstractEngine {
 
    public SuperGreenEngineAdapter(SuperGreenEngine greenEngine) {
        super(greenEngine.getEngineSize(), false);
    }
    
}
