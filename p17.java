import java.util.*;
public class p17 {
    
    public static int My (int a,int b){
        System.out.println(a+b);
        return a+b;

    }
    public static void main(String []args){
        System.out.println();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        My(a,b);
    }
}
