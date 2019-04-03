import java.util.*;
class p8{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the num ber of row ");
        int row=sc.nextInt();
        for(int i=row;i>=1;i--){
            for(int j=row;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
