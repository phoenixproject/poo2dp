/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.pizzariatocomfome.facade;

import br.edu.ifes.poo2.pizzariatocomfome.exception.DefinicaoDeFormatoException;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Cone;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Pizza;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Tradicional;

/**
 *
 * @author paulo.henrique
 */
public class DefinicaoDeFormato {
    
    
    public Pizza DefinicaoDeFormatoDePizza(Pizza pizza) throws DefinicaoDeFormatoException{
        
        switch(pizza.getTipoPizza()){
            case "Cone":
                System.out.println("Pizza em formato Cone escolhida");
                pizza = new Cone(pizza);
                System.out.println("Preço: "+pizza.getPreco());                
                break;
            case "Tradicional":
                System.out.println("Pizza em formato Tradicional escolhida");
                pizza = new Tradicional(pizza);
                System.out.println("Preço: "+pizza.getPreco());                
                break;
            default:
                throw new DefinicaoDeFormatoException(pizza.getTipoPizza());
        }
        
        return pizza;
    }
    
}
