package PPJ_c20;

public class Spawacz extends Osoba{
    int stazPracy;

    Spawacz(String name,int stazPracy){
        super(name);
        this.stazPracy=stazPracy;
    }
    void wyswietl(){
        super.wyswietl();
        System.out.println("staz pracy -> "+ stazPracy);
    }
}
