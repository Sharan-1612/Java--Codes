public class RemoveSpaceInString {
    public static void main(String[] args) {
        String a = "            Hello, welcome to the world of Java programming.           ";
        String b = a.replace(" ",  ""); // Remove all spaces from the string
        String c = a.trim();

        System.out.println(a); // Outputs the original string
        System.out.println(b); // Outputs the string without spaces
        System.out.println(c); // Outputs the string with leading and trailing spaces removed
    }
    
}
