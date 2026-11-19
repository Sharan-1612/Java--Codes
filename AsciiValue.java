import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String ch = sc.nextLine();
        char character = ch.charAt(0);
        int asciiValue = (int)character;
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
        sc.close();
    }   
}
