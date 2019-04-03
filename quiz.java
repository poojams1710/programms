
import java.util.*;
class quiz {
    char a[][];
    char k[];
    int s[];
    int i;
    void input ()

    {
        System.out.println("enter the number of participants");

        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
         a= new char[n][5];
         k=new char[ 5];
         s= new int[n];
        int i;

        System.out.println("enter the answers of participants in row wise");


        for (i = 0; i < n; i++) {
            System.out.println("participant" + (i + 1));
            for (int j = 0; j < 5; j++) {
                a[i][j]= sc.next().charAt(0);
            }
            System.out.println("enter the answer key");
            for ( i = 0; i < 5; i++) {
                k[i] = sc.next().charAt(0);

            }
        }
    }


        void calscore(){
            for(int i=0;i<5;i++){
                s[i]=0;
                for(int j=0;j<5;j++){
                    if(a[i][j]==k[i]){
                        s[i]++;
                    }
                }


            }
        }
        void printscore(){
            int max=0;
            System.out.println("participants"+(i+1)+"="+s[i]);
            if(s[i]>max){
                max=s[i];
                System.out.println(max);
            }

        }
public static void main(String [] args) {
            quiz ob=new quiz();
           ob. input();
           ob. calscore();
           ob. printscore();
}


}
