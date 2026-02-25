public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call encapsulated method
        boolean result = checker.checkPalindrome(input);

        // Display result
        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}


// Separate service class following SRP
class PalindromeChecker {

    // Public method to expose palindrome logic
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Convert to char array (Internal Data Structure)
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        // Two-pointer comparison
        while (start < end) {
            if (characters[start] != characters[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}