/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriabuilder.util;

import br.edu.ifes.poo2.cafeteriabuilder.cdp.Acucar;
import br.edu.ifes.poo2.cafeteriabuilder.cdp.Agua;
import br.edu.ifes.poo2.cafeteriabuilder.cdp.Bicarbonato;
import br.edu.ifes.poo2.cafeteriabuilder.cdp.Cafe;
import br.edu.ifes.poo2.cafeteriabuilder.cdp.CafeSoluvel;
import br.edu.ifes.poo2.cafeteriabuilder.cdp.Canela;
import br.edu.ifes.poo2.cafeteriabuilder.cdp.Chocolate;
import br.edu.ifes.poo2.cafeteriabuilder.cdp.Leite;

/**
 *
 * @author pchan
 */
public abstract class AbstractFabrica implements Fabrica {
        
    @Override
    public Agua AdicionarAgua() {
        return new Agua("Adicionando 100 ml de água");
    }

    @Override
    public CafeSoluvel AdicionarCafeSoluvel() {
        return new CafeSoluvel("Zero gramas adicionado de Café Solúvel");
    }

    @Override
    public Acucar AdicionarAcucar() {
        return new Acucar("Zero gramas adicionado de Açúcar");
    }

    @Override
    public Leite AdicionarLeite() {
        return new Leite("Zero gramas adicionado de Leite");
    }

    @Override
    public Bicarbonato AdicionarBicarbonato() {
        return new Bicarbonato("Zero gramas adicionado de Bicarbonato");
    }

    @Override
    public Canela AdicionarCanela() {
        return new Canela("Zero gramas adicionado de Canela");
    }

    @Override
    public Chocolate AdicionarChocolate() {
        return new Chocolate("Zero gramas adicionado de Chocolate");
    }

    @Override
    public Cafe criarCafe() {
       return new Cafe();
    }
    
}
