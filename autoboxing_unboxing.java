import java.util.Scanner;
public class autoboxing_unboxing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter n: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // String name="kushal";
        // String rolno="47";
        // String fullname=name+" "+rolno;
        // System.err.println("fullname: "+fullname);
        // System.err.println(fullname.length());
        // for (int i=0;i<fullname.length();i++)
        // {
        //     System.err.print(fullname.charAt(i));
        System.err.println();
            for(int a:arr)
            {
                System.err.print(a+" ");
            }
        }
        
        }

        
    
// }
