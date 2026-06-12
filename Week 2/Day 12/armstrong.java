//check armstrong number
import java.util.*;
public class armstrong {
    public static int digits(int n) {
        int count=0;
        int a=n;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void armstrong(int n) {
        int sum=0;
        int a=n;
        int digits=digits(n);
        while(n>0){
            int r=n%10;
            sum+=Math.pow(r,digits);
            n=n/10;
        }
        if(sum==a){
            System.out.println(a + " is a amstrong number");
        }
        else{
            System.out.println(a + " is not a amstrong number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to find its number of digits : ");
        int n = sc.nextInt();
        armstrong(n);
    }
}
