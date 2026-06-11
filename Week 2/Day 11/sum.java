// sum of two no.
import java.util.*;
public class sum {
    public static void sum(int n, int m) {
        System.out.println("Sum of two no. : " + (n+m));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no. : ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd no. : ");
        int m = sc.nextInt();
        sum(n, m);
    }
}
