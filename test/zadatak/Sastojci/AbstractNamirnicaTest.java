
package zadatak.Sastojci;

import org.junit.Test;
import static org.junit.Assert.*;


public class AbstractNamirnicaTest {
    
    public AbstractNamirnicaTest() {
    }
    


    @Test(expected = IllegalArgumentException.class)
    public void testNegativnaCenaSetter() {
        TestNamirnica namirnica = new TestNamirnica("Jaje", 10, false);
        namirnica.setCena(-100);
        
    }

    
    @Test
    public void testNultaCenaSetter() {
        TestNamirnica namirnica = new TestNamirnica("Jaje", 100, false);
        namirnica.setCena(0);
        assertEquals(namirnica.getCena(), 0);
        
    }
    
    
    @Test
    public void testPozitivnaCenaSetter() {
        TestNamirnica namirnica = new TestNamirnica("Jaje", 10, false);
        namirnica.setCena(100);
        assertEquals(namirnica.getCena(), 100);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativnaConstructorCena() {
        TestNamirnica namirnica = new TestNamirnica("Ječam", -100, true);
    }
    
    @Test
    public void testNultaConstructorCena() {
        TestNamirnica namirnica = new TestNamirnica("Ječam", 0, true);
        assertEquals(namirnica.getCena(), 0);
    }

    @Test
    public void testPozitivnaConstructorCena() {
        TestNamirnica namirnica = new TestNamirnica("Ječam", 10, true);
        assertEquals(namirnica.getCena(), 10);
    }
    


    public class TestNamirnica extends AbstractNamirnica {

        public TestNamirnica(String naziv, int cena, boolean DaLiJeLjuto) {
            super(naziv, cena, DaLiJeLjuto);
        }       
    }    
}