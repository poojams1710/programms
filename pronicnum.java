// pronic num n(n+1);
import java.util.*;
class pronicnum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("this is for the number which can get by mul of two successively " );

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(i*(i+1)==n) {
                flag = 1;
                break;
            }
        }

        if(flag == 1)
            System.out.println(n+" is a Pronic Number.");
        else
            System.out.println(n+" is not a Pronic Number.");
    }
}
