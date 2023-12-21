package PPJ_c21.Zadanie_4;

public class KontoVIP extends Konto{
    double limitDebetu;

    public KontoVIP(Osoba wlasciciel, double stan, double oprocentowanie, double limitDebetu) {
        super(wlasciciel, stan, oprocentowanie);
        this.limitDebetu = limitDebetu;
    }

    void wyplata(double kwota){
        if(stan-kwota>=limitDebetu)
            stan-=kwota;
        else {
            BlednaOperacja operacja=new BlednaOperacja();
        }
    }
        void przelew(RachunekBankowy rach,double kwota){
            if(this.stan-kwota>=limitDebetu)
                rach.stan+=kwota;
            else {
                BlednaOperacja operacja=new BlednaOperacja();
            }
    }
}
