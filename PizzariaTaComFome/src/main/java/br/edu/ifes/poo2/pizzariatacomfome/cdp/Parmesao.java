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
public class Parmesao extends AbstractIngrediente {

    public Parmesao(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public Double getPreco() {
        return pizza.getPreco() + 1;
    }     
    
}
