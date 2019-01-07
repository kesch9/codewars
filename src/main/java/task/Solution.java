/*
There is a queue for the self-checkout tills at the supermarket. Your task is write a function to calculate the total time required for all the customers to check out!

The function has two input variables:

    customers: an array (list in python) of positive integers representing the queue. Each integer represents a customer, and its value is the amount of time they require to check out.
    n: a positive integer, the number of checkout tills.

The function should return an integer, the total time required.
 */
package task;

public class Solution {

// My Solution
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] worker = new int[n];
        for (int i = 1; i < customers.length+1; i++){
            int min = worker[0];
            int j = 0;
            for (int k = 0 ; k < worker.length; k++){
                if (min > worker[k]){
                    min = worker[k];
                    j = k;
                }
            }
            worker[j] += customers[i-1];
        }
        int max = 0;
        for (int i : worker){
            if (max < i){
                max = i;
            }
        }
        return max;
    }


//Best Solution!!
//    public static int solveSuperMarketQueue(int[] customers, int n) {
//        int[] result = new int[n];
//        for(int i = 0; i < customers.length; i++){
//            result[0] += customers[i];
//            Arrays.sort(result);
//        }
//        return result[n-1];
//    }

}
