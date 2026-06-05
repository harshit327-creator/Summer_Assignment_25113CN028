//check strong number
import java.util.*;
public class Strong_number {
    public static int factorial(int n) {
        int fact=1;
        for(int i=1 ; i<=n ; i++){
            fact*=i;
        }
        return fact;
    }
    public static boolean Strong_number(int n) {
        int sum=0;
        int a=n;
        while(n>0){
            int r=n%10;
            sum+=factorial(r);
            n/=10;
        }
        if(sum == a){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is a strong number : ");
        int n = sc.nextInt();
        if(Strong_number(n)){
            System.out.println("The entered number is a strong number");
        }
        else{
            System.out.println("The entered number is not a strong number");
        }
    }
}
