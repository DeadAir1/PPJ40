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
        int[] tab = { 2, 1, 4, 3, 6, 5, 7, 8 };
        Node head = SortedSLL.arrayToList(tab);
        SortedSLL.show(head);
        Node[] nodes = SortedSLL.extract(head);
        SortedSLL.show(nodes[0]);
        SortedSLL.show(nodes[1]);


    }
}
