
package Jela;

import zadatak.Sastojci.Sos;
import zadatak.Sastojci.Tortilja;

public class TortiljaChips extends AbstractJelo{
    protected Tortilja chips;
    protected Sos sos;
    

    @Override
     public boolean DaLiJeLjuto() {
          if(chips.isDaLiJeLjuto()== true || sos.isDaLiJeLjuto() == true)
            return true;
        else
            return false;
     }

    @Override
    public int cena() {
        return chips.getCena() + sos.getCena();
    }

    public TortiljaChips(Tortilja chips, Sos sos) {
        this.chips = chips;
        this.sos = sos;
    }

    public Tortilja getChips() {
        return chips;
    }

    public void setChips(Tortilja chips) {
        this.chips = chips;
    }

    public Sos getSos() {
        return sos;
    }

    public void setSos(Sos sos) {
        this.sos = sos;
    }

    @Override
    public String toString() {
        return "TortiljaChips= chips:" + chips + ", sos:" + sos;
    }
       
}
