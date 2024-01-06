package PPJ_17;

public class CalculatingDevice {
    String name;
    public CalculatingDevice(String s) {
    this.name=s;
    }
    public String calculate(double x, double y){
            return this.toString() + Double.toString(x) + " + " + Double.toString(y) + " = "
            + Double.toString(x+y);
    }

    public static void printRes(CalculatingDevice[] a,
                                double x, double y){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].calculate(x,y));
        }
    }

    @Override
    public String toString() {
        return "CalculatingDevice{" +
                "name='" + name + '\'' +
                '}';
    }
}
