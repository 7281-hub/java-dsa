// Problem: Print All Pairs in an Array
// Topic: Arrays
// Time Complexity: O(n^2)
// Space Complexity: O(1)

public class PairsInArray {

    public static void printPairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + current + ", " + numbers[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}
