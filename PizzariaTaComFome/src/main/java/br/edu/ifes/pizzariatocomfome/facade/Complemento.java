/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.pizzariatocomfome.facade;

import br.edu.ifes.pizzariatocomfome.bridge.ComplementoDePizza;
import br.edu.ifes.pizzariatocomfome.bridge.ControleDeComplemento;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Pizza;

/**
 *
 * @author pchan
 */
public class Complemento {
    
    private ComplementoDePizza complementoDePizza;
    
    public Complemento(ComplementoDePizza complementoDePizza){
        this.complementoDePizza = complementoDePizza;
    }
    
    public Pizza ColocarMolhoDeTomate(Pizza pizza){
        return complementoDePizza.AdicionaMolhoDeTomate(pizza);
    }
    
    public Pizza ColocarCebola(Pizza pizza){
        return complementoDePizza.AdicionaCebola(pizza);
    }
    
    public Pizza ColocarPresunto(Pizza pizza){
        return complementoDePizza.AdicionaPresunto(pizza);
    }
    
}
