
import java.util.*;
class p18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == j) {
                    System.out.print(i);
                } else {
                    System.out.print(0);
                }
            }

            System.out.println();
        }

    }
}

