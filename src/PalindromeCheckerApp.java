import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------------");

        // Define the input string
        String input = "refer";
        System.out.println("Input : " + input);

        // --- UC2: Half-length loop efficiency ---
        boolean isPalindromeUC2 = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindromeUC2 = false;
                break;
            }
        }
        System.out.println("UC2 (Half-loop) result: " + isPalindromeUC2);

        // --- UC6: Queue + Stack Comparison (FIFO vs LIFO) ---
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        boolean isPalindromeUC6 = true;
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                isPalindromeUC6 = false;
                break;
            }
        }
        System.out.println("UC6 (Queue+Stack) result: " + isPalindromeUC6);

        // --- UC7: Deque-Based Optimized Palindrome Checker ---
        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindromeUC7 = true;
        // Compare front and rear while more than one element exists
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindromeUC7 = false;
                break;
            }
        }

        System.out.println("Is Palindrome? (UC7 Deque-based): " + isPalindromeUC7);
    }
}