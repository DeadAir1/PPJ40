package PPJ22;


import java.awt.*;
import java.util.Objects;

public class Person {
    private String name;
    private int birthYear;
    private Car car;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.car=null;
    }

    public Person(String name, int birthYear, Car car) {
        this(name,birthYear);
        this.car = car;
    }
    public static Car[] findAllCars(Person[] persons) {
        int c=0;
        for (int i = 0; i < persons.length ; i++)
            if(persons[i].car!=null) c++;
        Car cars[]=new Car[c];
        int j=0;
        for (int i = 0; i < persons.length; i++) {
            if(persons[i].car!=null) {
                cars[j]=persons[i].car;
                j++;
            }
        }

    return cars;
    }
    public static Person[] findOwners(Person[] persons, String make){
        int c=0;
        for (Person value : persons) {
            if (value.car != null) {
                if (Objects.equals(value.car.getMake(), make)) c++;
            }
        }
        Person person[]=new Person[c];
        int j=0;
        for (int i = 0; i < persons.length ; i++) {
            if(persons[i].car!=null){
            if(Objects.equals(persons[i].car.getMake(), make)){
                person[j]=persons[i];
                j++;
            }
            }
        }
   return person;
    }
    public static Color findColor(Person[] person,
                                  String name, int year){
        for (int i = 0; i < person.length; i++) {
            if(Objects.equals(person[i].name, name) && person[i].birthYear==year){
                return person[i].car.getColor();
            }
        }
    return null;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", car=" + car +
                '}';
    }
}
