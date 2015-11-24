/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.pizzariatocomfome.facade;

import br.edu.ifes.pizzariatocomfome.bridge.ComplementoDePizza;
import br.edu.ifes.pizzariatocomfome.bridge.ControleDeComplemento;
import br.edu.ifes.pizzariatocomfome.exception.PrepararPedidoException;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Pizza;

/**
 *
 * @author pchan
 */
public class PizzaFacade {
    
    public void PreparaParaVenda(Pizza pizza) throws PrepararPedidoException{
        
        String tipomassa = pizza.getTipoMassa();
        
        //Definição de formato da Pizza
        DefinicaoDeFormato definicaoDeFormato = new DefinicaoDeFormato();
        
        try{
            pizza = definicaoDeFormato.DefinicaoDeFormatoDePizza(pizza);
        } catch(Exception e){
            e.printStackTrace();
        }
        
        //Adicção de Queijo
        AdicaoDeQueijo adicaoDeQueijo = new AdicaoDeQueijo();        
                
        switch(tipomassa){
            
            case "Quatro queijos":
                System.out.println("Escolhida Pizza " + tipomassa);
                pizza = adicaoDeQueijo.PreparacaoQuatroQueijos(pizza);
                break;
            case "Mussarela":
                System.out.println("Escolhida Pizza " + tipomassa);
                pizza = adicaoDeQueijo.PreparacaoMussarela(pizza);
                break;
            default:
                throw new PrepararPedidoException(tipomassa);
        }
        
        //Adição de complementos em modo Bridge
        ComplementoDePizza complementoDePizza = new ControleDeComplemento();
        Complemento complemento = new Complemento(complementoDePizza);
                
        pizza = complemento.ColocarMolhoDeTomate(pizza);
        System.out.println("Preço: "+pizza.getPreco());
        
        pizza = complemento.ColocarCebola(pizza);
        System.out.println("Preço: "+pizza.getPreco());
                
        pizza = complemento.ColocarPresunto(pizza);
        System.out.println("Preço: "+pizza.getPreco());
        
        System.out.println(" ------------------------ ");
        System.out.println(" ");
        
    }
    
}
