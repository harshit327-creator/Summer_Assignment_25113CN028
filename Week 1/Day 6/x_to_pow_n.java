//find x^n without pow();
import java.util.*;
public class x_to_pow_n {
    public static int x_to_pow_n(int x, int n) {
        int a=1;
        for(int i=1 ; i<=n ; i++){
            a=a*x;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of base : ");
        int x=sc.nextInt();
        System.out.print("Enter value of power : ");
        int n=sc.nextInt();
        System.out.println("x^n : "+x_to_pow_n(x,n));
    }
}
