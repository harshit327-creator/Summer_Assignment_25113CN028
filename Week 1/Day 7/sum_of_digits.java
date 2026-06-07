//recursive sum of digits
import java.util.*;
public class sum_of_digits {
    public static int sum_of_digits(int n) {
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem+sum_of_digits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. to find its sum of digits : ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of "+n+" is : "+sum_of_digits(n));
    }
}
