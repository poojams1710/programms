import java.util.*;
class day1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter strength");
        int numtype = Integer.parseInt(sc.nextLine());
int sum=0;
        System.out.println("start entering the numbers ");
        for (int i = 0; i < numtype; i++) {
            int num = sc.nextInt();
            sum =sum+ num;


        }
        System.out.println(sum);
    }
}




