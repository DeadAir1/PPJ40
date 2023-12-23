package PPJ_c21.Zadanie_9;

import java.util.Arrays;

public class Komorka extends Telefon{
    String [] history=new String[10];
        int historyIndeks;
    public Komorka(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
    this.historyIndeks=9;
    }

    void zadzwon(String numer){
        System.out.println(numer);
        if(historyIndeks>=0) {
            history[historyIndeks] = numer;
            historyIndeks--;
        }
        else{
            historyIndeks=9;
            history[historyIndeks]=numer;
            historyIndeks--;
        }
    }
    void showHistory(){
        System.out.println(Arrays.toString(history));
    }
}
