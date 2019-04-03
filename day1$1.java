import java.util.*;
class day1$1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the strength");
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for( int a_i=0;a_i<n;a_i++){
            a[a_i]=sc.nextInt();
            sum+=a[a_i];

        }
        System.out.println(sum);
    }
}
