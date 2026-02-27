public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------------");

        String input = "level"; //
        System.out.println("Input : " + input);

        // --- Performance Benchmarking ---

        // Algorithm 1: Simple Two-Pointer Approach (UC2/UC4 logic)
        long startTime = System.nanoTime(); // Capture start time
        boolean result = isPalindromeBasic(input);
        long endTime = System.nanoTime(); // Capture end time

        long duration = endTime - startTime; // Calculate duration

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + duration + " ns"); // Display result
    }

    private static boolean isPalindromeBasic(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left++) != input.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}