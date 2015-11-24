/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.calculadoraimposto.cdp;

import br.edu.ifes.poo2.calculadoraimposto.util.Faixa;

/**
 *
 * @author 20101bsi0453
 */
public class ImpostoRenda {
    
    private Faixa faixa1;
    
    public ImpostoRenda(){
        Faixa faixa5 = new Faixa(4665, 9999, 0.275);
        Faixa faixa4 = new Faixa(3752, 4664, 0.225);
        Faixa faixa3 = new Faixa(2828, 3751, 0.15, faixa4);
        Faixa faixa2 = new Faixa(1904, 2827, 0.075, faixa3);
        faixa1 = new Faixa(0, 1903, 0, faixa2);
    }
    
    public double CalcularImposto(double salario){
        return faixa1.calcular(salario);
    }
    
    private double Calcular(Pessoa funcionario){
        return 0;
    }
    
}
