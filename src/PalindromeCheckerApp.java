public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: INITIALIZATION ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------------");

        // UC10 Input: "A man a plan a canal Panama"
        String input = "A man a plan a canal Panama";
        System.out.println("Input : " + input);

        // --- UC10 Preprocessing (Normalization) ---
        // 1. Convert to lowercase
        // 2. Remove spaces and non-alphanumeric symbols using regex
        String normalized = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // --- UC10 Validation Logic ---
        boolean isPalindrome = true;
        // Compare symmetric characters from both ends until the midpoint
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}