import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Application Entry & Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------------");

        // Define the input string (Using "level" as per UC8 hint)
        String input = "level";
        System.out.println("Input : " + input);

        // --- UC8: Linked List Based Palindrome Checker ---
        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        // LinkedList supports double-ended operations like removeFirst() and removeLast()
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}