import java.util.*;
class Listiterator{
    public static void main(String args[]){
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("mohit");
        al1.add("sharma");
        al1.add("pandit");
        al1.add("pooja");
        al1.add( 1,"papa");
        System.out.println("second element"+al1.get(2));
      ListIterator<String> itr=al1.listIterator();
      System.out.println("traversing element in forward direction");
      while(itr.hasNext()){
          System.out.println(itr.next());
      }
      System.out.println("in backward direction");
      while (itr.hasPrevious()){
          System.out.println(itr.previous());
      }


    }


}
