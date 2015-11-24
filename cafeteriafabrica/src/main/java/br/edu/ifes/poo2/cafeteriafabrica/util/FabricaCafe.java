/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriafabrica.util;

import br.edu.ifes.poo2.cafeteriafabrica.cdp.Cafe;

/**
 *
 * @author pchan
 */
public class FabricaCafe {

    public static Cafe CriarCafe(String nome) throws CafeException {

        Fabrica fabrica = null;
        
        switch (nome) {

            case "Café Expresso":
                fabrica = new FabricaCafeExpresso();
                break;
            case "Café Capuccino":
                fabrica = new FabricaCafeCapuccino();
                break;                
            case "Café sem Cafeina":
                fabrica = new FabricaCafeSemCafeina();
                break;                
            default:
                throw new CafeException(nome);                
        }

        Cafe cafe = fabrica.criarCafe();
        cafe.setNome(fabrica.DefinirNome());
        cafe.setValor(fabrica.DefinirValor());
        System.out.println(cafe);
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

/**
 
  switch(nome){
            
            case "Café Expresso":
                fabrica = new FabricaCafeExpresso();
                break;
            case "Café Capuccino":
                fabrica = new FabricaCafeCapuccino();
                break;
            case "Café sem Cafeina":
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
 
 
 */
