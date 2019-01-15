package task;

//My Solution
public class Max {
    public static int sequence(int[] arr) {
        int maximum = 0;
        int local_maximum = 0;
        for(int i:arr){
            if (local_maximum > 0){
                local_maximum += i;
                if (local_maximum<0){
                    local_maximum = 0;
                } else if (local_maximum>maximum){
                    maximum = local_maximum;
                }
            } else if (i>0){
                local_maximum += i;
            }
        }
        return maximum;
    }
}

//Best
//public class Max {
//    public static int sequence(int[] arr) {
//        int m = 0, a = 0, s = 0;
//        for(int e : arr) {
//            s += e;
//            m = Math.min(s, m);
//            a = Math.max(a, s - m);
//        }
//        return a;
//    }
//}

//public class Max {
//
//    public static int sequence(int[] arr) {
//        int max_ending_here = 0, max_so_far = 0;
//        for (int v : arr) {
//            max_ending_here = Math.max(0, max_ending_here + v);
//            max_so_far = Math.max(max_so_far, max_ending_here);
//        }
//        return max_so_far;
//    }
//}