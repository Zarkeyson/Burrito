
package zadatak.Sastojci;

public class Sir extends AbstractNamirnica{

    public Sir(String naziv, int cena, boolean DaLiJeLjuto) {
        super(naziv, cena, DaLiJeLjuto);
    }
    
    @Override
    public String toString() {
        return  naziv + ", cena: " + cena + ", ljut: " + DaLiJeLjuto;
    }   
}
