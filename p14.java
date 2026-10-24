import java.util.*;
public class p14 {
    public static int CalculatorSum(int a,int b){
        int c=a+b;
        System.out.println();
        System.out.println("The sum of "+a+" and "+b+" is: "+c);

        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("enter the value for a: ");
        int a=sc.nextInt();
        System.out.println();
        System.out.print("enter the value for b: ");
        int b=sc.nextInt();
        System.out.print("enter the type of function: ");
        String typ=sc.nextLine();
        sc.close();
        CalculatorSum(a, b);
    }
    
}
