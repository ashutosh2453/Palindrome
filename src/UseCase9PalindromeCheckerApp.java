public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        // Recursive palindrome check
        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }

    // Recursive method to check palindrome
    static boolean isPalindrome(String str, int start, int end) {

        // Base condition: crossed pointers or single character
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return isPalindrome(str, start + 1, end - 1);
    }
}