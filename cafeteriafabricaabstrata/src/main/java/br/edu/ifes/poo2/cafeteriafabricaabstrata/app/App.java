/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriafabricaabstrata.app;

import br.edu.ifes.poo2.cafeteriafabricaabstrata.cdp.Cafe;
import br.edu.ifes.poo2.cafeteriafabricaabstrata.util.FabricaCafe;

/**
 *
 * @author pchan
 */
public class App {
    
    public static void main(String [] args)
    {
        Cafe cafe = FabricaCafe.CriarCafe("CafeExpresso");
        System.out.println(cafe);
        System.out.println("");

        cafe = FabricaCafe.CriarCafe("CafeSemCafeina");
        System.out.println(cafe);
        System.out.println("");
        
        cafe = FabricaCafe.CriarCafe("CafeCapuccino");
        System.out.println(cafe);
        
    }
    
}
