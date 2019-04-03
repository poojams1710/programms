import java.util.*;
class p16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 0) {

                int num = 0;

                for (int j = 1; j <= rows; j++) {
                    {
                        System.out.print(num);
                        num = (num == 0) ? 1 : 0;
                    }
                }
            } else {
                int num = 1;
                for (int j = 1; j <= rows; j++) {
                    System.out.print(num);
                    num = (num == 0) ? 1 : 0;
                }


            }
            System.out.println();
        }
    }
}


