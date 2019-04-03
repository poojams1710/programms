import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        int num,  c;
        Scanner o = new Scanner(System.in);
        System.out.println("enter the number");
        num = o.nextInt();
         c=0;
       for(int i=1;i<=num;i++){
           if(num%i==0){
               c=c+1;
           }
       }
        if (c == 2) {
            System.out.println("its a prime number");
        } else {
            System.out.println("its not a prime num");
        }
    }
    }

