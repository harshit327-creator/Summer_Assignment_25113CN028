//compare two number
import java.util.*;
public class max {
    public static void max(int n, int m) {
        if(n > m){
            System.err.println(n + " is bigger number");
        }
        else{
            System.err.println(m + " is bigger number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no. : ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd no. : ");
        int m = sc.nextInt();
        max(n, m);
    }
}
