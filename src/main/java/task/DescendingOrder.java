/*
Your task is to make a function that can take any non-negative integer as
a argument and return it with its digits in descending order.
Essentially, rearrange the digits to create the highest possible number.
 */

package task;

import java.util.Arrays;
//My Sollution
public class DescendingOrder {
    public static int sortDesc(final int num) {
        String s = String.valueOf(num);
        char[] data = s.toCharArray();
        Arrays.sort(data);
        StringBuffer stringBuffer = new StringBuffer(new String(data));
        stringBuffer.reverse();
        return Integer.parseInt(stringBuffer.toString());//Your code
    }
}


//Best!!
//public class DescendingOrder {
//    public static int sortDesc(final int num) {
//        return Integer.parseInt(String.valueOf(num)
//                .chars()
//                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.joining()));
//    }
//}

//public class DescendingOrder {
//    public static int sortDesc(final int num) {
//        String[] array = String.valueOf(num).split("");
//        Arrays.sort(array, Collections.reverseOrder());
//        return Integer.valueOf(String.join("", array));
//    }
//}