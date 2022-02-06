
package zadatak.Sastojci;

public abstract class AbstractNamirnica {
    protected String naziv;
    protected int cena;
    protected boolean DaLiJeLjuto;

    public AbstractNamirnica(String naziv, int cena, boolean DaLiJeLjuto) {
        this.naziv = naziv;
        this.setCena(cena);
        this.DaLiJeLjuto = DaLiJeLjuto;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) { 
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        if(cena < 0) throw new IllegalArgumentException(); 
        this.cena = cena;
    }

    public boolean isDaLiJeLjuto() {
        return DaLiJeLjuto;
    }

    public void setDaLiJeLjuto(boolean DaLiJeLjuto) {
        this.DaLiJeLjuto = DaLiJeLjuto;
    }

    @Override
    public String toString() {
        return "AbstractNamirnica=" + naziv + ", cena=" + cena + ", da li je ljuto: " + DaLiJeLjuto;
    }
    
}
