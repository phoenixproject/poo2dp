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
public abstract class AbstractIngrediente extends AbstractPizza{
    
    protected Pizza pizza;
    
    @Override
    public Double getPreco() {
        return super.getPreco(); 
    }    
    
    public AbstractIngrediente(Pizza pizza){
        this.pizza = pizza;
    }    
}
