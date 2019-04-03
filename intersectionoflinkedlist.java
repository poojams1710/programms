 class intersectionoflinkedlist {
    static Node head1,head2;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

     }
     int getcount(Node node){
        Node current =node;
        int count=0;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;
     }
     int getnode(){
         int c1=getcount( head1);
         int c2=getcount(head2);
         if(c1>c2) {
            int  d=c1-c2;
             return getintersection( d, head1, head2);
         }else{
             int d=c2-c1;
             return getintersection(d, head2,head1);
         }
     }
     int getintersection( int d,Node node1,Node node2){
         Node current1=node1;
         Node current2=node2;
         for(int i=0;i<d;i++){
             if(current1!=null){
                 current1=current1.next;
             }
         }
         while(current1!=null && current2!=null){
             if(current1.data==current2.data){
                 return current1.data;
             }
             current1=current1.next;
             current2=current2.next;

         }
         return -1;
     }
     public static void main(String[] args) {
         intersectionoflinkedlist list = new intersectionoflinkedlist();

         // creating first linked list
         list.head1 = new Node(3);
         list.head1.next = new Node(6);
         list.head1.next.next = new Node(15);
         list.head1.next.next.next = new Node(15);
         list.head1.next.next.next.next = new Node(30);

         // creating second linked list
         list.head2 = new Node(10);
         list.head2.next = new Node(15);
         list.head2.next.next = new Node(30);

         System.out.println("The node of intersection is " + list.getnode());

     }
 }


