import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        System.out.println("a sequnce ");
        Scanner sc = new Scanner(System.in);
        int m = 1;
        int x = 5;
        int i = 1;
        System.out.println("enter the number of sequence you wants to print");
        int n = sc.nextInt();
        while (i <= n) {
            m = m * x;
            System.out.print(m);
                i++;


                if (x % 10 == 5 && m / 10 > 1) {

                    System.out.print(m + 5);
                }


                                 i++;

        }


    }
}

