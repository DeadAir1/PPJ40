package PPJ15;

public class Square {
    private double side;

    Square(double side){
        this.side=side;
    }
    Square(Circle circle){
        this.side=Math.sqrt(Math.PI*Math.pow(circle.getRadius(),2));
    }

    public static Circle[] getCircles(Square[] sqs) {
        Circle[] circles=new Circle[sqs.length];
        for (int i = 0; i <sqs.length ; i++) {
            circles[i]=new Circle(sqs[i]);
        }
    return circles;
    }

    double getSide(){
        return side;
    }
    double getArea(){
        return Math.pow(side,2);
    }
    double getPerimeter(){
        return side*4;
    }
    public String toString(){
        return "Square with side -> " + side;
    }
    Circle getInscribedCircle(){
        return new Circle(side/2);
    }
    Circle getCircumscribedCircle(){
        return new Circle((side*(Math.sqrt(2)))/2);
    }
}
