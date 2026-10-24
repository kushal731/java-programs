public class bit {
public static void main(String[] args) {
    int n=7; //0111
    int pos=2;
    int bitmask= 1<<pos; //
    System.out.println(bitmask);
    if ((bitmask & n)==0){
        System.err.println("zero");
    }else{
        System.out.println("one");
    }

}}