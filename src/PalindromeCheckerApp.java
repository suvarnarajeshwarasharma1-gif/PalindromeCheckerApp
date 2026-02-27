import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message & Versioning
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------------");

        // UC6: Input string for validation
        String input = "civic";
        System.out.println("Input : " + input);

        // UC2: Midpoint Loop (Half-length)
        boolean isPalindromeUC2 = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindromeUC2 = false;
                break;
            }
        }
        System.out.println("UC2 (Half-loop) result: " + isPalindromeUC2);

        // UC3: String Reversal logic
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

        // UC5: Stack-Only Reversal (LIFO)
        Stack<Character> stackUC5 = new Stack<>();
        for (char c : input.toCharArray()) {
            stackUC5.push(c);
        }
        boolean isPalindromeUC5 = true;
        for (char c : input.toCharArray()) {
            if (c != stackUC5.pop()) {
                isPalindromeUC5 = false;
                break;
            }
        }
        System.out.println("UC5 (Stack-only) result: " + isPalindromeUC5);

        // UC6: Queue + Stack Comparison (FIFO vs LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (char c : input.toCharArray()) {
            queue.add(c); // FIFO order
            stack.push(c); // LIFO order
        }

        boolean isPalindromeUC6 = true;
        // Compare Dequeue vs Pop
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                isPalindromeUC6 = false;
                break;
            }
        }
        System.out.println("Is Palindrome? (UC6 Queue + Stack): " + isPalindromeUC6);
    }
}