/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriafabrica.util;

import br.edu.ifes.poo2.cafeteriafabrica.cdp.CafeSoluvel;

/**
 *
 * @author pchan
 */
public class FabricaCafeSemCafeina extends FabricaCafeExpresso {
    
    @Override
    public String DefinirNome() {
        return "Café sem Cafeína";
    }
    
    @Override
    public Double DefinirValor() {
        return 3.0;
    }
    
    @Override
    public CafeSoluvel AdicionarCafeSoluvel() {
        return new CafeSoluvel("Adicionando 50g de Café Solúvel Descafeínado");
    }
    
    
    
}
