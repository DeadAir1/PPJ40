package PRIVATE.Wisielec;

public class WordList {
    static String listaSlow[]={"Komputer", "Programowanie", "Java",
            "Telefon", "Kot", "Pszczoła", "Książka", "Samolot",
            "Ananas", "Szkoła"};
    static String getWord(){
        int index=(int)(Math.random()*10);
        System.out.println(index);
        return listaSlow[index];
    }
}
