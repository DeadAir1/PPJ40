package PPJ_c21.Zadanie_9;

import java.util.Arrays;

public class Komorka extends Telefon{
    String [] history=new String[10];
        int historyIndeks=9;
    public Komorka(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
    }

    void zadzwon(String numer){
        System.out.println(numer);
        if(historyIndeks>=0)
            history[historyIndeks]=numer;
        else{
            historyIndeks=9;
            history[historyIndeks]=numer;
        }
    }
    void showHistory(){
        System.out.println(Arrays.toString(history));
    }
}
