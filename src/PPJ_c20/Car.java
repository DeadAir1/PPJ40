package PPJ_c20;

public class Car {
    double fuelLevel;
    Car( double fuelLevel){
        this.fuelLevel=fuelLevel;
    }

    static void drive (Car car,int distance){
        if(car.fuelLevel>=distance/10) {
            System.out.println("Silnik uruchomiony");
            car.fuelLevel -= distance;
        }
        else System.out.println("Nie starczy paliwa");
    }
}
