/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriablackwhitedecorator.util;

import br.edu.ifes.poo2.cafeteriablackwhitedecorator.cdp.Acucar;
import br.edu.ifes.poo2.cafeteriablackwhitedecorator.cdp.CafeSoluvel;
import br.edu.ifes.poo2.cafeteriablackwhitedecorator.cdp.Leite;

/**
 *
 * @author pchan
 */
public class FabricaCafeExpresso extends AbstractFabrica {

    @Override
    public String DefinirNome() {
        return "Café Expresso";
    }

    @Override
    public Double DefinirValor() {
        return 2.0;
    }
    
    @Override
    public CafeSoluvel AdicionarCafeSoluvel() {
        return new CafeSoluvel("Adicionando 50g de Café Solúvel");
    }

    @Override
    public Acucar AdicionarAcucar() {
        return new Acucar("Adicionando 2 xícaras de açúcar");
    }

    @Override
    public Leite AdicionarLeite() {
        return new Leite("Adicionando uma xícara de leite com 100ml");
    }
    
    
    
    


    
    
}
