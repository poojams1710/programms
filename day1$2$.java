 import java.util.*;
class day1$2$ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many in strengths ");
        int n=sc.nextInt();
        int a[]=new int[n];
        long total=0;
        for( int a_i=0;a_i<n;a_i++){
            a[a_i]=sc.nextInt();
            total+=a[a_i];

        }
        System.out.println(total);

    }
}

