
package Jela;

import org.junit.Test;
import static org.junit.Assert.*;
import zadatak.Sastojci.Meso;
import zadatak.Sastojci.Salata;
import zadatak.Sastojci.Sir;
import zadatak.Sastojci.Sos;


public class ObrokSalataTest {
    
    public ObrokSalataTest() {
    }
    

    @Test
    public void testMojOmiljeniObrok() {
        Meso svinjsko = new Meso("prasetina", 100, false);
        Sir gauda = new Sir("gauda", 50, false);
        Sos ljuti = new Sos("skorpio", 20, true);
        Salata zelena = new Salata("zelena", 0, false);
        ObrokSalata mojObrok = new ObrokSalata(svinjsko, gauda);
        mojObrok.dodajSos(ljuti);
        mojObrok.dodajSalatu(zelena);
        assertEquals(mojObrok.cena(), 170);
        assertTrue(mojObrok.DaLiJeLjuto());
    }
    
    @Test
    public void testGrozanObrok() {
        Meso junetina = new Meso("junece", 100, false);
        Sir gauda = new Sir("gauda", 50, false);
        Sos blagi = new Sos("pavlaka", 20, true);
        Salata srpska = new Salata("srpska", 20, true);
        ObrokSalata mojObrok = new ObrokSalata(junetina, gauda);
        mojObrok.dodajSos(blagi);
        mojObrok.dodajSalatu(srpska);
        assertEquals(mojObrok.cena(), 190);
        assertTrue(mojObrok.DaLiJeLjuto());
    }     
}
