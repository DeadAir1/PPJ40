package PPJ_c21.Zadanie_3;

public class Drzewo {

    public Owoc zerwijOwoc(){
        int liczba=(int)(Math.random()*3+1);
        return switch(liczba){
            case 1 -> {
                yield new Gruszka();
            }
            case 2->{
                yield new Jabko();
            }
            default -> new Pomarancza();
        };
    }
}
