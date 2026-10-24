


public class p18 {
    public static void main(String args[]) {
        loop1:for(int i=1;i<=100;i++){
            System.err.println("i="+i);
            if(i>=10){
                break;
            }
            for(int j=1;j<=100;j++){
                System.err.println("j="+j);
                if(i==j){
                    continue loop1;
                }
            }
        }
        }
    }
      
    

// class Triangle {
//     int base, height;

//     // Parameterized constructor
//     Triangle(int b, int h) {
//         base = b;
//         height = h;
//     }

//     // Default constructor
//     Triangle() {
//         base = 30;
//         height = 40;
//     }

//     // Method to display area
//     void display() {
//         double area = 0.5 * base * height;
//         System.out.println("Area of Triangle = " + area);
//     }
// }
