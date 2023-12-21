package PPJ_c21.Zadanie_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RachunekBankowy {
    Osoba wlasciciel;
    double stan;

    public RachunekBankowy(Osoba wlasciciel, double stan) {
        this.wlasciciel = wlasciciel;
        this.stan = stan;
    }
    void wplata(double kwota){
        stan+=kwota;

    }
    void wyplata(double kwota){
        if(stan>=kwota)
            stan-=kwota;
       else {
            BlednaOperacja operacja=new BlednaOperacja();
        }
    }
    void przelew(RachunekBankowy rach,double kwota){
        if(this.stan>=kwota)
            rach.stan+=kwota;
        else {
            BlednaOperacja operacja=new BlednaOperacja();
        }
    }
    void aktualizacja() throws FileNotFoundException{
        String info="Imie wlasciciela -> " + wlasciciel.imie +'\n'
                + "Rachunek bankowy" + '\n'
                + "Stan rachunku -> " + Math.round(stan);
                        System.out.println(info);
              PrintWriter zapis=new PrintWriter("src/PPJ_c21/Zadanie_4/raport.txt");
              zapis.println(info);
              zapis.close();

          }
    }

