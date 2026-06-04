//generate a fibonacci series
import java.util.*;
public class fibonacci_series {
    public static void fibonacci(int n) {
        int a=0 , b=1 ;
        if(n>=1){
            System.out.print("0 ");
        }
        if(n>=2){
            System.out.print("1 ");
        }
        for(int i=1 ; i<=n-2 ; i++){
            int fibo=a+b; ;
            System.out.print(fibo + " ");
            a=b;
            b=fibo;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. of terms in series : ");
        int n = sc.nextInt();
        fibonacci(n);
    }
}
