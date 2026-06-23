/*
 * Problem: Maximum Subarray Sum using Prefix Sum
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

public class MaxSubarraySum_PrefixSum {

    public static void printSubArraysSum(int numbers[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;

        // Create Prefix Sum Array
        int prefixSum[] = new int[numbers.length];
        prefixSum[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i];
        }

        // Calculate Maximum Subarray Sum
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {

                if (i == 0) {
                    currSum = prefixSum[j];
                } else {
                    currSum = prefixSum[j] - prefixSum[i - 1];
                }

                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("Maximum Sum of Subarray: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};

        printSubArraysSum(numbers);
    }
}
