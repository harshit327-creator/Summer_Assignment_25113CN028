//print number pyramid pattern
import java.util.*;
public class number_pyramid {
    public static void pattern(int n) {
        for(int i=1 ;  i<=n ; i++){
            int a = 0;
            for(int j=1 ; j<=n-i ; j++){
                System.out.print("  ");
            }
            for(int j=1 ; j<=i ; j++){
                a++;
                System.out.print(a+" ");
            }
            for(int j=1 ; j<=i-1 ; j++){
                a--;
                System.out.print(a+" ");
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
