//Convert decimal to binary;
import java .util.*;
public class decimal_to_binary {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal no. to convert it into binary no. : ");
        int n=sc.nextInt();
        System.out.println("Binary no. : "+decimal_to_binary(n));
    }
}
