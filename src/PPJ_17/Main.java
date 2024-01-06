package PPJ_17;

public class Main {
    public static void main(String[] args) {
        //Zadanie 1
       /* SortedSLL list = new SortedSLL();
        list.addSorted(4);
        list.addSorted(1);
        list.addSorted(6);
        list.addSorted(3);
        list.show();*/

        //Zadanie 2
        SortedSLL sortedSLL=new SortedSLL();
        int arr[]={5,4,3,2,1};
        SortedSLL.show(SortedSLL.arrayToList(arr));


    }
}
