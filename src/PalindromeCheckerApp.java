public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Startup Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------------");

        String input = "madam"; // Standard input for UC9
        System.out.println("Input : " + input);

        // UC9: Recursive Validation
        // Start index: 0, End index: length - 1
        boolean isPalindrome = check(input, 0, input.length() - 1);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks if a string is a palindrome.
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Case: If pointers cross or meet, it is a palindrome
        if (start >= end) {
            return true;
        }

        // If characters at current positions don't match, it is not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call: move inward
        return check(s, start + 1, end - 1);
    }
}