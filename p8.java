import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("enter a: ");
        int a=sc.nextInt();
        System.out.print("enter b: ");
        int b=sc.nextInt();
        sc.close();
        while(a<b+1){
            System.out.println(a+". kushal");
            a++;
        }
    }
}
