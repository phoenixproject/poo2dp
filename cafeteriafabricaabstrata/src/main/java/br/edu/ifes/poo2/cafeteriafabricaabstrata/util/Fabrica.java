/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriafabricaabstrata.util;

import br.edu.ifes.poo2.cafeteriafabricaabstrata.cdp.Acucar;
import br.edu.ifes.poo2.cafeteriafabricaabstrata.cdp.Agua;
import br.edu.ifes.poo2.cafeteriafabricaabstrata.cdp.Bicarbonato;
import br.edu.ifes.poo2.cafeteriafabricaabstrata.cdp.Cafe;
import br.edu.ifes.poo2.cafeteriafabricaabstrata.cdp.CafeSoluvel;
import br.edu.ifes.poo2.cafeteriafabricaabstrata.cdp.Canela;
import br.edu.ifes.poo2.cafeteriafabricaabstrata.cdp.Chocolate;
import br.edu.ifes.poo2.cafeteriafabricaabstrata.cdp.Leite;

/**
 *
 * @author pchan
 */
public interface Fabrica {
    
    public String DefinirNome();
    public Double DefinirValor();
    public Agua AdicionarAgua();
    public CafeSoluvel AdicionarCafeSoluvel();
    public Acucar AdicionarAcucar();
    public Leite AdicionarLeite();
    public Bicarbonato AdicionarBicarbonato();
    public Canela AdicionarCanela();
    public Chocolate AdicionarChocolate();
    public Cafe criarCafe();
    
}
