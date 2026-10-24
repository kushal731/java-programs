public class stringbuilder{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("kushal");
        System.out.println(sb);
        sb.setCharAt(0, 't');
        System.out.println(sb);
        sb.reverse();
        System.err.println(sb);
    }
}