//LCM of two numbers
import java.util.*;
public class LCM {
    public static int lcm(int n , int m) {
        int GCD=1;
        for(int i=1 ; i<=Math.min(n,m) ; i++){
            if(n%i==0 && m%i==0){
                GCD=i;
            }
        }
        int lcm=n*m/GCD;  //using formula LCM(a,b)*HCF(a*b)=a*b
        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int n = sc.nextInt();
        System.out.print("enter second number : ");
        int m = sc.nextInt();
        System.out.println("LCM of "+n+" and "+m+" is : " + lcm(n, m));
    }
}
