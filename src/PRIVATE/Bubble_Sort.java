package PRIVATE;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[]={507,303,34,125,8,23};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j< arr.length ; j++) {
                if(arr[j-1]>arr[j]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }
            }
        }
        for(int a:arr) System.out.print(a + " " );
    }
}
