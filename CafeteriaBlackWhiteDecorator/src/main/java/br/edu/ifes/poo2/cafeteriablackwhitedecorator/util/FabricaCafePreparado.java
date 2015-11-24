/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriablackwhitedecorator.util;

import br.edu.ifes.poo2.cafeteriablackwhitedecorator.cdp.CafePreparado;

/**
 *
 * @author pchan
 */
public class FabricaCafePreparado {

    public static CafePreparado CriarCafePreparado(String nome) throws CafeException {

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

        CafePreparado cafePreparado = fabrica.criarCafePreparado();
        cafePreparado.setNome(fabrica.DefinirNome());
        cafePreparado.setPreco(fabrica.DefinirValor());
        System.out.println(cafePreparado);
        cafePreparado.setAcucar(fabrica.AdicionarAcucar());
        cafePreparado.setAgua(fabrica.AdicionarAgua());
        cafePreparado.setBicarbonato(fabrica.AdicionarBicarbonato());
        cafePreparado.setCafeSoluvel(fabrica.AdicionarCafeSoluvel());
        cafePreparado.setCanela(fabrica.AdicionarCanela());
        cafePreparado.setChocolate(fabrica.AdicionarChocolate());
        cafePreparado.setLeite(fabrica.AdicionarLeite());

        return cafePreparado;
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
