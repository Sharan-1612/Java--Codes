public class PalindromeString {
    public static void main(String[] args) {
        String org = "madam"; // Example string
        String rev = "";

        // Reverse the string
        for (int i = org.length() - 1; i >= 0; i--) {
            rev += org.charAt(i);
        }

        // Check if the original string is equal to the reversed string
        if (org == rev) {
            System.out.println(org + " is a palindrome.");
        } else {
            System.out.println(org + " is not a palindrome.");
        }
    }
    
}
