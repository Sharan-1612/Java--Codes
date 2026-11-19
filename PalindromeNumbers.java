public class PalindromeNumbers {
    public static void main(String[] args) {
        int num = 121; // Example number
        int org = num;
        int rev = 0;
        // Reverse the number
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        // Check if the original number is equal to the reversed number
        if (org == rev) {
            System.out.println(org + " is a palindrome.");
        } else {
            System.out.println(org + " is not a palindrome.");
        }
    }
}
