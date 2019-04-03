
import java.util.*;
class  Collection1{
    public static void main(String args[]){
        ArrayList <String> list =new ArrayList<String>();
        list.add("Mohit");//creating object
        list.add("Pooja");
        list.add("mummy");
        list.add("papa");
        list.add("shivam");
        list.add("shubham");
        list.add("harshit bhaiya");
// Traversing list through iterator
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
