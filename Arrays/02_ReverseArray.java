// Problem: Reverse an Array
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseArray {

    public static void reverse(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int numbers[]) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        System.out.print("Original Array: ");
        printArray(numbers);

        reverse(numbers);

        System.out.print("Reversed Array: ");
        printArray(numbers);
    }
}
