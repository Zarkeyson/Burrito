
package zadatak.Sastojci;

public class Sos extends AbstractNamirnica {

    public Sos(String naziv, int cena, boolean DaLiJeLjuto) {
        super(naziv, cena, DaLiJeLjuto);
    }
    
    @Override
    public String toString() {
        return naziv + ", cena: " + cena + ", ljut: " + DaLiJeLjuto;
    }
}
