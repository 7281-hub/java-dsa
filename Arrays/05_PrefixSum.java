// Problem: Maximum Subarray Sum using Prefix Sum
// Topic: Arrays
// Time Complexity: O(n^2)
// Space Complexity: O(n)

public class PrefixSum {

    public static void maxSubarraySum(int numbers[]) {
        int[] prefix = new int[numbers.length];

        prefix[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {

                int currentSum;

                if (i == 0) {
                    currentSum = prefix[j];
                } else {
                    currentSum = prefix[j] - prefix[i - 1];
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
