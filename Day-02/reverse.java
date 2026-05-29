import java.util.*;
public class reverse {
    public static void reverse(){
        int r,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n= sc.nextInt();
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("reverse of number:"+rev);
    }
    public static void main(String[] args) {
        reverse();
    }
}
