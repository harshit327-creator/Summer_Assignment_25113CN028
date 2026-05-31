//find nth fibonacci term
import java.util.*;
public class nth_fibonacci {
    public static void fibonacci(int n) {
        int a=0 , b=1 ;
        if(n==1){
            System.out.println("The 1st term is 0");
            return ;
        }
        if(n==2){
            System.out.println("The 2nd term is 1");
            return ;
        }
        if(n==3){
            System.out.println("The 3rd term is 1");
            return ;
        }
        for(int i=1 ; i<=n-2 ; i++){
            int fibo=a+b;
            a=b;
            b=fibo;
        }
        System.out.println("The "+n+"th term is "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the nth term to be found : ");
        int n = sc.nextInt();
        fibonacci(n);
    }
}
