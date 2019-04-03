
import java.io.*;
import java.sql.BatchUpdateException;

class swaps
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the first String to be swap");
        String s1=br.readLine();
        int l=s1.length();
        System.out.println("enter the sec one");
        String s2=br.readLine();
        /*before swapiing*/
        System.out.println("the first string............."+s1);
        System.out.println("....................");

        System.out.println("the sec string............."+s2);
        System.out.println("..................");
        /*swapping logic */
        s1=s1+s2;
       s2=s1.substring(0,l);
       s1=s1.substring(l);
       /*After swapping*/
       System.out.println("after swap.....");
       System.out.println("first  become..........."+s1);
       System.out.println("sec become............"+s2);








    }
}

