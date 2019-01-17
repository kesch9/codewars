package task;
//My Solution
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        char [] str2c = str2.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str1);
        for (char c : str2c){
            try {
                stringBuffer.deleteCharAt(stringBuffer.toString().indexOf(c));
            }catch (StringIndexOutOfBoundsException e){
                return false;
            }
        }
        return true;
    }
}
//Best!!
//public class Scramblies {
//
//    public static boolean scramble(String str1, String str2) {
//        if (str2.length() > str1.length()) return false;
//        for (String s: str2.split("")) {
//            if (!str1.contains(s))  return false;
//            str1 = str1.replaceFirst(s,"");
//        }
//
//        return true;
//    }
//}
//
//import java.util.LinkedList;
//
//public class Scramblies {
//
//    public static boolean scramble(String str1, String str2) {
//        LinkedList<Character> linkedList = new LinkedList<Character>();
//        for(char a: str1.toCharArray()){
//            linkedList.add(a);
//        }
//        for(char a: str2.toCharArray()) {
//            if(!linkedList.remove((Character)a)) {
//                return false;
//            }
//        }
//        return true;
//    }
//}