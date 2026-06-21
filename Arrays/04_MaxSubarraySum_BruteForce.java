// Problem: Maximum Subarray Sum (Brute Force)
// Topic: Arrays
// Time Complexity: O(n^3)
// Space Complexity: O(1)

public class MaxSubarraySumBruteForce {

    public static void maxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {

                int currentSum = 0;

                for (int k = i; k <= j; k++) {
                    currentSum += numbers[k];
                }

                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarraySum(numbers);
    }
}
