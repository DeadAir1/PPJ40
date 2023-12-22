package PPJ_c21.Zadanie_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Konto extends RachunekBankowy{
    double oprocentowanie;
    public Konto(Osoba wlasciciel, double stan,double oprocentowanie) {
        super(wlasciciel, stan);
        this.oprocentowanie=oprocentowanie;
    }
    void wplata(double kwota){
        stan+=kwota;

    }
    void aktualizacja()  {
        this.stan-=this.oprocentowanie;
        String info="Imie wlasciciela -> " + wlasciciel.imie +'\n'
                + "Konto" + '\n'
                + "Stan rachunku -> " + Math.round(stan);
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
