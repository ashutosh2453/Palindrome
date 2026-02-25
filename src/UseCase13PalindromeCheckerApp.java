import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        System.out.println("Performance Comparison for input: \"" + input + "\"\n");

        // Two Pointer Approach
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Stack Approach
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Recursive Approach
        long start3 = System.nanoTime();
        boolean result3 = recursiveCheck(input, 0, input.length() - 1);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // Display Results
        System.out.println("Two Pointer Result  : " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Result        : " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Recursive Result    : " + result3 + " | Time: " + time3 + " ns");
    }

    // Two-pointer approach
    static boolean twoPointerCheck(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Stack-based approach
    static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Recursive approach
    static boolean recursiveCheck(String input, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        return recursiveCheck(input, start + 1, end - 1);
    }
}