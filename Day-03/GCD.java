//GCD of two numbers
import java.util.*;
public class GCD {
    public static int gcd(int n , int m) {
        int GCD=1;
        for(int i=1 ; i<=Math.min(n,m) ; i++){
            if(n%i==0 && m%i==0){
                GCD=i;
            }
        }
        return GCD;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int n = sc.nextInt();
        System.out.print("enter second number : ");
        int m = sc.nextInt();
        System.out.println("GCD of "+n+" and "+m+" is : " + gcd(n, m));
    }
}
