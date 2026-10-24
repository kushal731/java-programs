import java.util.*;
public class Simple {

    public void array1() {
        ArrayList<Integer> a = new ArrayList<>();
        Random rand = new Random();

        for (int i = 1; i < 100; i++) {
            Set<Integer> s = new HashSet<>();
            s.add(rand.nextInt(8001) + 1000); // Random number between 1000 and 9000
            for (int k : s) {
                a.add(k);
            }
        }

        System.out.println("ArrayList contents:");
        for (int val : a) {
            System.out.println(val);
        }
    }

    public void panda1() {
        Map<String, List<Number>> dic1 = new HashMap<>();
        dic1.put("1", Arrays.asList(8639, 3333, 736, 84686));
        dic1.put("b", Arrays.asList(184, 836, 83, 936.300));

        System.out.println("Simulated DataFrame:");
        String[] index = {"a", "b", "c", "d"};
        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i] + ": " + dic1.get("1").get(i) + ", " + dic1.get("b").get(i));
        }

        System.out.println("\nAccessing dic1[1][2]: " + dic1.get("1").get(2));

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> l2 = Arrays.asList(5, 4, 3, 2, 1);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 's' to sum the lists: ");
        String n = sc.nextLine();

        if (n.equals("s")) {
            try {
                List<Integer> sumList = new ArrayList<>();
                for (int i = 0; i < l1.size(); i++) {
                    sumList.add(l1.get(i) + l2.get(i));
                }
                System.out.println("Summed List:");
                for (int val : sumList) {
                    System.out.println(val);
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
        sc.close();
        }
    }

    public static void main(String[] args) {
        Simple z = new Simple();
        z.panda1();
        z.array1();
    }
}
