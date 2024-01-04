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
            void show(){
                Node tmp=head;
               while(tmp!=null){
                   System.out.println(tmp.data);
                   tmp=tmp.next;
               }
            }

}
