import java.util.*;
public class palindriome {
    public static void palindrome(){
        int r,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n= sc.nextInt();
        int a=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==a){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("the number is not palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome();
    }
}
