// count set bits in a number
import java.util.*;
public class set_bits {
    public static int decimal_to_binary(int n) {
        int bin=0, pow=0;
        while (n>0){
            int r=n%2;
            bin += r*(int)Math.pow(10,pow);
            pow++;
            n/=2;
        }
        return bin;
    }
    public static int set_bits(int n) {
        int count=0;
        int a=decimal_to_binary(n);
        while(a>0){
            if(a%10 == 1){
                count++;
            }
            a/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count its set bits : ");
        int n=sc.nextInt();
        System.out.println("No. of set bits : "+set_bits(n));
    }
}
