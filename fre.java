import java .io.*;

class fre {
    public static void main(String[] args) throws IOException {
        String s;
        int count = 0;
        int l;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the sentence");
        s = br.readLine();
        System.out.println("frequency");
        System.out.println("==================================");
        char ch;

        l = s.length();
        for (char i = 'a'; i <= 'z'; i++) {
            count = 0;
            for (int j = 0; j <= l; j++) {
                ch = s.charAt(j);
                if (ch == i) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println(i + "\t\t" + count);
            }
        }
    }
}
