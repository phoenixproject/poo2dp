/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.flyweight.util;

import br.edu.ifes.poo2.flyweight.cdp.Engine;
import br.edu.ifes.poo2.flyweight.cdp.StandardEngine;
import br.edu.ifes.poo2.flyweight.cdp.TurboEngine;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 20101bsi0453
 */

//TEr a mesma área de memória para alocar os objetos comuns
public class EngineFlyweightFactory {
    
    private Map<Integer, Engine> standardEnginePool;
    private Map<Integer, Engine> turboEnginePool;
    
    public EngineFlyweightFactory(){
        
        standardEnginePool = new HashMap<Integer, Engine>();
        turboEnginePool = new HashMap<Integer, Engine>();                        
    }
    
    public Engine getStandardEngine(int size){
        Engine e = standardEnginePool.get(size);
        if(e == null){
            e = new StandardEngine(size);
            standardEnginePool.put(size, e);
        }
        
        return e;
    }

    public Engine getTurboEngine(int size){
        Engine e = turboEnginePool.get(size);
        if(e == null){
            e = new TurboEngine(size);
            turboEnginePool.put(size, e);
        }
        
        return e;
    }    
    
}
