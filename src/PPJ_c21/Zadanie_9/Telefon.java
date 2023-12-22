package PPJ_c21.Zadanie_9;

public class Telefon {
    String interfejsKomunikacyjny;
    String color;

    public Telefon(String interfejsKomunikacyjny, String color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    void zadzwon(String numer){
        System.out.println(numer);
    }
    void showHistory(){
        System.out.println("Brak historii");
    }
}
