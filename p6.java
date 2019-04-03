
import java.util.*;
class p6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--){
            for(int j=rows;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
