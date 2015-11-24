package br.x.teste;

import br.edu.ifes.poo2.cafeteriafabrica.cdp.Cafe;
import br.edu.ifes.poo2.cafeteriafabrica.util.FabricaCafe;
import br.edu.ifes.poo2.cafeteriafabrica.util.CafeException;

import static org.junit.Assert.*;
import org.junit.Test;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20101bsi0453
 */
public class TesteFabrica {
    
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
