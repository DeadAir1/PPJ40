package PPJ_c20;

public class DrzewoLisciaste extends Drzewo{
    private int ksztaltLiscia;
    public DrzewoLisciaste(boolean wiecznoZielone, int wysokosc, String przekrojDrzewa,
                           int ksztaltLiscia) {
        super(wiecznoZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia=ksztaltLiscia;
    }

    @Override
    public String toString() {
        return "DrzewoLisciaste{" +
                "ksztaltLiscia=" + ksztaltLiscia +
                "} " + super.toString();
    }
}
