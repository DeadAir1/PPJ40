package PPJ_17;

public class Computer extends Calculator{
    public Computer(String s) {
        super(s);
    }
    public String calculate(double x, double y){
        return super.calculate(x,y) + " ; " + Double.toString(x) + " * " + Double.toString(y)
                + " = " + Double.toString(x * y) +
                 " ; " + Double.toString(x) + " / " + Double.toString(y)
                + " = " + Double.toString(x/y);
    }
}
