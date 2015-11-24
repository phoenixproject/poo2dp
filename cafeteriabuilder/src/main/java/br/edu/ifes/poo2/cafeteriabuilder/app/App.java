/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriabuilder.app;

import br.edu.ifes.poo2.cafeteriabuilder.cdp.Cafe;
import br.edu.ifes.poo2.cafeteriabuilder.util.CafeException;
import br.edu.ifes.poo2.cafeteriabuilder.util.FabricaCafe;

/**
 *
 * @author pchan
 */
public class App {
    
    public static void main(String [] args) throws CafeException
    {
        Cafe cafe = FabricaCafe.CriarCafe("CafeExpresso");
        //System.out.println(cafe);
        //System.out.println("");

        cafe = FabricaCafe.CriarCafe("CafeSemCafeina");
        //System.out.println(cafe);
        //System.out.println("");
        
        cafe = FabricaCafe.CriarCafe("CafeCapuccino");
        //System.out.println(cafe);
        
    }
    
}
