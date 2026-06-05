//check perfect number
import java.util.*;
public class perfect_number {
    public static boolean perfect_number(int n) {
        int sum=0;
        for(int i=1 ; i<n ; i++){
            if(n%i == 0){
                sum+=i;
            }
        }
        if(sum == n){
            return true;
        }
        else{
           return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is a perfect number : ");
        int n = sc.nextInt();
        if(perfect_number(n)){
            System.out.println("The entered number is a perfect number");
        }
        else{
            System.out.println("The entered number is not a perfect number");
        }
    }
}
