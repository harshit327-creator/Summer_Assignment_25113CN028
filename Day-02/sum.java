import java.util.*;
public class sum {
    public static void sum_of_digits(){
        int r,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n= sc.nextInt();
        while(n>0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println("sum of digits:"+sum);
    }
    public static void main(String[] args) {
        sum_of_digits();
    }
}
