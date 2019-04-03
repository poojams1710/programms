import java.util.*;
class automorphic
{
    public static void main(String args[]) throws Exception
    {
      System.out.println("this is for checking the number as automorphic means square of that ends with that num or not ");
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the num to be checked");
      int n=sc.nextInt();
      int sq=n*n;
      String num=Integer.toString(n);
      String square=Integer.toString(sq);
      if(square.endsWith(num)){

          System.out.println ("automorphic");
      }
      else {
          System.out.println("not");
      }

    }
}
//25
//625
//this 25 comes in their square .
//