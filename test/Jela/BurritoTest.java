
package Jela;

import org.junit.Test;
import static org.junit.Assert.*;
import zadatak.Sastojci.Meso;
import zadatak.Sastojci.Salata;
import zadatak.Sastojci.Sir;
import zadatak.Sastojci.Sos;
import zadatak.Sastojci.Tortilja;


public class BurritoTest {
    
    public BurritoTest() {
       
    }
    


    @Test
    public void testOdvratniBurrito() {
        Meso junetina = new Meso("junece", 100, false);
        Sir gauda = new Sir("gauda", 50, false);
        Sos blagi = new Sos("pavlaka", 20, true);
        Salata srpska = new Salata("srpska", 20, true);
        Tortilja zelena = new Tortilja("vege", 0, false);
        Burrito grozanBurrito = new Burrito(zelena, junetina, gauda);
        grozanBurrito.dodajSalatu(srpska);
        grozanBurrito.dodajSos(blagi);
        assertEquals(grozanBurrito.cena(), 190);
        assertTrue(grozanBurrito.DaLiJeLjuto());
    }
    
    
    @Test
    public void testDooobarBurrito(){
        Meso svinjsko = new Meso("prasetina", 100, false);
        Sir gauda = new Sir("gauda", 50, false);
        Sos blagi = new Sos("pavlaka", 20, false);
        Sos crveni = new Sos("kecap", 0, true);
        Salata zelena = new Salata("zelena", 0, false);
        Tortilja mexicana = new Tortilja("mexicana", 10, false);
        Burrito legendary = new Burrito(mexicana, svinjsko, gauda);
        legendary.dodajSalatu(zelena);
        legendary.dodajSos(blagi);
        legendary.dodajSos(crveni);
        assertEquals(legendary.cena(), 180);
        assertTrue(legendary.DaLiJeLjuto());
    }  
}