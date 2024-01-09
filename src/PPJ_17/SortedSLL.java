package PPJ_17;

public class SortedSLL {
            Node head;

            SortedSLL(){
                this.head=null;
            }
            //FUNKCJA DO ZADANIA 1
            void addSorted(int data){
                if(head==null || data<=head.data){
                    head=new Node(data,head);
                }else{
                    Node tmp=head;
                    while(tmp.next!=null && data>=tmp.data){
                        tmp=tmp.next;
                    }
                    if(data>=tmp.data){
                    tmp.next=new Node(data,null);
                    }else{
                        tmp=new Node(data,tmp);
                        Node tmp1=head;
                        while(tmp1.next.data<=data){
                            tmp1=tmp1.next;
                        }
                        tmp1.next=tmp;
                    }
                }

            }

            //FUNKCJA DO ZADANIA 2

            static Node arrayToList(int arr[]){
                SortedSLL sortedSLL=new SortedSLL();
                Node tmp=new Node(arr[arr.length-1],null);
                for (int i = arr.length-2; i >0 ; i--) {
                    tmp=new Node(arr[i],tmp);
                }
                sortedSLL.head=new Node(arr[0],tmp);
                return sortedSLL.head;
            }

            static void show(Node head){
               while(head!=null){
                   System.out.print(head.data + " ");
                   head=head.next;
               }
            }
    static Node[] extract(Node head){
        Node [] nodes=new Node[2];



    return nodes; }

}
