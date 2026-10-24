import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value for a=");
        int a=sc.nextInt();
        System.out.print("enter the value for b=");
        int b=sc.nextInt();
        sc.close();
        if(a==b){
            System.out.println("this is equal");
        }else if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }
        if(a==b)
            System.out.println("the");
    }
}
