package PPJ11;

public class Main {
    //FUNKCJA DO ZADANIA 1
    public static int countEven(int []arr,int from) {
        if(from<arr.length )
           return arr[from]%2==0 ?  1+countEven(arr,++from): countEven(arr, ++from);
        return 0;
    }
    public static void main(String[] args) {
            //Zad 1
        int[] a = {2,3,2,4,3,1,6,3,2,3};
        System.out.println("# of even: " + countEven(a,0));

        //Zad  2




    }
}
