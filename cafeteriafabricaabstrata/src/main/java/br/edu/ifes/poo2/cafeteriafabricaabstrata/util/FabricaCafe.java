/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriafabricaabstrata.util;

import br.edu.ifes.poo2.cafeteriafabricaabstrata.cdp.Cafe;

/**
 *
 * @author pchan
 */
public class FabricaCafe {
    
    public static Cafe CriarCafe(String nome){
        
        Fabrica fabrica = null;
        
        switch(nome){
            
            case "CafeExpresso":
                fabrica = new FabricaCafeExpresso();
                break;
            case "CafeCapuccino":
                fabrica = new FabricaCafeCapuccino();
                break;
            case "CafeSemCafeina":
                fabrica = new FabricaCafeSemCafeina();
                break;
            default:
                break;
        }
        
        Cafe cafe = fabrica.criarCafe();
        cafe.setNome(fabrica.DefinirNome());
        cafe.setValor(fabrica.DefinirValor());
        cafe.setAcucar(fabrica.AdicionarAcucar());
        cafe.setAgua(fabrica.AdicionarAgua());
        cafe.setBicarbonato(fabrica.AdicionarBicarbonato());
        cafe.setCafeSoluvel(fabrica.AdicionarCafeSoluvel());
        cafe.setCanela(fabrica.AdicionarCanela());
        cafe.setChocolate(fabrica.AdicionarChocolate());
        cafe.setLeite(fabrica.AdicionarLeite());
        
        return cafe;        
    }
    
}
