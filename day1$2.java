import java.util.*;
public class day1$2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = Integer.parseInt(sc.nextLine());
        String[] integers = sc.nextLine().split(" ");
        long sum = 0;
        for(int i = 0; i < numbers; i++)
        {
            sum += Long.parseLong(integers[i]);
        }
        System.out.println(sum);

    }
}