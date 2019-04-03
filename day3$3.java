import java.util.*;
class day3$3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter time in pm /am");
        String time=sc.nextLine();
        //*array for storing time of am and pm in 3 values after splitting at:
        String a[]=time.split(":");
        //*here we extract char store at a[2].charAt(2)to check whether it is am or pm
        //*if am no changes only a case if at 12 we have to show 00.
        char am_pm=a[2].charAt(2);
        if( am_pm=='a'||am_pm=='A'){
            if(a[0].equals("12")){
                String am12="00";
                am12+=":"+a[1]+":"+a[2].charAt(0)+a[2].charAt(1);
                System.out.println(am12);
            }
            System.out.println(a[0]+":"+a[1]+":"+a[2].charAt(0)+a[2].charAt(1));

        }
        else {
            //* if in pm then extract the hours from a[0] and add 12 into that if exact 12 write as it is
            int tpm=Integer.parseInt(a[0]);
            if(tpm<12){
                tpm+=12;
             String   twenty_four=tpm+":"+a[1]+":"+a[2].charAt(0)+a[2].charAt(1);

            System.out.println(twenty_four);
            }
            else {
                System.out.println(a[0]+":"+a[1]+":"+a[2].charAt(0)+a[2].charAt(1));
            }

        }
    }
}
