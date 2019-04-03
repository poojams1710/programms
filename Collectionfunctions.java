import java.util.*;
class book{
    int id;
    String publisher ,author ,name;
    int quantity;
    public book(int id,String name, String author, String publisher ,int quantity){
        this .id=id;
        this .author=author;
        this .publisher=publisher;
        this .quantity=quantity;
        this .name=name;
    }

}

public class Collectionfunctions{
    public static void main(String[] args) {
        //Creating list of Books
        ArrayList<book> list=new ArrayList<book>();
        //Creating Books
        book b1=new book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        book b2=new book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        book b3=new book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        Iterator itr=list.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            book st=(book)itr.next();
            System.out.println(st.author+" "+st.name+" "+st.publisher);
        }


    }
}

