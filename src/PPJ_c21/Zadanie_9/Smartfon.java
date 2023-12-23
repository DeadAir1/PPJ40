package PPJ_c21.Zadanie_9;

import java.util.Arrays;

public class Smartfon extends Komorka{

    Osoba znajomi[]=new Osoba[10];
    public Smartfon(String interfejsKomunikacyjny, String color,Osoba znajomi[]) {
        super(interfejsKomunikacyjny, color);
        this.znajomi=znajomi;
    }
    void zadzwon(String numer){
        System.out.println(numer);
        if(this.historyIndeks>=0)
            history[historyIndeks]=numer;
        else{
            historyIndeks=9;
            history[historyIndeks]=numer;
        }
    }
    void showHistory(){
        boolean is=false;
        for (int i = 0; i <history.length ; i++) {
            for (int j = 0; j < znajomi.length; j++) {
                if(znajomi[j].equals(history[i])){
                    is=true;
                    System.out.println(znajomi[j].imie + " " + znajomi[j].nazwisko + " " + znajomi[j].numer);
                break;
                }
            }
            if(!is) System.out.println(history[i]);
            else is=false;
        }
    }
}
