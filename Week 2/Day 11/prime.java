//check whether a number is prime or not
import java.util.*;
public class prime {
    public static boolean isprime(int n) {
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        else{
            for(int i=2 ; i<=Math.sqrt(n) ; i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        if(isprime(n)==true){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }
        
    }
}
