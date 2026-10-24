import java.util.*;
public class p6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("enter the button: ");
        int button= sc.nextInt(); 
        sc.close();
        switch(button){
            case 1:
            while (button<10) {
                System.out.println("hi");
                button=button+1;
            }
            System.out.println("hello");
            break;
            case 2:
            System.out.println("namaste");
            break;
            case 3: 
            System.out.println("bonjour");
            break;
            default:
            System.out.println("invalid button");
    }
    
}}
