import java.util.Arrays;
import java.util.List;

/**
 * Created by vbauer on 07/05/14.
 */
public class StringTest {
    public static void main(String[] args) {

        char[] passw = {'p','a','s','s','w'};

        String string = new String(passw);
        System.out.println(passw);

        passw[0] = 'd';
        System.out.println(string);

        char[] newpassw = passw.clone();

        System.out.println(newpassw);

        String[] array = {"One", null, "Three", null};

        List<String> strings = Arrays.asList(args);

        strings.remove("One");

        for (String s : strings) {
            System.out.println(s);
        }

    }
}
