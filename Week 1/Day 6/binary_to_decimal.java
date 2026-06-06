//convert binary to decimal
import java.util.*;
public class binary_to_decimal {
    public static int binary_to_decimal(int n) {
        int dec=0, pow=0;
        while(n>0){
            int r=n%10;
            dec+=r*(int)Math.pow(2, pow);
            pow++;
            n/=10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary no. to convert it into decimal no. : ");
        int n=sc.nextInt();
        System.out.println("Deccimal no. : "+binary_to_decimal(n));
    }
}
