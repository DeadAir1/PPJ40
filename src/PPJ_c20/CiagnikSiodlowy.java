package PPJ_c20;

public class CiagnikSiodlowy extends PojazdKolowy{
    double masa;
    CiagnikSiodlowy(String color,int iloscOsi,double masa){
        super(color,iloscOsi);
        this.masa=masa;
    }

    public void rozpocznijJazde(){
        if(this.getIloscOsi()/masa>=11){
            System.out.println("Jazda niebiezpieczna,odmowa uruchomienia silnika");
        }
    }
}
