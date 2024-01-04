package PPJ_17;

public class SortedSLL {
            Node head;

            SortedSLL(){
                this.head=null;
            }

            void addSorted(int data){
                if(head==null || data<=head.data){
                    head=new Node(data,head);
                }else{
                    Node tmp=head;
                    while(tmp.next!=null || data>=tmp.next.data ) {


                    }

                }


            }
            void show(){
                Node tmp=head;
                while(tmp.next!=null){
                    System.out.println(tmp.data);
                    tmp=tmp.next;
                }
            }

}
