
import java.util.*;
class p22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }
    }
}
        //*fo}
