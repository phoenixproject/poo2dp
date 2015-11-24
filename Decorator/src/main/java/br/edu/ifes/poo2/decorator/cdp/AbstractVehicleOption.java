/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.decorator.cdp;

/**
 *
 * @author 20101bsi0453
 */
public abstract class AbstractVehicleOption extends AbstractVehicle {

    protected Vehicle decoratedVehicle;
    
    @Override
    public int getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public AbstractVehicleOption(Vehicle vehicle){        
        decoratedVehicle = vehicle;
    }
        
}
