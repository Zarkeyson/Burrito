
package zadatak.Sastojci;

public class Meso extends AbstractNamirnica {

    public Meso(String naziv, int cena, boolean DaLiJeLjuto) {
        super(naziv, cena, DaLiJeLjuto);
    }  
    @Override
    public String toString() {
        return  naziv + ", cena: " + cena + ", ljuto: " + DaLiJeLjuto;
    }
}
