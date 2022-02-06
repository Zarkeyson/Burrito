
package Jela;

import zadatak.Sastojci.Sir;
import zadatak.Sastojci.Meso;
import zadatak.Sastojci.Tortilja;

public class Burrito extends ObrokSalata {
    public Tortilja tortilja;

    public Burrito(Tortilja tortilja, Meso meso, Sir sir) {
        super(meso, sir);
        this.tortilja = tortilja;
    }

    public Tortilja getTortilja() {
        return tortilja;
    }

    public void setTortilja(Tortilja tortilja) {
        this.tortilja = tortilja;
    }

    @Override
    public int cena() {
        return super.cena()+ tortilja.getCena() ;
    }
    
    @Override
    public boolean DaLiJeLjuto(){
        if(super.DaLiJeLjuto() == true || tortilja.isDaLiJeLjuto() == true)
            return true;
        else return false;
    }
    
    
  
    @Override
    public String toString() {
        return "Burrito= " +  " tortilja: " + tortilja + " ,meso: " + meso + " ,sir: " + sir;
    }
}
