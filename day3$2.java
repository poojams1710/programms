import java.util.*;
class day3$2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age of girl so that we get the numbers of candles");
        int n=sc.nextInt();
        System.out.println("for heights of cakes an array");
        long a[]=new long[n];
        long tallest =a[0];
       int  count=0;
        System.out.println("start entering the candle heights");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //*finding all tallest candles
        for (int i=0;i<n;i++ ) {
            if (a[i] > tallest) {
                tallest = a[i];
            }


        }
            //*finding the number of tallest candles
           for (int i=0;i<n;i++){
            if(a[i]==tallest){
                count++;
            }
           }
           System.out.println("the num of candles blown out"+count);


    }
}
