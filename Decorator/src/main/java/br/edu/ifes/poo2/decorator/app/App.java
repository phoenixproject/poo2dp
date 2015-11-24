/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.decorator.app;

import br.edu.ifes.poo2.decorator.cdp.AirConditionedVehicle;
import br.edu.ifes.poo2.decorator.cdp.AlloyWheeledVehicle;
import br.edu.ifes.poo2.decorator.cdp.LeatherSeatedVehicle;
import br.edu.ifes.poo2.decorator.cdp.Saloon;
import br.edu.ifes.poo2.decorator.cdp.Vehicle;

/**
 *
 * @author 20101bsi0453
 */
public class App {
    
    public static void main(String[] args){
        
        //Create a blue saloon car...
        Vehicle myCar = new Saloon();
        
        //Add air-conditioning to the car
        myCar = new AirConditionedVehicle(myCar);
        
        System.out.println("Preço: "+myCar.getPrice());
        
        //Now add alooy wheels ...
        myCar = new AlloyWheeledVehicle(myCar);
        
        System.out.println("Preço: "+myCar.getPrice());
        
        //Now add leather seats...
        myCar = new LeatherSeatedVehicle(myCar);
        
        System.out.println("Preço: "+myCar.getPrice());
    }
    
}
