import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vbauer on 05/07/14.
 */
public class ArraysTest {

    public static void main(String[] args) {

        String[] array = {null, null, "12345"};

        array = removeNulls(array);

        int vin = array.length - 1;

        StringBuilder desc = new StringBuilder();

        for (int i = 0; i < vin ; i++) {
            desc.append(array[i]);
            if(i!=vin-1) desc.append(',');
        }

        System.out.println("Vin = " + array[vin]);
        System.out.println("Desc = " + desc.toString());
    }



    public static <T> T[] removeNulls(T[] a) {
        List<T> noNullsCopy = new ArrayList<>(a.length);
        for (T t : a) {
            if (t!=null) noNullsCopy.add(t);
        }
        return (T[]) Arrays.copyOf(noNullsCopy.toArray(a), noNullsCopy.size(), a.getClass());
    }

}
