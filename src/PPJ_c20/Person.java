package PPJ_c20;

public class Person {
    private String name;
    private int birthYear;
    Person(String name,int birthYear){
        this.name=name;
        this.birthYear=birthYear;
    }
    Person(String name){
        this(name,1990);
    }
    public String  getName(){
        return name;
    }
    public int getAge(){
        return 2023-birthYear;
    }
    static Person getOlder(Person a,Person b){
        return a.getAge()>b.getAge() ? a:b;
    }
    static Person getOldest(Person[] people){
        Person ans=people[0];
        for (int i = 0; i <people.length ; i++) {
            if(people[i].getAge()> ans.getAge())
                ans=people[i];
        }
    return ans;
    }
    static void sortPeopleByAge(Person[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if(arr[i].getAge()>arr[j].getAge()){
                    Person t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }
        public String toString(){
        return "My name is ->" + name + " , and my birthYear ->" +birthYear;
        }

}
