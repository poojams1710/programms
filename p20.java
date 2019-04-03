import java.util.*;
class p20{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        int n = sc.nextInt();
        int half = n / 2;
        int value = 1;
        for (int i = half; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= value; j++) {
                System.out.print(value + " ");
            }
            System.out.println();
            value++;

        }
        int value2=half-1;

       for(int i=0;i<half;i++){

            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=value2;j>0;j--){
                System.out.print(value2+" ");
            }
            System.out.println();
           value2--;

        }
    }
}

