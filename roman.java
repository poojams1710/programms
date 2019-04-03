
import java.io.*;
import java.nio.Buffer;

class roman
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        int num=Integer.parseInt(br.readLine());//accepting decimal number

         //checking whethe the number entered is within the range [1-3999]

if(num>0 || num>4000){
/*Saving the Roman equivalent of the thousand, hundred, ten and units place of a decimal number*/
            String thou[]={"","M","MM","MMM"};
            String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
            String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
            String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};

/*Finding the digits in the thousand, hundred, ten and units place*/

        int th=num/1000;
int h=(num/100)%10;
int t=(num/10)%10;
int u=num%10;



/*Displaying equivalent roman number*/
            System.out.println("Roman Equivalent= "+thou[th]+hund[h]+ten[t]+unit[u]);
        }

/*Displaying an error message if the number entered is out of range*/
        else
            System.out.println("nYou entered a number out of Range.nPlease enter a number in the range [1-3999]");
    }
}