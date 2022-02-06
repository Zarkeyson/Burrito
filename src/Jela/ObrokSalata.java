package Jela;

import zadatak.Sastojci.Sir;
import zadatak.Sastojci.Salata;
import zadatak.Sastojci.Sos;
import zadatak.Sastojci.Meso;
import java.util.ArrayList;

public class ObrokSalata extends AbstractJelo {
    protected Meso meso;
    protected Sir sir;
    protected ArrayList<Sos> sosevi = new ArrayList<Sos>();
    protected ArrayList<Salata> salate = new ArrayList<Salata>();

    public ObrokSalata(Meso meso, Sir sir) {
        this.meso = meso;
        this.sir = sir;
    }
    
    public void dodajSos(Sos sos){
        sosevi.add(sos);
        
    }
    public void dodajSalatu(Salata salata){
        salate.add(salata);
    }

    public Meso getMeso() {
        return meso;
    }

    public void setMeso(Meso meso) {
        this.meso = meso;
    }

    public Sir getSir() {
        return sir;
    }

    public void setSir(Sir sir) {
        this.sir = sir;
    }

    public ArrayList<Sos> getSosevi() {
        return sosevi;
    }

    public void setSosevi(ArrayList<Sos> sosevi) {
        this.sosevi = sosevi;
    }

    public ArrayList<Salata> getSalate() {
        return salate;
    }

    public void setSalate(ArrayList<Salata> salate) {
        this.salate = salate;
    }
    
    @Override
    public String toString() {
        return "Obrok salata= meso:" + meso + ",sir: " + sir + ", sosevi: " + sosevi + ", salate: " + salate;
    } 
    
    @Override
    public boolean DaLiJeLjuto(){
        int brojac = 0;
        for(Salata salata : salate){
            if(salata.isDaLiJeLjuto() == true)
                brojac++;
        }
        for(Sos sos : sosevi){
            if(sos.isDaLiJeLjuto() == true)
                brojac++;

        }
        if(meso.isDaLiJeLjuto() == true || sir.isDaLiJeLjuto() == true){
            brojac++;
        }
        if(brojac > 0)
            return true;
        else
            return false;
    }
          

    @Override
    public int cena() {
        int ukupnaCena = meso.getCena() + sir.getCena(); ;
        for(Salata salata : salate)
            ukupnaCena += salata.getCena();
        for(Sos sos : sosevi)
            ukupnaCena += sos.getCena();
        return ukupnaCena;
    }
}