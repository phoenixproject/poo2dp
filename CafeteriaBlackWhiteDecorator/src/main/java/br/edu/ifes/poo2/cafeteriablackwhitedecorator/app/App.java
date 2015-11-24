/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriablackwhitedecorator.app;

import br.edu.ifes.poo2.cafeteriablackwhitedecorator.cdp.Cafe;
import br.edu.ifes.poo2.cafeteriablackwhitedecorator.cdp.Chantili;
import br.edu.ifes.poo2.cafeteriablackwhitedecorator.cdp.ChocolateGranulado;
import br.edu.ifes.poo2.cafeteriablackwhitedecorator.cdp.CremeDeLaranja;
import br.edu.ifes.poo2.cafeteriablackwhitedecorator.cdp.Licor;
import br.edu.ifes.poo2.cafeteriablackwhitedecorator.util.FabricaCafePreparado;

/**
 *
 * @author pchan
 */
public class App {
    
    public static void main(String [] args)
    {
        try{
            Cafe cafe = FabricaCafePreparado.CriarCafePreparado("Café Expresso");                        
            
            System.out.println("Adicionando Chantili ao Café Expresso");
            cafe = new Chantili(cafe);
            System.out.println("Preço: "+cafe.getPreco());
                        
            cafe = FabricaCafePreparado.CriarCafePreparado("Café sem Cafeina");
            System.out.println("Adicionando Chocolate Granulado ao Café sem Cafeína");
            cafe = new ChocolateGranulado(cafe);
            System.out.println("Preço: "+cafe.getPreco());

            cafe = FabricaCafePreparado.CriarCafePreparado("Café Capuccino");
            System.out.println("Adicionando Licor e Creme de Laranja ao Café Cappucino");
            cafe = new Licor(cafe);
            System.out.println("Preço: "+cafe.getPreco());
            cafe = new CremeDeLaranja(cafe);
            System.out.println("Preço: "+cafe.getPreco());
            
        }catch(Exception e){
            e.printStackTrace();
        }
            
        
        
        
    }
    
}
