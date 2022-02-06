
package Jela;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import zadatak.Sastojci.Sos;
import zadatak.Sastojci.Tortilja;

public class TortiljaChipsTest {
    
    public TortiljaChipsTest() {
    }
    
    
    @Test
    public void testGoodTortilja() {
        Tortilja classic = new Tortilja("obicna", 0, false);
        Sos cheese = new Sos("extra topljeni sir", 50, true);
        TortiljaChips crunchyCheese = new TortiljaChips(classic, cheese);
        assertEquals(crunchyCheese.cena(), 50);
        assertTrue(crunchyCheese.DaLiJeLjuto());
    }

    @Test
    public void testBoringTortilja() {
       Tortilja zelena = new Tortilja("vege", 0, false);
       Sos crveni = new Sos("kecap", 20, false);
       TortiljaChips boringTortilja = new TortiljaChips(zelena, crveni);
        assertEquals(boringTortilja.cena(), 20);
        assertFalse(boringTortilja.DaLiJeLjuto());
        
    }
}
