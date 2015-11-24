/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriabuilder.teste;

import br.edu.ifes.poo2.cafeteriabuilder.cdp.Cafe;
import br.edu.ifes.poo2.cafeteriabuilder.util.CafeException;
import br.edu.ifes.poo2.cafeteriabuilder.util.FabricaCafe;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20101bsi0453
 */
public class TesteBuilder {
    
    @Test
    public void criarCafeExpresso() throws CafeException
    {
        Cafe cafe = FabricaCafe.CriarCafe("Café Expresso");
        assertEquals("Café Expresso", cafe.getNome());
    }
    
    @Test
    public void criarCafeCapuccino() throws CafeException
    {
        Cafe cafe = FabricaCafe.CriarCafe("Café Capuccino");
        assertEquals("Café Capuccino", cafe.getNome());
    }
    
    @Test
    public void criarCafeSemCafeina() throws CafeException
    {
        Cafe cafe = FabricaCafe.CriarCafe("Café sem Cafeina");
        assertEquals("Café sem Cafeína", cafe.getNome());
    }
    
    @Test(expected = CafeException.class)
    public void criarCafeInvalido() throws CafeException
    {
        Cafe cafe = FabricaCafe.CriarCafe("xxxxx");
        
    }
}
