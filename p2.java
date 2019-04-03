
import java.util.*;
class p2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many rows ");
        int row=sc.nextInt();
        System.out.println("here is your pattern");
        for(int i=1;i<row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}