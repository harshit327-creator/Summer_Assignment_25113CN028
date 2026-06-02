//reverse a nymber
import java.util.*;
public class reverse {
    public static void reverse(){
        int r,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed : ");
        int n= sc.nextInt();
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse of entered number : "+rev);
    }
    public static void main(String[] args) {
        reverse();
    }
}
