
package zadatak.Sastojci;

public class Salata extends AbstractNamirnica {

    public Salata(String naziv, int cena, boolean DaLiJeLjuto) {
        super(naziv, cena, DaLiJeLjuto);
    }
    
    @Override
    public String toString() {
        return  naziv + ", cena: " + cena + ", ljuto: " + DaLiJeLjuto;
    }
}
