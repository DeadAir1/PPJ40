package PPJ_c20;

public class DrzewoIglaste extends Drzewo{
    private int iloscIgiel;
    private double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznoZielone, int wysokosc, String przekrojDrzewa,
                         int iloscIgiel,double dlugoscSzyszki) {
        super(wiecznoZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel=iloscIgiel;
        this.dlugoscSzyszki=dlugoscSzyszki;
    }

    @Override
    public String toString() {
        return "DrzewoIglaste{" +
                "iloscIgiel=" + iloscIgiel +
                ", dlugoscSzyszki=" + dlugoscSzyszki +
                "} " + super.toString();
    }
}
