import java.util.Scanner;

class fibonacciSeries{

    public static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of times u want ");
        int count=sc.nextInt();
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<=count;i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(n3);
        }

    }
}