package PPJ15;

import java.util.Arrays;

public class Child {
    private String name;
    private int numCandies=2;
    Child(String name){
        this.name=name;
    }

    void givesCandyTo(Child other){
        if(this.numCandies>0){
        --this.numCandies;
        ++other.numCandies;
        }else System.out.println("I have no candies");
    }
   static Child getChildByName(Child [] arr,String name){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].name.equals(name)){
                return arr[i];
            }
        }
    return null;
    }
    static void printChildren(Child [] children){
        System.out.println(children.length + ":" + Arrays.toString(children));
    }
     public String toString(){
        return '('+ name + ','+ numCandies + " candies" + ')';
     }
}
