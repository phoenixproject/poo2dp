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
public class EngineProxy implements Engine {
    
    private Engine engine;
    
    public EngineProxy(int size, boolean turbo){
        
        if(turbo){
            engine = new TurboEngine(size);
        }
        else{
            engine = new StandardEngine(size);
        }
    }
    
    @Override
    public int getSize(){
        return engine.getSize();
    }
    
    @Override
    public boolean isTurbo(){
        return engine.isTurbo();
    }
    
    //This method is time-consuming
    @Override
    public void diagnose(final DiagnosticTool tool){
        
        //Run the metho as a separate thread
        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("(Turnning tool as thread)");
                engine.diagnose(tool);
            }
        });
        
    }
    
}
