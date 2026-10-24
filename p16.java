import java.util.*;
public class p16 {
    public static void main (String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.println();
        
        int [] n=new int[b];
        for(int i=0;i<b;i++)
            {
            System.out.print("Enter c: ");
            int c=sc.nextInt();
            System.out.println();
            n[i]=c;
            }
        for(int j=0;j<b;j++)
            {
            
            System.out.print("Enter c1: ");
            int c1=sc.nextInt();
            System.out.println();
            if(c1<b)
                {
                System.out.println("The value of array in the position of "+c1+" :\n"+n[c1]);
                }

            }
        int [][] n1=new int[b][b];
        n1[0][0]=1;
        System.out.println(n1[0][0]);
        

        sc.close();
    }
}
