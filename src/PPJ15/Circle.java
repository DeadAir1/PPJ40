package PPJ15;

public class Circle {
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    Circle(Square square){
        this.radius=Math.sqrt(Math.pow(square.getSide(),2)/Math.PI);
    }

    public static Square[] getSquares(Circle[] circles) {
        Square[] squares=new Square[circles.length];
        for (int i = 0; i < circles.length ; i++) {
            squares[i]=new Square(circles[i]);
        }
    return squares;
    }

    double getRadius(){
        return radius;
    }
    double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
   public String toString(){
        return "Circlre with radius -> " + radius;
   }
   Square getInscribedSquare(){
        return  new Square(radius/(Math.sqrt(2))/2);
   }
    Square getCircumscribedSquare(){
        return new Square(radius*2);
    }
}
