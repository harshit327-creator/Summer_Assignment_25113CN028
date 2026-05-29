import java.util.*;
public class product {
    public static void product_of_digits(){
        int r,prd=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n= sc.nextInt();
        while(n>0){
            r=n%10;
            prd*=r;
            n=n/10;
        }
        System.out.println("product of digits:"+prd);
    }
    public static void main(String[] args) {
        product_of_digits();
    }
}
