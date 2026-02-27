/**
 * Service class that contains palindrome logic.
 * This demonstrates the Single Responsibility Principle.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * Uses an optimized two-pointer approach internally.
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Preprocessing for robustness (UC10 logic)
        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Initialize pointers
        int start = 0;
        int end = clean.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (clean.charAt(start) != clean.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: INITIALIZATION ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------------");

        // UC11 Input
        String input = "racecar";
        System.out.println("Input : " + input);

        // --- UC11: Object-Oriented Approach ---
        // Instantiate the service class
        PalindromeService service = new PalindromeService();

        // Call the encapsulated method
        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);
    }
}