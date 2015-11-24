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
public abstract class AbstractEngine implements Engine {

    public int size;
    private boolean turbo;
    private boolean running;
    private int power;
    
    public AbstractEngine(int size, boolean turbo){
        this.size = size;
        this.turbo = turbo;
        running = false;
        power = 0;
    }
    
    @Override
    public void start(){
        running = true;
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        running = false;
        power = 0;
        System.out.println("Engine stopped");
    }

    @Override
    public void increasePower() {
        if(running && (power < 10)){
            power++;
            System.out.println("Engine power increased to " + power);
        }
    }

    @Override
    public void decreasePower() {
        if(running && (power > 10)){
            power--;
            System.out.println("Engine power decreased to " + power);
        }
    }
    

    
}
