package PPJ_c21.Zadanie_9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Osoba znajomi[]={new Osoba("Mark","Jonatan","123456"),
        new Osoba("John","Carry","234567"),
        new Osoba("Mike","Labrador","345678")};

        Telefon []arr={new Telefon("A","Blue"),
        new Komorka("B","Green"),
                new Smartfon("C","White",znajomi)};
        for (int i = 0; i < znajomi.length ; i++) {
            for (int j = 0; j <10 ; j++) {
                if(j%2==0)
                arr[i].zadzwon(znajomi[i].numer);
                else {
                    arr[i].zadzwon("999");
                }
            }
            System.out.println("++++++++++++++++++++++++++++++++");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("++++++++++++++++++++++++");
            arr[i].showHistory();
        }

    }
}
