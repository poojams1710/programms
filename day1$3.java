import  java.util.*;
class day1$3{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the comparing number in both  ");

        int a0=sc.nextInt();
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        System.out.println("enter in sec");
        int b0=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int A=0;
        int B=0;

        if(a0>b0) {
            A++;
        }
        else if(a0<b0) {

            B++;
        }
        if(a1>b1){
            A++;

        }
        else if(a1<b1){
            B++;

        }
        if(a2>b2){
            A++;
        }
        else if(a2<b2){
            B++;
        }
        System.out.println(A);
        System.out.println(B);

    }
}
