
import java.io.*;
class removerepeat
{
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the word ");
        String s1 = br.readLine();
        s1 = s1 + " ";
        int l = s1.length();
        String ans = " ";
        for (int i = 0; i < l - 1; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s1.charAt(i + 1);
            if (ch1 != ch2) {
                ans = ans + ch1;
            }

        }
        System.out.println(ans);
    }


}