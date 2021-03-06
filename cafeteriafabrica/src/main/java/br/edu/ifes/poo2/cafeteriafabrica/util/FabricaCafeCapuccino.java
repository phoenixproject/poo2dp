/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriafabrica.util;

import br.edu.ifes.poo2.cafeteriafabrica.cdp.Acucar;
import br.edu.ifes.poo2.cafeteriafabrica.cdp.Bicarbonato;
import br.edu.ifes.poo2.cafeteriafabrica.cdp.CafeSoluvel;
import br.edu.ifes.poo2.cafeteriafabrica.cdp.Canela;
import br.edu.ifes.poo2.cafeteriafabrica.cdp.Chocolate;
import br.edu.ifes.poo2.cafeteriafabrica.cdp.Leite;

/**
 *
 * @author pchan
 */
public class FabricaCafeCapuccino extends FabricaCafeExpresso {
    
    @Override
    public String DefinirNome() {
        return "Café Capuccino";
    }    
    
    @Override
    public Double DefinirValor() {
        return 5.0;
    }
    
    @Override
    public CafeSoluvel AdicionarCafeSoluvel() {
        return new CafeSoluvel("Adicionando 50g de Café Solúvel Descafeínado");
    }
    
    @Override
    public Acucar AdicionarAcucar() {
        return new Acucar("Adicionando 200g de açúcar");
    }

    @Override
    public Leite AdicionarLeite() {
        return new Leite("Adicionando 100g de leite em pó");
    }

    @Override
    public Bicarbonato AdicionarBicarbonato() {
        return new Bicarbonato("Adicionando 1 colher de chá de bicarbonato");
    }

    @Override
    public Canela AdicionarCanela() {
        return new Canela("Adicionando 1 colher de sobremesa de canela");
    }

    @Override
    public Chocolate AdicionarChocolate() {
        return new Chocolate("Adicionando 50g de chocolate");
    }
}
