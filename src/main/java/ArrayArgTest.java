import java.util.Arrays;

/**
 * Created by vbauer on 06/07/14.
 */
public class ArrayArgTest {

    public static void main(String[] args) {

        String[] array = {"one", "two"};
        changeArray(array);
        System.out.println(Arrays.toString(array));

    }



    public static void changeArray(String[] array){

        array = new String[]{"array", "changed"};
    }

}
