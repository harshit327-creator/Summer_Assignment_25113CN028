//sum of n natural number
import java.util.*;
public class sum{
    
    public static void Sum(int n){
        int sum=0;
        for(int i=1 ; i<=n ; i++){
            sum+=i;
        }
        System.out.println("sum of n natural number : " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        Sum(n);
    }
}