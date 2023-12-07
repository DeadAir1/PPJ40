package PPJ_c15;

public class Fruit {
    String name;
    double weight;

    Fruit(String name){
        this.name=name;
        this.weight=(Math.random()*0.8)+0.5;
    }
    public void show(){
        System.out.printf("My name is -> %s and my weight is %f",name,weight);
    }
}
