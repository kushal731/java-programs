import java.util.*;
public class p13 {
    public static int printMyName(int num,int a){
        
        System.out.print("The addition of "+num+" and "+a+" is: ");
        System.out.print(a + num);
        return 5;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print("enter num: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("enter a: ");
        int a=sc.nextInt();

        sc.close();
        // printMyName(num);
        printMyName(num, a);
    }
}
