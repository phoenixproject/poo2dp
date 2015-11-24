/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.pizzariatacomfome.cdp;

/**
 *
 * @author pchan
 */
public class Cone extends AbstractIngrediente {
    
    public Cone(Pizza pizza) {
        super(pizza);
    }  
    
    @Override
    public Double getPreco() {
        return pizza.getPreco() + 10;
    }
    
}
