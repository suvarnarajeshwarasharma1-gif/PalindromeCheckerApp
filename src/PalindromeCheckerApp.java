public class PalindromeCheckerApp {


    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            // String Concatenation (+) to build the reversed string
            reversed += input.charAt(i);
        }

        // Compare the actual content using the equals() method
        boolean isPalindrome = input.equals(reversed);

        // Display results
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}