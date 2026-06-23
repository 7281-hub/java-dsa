/*
 * Problem: Maximum Subarray Sum using Kadane's Algorithm
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MaxSubarraySum_KadanesAlgorithm {

    public static void kadanes(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];

            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};

        kadanes(numbers);
    }
}
//The above version fails when all elements are negative.
