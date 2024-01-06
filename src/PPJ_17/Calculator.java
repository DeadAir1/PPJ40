package PPJ_17;

public class Calculator extends CalculatingDevice{

    public Calculator(String s) {
        super(s);
    }
    public String calculate(double x, double y){
    return super.calculate(x,y) + " ; " + Double.toString(x) + " - " + Double.toString(y)
            + " = " + Double.toString(x-y);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
