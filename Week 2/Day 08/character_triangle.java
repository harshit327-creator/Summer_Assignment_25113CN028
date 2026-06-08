//print character triangle
import java.util.*;
public class character_triangle {
    public static void pattern(int n) {
        for(int i=1 ;  i<=n ; i++){
            char ch = 'A';
            for(int j=1 ; j<=i ; j++){
                System.out.print(ch+" ");
                ch++;
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
