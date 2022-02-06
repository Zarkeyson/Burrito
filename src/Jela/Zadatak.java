
package Jela;

import zadatak.Sastojci.Sir;
import zadatak.Sastojci.Salata;
import zadatak.Sastojci.Sos;
import zadatak.Sastojci.Meso;
import zadatak.Sastojci.Tortilja;

public class Zadatak {

    public static void main(String[] args) {
       Tortilja Zelena = new Tortilja("Zelena", 10, false);
       Tortilja Crvena = new Tortilja("Crvena", 0, true);
       Meso Svinjsko = new Meso("Svinjsko", 20, true);
       Meso Pilece = new Meso("Pilece", 10, false);
       Sir Gauda = new Sir("Gauda", 20, false);
       Sir Kackavalj = new Sir("Kackavalj", 20, false);
       Sir Biljni = new Sir("Biljni", 10, true);
       Salata sopska = new Salata("Sopska", 10, false);
       Sos skorpio = new Sos("Scorpion",100, true);
       Sos blagi = new Sos("Kecap", 0, false);
       
       TortiljaChips GentleChipsy = new TortiljaChips(Zelena, blagi);
       System.out.println(GentleChipsy + ",\n da li je ljuto? " + GentleChipsy.DaLiJeLjuto() + "\n ukupna cena jela: " + GentleChipsy.cena() + " dinara");
       TortiljaChips SpicyChipsy = new TortiljaChips(Zelena, skorpio);
       System.out.println(SpicyChipsy + ",\n da li je ljuto? " + SpicyChipsy.DaLiJeLjuto()+ "\n ukupna cena jela: " + SpicyChipsy.cena() + " dinara");
        
       ObrokSalata CheesyPiggy = new ObrokSalata(Svinjsko, Gauda);
       CheesyPiggy.sosevi.add(blagi);
       CheesyPiggy.sosevi.add(skorpio);
       CheesyPiggy.salate.add(sopska);
       System.out.println(CheesyPiggy +"\n da li je ljuto: " + CheesyPiggy.DaLiJeLjuto() + " \n ukupna cena jela: " + CheesyPiggy.cena() + " dinara" );
        
       Burrito LjutoPile = new Burrito(Crvena, Pilece, Kackavalj);
       System.out.println(LjutoPile + "\n da li je ljuto: " + LjutoPile.DaLiJeLjuto() + " \n ukupna cena jela: " + LjutoPile.cena() + " dinara");
       
       Burrito DobroPile = new Burrito(Zelena, Pilece, Gauda);
       System.out.println(DobroPile + "\n da li je ljuto: " + DobroPile.DaLiJeLjuto() + " \n ukupna cena jela: " + DobroPile.cena() + " dinara");
        
        
        
       
       Narudzbine narudzbina1 = new Narudzbine();
       narudzbina1.stavke.add(CheesyPiggy);
       narudzbina1.stavke.add(GentleChipsy);
       narudzbina1.stavke.add(SpicyChipsy);
       narudzbina1.stavke.add(LjutoPile);
       narudzbina1.stavke.add(DobroPile);
       
       
       System.out.println(narudzbina1);           
    }  
}  