import java.util.*;
public class p15 {
    public static int MultipleMy(int a,int b ) {
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int a=sc.nextInt();
        System.out.println();
        int b=sc.nextInt();
        int prod=MultipleMy(a,b);
        sc.close();
        System.out.println(prod);
    }
}
