//count digits in a number
import java.util.*;
public class digits {

    public static void digits(int n) {
        int count=0;
        int a=n;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("no. of digits in " + a + " is " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to find its number of digits : ");
        int n = sc.nextInt();
        digits(n);
    }
}
