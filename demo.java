
public class demo {

    public static void main(String[] args) {
        int arr[] = {12, 32, 432, 44, 21, 112, 432};
        int arr2[] = new int[arr.length];
        int n = arr.length;
        System.out.println("The given array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "   ");

        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        System.out.println();
        System.out.println("The sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "   ");
        }

        for (int j1 = 0; j1 < n; j1++) {
            // System.out.println(j);
            arr2[j1] = arr[n - j1 - 1];
        }

        System.out.println();
        System.out.println("The reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + "   ");
        }
    }
}
