public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345; // Example number
        int rev = 0;

        while (n > 0) {
            int digit = n % 10; // Get the last digit
            rev = rev * 10 + digit; // Append it to the reversed number
            n = n / 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + rev); // Outputs 54321
    }
    
}
