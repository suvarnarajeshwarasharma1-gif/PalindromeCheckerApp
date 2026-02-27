import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Startup Flow
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------------");

        String input = "noon"; // input from UC5 hint
        System.out.println("Input : " + input);

        // UC2: Midpoint Loop Efficiency
        boolean isPalindromeUC2 = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindromeUC2 = false;
                break;
            }
        }
        System.out.println("UC2 (Half-loop) result: " + isPalindromeUC2);

        // UC3: String Reversal (Immutability check)
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("UC3 (Reversal) result: " + input.equals(reversed));

        // UC4: Two-Pointer Technique (char array)
        char[] charArray = input.toCharArray();
        int left = 0, right = charArray.length - 1;
        boolean isPalindromeUC4 = true;
        while (left < right) {
            if (charArray[left++] != charArray[right--]) {
                isPalindromeUC4 = false;
                break;
            }
        }
        System.out.println("UC4 (Two-pointer) result: " + isPalindromeUC4);

        // UC5: Stack-Based Logic
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindromeUC5 = true;
        // Iterate again through original string and pop from stack to compare
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindromeUC5 = false;
                break;
            }
        }
        System.out.println("Is Palindrome? (UC5 Stack-based): " + isPalindromeUC5);
    }
}