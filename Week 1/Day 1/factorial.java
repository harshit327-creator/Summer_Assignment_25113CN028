//factorial of a number
import java.util.*;
public class factorial {
    public static void factorial(int n) {
        int fact=1;
        for(int i=1 ; i<=n ; i++){
            fact*=i;
        }
        System.out.println("factorial of " + n + " is " + fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to find its factorial : ");
        int n = sc.nextInt();
        factorial(n);
    }
    
}
