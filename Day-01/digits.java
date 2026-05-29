import java.util.*;
public class digits {

    public static void digits(int n) {
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        System.out.println("no. of digits = " + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        digits(n);
    }
}
