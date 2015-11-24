/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.pizzariatocomfome.facade;

import br.edu.ifes.poo2.pizzariatacomfome.cdp.Gorgonzola;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Margherita;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Mussarela;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Parmesao;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Pizza;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Provolone;

/**
 *
 * @author pchan
 */
public class AdicaoDeQueijo {
    
    public Pizza PreparacaoQuatroQueijos(Pizza pizza){
        
        System.out.println("Adicionando Queijo Parmesão");
        pizza = new Parmesao(pizza);
        System.out.println("Preço: "+pizza.getPreco());
        
        System.out.println("Adicionando Queijo Mussarela");
        pizza = new Mussarela(pizza);
        System.out.println("Preço: "+pizza.getPreco());
        
        System.out.println("Adicionando Queijo Margherita");
        pizza = new Margherita(pizza);
        System.out.println("Preço: "+pizza.getPreco());
        
        System.out.println("Adicionando Queijo Provolone");
        pizza = new Provolone(pizza);
        System.out.println("Preço: "+pizza.getPreco());
        
        System.out.println("Adicionando Queijo Gorgonzola");
        pizza = new Gorgonzola(pizza);        
        System.out.println("Preço: "+pizza.getPreco());
        
        return pizza;
    }
    
    public Pizza PreparacaoMussarela(Pizza pizza){
        
        System.out.println("Adicionando Queijo Mussarela");
        pizza = new Mussarela(pizza);        
        System.out.println("Preço: "+pizza.getPreco());
        
        System.out.println("Adicionando Queijo Gorgonzola");
        pizza = new Gorgonzola(pizza);        
        System.out.println("Preço: "+pizza.getPreco());
        
        return pizza;
    }    
    
}
