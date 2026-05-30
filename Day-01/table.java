//print multiplication table of a givenn number
import java.util.*;
public class table {
    public static void table(int n){
        System.out.println("table of " + n);
        for(int i=1 ; i<=10 ; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number whose multiplication table is required : ");
        int n=sc.nextInt();
        table(n);
    }
}
