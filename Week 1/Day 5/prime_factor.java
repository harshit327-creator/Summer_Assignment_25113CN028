//find largest prime factor
import java.util.*;
public class prime_factor {
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

    public static int largest_prime_factor(int n) {
        for(int i=n ; i>=2 ; i--){
            if(n%i == 0){
                if(isprime(i)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find its largest prime factor : ");
        int n = sc.nextInt();
        System.out.println("The largest prime factor of "+n+" is : "+largest_prime_factor(n));
    }
}
