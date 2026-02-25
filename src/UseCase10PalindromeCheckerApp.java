public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string with spaces and mixed case
        String input = "Never Odd Or Even";

        // Step 1: Normalize the string
        // Convert to lowercase and remove spaces
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Step 2: Palindrome check using two-pointer technique
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Display result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome (ignoring spaces & case).");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}