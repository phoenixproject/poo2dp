/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.pizzariatocomfome.bridge;

import br.edu.ifes.poo2.pizzariatacomfome.cdp.Pizza;

/**
 *
 * @author pchan
 */
public interface ComplementoDePizza extends Pizza {
    
    public Pizza AdicionaMolhoDeTomate(Pizza pizza);
    public Pizza AdicionaCebola(Pizza pizza);
    public Pizza AdicionaPresunto(Pizza pizza);
    
}
