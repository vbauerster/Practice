import java.util.Random;

/**
 * Created by vbauer on 05/05/14.
 */
public class RandomGenerator {
    public static void main(String[] args) {
        Random r = new Random();
//        System.out.println(r.nextInt(10));

        for(int n=0; n<100; n++) {
            if((n & -n) == n)
            System.out.println(n);
        }

        int i = 12;
        System.out.println(String.format("%32s",Integer.toBinaryString(i)).replaceAll(" ", "0"));
        System.out.println(Integer.toBinaryString(-i));

    }

    private static int rint(int min, int max)
    {
        return (int)(Math.random() * (max - min) + min);
    }
}
