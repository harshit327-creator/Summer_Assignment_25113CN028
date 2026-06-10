//print reverse pyramid pattern
import java.util.*;
public class reverse_pyramid {
    public static void pattern(int n) {
        for(int i=n ;  i>=1 ; i--){
            for(int j=1 ; j<=n-i ; j++){
                System.out.print("  ");
            }
            for(int j=1 ; j<=2*i-1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in pattern : ");
        int n = sc.nextInt();
        pattern(n);
    }
}
