//this code will tell all the armstrong numbers between 2 numbers including the upper and lower limt values
//0 is also a armstrong number it includes that also 
import java.util.Scanner;
public class armstrong_range {
    public static int digits(int n) {
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static boolean armstrong(int n) {
        int sum=0;
        int a=n;
        int digits=digits(n);
        while(n>0){
            int r=n%10;
            sum+=Math.pow(r,digits);
            n=n/10;
        }
        if(sum==a){
            return true;
        }
        return false;
    }

    public static void range(int n, int m) {
        for(int i=n ; i<=m ; i++){
            if(armstrong(i)==true){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the lower limit of range for checking armstrong numbers : ");
       int n = sc.nextInt();
       System.out.print("enter the upper limit of range for checking armstrong numbers : ");
       int m = sc.nextInt();
       range(n,m);
    }
}
