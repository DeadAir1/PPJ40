package PPJ15;

public class Square {
    private double side;

    Square(double side){
        this.side=side;
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
        return new Circle((side*Math.sqrt(2))/2);
    }
}
