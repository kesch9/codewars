package task;


//My Solution
public class Kata {

    public static String expandedForm(int num)
    {
        char[] charsNum = String.valueOf(num).toCharArray();
        int[] intsum = new int[charsNum.length];
        int j = 0;
        for(int i = charsNum.length; i > 0; i--){
            intsum[j++] = (int)(num/Math.pow(10,(double)i-1))*(int)(Math.pow(10,(double)i-1));
            num = (int) (num%Math.pow(10,(double)i-1));
        }
        String s = "";
        for (int i: intsum){
            if (i!=0){
                s = s + i + " + ";
            }
        }
        s = s.substring(0,s.length()-3);
        return s;
    }

}

//Best!!!
//public class Kata
//{
//    public static String expandedForm(int num)
//    {
//        String outs = "";
//        for (int i = 10; i < num; i *= 10) {
//            int rem = num % i;
//            outs = (rem > 0) ? " + " + rem + outs : outs;
//            num -= rem;
//        }
//        outs = num + outs;
//
//        return outs;
//    }
//}

//public class Kata
//{
//    public static String expandedForm(int num)
//    {
//        return IntStream.range(0, String.valueOf(num).length())
//                .mapToObj(x -> String.valueOf( Character.getNumericValue(String.valueOf(num).charAt(x) ) * (int)Math.pow(10, String.valueOf(num).substring(x).length()-1)))
//                .filter(x -> !x.equals("0"))
//                .collect(Collectors.joining(" + "));
//    }
//}