import java.util.*;
class day3$4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
        int n=sc.nextInt();
        System.out.println("making array for their grade");
        int a[]=new int[n];
        System.out.println("Start entering the grade");
        for(int i=0;i<n;i++){
            if(a[i]<100)
                a[i]=sc.nextInt();
            else {
                System.out.println("enter grade out of range");
            }
        }
        for(int i=0;i<n;i++) {
            if(a[i]>=38) {
                if (a[i] % 5 == 3) {
                    a[i] = a[i] + 2;
                } else if (a[i] % 5 == 4) {
                    a[i] = a[i] + 1;
                } else {
                    a[i] = a[i] + 0;
                }
            }
            else{
                a[i]=a[i]+0;
            }
            System.out.println(a[i]);

        }
    }
}
