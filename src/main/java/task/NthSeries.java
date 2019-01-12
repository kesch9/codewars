/*
Your task is to write a function which returns the sum of following series upto nth term(parameter).

Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...

Rules:

    You need to round the answer to 2 decimal places and return it as String.

    If the given value is 0 then it should return 0.00

    You will only be given Natural Numbers as arguments.

 */

package task;

// My Solution
public class NthSeries {

    public static String seriesSum(int n) {

        double sum = 0;
        for (double i = 0; i < n; i++){
            sum += 1/(1+i*3);
        }
        char [] data = String.format("%.2f%n",sum).toCharArray();
        data [1] = '.';
        String s = new String(data,0,4);
        return s;
    }
}

//Best Solution
//public class NthSeries {
//
//    public static String seriesSum(int n) {
//
//        double sum = 0.0;
//        for (int i = 0; i < n; i++)
//            sum += 1.0 / (1 + 3 * i);
//
//        return String.format("%.2f", sum);
//
//    }
//}

//import java.util.stream.IntStream;
//
//public class NthSeries {
//
//    public static String seriesSum(int n) {
//        return String.format("%.2f", IntStream.range(0, n).mapToDouble(num -> 1.0 / (1 + num * 3)).sum());
//    }
//}
