//sum of 1st n natural number
import java.util.*;
public class sum{
    
    public static void Sum(int n){
        int sum=0;
        for(int i=1 ; i<=n ; i++){
            sum+=i;
        }
        System.out.println("sum of n natural no. = " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sum(n);
    }
}