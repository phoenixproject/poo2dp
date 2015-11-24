/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.flyweight;

import br.edu.ifes.pizzariatocomfome.exception.PrepararPedidoException;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Pizza;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.PizzaMussarela;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.PizzaQuatroQueijos;

/**
 *
 * @author pchan
 */
public class PreparacaoDoPedido {
    
    public Pizza PrepararPedido(String tipomassa) throws PrepararPedidoException{
        
        Pizza pizza = null;
        
        switch(tipomassa){
            case "Quatro queijos":
                pizza = new PizzaQuatroQueijos();
                System.out.println("Pizza Quatro queijos escolhida");
                break;
            case "Mussarela":
                pizza = new PizzaMussarela();
                System.out.println("Pizza Mussarela escolhida");
                break;
            default:
                throw new PrepararPedidoException(tipomassa);                
        }
        
        return pizza;        
    }
    
}
