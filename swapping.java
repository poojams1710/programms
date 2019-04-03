
import java.io.*;
class swapping
{
    public static void main(String args[])throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("this is for swapping two numbers enter first ");
       int a=Integer.parseInt(br.readLine());
       System.out.println("enter the sec num");
       int b=Integer.parseInt(br.readLine());
       /* before swapping*/
       System.out.println("first is"+a);
       System.out.println("sec is"+b);
       /* method*/
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("first is now....."+a);
       System.out.println("sec is now......"+b);

    }
}