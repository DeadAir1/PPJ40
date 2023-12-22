package PPJ_c21.Zadanie_4;

import PPJ_c21.Zadanie_4.Osoba;
import PPJ_c21.Zadanie_4.RachunekBankowy;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Zad 3
        /*int counter=0;
        int a=0;
        Owoc owocy[]=new Owoc[100];
        while(counter<5000){
            Drzewo drzewo=new Drzewo();
            Owoc owoc=drzewo.zerwijOwoc();
            counter+=owoc.getMasa();
            owocy[a]=owoc;
            a++;
        }
        int jabko=0;
        int gruszka=0;
        int pomarancza=0;
        a=0;
        while(owocy[a]!=null) {
            switch(owocy[a].getNazwa()){
                case "Gruszka" : gruszka++;
                break;
                case "Jabko" : jabko++;
                break;
                case "Pomarancza": pomarancza++;
                break;
                default :
                    System.out.println("Nie znam takiego owocu");
            }
            a++;
        }
        System.out.printf("Mam %d jablek,%d gruszek,%d pomaranczy",jabko,gruszka,pomarancza);*/

        //Zad 4,5,6,7
        RachunekBankowy rachunekBankowy=new RachunekBankowy(new Osoba("Michal"),1000);
        rachunekBankowy.aktualizacja();
        RachunekBankowy rachunekBankowy1=new RachunekBankowy(new Osoba("Maja"),1);
        rachunekBankowy1.aktualizacja();
        KontoVIP kontoVIP=new KontoVIP(new Osoba("Oleg"),1000,20,0);
        kontoVIP.aktualizacja();
        kontoVIP.przelew(rachunekBankowy,1005);
        kontoVIP.aktualizacja();
        kontoVIP.przelew(rachunekBankowy,1005);
        kontoVIP.aktualizacja();
    }
}
