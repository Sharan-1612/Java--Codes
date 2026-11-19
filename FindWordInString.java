public class FindWordInString {
    public static void main(String[] args) {
        String a = "Hello, welcome to the world of Java programming.";
        String wordToFind = "Java";

        // Check if the word exists in the string
        if (a.contains(wordToFind)) {
            System.out.println( wordToFind + " is found in the string.");
        } else {
            System.out.println(wordToFind + "' is not found in the string.");
        }
    }
    
}
