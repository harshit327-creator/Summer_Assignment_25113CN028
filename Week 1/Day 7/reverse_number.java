//recursive reverse number
import java.util.*;
public class reverse_number {
    static int rev=0;
    public static int reverse_number(int n) {
        if(n==0){
            return rev;
        }
        int rem=n%10;
        rev=rev*10+rem;
        return reverse_number(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. to find its reverse : ");
        int n = sc.nextInt();
        System.out.println("Reverse of "+n+" is : "+reverse_number(n));
    }
}
