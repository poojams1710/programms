
import java.io.*;
class special
{
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the num ");
        int n = Integer.parseInt(br.readLine());
        int first, last, pro, sum;
        if (n < 10 || n > 100)
            System.out.println("you entered a wrong digit for check its only for two");
        else {
            first = n / 10;
            last = n % 10;
            sum = first + last;
            pro = first * last;


            if (sum + pro == n) {
                System.out.println("num is special");
            } else {
                System.out.println("not");
            }
        }
    }

}
