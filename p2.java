import java.util.*;
public class p2 {

    public static void main(String[] args) {
        System.out.print("enter the number=");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        while (n<10) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            n=n+1;
        }
    }
}