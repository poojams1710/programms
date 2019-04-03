 class segregateEOlinkedlist {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
   public void segregate(){
        Node evenstart=null;
        Node evenend=null;
        Node oddstart=null;
        Node oddend=null;
        Node current=head;
        while(current!=null) {
            int K = current.data;
            if (K % 2 == 0) {
                if (evenstart == null) {
                    evenstart = current;
                    evenend = evenstart;
                } else {
                    evenend.next = current;
                    evenend = evenend.next;
                }

            } else {
                if (oddstart == null) {
                    oddstart = current;
                    oddend = oddstart;
                } else {
                    oddend.next = current;
                    oddend = oddend.next;
                }
            }

            current=current.next;

        }
        if(oddstart==null && evenstart==null){
            return;
        }
        head=evenstart;
        evenend.next=oddstart;
        oddend.next=null;

    }
    void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    void printlist(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]) {
        segregateEOlinkedlist llist = new segregateEOlinkedlist();
        llist.push(45);
        llist.push(7);
        llist.push(8);
        llist.push(12);
        llist.push(18);
        llist.push(17);
        llist.push(22);
        llist.push(25);
        System.out.println("before segregatio");
        llist.printlist();
        System.out.println("after");
        llist.segregate();
        llist.printlist();
    }



}
