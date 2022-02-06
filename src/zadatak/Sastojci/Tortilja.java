package zadatak.Sastojci;

public class Tortilja extends AbstractNamirnica {

    public Tortilja(String naziv, int cena, boolean DaLiJeLjuto) {
        super(naziv, cena, DaLiJeLjuto);
    }
    
    @Override
    public String toString() {
        return  naziv + ", cena: " + cena + ", ljuta: " + DaLiJeLjuto;
    }
}
