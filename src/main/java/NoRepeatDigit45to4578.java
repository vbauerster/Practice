/**
 *
 * Print From 45 to 4578 Without Repeating Digits
 *
 * Write a method that prints all the numbers from 45 to 4578 to the console,
 * with the constraint that you cannot print any number with repeating digits.
 * This means the following numbers would be skipped: 11, 22, ...., 122, 110,....
 *
 * Created by vbauer on 19/04/14.
 */
public class NoRepeatDigit45to4578 {

    public static void main(String[] args) {

        outmost:
        for(int i=45; i<4579; i++){
            String num = Integer.toString(i);
            char[] decimal = num.toCharArray();

            for(int right=decimal.length-1; right>-1; right--)
                for(int left=right-1; left>-1; left--)
                    if(decimal[right]==decimal[left])
                        continue outmost;

            System.out.println(num);
        }

    }

}