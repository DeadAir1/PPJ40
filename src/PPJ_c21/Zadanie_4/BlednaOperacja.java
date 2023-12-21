package PPJ_c21.Zadanie_4;

public class BlednaOperacja extends RuntimeException{
    public BlednaOperacja() {
        super();
    }
    public BlednaOperacja(String error){
        super(error);
    }
}
