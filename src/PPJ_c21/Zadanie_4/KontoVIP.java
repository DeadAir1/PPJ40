package PPJ_c21.Zadanie_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class KontoVIP extends Konto{
    double limitDebetu;
    int probyPrzekroczeniaLimitu;

    public KontoVIP(Osoba wlasciciel, double stan, double oprocentowanie, double limitDebetu) {
        super(wlasciciel, stan, oprocentowanie);
        this.limitDebetu = limitDebetu;
    }
    void wplata(double kwota){
        stan+=kwota;

    }

    void wyplata(double kwota){
        if(stan-kwota>=limitDebetu)
            stan-=kwota;
        else {
            probyPrzekroczeniaLimitu+=1;
            BlednaOperacja operacja=new BlednaOperacja();
        }
    }
        void przelew(RachunekBankowy rach,double kwota){
            if(this.stan-kwota>=limitDebetu)
                rach.stan+=kwota;
            else {
                probyPrzekroczeniaLimitu+=1;
                BlednaOperacja operacja=new BlednaOperacja();
            }
    }
    void aktualizacja()  {
        String info="Imie wlasciciela -> " + wlasciciel.imie +'\n'
                + "Rachunek bankowy" + '\n'
                + "Stan rachunku -> " + Math.round(stan) +'\n'
                +"Proby przekroczenia limitu " + probyPrzekroczeniaLimitu;
        System.out.println(info);
        File file=new File("src/PPJ_c21/Zadanie_4/raport.txt");
        try{
            FileWriter zapis = new FileWriter("src/PPJ_c21/Zadanie_4/raport.txt", true);
            zapis.write(info + '\n');
            zapis.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
