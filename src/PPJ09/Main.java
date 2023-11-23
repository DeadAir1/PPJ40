package PPJ09;

public class Main {

    //FUNKCJA DLA ZADANIA 2
    static void function(int [][]arr){
        int sumRow=0;
        int sumCol=0;
        int counterRow=0;
        int counterCol=0;
        int rowNumber=0;
        int colNumber=0;
        for (int i = 0; i <arr.length ; i++) {
            counterRow=0;
            counterCol=0;
            for (int j = 0; j <arr[i].length ; j++) {
                counterRow+=arr[i][j];
                counterCol+=arr[j][i];
            }
            if(sumRow<counterRow){
                sumRow=counterRow;
                rowNumber=i;
            }

        }


    }
    public static void main(String[] args) {
        //Zad 1
        /*int[][] arr = {
                {1,2,3,4,5,6},
                {2,3,4,5,6,7},
                {3,4,5,6,7,8},
                {4,5,6,7,8,9}
        };
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i][arr[i].length-1];
        }
        System.out.println(sum);
        */


        //Zad 2
        int arr[][]={
                {1,3,2},
                {3,4,8},
                {2,6,8},
                {1,8,5}
        };



       }
}
