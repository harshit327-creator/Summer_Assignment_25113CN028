//this code will tell all the prime numbers between 2 numbers including the upper and lower limt values
import java.util.*;
public class prime_range {
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

    public static void range(int n , int m) {
        for(int i=n ; i<=m ; i++){
            if(isprime(i)==true){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lower limit of range for checking prime numbers : ");
        int n = sc.nextInt();
        System.out.print("enter the upper limit of range for checking prime numbers : ");
        int m = sc.nextInt();
        range(n,m);
    }
}
