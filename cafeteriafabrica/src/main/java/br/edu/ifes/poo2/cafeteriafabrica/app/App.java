/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriafabrica.app;

import br.edu.ifes.poo2.cafeteriafabrica.cdp.Cafe;
import br.edu.ifes.poo2.cafeteriafabrica.util.FabricaCafe;

/**
 *
 * @author pchan
 */
public class App {
    
    public static void main(String [] args)
    {
        try{
            Cafe cafe = FabricaCafe.CriarCafe("Cafe Expresso");
            //System.out.println(cafe);
            //System.out.println("");

            cafe = FabricaCafe.CriarCafe("Cafe sem Cafeina");
            //System.out.println(cafe);
            //System.out.println("");

            cafe = FabricaCafe.CriarCafe("Cafe Capuccino");
            //System.out.println(cafe);            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
}
