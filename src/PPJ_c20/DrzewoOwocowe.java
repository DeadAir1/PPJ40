package PPJ_c20;

public class DrzewoOwocowe extends DrzewoLisciaste{
    private String nazwaOwoca;
    public DrzewoOwocowe(boolean wiecznoZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia,
                         String nazwaOwoca) {
        super(wiecznoZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca=nazwaOwoca;
    }

    @Override
    public String toString() {
        return "DrzewoOwocowe{" +
                "nazwaOwoca='" + nazwaOwoca + '\'' +
                "} " + super.toString();
    }
}
