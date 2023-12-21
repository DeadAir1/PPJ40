package PPJ_c21.Zadanie_3;

public class Owoc {
    private String nazwa;
    private double masa;

    public Owoc(String nazwa, double masa) {
        this.nazwa = nazwa;
        this.masa = masa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getMasa() {
        return masa;
    }

    @Override
    public String toString() {
        return "Owoc{" +
                "nazwa='" + nazwa + '\'' +
                ", masa=" + masa +
                '}';
    }
}
