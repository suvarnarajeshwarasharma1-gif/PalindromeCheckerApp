import java.util.*;

/**
 * INTERFACE - PalindromeStrategy
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Implements palindrome validation using the LIFO behavior of a Stack.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        // Normalization for consistency
        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character onto the stack
        for (char c : clean.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping
        for (char c : clean.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * CLASS - DequeStrategy
 * Implements palindrome validation using double-ended operations.
 */
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : clean.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

/**
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * Demonstrates dynamic algorithm selection at runtime.
 */
public class PalindromeCheckerApp {
    private PalindromeStrategy strategy;

    // Inject the strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void validate(String input) {
        System.out.println("Using Strategy: " + strategy.getClass().getSimpleName());
        boolean result = strategy.check(input);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 12.0 - Strategy Pattern Edition");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------------");

        PalindromeCheckerApp app = new PalindromeCheckerApp();
        String testInput = "level";

        // UC12: Dynamic Strategy Injection
        app.setStrategy(new StackStrategy());
        app.validate(testInput);

        app.setStrategy(new DequeStrategy());
        app.validate(testInput);
    }
}