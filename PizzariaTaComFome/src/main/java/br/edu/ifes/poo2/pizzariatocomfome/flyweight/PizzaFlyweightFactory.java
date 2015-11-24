/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.pizzariatocomfome.flyweight;

import br.edu.ifes.poo2.pizzariatocomfome.exception.FlyweightException;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Pizza;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pchan
 */
public class PizzaFlyweightFactory  {
        
    private Map<String, Pizza> tipomassa;    
    private PreparacaoDoPedido preparacaoDoPedido;
        
    public PizzaFlyweightFactory(){        
        
        preparacaoDoPedido = new PreparacaoDoPedido();
    }
    
    public Pizza getPizzaPorMassa(String descricaotipopizza, String descricaotipomassa) throws FlyweightException{
        
        try{
            CriaHashPorMassaDePizza(descricaotipomassa);
        } catch(Exception e){
            e.printStackTrace();
        }
        
        Pizza pizza = this.tipomassa.get(descricaotipomassa);
               
        if(pizza == null){
            try{
                pizza = preparacaoDoPedido.PrepararPedido(descricaotipomassa);
            } catch(Exception e){
                e.printStackTrace();
            }
           
           this.tipomassa.put(descricaotipopizza, pizza);           
        }
        
        pizza.setPreco(0.0);
        pizza.setTipoMassa(descricaotipomassa);
        pizza.setTipoPizza(descricaotipopizza);
        
        return pizza;
    }
    
    public void CriaHashPorMassaDePizza(String descricaotipomassa) throws FlyweightException{
                        
        switch(descricaotipomassa){
            case "Quatro queijos":
                this.tipomassa = new HashMap<String, Pizza>();                
                break;
            case "Mussarela":
                this.tipomassa = new HashMap<String, Pizza>();
                break;
            default:                
                throw new FlyweightException(descricaotipomassa);                           
        }
    }    
}
