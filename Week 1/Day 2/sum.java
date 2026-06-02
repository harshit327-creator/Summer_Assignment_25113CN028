//sum of digits of a number
import java.util.*;
public class sum {
    public static void sum_of_digits(){
        int r,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find sum of its digits : ");
        int n= sc.nextInt();
        while(n>0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println("Sum of digits of entered number : "+sum);
    }
    public static void main(String[] args) {
        sum_of_digits();
    }
}
