public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------------");

        String input = "madam";
        System.out.println("Input text: " + input);

        boolean isPalindromeUC2 = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindromeUC2 = false;
                break;
            }
        }
        System.out.println("UC2 Result (Half-loop): " + isPalindromeUC2);

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        boolean isPalindromeUC3 = input.equals(reversed);
        System.out.println("UC3 Result (Reversal): " + isPalindromeUC3);

        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindromeUC4 = true;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindromeUC4 = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("UC4 Result (Char Array/Two-Pointer): " + isPalindromeUC4);
    }
}