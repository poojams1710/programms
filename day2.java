
import java.util.*;

public class day2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter strength");
        int numtype = Integer.parseInt(sc.nextLine());
        double ncount=0.0,pcount=0.0,zcount=0.0;
        System.out.println("start entering the numbers ");
        for(int i=0;i<numtype;i++){
            int num = sc.nextInt();
            if(num<0){
                ncount++;
            }else if(num>0){
                pcount++;
            }else{
                zcount++;
            }
        }
        System.out.printf("%.6f\n%.6f\n%.6f",pcount/numtype,ncount/numtype,zcount/numtype);
    }
}