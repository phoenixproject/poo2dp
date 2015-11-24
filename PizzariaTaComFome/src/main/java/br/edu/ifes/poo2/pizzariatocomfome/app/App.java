/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.pizzariatocomfome.app;

import br.edu.ifes.poo2.pizzariatocomfome.facade.PizzaFacade;
import br.edu.ifes.poo2.pizzariatocomfome.flyweight.PizzaFlyweightFactory;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Pizza;

/**
 *
 * @author pchan
 */
public class App {
    
    public static void main(String args[]){
        
        Pizza pizza = null;
        
        try{
            PizzaFlyweightFactory pizzaFlyweightFactory = new PizzaFlyweightFactory();
            pizza = pizzaFlyweightFactory.getPizzaPorMassa("Tradicional","Quatro queijos");            
        } catch(Exception e){
            e.printStackTrace();
        }
        PizzaFacade facade = new PizzaFacade();
        try{
            facade.PreparaParaVenda(pizza);        
        }catch(Exception e){
            e.printStackTrace();
        }        
        
        try{
            PizzaFlyweightFactory pizzaFlyweightFactory = new PizzaFlyweightFactory();
            pizza = pizzaFlyweightFactory.getPizzaPorMassa("Tradicional","Mussarela");            
        } catch(Exception e){
            e.printStackTrace();
        }
        facade = new PizzaFacade();
        try{
            facade.PreparaParaVenda(pizza);        
        }catch(Exception e){
            e.printStackTrace();
        }        
        
        try{
            PizzaFlyweightFactory pizzaFlyweightFactory = new PizzaFlyweightFactory();
            pizza = pizzaFlyweightFactory.getPizzaPorMassa("Cone","Quatro queijos");            
        } catch(Exception e){
            e.printStackTrace();
        }
        facade = new PizzaFacade();
        try{
            facade.PreparaParaVenda(pizza);        
        }catch(Exception e){
            e.printStackTrace();
        }        
        
        try{
            PizzaFlyweightFactory pizzaFlyweightFactory = new PizzaFlyweightFactory();
            pizza = pizzaFlyweightFactory.getPizzaPorMassa("Cone","Mussarela");            
        } catch(Exception e){
            e.printStackTrace();
        }
        facade = new PizzaFacade();
        try{
            facade.PreparaParaVenda(pizza);        
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
}
