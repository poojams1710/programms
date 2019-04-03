
import java.util.*;
class day3$1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers in array");
        int n=sc.nextInt();
        long a[]=new long[5];
        int sumofnumbers=0;
        long maxnum=a[0];
        long minnum=a[0];
        System.out.println("start entering number");
        for(int i=0;i<5;i++ ) {
            a[i] = sc.nextInt();
            sumofnumbers+=a[i];
        }
        //*after entering
        //*here a simple logic that is take 1,2,3,4,5,as example if we take sum
        // *of all these we have 15.okk after that getting which one is min between all
        //*here it is 1subtract from whole sum 15-1=14 i think i'll be the highest sum we can get by using four from these five.
        //*after that similarly subtract highest one from 15 to get min sum 15-5=10.

        for(int i=0;i<5;i++) {
            if (a[i] > maxnum) {
                maxnum = a[i];
            }
        }
        for(int i=0;i<5;i++){
            if (a[i] < minnum) {
                minnum = a[i];
            }
        }
        System.out.println("this is our max "+maxnum);
        System.out.println("this is our min"+minnum);


        System.out.println("here the result");
        System.out.println(sumofnumbers-minnum);
        System.out.println(sumofnumbers-maxnum);
    }
}//*i know complexity is tooo much but thats can be minimise smartly hhhaaahhhah
