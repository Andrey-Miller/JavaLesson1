import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        int i = RandomNum();
        System.out.println(i+" рандомное число");
        int n = HighBit(i);
        System.out.println(n+" старший бит");
        int[] m1 = EvenNum(n, i);
        //System.out.println(Arrays.toString(m1));
        int[] m2 = EvenNum(n, i);
        //System.out.println(Arrays.toString(m2));
    
    }

    static int RandomNum(){
        int i = new Random().nextInt(2001);
        return i;
    }

    static int HighBit(int i) {
        int n = 0;
        while (i > 0) {
            i >>= 1;
            n++;
        }
        return n;
    }

    static int[] EvenNum(int n, int i) {
        int[] m1 = IntStream.rangeClosed(i, Short.MAX_VALUE).filter(num -> num % n == 0).toArray();
        return m1;
    }

    static int[] OddNum(int n, int i) {
        int[] m2 = IntStream.rangeClosed(Short.MIN_VALUE, i).filter(num -> num % n != 0).toArray();
        return m2;
    }

}
