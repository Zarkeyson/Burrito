
package Jela;

import org.junit.Test;
import static org.junit.Assert.*;
import zadatak.Sastojci.Meso;
import zadatak.Sastojci.Salata;
import zadatak.Sastojci.Sir;
import zadatak.Sastojci.Sos;
import zadatak.Sastojci.Tortilja;

public class NarudzbineTest {
    

    @Test
    public void testNarudzbina() {
        
                
        Tortilja classic = new Tortilja("obicna", 0, false);
        Sos cheese = new Sos("extra topljeni sir", 50, true);
        TortiljaChips crunchyCheese = new TortiljaChips(classic, cheese);
        assertEquals(crunchyCheese.cena(), 50);
        
        
        
        
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
        
        
                
        
        Sos ljuti = new Sos("skorpio", 20, true);
        ObrokSalata mojObrok = new ObrokSalata(svinjsko, gauda);
        mojObrok.dodajSos(ljuti);
        mojObrok.dodajSalatu(zelena);
        assertEquals(mojObrok.cena(), 170);
        
        
        Narudzbine narudzbina1 = new Narudzbine();
        narudzbina1.stavke.add(mojObrok);
        narudzbina1.stavke.add(legendary);
        narudzbina1.stavke.add(crunchyCheese);
        assertEquals(narudzbina1.cena(), 400);
        }   
}            
   
