
package Jela;

import Jela.AbstractJelo;
import java.util.ArrayList;

public class Narudzbine {

    protected ArrayList<AbstractJelo> stavke = new ArrayList<AbstractJelo>();

 
    
    public void setStavke(ArrayList<AbstractJelo> stavke) {
        this.stavke = stavke;
    }

    public ArrayList<AbstractJelo> getStavke() {
        return stavke;
    }
    public void dodajJelo(AbstractJelo stavka){     
        stavke.add(stavka);
    }
    
    public int cena(){
        int ukupnaCena=0;
        for(AbstractJelo stavka : stavke)
            ukupnaCena += stavka.cena();
            if(ukupnaCena < 0 ) throw new IllegalArgumentException();
        return ukupnaCena;  
    }

    @Override
    public String toString() {
        return "Narudzbina= " + stavke + ",\n Ukupna cena Vase narudzbine: " + cena() + " dinara"; 
    }
    
}
    
     
