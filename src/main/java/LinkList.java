public class LinkList {

    class Node{
        int val;
        Node next;

        Node(int v){
            this.val=v;
            this.next=null;
        }

        Node(int v, Node nxt){
            this.val=v;
            this.next=nxt;
        }
    }

    public Node head=null;
    public Node tail=null;

    public static void main(String[] args) {

        LinkList li = new LinkList();
        li.addNode(1)
                .addNode(2)
                .addNode(5);
//                .printList();
        LinkList li2 = new LinkList();
        li2.addNode(1)
                .addNode(3)
                .addNode(4);
//                .printList();

        new LinkList().mergeSortedList(li.head, li2.head);

    }


    public void mergeSortedList(Node l1, Node l2){

//        LinkList ll = new LinkList().addNode(0);
////        Node l= LinkList.Node;
//        while (l1!=null && l2!=null){
//
//            if(l1.val<=l2.val){
//                l = l1;
//                l1=l1.next;
//            }else{
//                l=l2;
//                l2=l2.next;
//            }
//
//            l=l.next;
//
//            System.out.println(ll);

//        }

//        printList(ll.next);

//        return head;
    }

    public LinkList addNode(int val){

        if(head==null){
            head = new Node(val);
            tail=head;
        }else{
            tail.next = new Node(val);
            tail=tail.next;
        }

        return this;
    }

    public LinkList printList(){

        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }

        return this;
    }

    public LinkList printList(Node temp){

        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        return this;

    }



}
