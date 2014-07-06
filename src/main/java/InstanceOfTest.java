import java.util.Date;

/**
 * Created by vbauer on 10/06/14.
 */
public class InstanceOfTest {

    public static void main(String[] args) {

        java.sql.Date date = new java.sql.Date(0l);
        System.out.println(date);

        System.out.println(date instanceof Date);
    }
}
