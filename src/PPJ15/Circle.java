package PPJ15;

public class Circle {
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return 3.14*Math.pow(radius,2);
    }
    double getPerimeter(){
        return 2*3.14*radius;
    }
   public String toString(){
        return "Circlre with radius -> " + radius;
   }
   Square getInscribedSquare(){
        return  new Square()
   }
    Square getCircumscribedSquare(){
        return
    }
}
