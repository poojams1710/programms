// in this we have two num and we have to find gdc so firstly we lets start with example 18 and 24
//24%18==6 then
import java.util.*;
class gcd
{
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First no : ");
        int n1=sc.nextInt();
        System.out.print("Enter the Second no : ");
        int n2=sc.nextInt();
        int r;

        while(n2 != 0)
        {
            r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        System.out.print("GCD = "+n1);
    }
}