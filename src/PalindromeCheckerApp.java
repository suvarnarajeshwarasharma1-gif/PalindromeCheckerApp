public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;

        // Display the input text
        System.out.println("Input text: " + input);

        // Palindrome logic: Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character at index 'i' with character at matching end index
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop if a mismatch is found
            }
        }

        // Display the result
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
