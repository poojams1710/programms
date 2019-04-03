import java.util.*;
class p21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        //*divde the row in half which one half move for one
        int half=n/2;
        for (int i=half;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=half;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //*for printing next half
       int  half2=half-1;
        for(int i=half2;i>0;i--){
            for (int j=half2;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

}
