
class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void print(){
        Node n=head;
        while (n!= null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String args[]){
        LinkedList llist = new LinkedList();

        llist.head       = new Node(1);
        Node second      = new Node(2);
        Node third       = new Node(3);

        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node

        llist.print();


    }
}