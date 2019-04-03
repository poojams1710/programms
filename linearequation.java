import java.util.Scanner;
public class linearequation
{
    public static void main(String args[]){

        char []var={'x','y','z','w','a','b','c','d','e'};
        System.out.println("enter the num of variables in the equation");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the coefficient of each variable");
        System.out.println("ax+by+cz+......+d");
        int [][]mat=new int[n][n];
        int [][]constant=new int[n][1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
            constant[i][0]=sc.nextInt();
        }
        System.out.println("matrix representation:   ");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" " + mat[i][j]);
            }

            System.out.println("" + var[i]);
            System.out.println("" + constant[i][0]);

        }
    }
}
