import java .io.*;
class firstalph {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        char x;
        int l;
        System.out.println("enter your sentance");
        s = br.readLine();
        s = " " + s;
        System.out.println("output" + s);
        l = s.length();
        for (int i = 0; i < l; i++) {
            x = s.charAt(i);
            if (x == ' ') {
                System.out.println(s.charAt(i+1) + " ");
            }
        }
    }
}



