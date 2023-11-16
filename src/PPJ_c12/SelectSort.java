package PPJ_c12;

public class SelectSort {
    public static void main(String[] args) {
        int arr[]={4,5,-2,4,-1,6,-7,5};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[i]) {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int a: arr){
            System.out.print(a + " ");
        }
    }
}
