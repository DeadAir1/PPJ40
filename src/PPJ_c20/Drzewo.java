package PPJ_c20;

public class Drzewo {
    private boolean wiecznoZielone;
    private int wysokosc;
    private String przekrojDrzewa;

    public Drzewo(boolean wiecznoZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznoZielone = wiecznoZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "wiecznoZielone=" + wiecznoZielone +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzewa='" + przekrojDrzewa + '\'' +
                '}';
    }
}
