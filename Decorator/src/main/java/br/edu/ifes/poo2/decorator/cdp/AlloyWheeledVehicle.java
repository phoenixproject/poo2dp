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
public class AlloyWheeledVehicle extends AbstractVehicleOption {

    public AlloyWheeledVehicle(Vehicle vehicle) {
        super(vehicle);
    }
    
    @Override
    public int getPrice() {
        return decoratedVehicle.getPrice() + 250;
    }
    
    
    
}
